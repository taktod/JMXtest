package com.ttProject.jmxtest.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectInstance;
import javax.management.ObjectName;

public class JMXFactory {
	private static String domain = "com.ttProject.jmxtest";
	private static MBeanServer mBeanServer;
	static {
		try {
			mBeanServer = MBeanServerFactory.findMBeanServer(null).get(0);
		}
		catch(Exception e) {
			mBeanServer = ManagementFactory.getPlatformMBeanServer();
		}
	}

	public static ObjectInstance registerMBean(Object obj) {
		return registerMBean(obj, (String[])null);
	}
	public static ObjectInstance registerMBean(Object obj, String str) {
		if(str == null || str.length() == 0) {
			return registerMBean(obj, (String[])null);
		}
		return registerMBean(obj, new String[]{str});
	}
	public static ObjectInstance registerMBean(Object obj, String[] path) {
		ObjectName oName;
		try {
			oName = makeObjectName(obj, path);
		}
		catch (Exception e) {
			System.out.println("ObjectName作成に失敗");
			e.printStackTrace();
			return null;
		}
		try {
			if(mBeanServer.isRegistered(oName)) {
				System.out.println("古い登録があるので、削除します。");
				mBeanServer.unregisterMBean(oName);
			}
			return mBeanServer.registerMBean(obj, oName);
		}
		catch (Exception e) {
			System.out.println("MBean登録に失敗");
			e.printStackTrace();
		}
		return null;
	}
	public static void unregisterMBean(Object obj) {
		unregisterMBean(obj, (String[])null);
	}
	public static void unregisterMBean(Object obj, String str) {
		if(str == null || str.length() == 0) {
			unregisterMBean(obj, (String[])null);
		}
		unregisterMBean(obj, new String[]{str});
	}
	public static void unregisterMBean(Object obj, String[] path) {
		ObjectName oName;
		try {
			oName = makeObjectName(obj, path);
		}
		catch (Exception e) {
			System.out.println("ObjectName作成に失敗");
			e.printStackTrace();
			return;
		}
		try {
			if(mBeanServer.isRegistered(oName)) {
				System.out.println("古い登録があるので、削除します。");
				mBeanServer.unregisterMBean(oName);
			}
		}
		catch (Exception e) {
			System.out.println("MBean削除に失敗");
			e.printStackTrace();
		}
	}
	private static ObjectName makeObjectName(Object obj, String[] path) 
		throws MalformedObjectNameException, NullPointerException {
		StringBuilder objectNameStr = new StringBuilder(domain);
		objectNameStr.append(":type=");
		objectNameStr.append(obj.getClass().getSimpleName());
		if(path != null) {
			int i = 0;
			for(String str : path) {
				objectNameStr.append(",");
				objectNameStr.append(i);
				objectNameStr.append("=");
				objectNameStr.append(str);
			}
		}
		System.out.println(objectNameStr.toString());
		return new ObjectName(objectNameStr.toString());
	}
	public static MBeanServer getMBeanServer() {
		return mBeanServer;
	}
	public static void setMBeanServer(MBeanServer mbs) {
		mBeanServer = mbs;
	}
	public static String getDomain() {
		return domain;
	}
	public static void setDomain(String domain) {
		JMXFactory.domain = domain;
	}
}

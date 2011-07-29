package com.ttProject.jmxtest;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

import com.ttProject.jmxtest.component.JSystemOutTextArea;
import com.ttProject.jmxtest.controller.MainController;

public class GuiEntry extends JFrame {
	private GuiEntry self;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane TabFrame = null;
	private JPanel Panel1 = null;
	private JPanel Contents = null;
	private JPanel TitlePanel = null;
	private JLabel TitleLabel = null;
	private JLabel RegisterJMXLabel = null;
	private JPanel LeftGap1 = null;
	private JPanel RightGap1 = null;
	private JButton RegisterJMXButton = null;
	private JTextField RegisterJMXField = null;
	private JLabel RemoveJMXLabel = null;
	private JTextField RemoveJMXField = null;
	private JButton RemoveJMXButton = null;
	private JPanel LogPanel = null;
	private JScrollPane LogScroll = null;
	private JSystemOutTextArea LogArea = null;
	private JPanel LogTitlePanel = null;
	private JLabel LogTitleLabel = null;

	/**
	 * This method initializes TabFrame	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTabFrame() {
		if (TabFrame == null) {
			TabFrame = new JTabbedPane();
			TabFrame.addTab("Tab1", null, getPanel1(), null);
			TabFrame.addTab("ログ", null, getLogPanel(), null);
		}
		return TabFrame;
	}

	/**
	 * This method initializes Panel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel1() {
		if (Panel1 == null) {
			Panel1 = new JPanel();
			Panel1.setLayout(new BorderLayout());
			Panel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createEmptyBorder(10, 30, 30, 30)));
			Panel1.add(getContents(), BorderLayout.NORTH);
		}
		return Panel1;
	}

	/**
	 * This method initializes Contents	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getContents() {
		if (Contents == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 3;
			gridBagConstraints8.gridy = 2;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints7.gridy = 2;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.gridx = 2;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 1;
			gridBagConstraints6.gridy = 2;
			RemoveJMXLabel = new JLabel();
			RemoveJMXLabel.setText("削除:");
			RemoveJMXLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.gridy = 1;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.gridx = 2;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.gridy = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 4;
			gridBagConstraints3.gridy = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 1;
			RegisterJMXLabel = new JLabel();
			RegisterJMXLabel.setText("登録:");
			RegisterJMXLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridwidth = 5;
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridy = 0;
			Contents = new JPanel();
			Contents.setLayout(new GridBagLayout());
			Contents.setBackground(Color.white);
			Contents.add(getLeftGap1(), gridBagConstraints2);
			Contents.add(getRightGap1(), gridBagConstraints3);
			Contents.add(getTitlePanel(), gridBagConstraints);
			Contents.add(RegisterJMXLabel, gridBagConstraints1);
			Contents.add(getRegisterJMXButton(), gridBagConstraints4);
			Contents.add(getRegisterJMXField(), gridBagConstraints5);
			Contents.add(RemoveJMXLabel, gridBagConstraints6);
			Contents.add(getRemoveJMXField(), gridBagConstraints7);
			Contents.add(getRemoveJMXButton(), gridBagConstraints8);
		}
		return Contents;
	}

	/**
	 * This method initializes TitlePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getTitlePanel() {
		if (TitlePanel == null) {
			TitleLabel = new JLabel();
			TitleLabel.setText("JMXFactoryの操作");
			TitlePanel = new JPanel();
			TitlePanel.setLayout(new BorderLayout());
			TitlePanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.gray), BorderFactory.createEmptyBorder(3, 15, 0, 0)));
			TitlePanel.setBackground(Color.white);
			TitlePanel.add(TitleLabel, BorderLayout.WEST);
		}
		return TitlePanel;
	}

	/**
	 * This method initializes LeftGap1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getLeftGap1() {
		if (LeftGap1 == null) {
			LeftGap1 = new JPanel();
			LeftGap1.setLayout(new GridBagLayout());
			LeftGap1.setPreferredSize(new Dimension(15, 0));
		}
		return LeftGap1;
	}

	/**
	 * This method initializes RightGap1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getRightGap1() {
		if (RightGap1 == null) {
			RightGap1 = new JPanel();
			RightGap1.setLayout(new GridBagLayout());
			RightGap1.setPreferredSize(new Dimension(15, 0));
		}
		return RightGap1;
	}

	/**
	 * This method initializes RegisterJMXButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRegisterJMXButton() {
		if (RegisterJMXButton == null) {
			RegisterJMXButton = new JButton();
			RegisterJMXButton.setText("登録");
			RegisterJMXButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					MainController mcontroller = new MainController(self);
					System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					mcontroller.registerJMX();
				}
			});
		}
		return RegisterJMXButton;
	}

	/**
	 * This method initializes RegisterJMXField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getRegisterJMXField() {
		if (RegisterJMXField == null) {
			RegisterJMXField = new JTextField();
		}
		return RegisterJMXField;
	}

	/**
	 * This method initializes RemoveJMXField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getRemoveJMXField() {
		if (RemoveJMXField == null) {
			RemoveJMXField = new JTextField();
		}
		return RemoveJMXField;
	}

	/**
	 * This method initializes RemoveJMXButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRemoveJMXButton() {
		if (RemoveJMXButton == null) {
			RemoveJMXButton = new JButton();
			RemoveJMXButton.setText("削除");
			RemoveJMXButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					MainController mcontroller = new MainController(self);
					System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					mcontroller.removeJMX();
				}
			});
		}
		return RemoveJMXButton;
	}

	/**
	 * This method initializes LogPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getLogPanel() {
		if (LogPanel == null) {
			LogPanel = new JPanel();
			LogPanel.setLayout(new BorderLayout());
			LogPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createEmptyBorder(10, 30, 30, 30)));
			LogPanel.add(getLogScroll(), BorderLayout.CENTER);
			LogPanel.add(getLogTitlePanel(), BorderLayout.NORTH);
		}
		return LogPanel;
	}

	/**
	 * This method initializes LogScroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getLogScroll() {
		if (LogScroll == null) {
			LogScroll = new JScrollPane();
			LogScroll.setViewportView(getLogArea());
		}
		return LogScroll;
	}

	/**
	 * This method initializes LogArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public JSystemOutTextArea getLogArea() {
		if (LogArea == null) {
			LogArea = new JSystemOutTextArea();
			LogArea.setLineWrap(true);
		}
		return LogArea;
	}

	/**
	 * This method initializes LogTitlePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getLogTitlePanel() {
		if (LogTitlePanel == null) {
			LogTitleLabel = new JLabel();
			LogTitleLabel.setText("ログデータ");
			LogTitlePanel = new JPanel();
			LogTitlePanel.setLayout(new BorderLayout());
			LogTitlePanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.gray), BorderFactory.createEmptyBorder(3, 15, 0, 0)));
			LogTitlePanel.setBackground(Color.white);
			LogTitlePanel.add(LogTitleLabel, BorderLayout.NORTH);
		}
		return LogTitlePanel;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuiEntry thisClass = new GuiEntry();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public GuiEntry() {
		super();
		initialize();
		self = this;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(600, 400);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getTabFrame(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

}

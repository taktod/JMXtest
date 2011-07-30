package com.ttProject.jmxtest;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

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
import javax.swing.JComboBox;

public class GuiEntry extends JFrame {
	private static final long serialVersionUID = 1L;
	private GuiEntry self;
	private JPanel jContentPane = null;
	private JTabbedPane TabFrame = null;
	private JPanel Panel1 = null;
	private JPanel Contents1 = null;
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
	private JPanel SettingPanel = null;
	private JPanel SettingContents = null;
	private JPanel SettingLeftGap = null;
	private JPanel SettingRightGap = null;
	private JPanel SettingTitlePanel = null;
	private JLabel SettingTitlaLabel = null;
	private JLabel LookFeelLabel = null;
	private JComboBox SkinComboBox = null;
	/**
	 * This method initializes TabFrame	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTabFrame() {
		if (TabFrame == null) {
			TabFrame = new JTabbedPane();
			TabFrame.addTab("Tab1", null, getPanel1(), null);
			TabFrame.addTab("設定", null, getSettingPanel(), null);
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
			Panel1.add(getContents1(), BorderLayout.NORTH);
		}
		return Panel1;
	}

	/**
	 * This method initializes Contents1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getContents1() {
		if (Contents1 == null) {
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
			Contents1 = new JPanel();
			Contents1.setLayout(new GridBagLayout());
			Contents1.setBackground(Color.white);
			Contents1.add(getLeftGap1(), gridBagConstraints2);
			Contents1.add(getRightGap1(), gridBagConstraints3);
			Contents1.add(getTitlePanel(), gridBagConstraints);
			Contents1.add(RegisterJMXLabel, gridBagConstraints1);
			Contents1.add(getRegisterJMXButton(), gridBagConstraints4);
			Contents1.add(getRegisterJMXField(), gridBagConstraints5);
			Contents1.add(RemoveJMXLabel, gridBagConstraints6);
			Contents1.add(getRemoveJMXField(), gridBagConstraints7);
			Contents1.add(getRemoveJMXButton(), gridBagConstraints8);
		}
		return Contents1;
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
	 * This method initializes SettingPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSettingPanel() {
		if (SettingPanel == null) {
			SettingPanel = new JPanel();
			SettingPanel.setLayout(new BorderLayout());
			SettingPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createEmptyBorder(10, 30, 30, 30)));
			SettingPanel.add(getSettingContents(), BorderLayout.NORTH);
		}
		return SettingPanel;
	}

	/**
	 * This method initializes SettingContents	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSettingContents() {
		if (SettingContents == null) {
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints13.gridy = 2;
			gridBagConstraints13.weightx = 1.0;
			gridBagConstraints13.gridx = 2;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 1;
			gridBagConstraints12.gridy = 2;
			LookFeelLabel = new JLabel();
			LookFeelLabel.setText("スキン:");
			LookFeelLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 6;
			gridBagConstraints11.gridy = 0;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 0;
			gridBagConstraints10.gridy = 0;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.gridx = 0;
			gridBagConstraints9.gridwidth = 7;
			gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints9.gridy = 1;
			SettingContents = new JPanel();
			SettingContents.setLayout(new GridBagLayout());
			SettingContents.setBackground(Color.white);
			SettingContents.add(getSettingLeftGap(), gridBagConstraints10);
			SettingContents.add(getSettingRightGap(), gridBagConstraints11);
			SettingContents.add(getSettingTitlePanel(), gridBagConstraints9);
			SettingContents.add(LookFeelLabel, gridBagConstraints12);
			SettingContents.add(getSkinComboBox(), gridBagConstraints13);
		}
		return SettingContents;
	}

	/**
	 * This method initializes SettingLeftGap	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSettingLeftGap() {
		if (SettingLeftGap == null) {
			SettingLeftGap = new JPanel();
			SettingLeftGap.setLayout(new GridBagLayout());
			SettingLeftGap.setPreferredSize(new Dimension(15, 0));
		}
		return SettingLeftGap;
	}

	/**
	 * This method initializes SettingRightGap	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSettingRightGap() {
		if (SettingRightGap == null) {
			SettingRightGap = new JPanel();
			SettingRightGap.setLayout(new GridBagLayout());
			SettingRightGap.setPreferredSize(new Dimension(15, 0));
		}
		return SettingRightGap;
	}

	/**
	 * This method initializes SettingTitlePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSettingTitlePanel() {
		if (SettingTitlePanel == null) {
			SettingTitlaLabel = new JLabel();
			SettingTitlaLabel.setText("設定");
			SettingTitlePanel = new JPanel();
			SettingTitlePanel.setLayout(new BorderLayout());
			SettingTitlePanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.gray), BorderFactory.createEmptyBorder(3, 15, 0, 0)));
			SettingTitlePanel.setBackground(Color.white);
			SettingTitlePanel.add(SettingTitlaLabel, BorderLayout.NORTH);
		}
		return SettingTitlePanel;
	}

	/**
	 * This method initializes SkinComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getSkinComboBox() {
		if (SkinComboBox == null) {
			SkinComboBox = new JComboBox();
			String defaultName = UIManager.getLookAndFeel().getName();
			for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()) {
				SkinComboBox.addItem(lafInfo.getName());
			}
			SkinComboBox.setSelectedItem(defaultName);
			SkinComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					System.out.println("itemStateChanged()"); // TODO Auto-generated Event stub itemStateChanged()
					MainController mcontroller = new MainController(self);
					mcontroller.changeSkin(SkinComboBox.getSelectedItem().toString());
				}
			});
		}
		return SkinComboBox;
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

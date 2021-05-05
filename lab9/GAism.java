package lab9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import java.awt.Point;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JTabbedPane;

public class GAism extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GAism frame = new GAism();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GAism() {
		getContentPane().setSize(new Dimension(1000, 1000));
		setSize(new Dimension(1000, 1000));
		setTitle("AismGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("ADD NEW ODER", null, panel, null);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("oder'S name");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD ODER");
		panel.add(btnNewButton);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("ADD NEW ITEM", null, tabbedPane_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("BOOK", null, panel_2, null);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("Title");
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CATEGORY");
		panel_2.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("COST");
		panel_2.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("AUTHOR");
		panel_2.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("CONTENT");
		panel_2.add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_2.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("add");
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("CD", null, panel_3, null);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1_5 = new JLabel("TITLE");
		panel_3.add(lblNewLabel_1_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_3.add(textField_6);
		
		JLabel lblNewLabel_1_6 = new JLabel("CATEGORY");
		panel_3.add(lblNewLabel_1_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_3.add(textField_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("COST");
		panel_3.add(lblNewLabel_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_3.add(textField_8);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DIRECTORY");
		panel_3.add(lblNewLabel_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("LENGTH");
		panel_3.add(lblNewLabel_1_3_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_3.add(textField_10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("ARTIST");
		panel_3.add(lblNewLabel_1_4_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel_3.add(textField_15);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_3.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("ADD");
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("DVD", null, panel_4, null);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1_7 = new JLabel("TITLE");
		panel_4.add(lblNewLabel_1_7);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_4.add(textField_11);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("CATEGORY");
		panel_4.add(lblNewLabel_1_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_4.add(textField_12);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("DIRECTOR");
		panel_4.add(lblNewLabel_1_2_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		panel_4.add(textField_13);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("COST");
		panel_4.add(lblNewLabel_1_3_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		panel_4.add(textField_14);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("LENGTH");
		panel_4.add(lblNewLabel_1_4_2);
		
		JButton btnNewButton_3 = new JButton("add");
		panel_4.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("DISPLAY", null, panel_1, null);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_4 = new JButton("DISPLAY");
		panel_1.add(btnNewButton_4);
	}
}

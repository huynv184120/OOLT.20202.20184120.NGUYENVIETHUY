package lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
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
import javax.swing.ListModel;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIAism extends JFrame {
	private JTextField enterNameOrder_textField;
	private JTextField titlebook;
	private JTextField categorybook;
	private JTextField costbook;
	private JTextField authorbook;
	private JTextField contentbook;
	private JTextField titlecd;
	private JTextField categorycd;
	private JTextField costcd;
	private JTextField directorycd;
	private JTextField lenghtcd;
	private JTextField artistcd;
	private JTextField titledvd;
	private JTextField categorydvd;
	private JTextField costdvd;
	private JTextField directordvd;
	private JTextField lenghtdvd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAism frame = new GUIAism();
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
	public GUIAism() {
		setSize(new Dimension(1000, 1000));
		setTitle("AismGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JList listItem = new JList();

		List<JPanel> listOder_panel =new ArrayList<JPanel>();
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("ORDER", null, panel, null);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panelitem = new JPanel();
		panelitem.setLayout(new BoxLayout(panelitem, BoxLayout.Y_AXIS));
		
		JPanel add_oder_panel = new JPanel();
		add_oder_panel.setMaximumSize(new Dimension(400, 60));
		panel.add(add_oder_panel);
		
		JLabel lblNewLabel = new JLabel("Order name :");
		add_oder_panel.add(lblNewLabel);
		enterNameOrder_textField = new JTextField();
		enterNameOrder_textField.setText("");
		enterNameOrder_textField.setColumns(10);
		add_oder_panel.add(enterNameOrder_textField);
		DefaultListModel<Order> listOrder =new DefaultListModel<Order>();
		JList order_list = new JList();
		JButton addOrder_button = new JButton("Add");
		JComboBox chooseorder = new JComboBox();
		JComboBox chooseOderDp = new JComboBox();
		chooseOderDp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order order =(Order)chooseOderDp.getSelectedItem();
				DefaultListModel<Media> listitem = new DefaultListModel<Media>();
				for(Media item : order.getItemsOrdered()) {
					listitem.addElement(item);
				}
				listItem.setModel(listitem);
			}
		});
		chooseorder.setFont(new Font("Tahoma", Font.BOLD, 10));
		chooseorder.setBackground(new Color(255, 255, 255));
		chooseorder.setMaximumRowCount(100);
		addOrder_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order;
				String nameOrder = new String(enterNameOrder_textField.getText());
				if(nameOrder.length()==0) {
					order = new Order();
				}
				else {
					order = new Order(nameOrder);
				}
				listOrder.addElement(order);
				chooseorder.addItem(order);
				chooseOderDp.addItem(order);
				order_list.setModel(listOrder);			
			}			
		});
		add_oder_panel.add(addOrder_button);
		JLabel lblNewLabel_1 = new JLabel("List Ordered");
		lblNewLabel_1.setAlignmentX(0.5f);
		panel.add(lblNewLabel_1);
		panel.add(order_list);		
		JButton delete_order = new JButton("delete");
		delete_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Order> listorder = order_list.getSelectedValuesList();
				for(Order o : listorder) {
					Order.removeOder(o);
					listOrder.removeElement(o);
					chooseorder.removeItem(o);
					chooseOderDp.removeItem(o);
				}
				order_list.setModel(listOrder);			

				
			}
		});
		delete_order.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(delete_order);
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panelitem.add(new JLabel("choose order"));
		panelitem.add(chooseorder);

		panelitem.add(tabbedPane_1);
		tabbedPane.addTab("ITEM", null, panelitem, null);
		
		
		JPanel panel_book = new JPanel();
		tabbedPane_1.addTab("BOOK", null, panel_book, null);
		panel_book.setLayout(new BoxLayout(panel_book, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("title");
		panel_book.add(lblNewLabel_2);
		
		titlebook = new JTextField();
		panel_book.add(titlebook);
		titlebook.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("category");
		panel_book.add(lblNewLabel_3);
		
		categorybook = new JTextField();
		panel_book.add(categorybook);
		categorybook.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("cost");
		panel_book.add(lblNewLabel_4);
		
		costbook = new JTextField();
		panel_book.add(costbook);
		costbook.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("author");
		panel_book.add(lblNewLabel_5);
		
		authorbook = new JTextField();
		panel_book.add(authorbook);
		authorbook.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("content");
		panel_book.add(lblNewLabel_6);
		
		contentbook = new JTextField();
		panel_book.add(contentbook);
		contentbook.setColumns(10);
		

		
		JButton addbook = new JButton("add");
		addbook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order =(Order)chooseorder.getSelectedItem();
				Books b = new Books(titlebook.getText(),categorybook.getText(),Float.parseFloat(costbook.getText()),Arrays.asList(authorbook.getText().split(",")),contentbook.getText());
				order.addMedia(b);
			}
		});
		panel_book.add(addbook);
		panel_book.add(addbook);
		
		JPanel panel_cd = new JPanel();
		tabbedPane_1.addTab("CD", null, panel_cd, null);
		panel_cd.setLayout(new BoxLayout(panel_cd, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_2_1 = new JLabel("title");
		panel_cd.add(lblNewLabel_2_1);
		
		titlecd = new JTextField();
		titlecd.setColumns(10);
		panel_cd.add(titlecd);
		
		JLabel lblNewLabel_3_1 = new JLabel("category");
		panel_cd.add(lblNewLabel_3_1);
		
		categorycd = new JTextField();
		categorycd.setColumns(10);
		panel_cd.add(categorycd);
		
		JLabel lblNewLabel_4_1 = new JLabel("cost");
		panel_cd.add(lblNewLabel_4_1);
		
		costcd = new JTextField();
		costcd.setColumns(10);
		panel_cd.add(costcd);
		
		JLabel lblNewLabel_5_1 = new JLabel("directory");
		panel_cd.add(lblNewLabel_5_1);
		
		directorycd = new JTextField();
		directorycd.setColumns(10);
		panel_cd.add(directorycd);
		
		JLabel lblNewLabel_6_1 = new JLabel("lenght");
		panel_cd.add(lblNewLabel_6_1);
		
		lenghtcd = new JTextField();
		lenghtcd.setColumns(10);
		panel_cd.add(lenghtcd);
		
		JLabel lblNewLabel_7 = new JLabel("artist");
		panel_cd.add(lblNewLabel_7);
		
		artistcd = new JTextField();
		panel_cd.add(artistcd);
		artistcd.setColumns(10);
		
		JButton addcd = new JButton("add");
		addcd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order =(Order)chooseorder.getSelectedItem();
				CompactDisc cd = new CompactDisc(titlecd.getText(),categorycd.getText(),Float.parseFloat(costcd.getText()),directorycd.getText(),Integer.parseInt(lenghtcd.getText()),artistcd.getText());
				order.addMedia(cd);
			}
			
		});
		panel_cd.add(addcd);
		
		JPanel panel_dvd = new JPanel();
		tabbedPane_1.addTab("DVD", null, panel_dvd, null);
		panel_dvd.setLayout(new BoxLayout(panel_dvd, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_2_2 = new JLabel("title");
		panel_dvd.add(lblNewLabel_2_2);
		
		titledvd = new JTextField();
		titledvd.setColumns(10);
		panel_dvd.add(titledvd);
		
		JLabel lblNewLabel_3_2 = new JLabel("category");
		panel_dvd.add(lblNewLabel_3_2);
		
		categorydvd = new JTextField();
		categorydvd.setColumns(10);
		panel_dvd.add(categorydvd);
		
		JLabel lblNewLabel_4_2 = new JLabel("cost");
		panel_dvd.add(lblNewLabel_4_2);
		
		costdvd = new JTextField();
		costdvd.setColumns(10);
		panel_dvd.add(costdvd);
		
		JLabel lblNewLabel_5_2 = new JLabel("director");
		panel_dvd.add(lblNewLabel_5_2);
		
		directordvd = new JTextField();
		directordvd.setColumns(10);
		panel_dvd.add(directordvd);
		
		JLabel lblNewLabel_6_2 = new JLabel("lenght");
		panel_dvd.add(lblNewLabel_6_2);
		
		lenghtdvd = new JTextField();
		lenghtdvd.setColumns(10);
		panel_dvd.add(lenghtdvd);
		
		JButton adddvd = new JButton("add");
		adddvd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order =(Order)chooseorder.getSelectedItem();
				DigitalVideoDisc dvd = new DigitalVideoDisc(titledvd.getText(),categorydvd.getText(),Float.parseFloat(costdvd.getText()),Integer.parseInt(lenghtdvd.getText()),directordvd.getText());
				order.addMedia(dvd);	
			}
		});
		panel_dvd.add(adddvd);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Display/Delete_Item", null, panel_1, null);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_8 = new JLabel("choose order");
		panel_2.add(lblNewLabel_8);
		
		panel_2.add(chooseOderDp);
		
		JButton display = new JButton("display");
		display.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Order order =(Order)chooseOderDp.getSelectedItem();
				DefaultListModel<Media> listitem = new DefaultListModel<Media>();
				for(Media item : order.getItemsOrdered()) {
					listitem.addElement(item);
				}
				listItem.setModel(listitem);
				
			}
			
		});
		panel_2.add(display);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		panel_3.add(listItem);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JButton deleteItem = new JButton("delete");
		deleteItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Order> list = listItem.getSelectedValuesList();
				Order order = (Order)chooseOderDp.getSelectedItem();
				DefaultListModel<Media> listitem = new DefaultListModel<Media>();
				for(Object item : list) {
					order.removeMedia((Media)item);
				}
				
				for(Media item : order.getItemsOrdered()) {
					listitem.addElement(item);
				}
				listItem.setModel(listitem);
			}
		});
		panel_4.add(deleteItem);


	}
}

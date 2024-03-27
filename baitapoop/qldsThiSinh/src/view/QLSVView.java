package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.TextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	QLSVModel model; 
	private JTextField textField_MaSinhVien;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_HoVaTen;
	private JTextField textField_NgaySinh;
	private JTextField textField_Mon1;
	private JTextField textField_Mon2;
	private JTextField textField_Mon3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
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
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 682);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About Me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Quê quán");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_QueQuan.setBounds(10, 11, 83, 43);
		contentPane.add(label_QueQuan);
		
		JLabel label_MaThiSinh = new JLabel("Mã thí sinh");
		label_MaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_MaThiSinh.setBounds(426, 11, 96, 43);
		contentPane.add(label_MaThiSinh);
		
		textField_MaSinhVien = new JTextField();
		textField_MaSinhVien.setBounds(532, 24, 144, 20);
		contentPane.add(textField_MaSinhVien);
		textField_MaSinhVien.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(776, 19, 57, 27);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.setBounds(103, 23, 128, 22);
		contentPane.add(comboBox_QueQuan);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 65, 893, 16);
		contentPane.add(separator_1);
		
		JLabel label_DanhSachThiSinh = new JLabel("Danh sách thí sinh");
		label_DanhSachThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_DanhSachThiSinh.setBounds(10, 75, 135, 43);
		contentPane.add(label_DanhSachThiSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 117, 893, 197);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 325, 893, 16);
		contentPane.add(separator_1_1);
		
		JLabel label_ThongTin = new JLabel("Thông tin thí sinh");
		label_ThongTin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_ThongTin.setBounds(10, 325, 154, 43);
		contentPane.add(label_ThongTin);
		
		JLabel label_ID = new JLabel("Mã thí sinh");
		label_ID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_ID.setBounds(10, 352, 96, 43);
		contentPane.add(label_ID);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(95, 365, 144, 20);
		contentPane.add(textField_ID);
		
		JLabel label_HoVaTen = new JLabel("Họ và tên");
		label_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_HoVaTen.setBounds(10, 406, 96, 32);
		contentPane.add(label_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(95, 414, 144, 20);
		contentPane.add(textField_HoVaTen);
		
		JLabel label_QueQuan1 = new JLabel("Quê quán");
		label_QueQuan1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_QueQuan1.setBounds(10, 449, 96, 32);
		contentPane.add(label_QueQuan1);
		
		JComboBox comboBox_QueQuan1 = new JComboBox();
		comboBox_QueQuan1.setBounds(95, 456, 144, 22);
		contentPane.add(comboBox_QueQuan1);
		
		JLabel label_NgaySinh = new JLabel("Ngày sinh");
		label_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_NgaySinh.setBounds(10, 492, 96, 32);
		contentPane.add(label_NgaySinh);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(95, 500, 144, 20);
		contentPane.add(textField_NgaySinh);
		
		JRadioButton radioButton_nam = new JRadioButton("Nam");
		radioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_nam.setBounds(579, 362, 57, 23);
		contentPane.add(radioButton_nam);
		
		JRadioButton radioButton_nu = new JRadioButton("Nữ");
		radioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_nu.setBounds(670, 362, 57, 23);
		contentPane.add(radioButton_nu);
		
		JLabel label_GioiTinh = new JLabel("Giới tính");
		label_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_GioiTinh.setBounds(483, 357, 96, 32);
		contentPane.add(label_GioiTinh);
		
		JLabel label_Mon1 = new JLabel("Điểm môn 1");
		label_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Mon1.setBounds(483, 406, 96, 32);
		contentPane.add(label_Mon1);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(583, 414, 144, 20);
		contentPane.add(textField_Mon1);
		
		JLabel label_Mon2 = new JLabel("Điểm môn 2");
		label_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Mon2.setBounds(483, 449, 96, 32);
		contentPane.add(label_Mon2);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(583, 457, 144, 20);
		contentPane.add(textField_Mon2);
		
		JLabel label_Mon3 = new JLabel("Điểm môn 3");
		label_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Mon3.setBounds(483, 492, 96, 32);
		contentPane.add(label_Mon3);
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(583, 500, 144, 20);
		contentPane.add(textField_Mon3);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInsert.setBackground(Color.LIGHT_GRAY);
		btnInsert.setBounds(46, 570, 126, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setBounds(220, 570, 135, 27);
		contentPane.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBackground(Color.LIGHT_GRAY);
		btnEdit.setBounds(399, 570, 135, 27);
		contentPane.add(btnEdit);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setBounds(570, 570, 135, 27);
		contentPane.add(btnSave);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 549, 893, 2);
		contentPane.add(separator_1_1_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(734, 570, 125, 27);
		contentPane.add(btnCancel);
		
		this.setVisible(true);
	}
}

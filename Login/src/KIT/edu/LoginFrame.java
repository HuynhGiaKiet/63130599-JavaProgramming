package KIT.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Hệ Thống Quản Lý Bán Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 52, 146, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(35, 115, 146, 20);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(173, 45, 196, 39);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(173, 108, 196, 39);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Viết hàm xử lý đăng nhập
				XuLyDangNhap();
			}
		});
		btnDangNhap.setBounds(142, 179, 130, 39);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap()
	{
		//Lấy về tên đăng nhập và mật khẩu
		String str_Ten = txtTenDangNhap.getText();
		String str_MatKhau = txtMatKhau.getText();
		//XuLy
		if(str_Ten.equals("63CNTT") && str_MatKhau.equals("123"))
		{
			//Hiện Trang chủ
			HomeFrame homepage = new HomeFrame();
			homepage.setVisible(true);
			//Ẩn form đăng nhập
			this.setVisible(false);
		}
		else {
			//Báo lỗi
			//Xóa dữ liệu nhập
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
			//JOptionPane hopThoai = new JOptionPane();
			//hopThoai.showMessageDialog(this, "Đăng nhập thất bại", "Thông báo");
			
		}
	}
}

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

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		setTitle("Chương Trình Tính Toán Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(72, 98, 159, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ nhất (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(72, 187, 159, 30);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(241, 98, 354, 30);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(241, 187, 354, 30);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng
				//Viết lệnh xử lý ở 1 thủ tục/ hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(141, 269, 90, 37);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(283, 269, 90, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(409, 270, 90, 35);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(531, 270, 90, 35);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán: ");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(72, 358, 159, 30);
		contentPane.add(lblKtQuTnh);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(241, 358, 354, 30);
		contentPane.add(txtKQ);
	}// hết hàm tạo
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		// lấy số a, số b
		String str_soA = txtA.getText(); 
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu 
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tổng
		double Tong = soA + soB;
		//Đưa ra hiển thị kết quả lên diều khiển
		txtKQ.setText( String.valueOf(Tong) );
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		// lấy số a, số b
		String str_soA = txtA.getText(); 
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu 
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tổng
		double Tru = soA - soB;
		//Đưa ra hiển thị kết quả lên diều khiển
		txtKQ.setText( String.valueOf(Tru) );
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		// lấy số a, số b
		String str_soA = txtA.getText(); 
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu 
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tổng
		double Nhan = soA * soB;
		//Đưa ra hiển thị kết quả lên diều khiển
		txtKQ.setText( String.valueOf(Nhan) );
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		// lấy số a, số b
		String str_soA = txtA.getText(); 
		String str_soB = txtB.getText();
		//Chuyển kiểu dữ liệu 
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tổng
		double Chia = soA / soB;
		//Đưa ra hiển thị kết quả lên diều khiển
		txtKQ.setText( String.valueOf(Chia) );
	}
}

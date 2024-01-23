import java.util.Scanner;

public class SanPham 
	{

			private String tenSp;
			private double donGia;
			private double giamGia;
		    Scanner scanner = new Scanner(System.in);
//		    
//		    public SanPham(String tenSp, double donGia, double giamGia) {
//		        this.tenSp = tenSp;
//		        this.donGia = donGia;
//		        this.giamGia = giamGia;
//		    }

			public double getThueNhapKhau() 
		    {
		        return donGia * 0.1;
		    }

		    public void Xuat() 
		    {
		        System.out.println("Tên sản phẩm: " + tenSp);
		        System.out.println("Đơn giá: " + donGia);
		        System.out.println("Giảm giá: " + giamGia);
		        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
		    }

		    public void Nhap() 
		    {
		        System.out.print("Nhập tên sản phẩm: ");
		        tenSp = scanner.nextLine();

		        System.out.print("Nhập đơn giá: ");
		        donGia = scanner.nextDouble();

		        System.out.print("Nhập mức giảm giá: ");
		        giamGia = scanner.nextDouble();
		    }
		    
	}
import java.util.*;
import java.util.Scanner;
//Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2
//phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn
//hình. Thông tin xuất ra màn hình gồm

public class Lab4Bai1 
{
	public class SanPham 
	{

			private String tenSp;
			private double donGia;
			private double giamGia;
		    Scanner scanner = new Scanner(System.in);
		    
		    public SanPham(String tenSp, double donGia, double giamGia) {
		        this.tenSp = tenSp;
		        this.donGia = donGia;
		        this.giamGia = giamGia;
		    }

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
		        System.out.println("Nhập tên sản phẩm: ");
		        tenSp = scanner.nextLine();

		        System.out.println("Nhập đơn giá: ");
		        donGia = scanner.nextDouble();

		        System.out.println("Nhập mức giảm giá: ");
		        giamGia = scanner.nextDouble();
		    }
		    
	}
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		SanPham sp = new SanPham();
		sp.Nhap();
		sp.Xuat();
	}
}


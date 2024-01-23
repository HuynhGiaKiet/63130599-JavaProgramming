import java.util.*;
import java.util.Scanner;
//Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2
//phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn
//hình. Thông tin xuất ra màn hình gồm

public class Lab4Bai1 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		SanPham sp = new SanPham();
		sp.Nhap();
		sp.Xuat();
	}
}


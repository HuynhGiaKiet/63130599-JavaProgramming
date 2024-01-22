import java.util.*;
//Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến

public class Lab2Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sodien, tiendien;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng của tháng: ");
		sodien = scanner.nextInt();
		
		if( sodien < 50)
		{
			tiendien = sodien*1000;
			System.out.printf("Số tiền điện sử dụng của tháng: %d", tiendien);
		}
		else
		{
			tiendien = 50*1000 + (sodien - 50)*1200;
			System.out.printf("Số tiền điện sử dụng của tháng: %d", tiendien);
		}
	}

}

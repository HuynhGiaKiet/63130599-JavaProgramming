import java.util.*;
//Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức năng để thoát khỏi ứng dụng.
public class Lab2Bai4 {

	public static void giaiPTB1()
	{
		int a,b;
		float x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextInt();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.print("Vô số nghiệm"); 
			}
			else
			{
				System.out.print("Vô nghiệm"); 
			}
		}
		else
		{
			x = -b/a;
			System.out.printf("Phương trình có nghiệm là: %.2f", x);
		}
	}
	
	public static void giaiPTB2()
	{
		int a,b,c;
		double delta,x,x1,x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextInt();
		
		//Xét a để giải phương trình bậc nhất
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.print("Phương trình bậc 1 có vô số nghiệm"); 
			}
			else
			{
				System.out.print("Phương trình bậc 1 vô nghiệm"); 
			}
			x = -b/a;
			System.out.printf("Phương trình bậc 1 có nghiệm là: %.2f", x);
		}
		else
		{
			// Tính delta
			delta = Math.pow(b, 2) - (4 * a * c);
			//Biện luận
			if(delta < 0)
			{
				System.out.print("Phương trình bậc 2 vô nghiệm"); 
			}
			if(delta == 0)
			{
				 x = -b/(2*a);
				System.out.printf("Phương trình bậc 2 có 1 nghiệm kép: %.2f", x); 
			}
			if(delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2*a);
				x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.printf("Phương trình bậc 2 có 2 nghiệm phân biệt: %.2f %.2f", x1, x2);
			}
		}
	}
	
	public static void tinhTienDien()

	{
		int sodien, tiendien;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng của tháng: ");
		sodien = scanner.nextInt();
		
		if( sodien < 50)
		{
			tiendien = sodien*1000;
			System.out.println("Số tiền điện sử dụng của tháng: "+ tiendien);
		}
		else
		{
			tiendien = 50*1000 + (sodien - 50)*1200;
			System.out.println("Số tiền điện sử dụng của tháng: "+ tiendien);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice ;
		int a,b,c,tiendien,sodien;
		double delta,x,x1,x2;
		Scanner scanner = new Scanner(System.in);
		

		do
		{
			System.out.println("\n\n\t\t+---------- Menu ----------+");
			System.out.print("\n\n\t\t1. Giải phương trình bậc nhất");
			System.out.print("\n\n\t\t2. Giải phương trình bậc hai");
			System.out.print("\n\n\t\t3. Tính tiền điện");
			System.out.print("\n\n\t\t4. Kết thúc");
			System.out.println("\n\n\t\t+---------- End ----------+");
			
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					giaiPTB1();
					break;
				case 2:
					giaiPTB2();
					break;
				case 3:
					tinhTienDien();
					break;
				case 4:
					System.out.println("Ứng dụng kết thúc.");
	                break;
				default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
			}
		}while (choice != 4);
		
	}

}

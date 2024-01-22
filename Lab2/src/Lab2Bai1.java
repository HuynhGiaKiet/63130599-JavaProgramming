import java.util.*;
//Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b nhập từ bàn phím
public class Lab2Bai1 {

	public static void main(String[] args){
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
}

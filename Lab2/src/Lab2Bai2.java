import java.util.*;
//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím
public class Lab2Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}

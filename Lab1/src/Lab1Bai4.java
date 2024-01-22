import java.util.*;
//Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		// Nhập các hệ số của phương trình
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextInt();

		// Tính delta
		Double delta = Math.pow(b, 2) - (4 * a * c);
		// Xuất căn delta ra màn hình
        if (delta >= 0) 
        {
        	Double candelta = Math.sqrt(delta);
            System.out.println("Căn delta là: " + candelta);
        } 
        else 
        {	
            System.out.println("Delta là số âm, không thể tính căn delta.");
        }
	}
}

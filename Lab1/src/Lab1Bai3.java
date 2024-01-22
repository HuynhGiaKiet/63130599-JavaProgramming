import java.util.Scanner;
//Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích của khối chữ nhật
public class Lab1Bai3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thetichlapphuong, canh;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hãy nhập cạnh của khối lập phương: ");
		canh = scanner.nextInt();
		
		//Tinh Thể tích
		thetichlapphuong = canh * canh * canh;
		System.out.printf("Thể tích khối lập phương: %d", thetichlapphuong);


	}

}
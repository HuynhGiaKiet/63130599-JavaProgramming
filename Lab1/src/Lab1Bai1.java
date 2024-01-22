import java.util.*;
//Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím

public class Lab1Bai1 {
	public static void main(String[] args){
		String hoten;
		Double diemTB;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		hoten = scanner.nextLine();
		System.out.print("Điểm TB: ");
		diemTB = scanner.nextDouble();
		System.out.printf("%s: %.2f điểm", hoten, diemTB);
	}
}
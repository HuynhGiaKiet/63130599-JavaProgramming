import java.util.Scanner;
//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,diện tích và cạnh nhỏ của hình chữ nhật.

public class Lab1Bai2 {
	public static void main(String[] args){
		int chieudai,chieurong;
		int chuvi,dientich;
		int canhmin;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài của hình chữ nhật: ");
		chieudai = scanner.nextInt();
		System.out.print("Chiều rộng của hình chữ nhật: ");
		chieurong = scanner.nextInt();

		//Tinh Chuvi
		chuvi = (chieudai + chieurong)*2;
		System.out.println("Chu vi hình chữ nhật: " +chuvi);
		//Tinh dientich
		dientich = chieudai * chieurong;
		System.out.println("Diện tích hình chữ nhật: " +dientich);
		//Tinhcanhmin
		canhmin = Math.min(chieudai, chieurong);
		System.out.println("Cạnh nhỏ nhất: "+canhmin);
	}
}
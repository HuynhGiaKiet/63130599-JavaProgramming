import java.util.ArrayList;
import java.util.Scanner;
//Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách vừa nhập và tổng của nó.
public class Lab5Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Khởi tạo danh sách số thực
        ArrayList<Double> list = new ArrayList<>();

        // Nhập số lượng tùy ý
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số thực: ");
            Double x = scanner.nextDouble();
            list.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            String yn = scanner.nextLine();
            if (yn.equals("N")) {
                break;
            }
            scanner.nextLine();
        }
            
        
        
        // Nhập các phần tử của danh sách
        //for (int i = 0; i < n; i++) {
            //System.out.print("Nhập số thực thứ " + (i + 1) + ": ");
            //Double x = scanner.nextDouble();
            //list.add(x);
        //}

        // Tính tổng các phần tử của danh sách
        double sum = 0;
        for (Double x : list) 
        {
            sum += x;
        }

        // Xuất danh sách vừa nhập
        System.out.println("Danh sách số thực: ");
        for (Double x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Xuất tổng các phần tử của danh sách
        System.out.println("Tổng các phần tử: " + sum);
	}

}

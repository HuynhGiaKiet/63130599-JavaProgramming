import java.util.*;
//Viết chương trình nhập mảng số nguyên từ bàn phím.
public class Lab3Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo mảng
		int array[]= new int[10];
		// Nhập mảng từ bàn phím
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Sắp xếp mảng
        Arrays.sort(array);

        // Xuất mảng đã sắp xếp
        System.out.println("Mảng đã sắp xếp:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Xuất phần tử có giá trị nhỏ nhất
        int min = array[0];
        for (int i = 1; i < array.length; i++) 
        {
            min = Math.min(min, array[i]);
        }
        System.out.println("\nPhẩn tử có giá trị nhỏ nhất: " + min);
        
        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        //int count = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] % 3 == 0) 
            {
                sum += array[i];
                //count++;
            }
        }
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + (sum / 3));
	}
}

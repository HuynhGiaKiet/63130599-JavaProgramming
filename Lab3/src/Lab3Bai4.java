import java.util.*;
import java.util.Scanner;
//Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
public class Lab3Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo mảng họ tên và điểm
		String fullname[] = new String[5];
		float grade[] = new float[5];
        String gradeLevel;
        
        // Nhập mảng họ tên và điểm
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < fullname.length; i++) 
        {
          System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
          fullname[i] = scanner.nextLine(); 
          System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
          grade[i] = scanner.nextFloat();
          //scanner.nextLine();
          
        }



        
        
        // Xuất mảng đã nhập
        System.out.println("Danh sách sinh viên đã nhập:");
        for (int i = 0; i < fullname.length; i++) 
        {
            System.out.println("Họ tên: " + fullname[i] + ", điểm: " + grade[i]);
            System.out.println();
        }
        
        // Xét học lực
        System.out.println("Xét học lực cho từng sinh viên:");
        for (int i = 0; i < fullname.length; i++) 
        {
            // Xác định học lực
            if (grade[i] < 5) {
                gradeLevel = "Yếu";
            } else if (grade[i] < 6.5) {
                gradeLevel = "Trung bình";
            } else if (grade[i] < 7.5) {
                gradeLevel = "Khá";
            } else if (grade[i] < 9) {
                gradeLevel = "Giỏi";
            } else {
                gradeLevel = "Xuất sắc";
            }
            // Xuất thông tin sinh viên
            System.out.println("Họ tên: " + fullname[i] + ", điểm: " + grade[i] + ", học lực: " + gradeLevel);
            System.out.println();
        }
        
        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        // Sử dụng thuật toán so sánh trực tiếp
        for (int i = 0; i < fullname.length - 1; i++) 
        {
            for (int j = i + 1; j < fullname.length; j++) 
            {
                if (grade[i] > grade[j]) 
                {
                    // Hoán đổi vị trí của hai sinh viên
                    String tempName = fullname[i];
                    float tempGrade = grade[i];
                    fullname[i] = fullname[j];
                    grade[i] = grade[j];
                    fullname[j] = tempName;
                    grade[j] = tempGrade;
                }
            }
        }
        
        // Xuất danh sách sinh viên đã sắp xếp
        System.out.println("Danh sách sinh viên đã sắp xếp:");
        for (int i = 0; i < fullname.length; i++) 
        {
        	// Xác định học lực
            if (grade[i] < 5) {
                gradeLevel = "Yếu";
            } else if (grade[i] < 6.5) {
                gradeLevel = "Trung bình";
            } else if (grade[i] < 7.5) {
                gradeLevel = "Khá";
            } else if (grade[i] < 9) {
                gradeLevel = "Giỏi";
            } else {
                gradeLevel = "Xuất sắc";
            }
            System.out.println("Họ tên: " + fullname[i] + ", điểm: " + grade[i] + ", học lực: " + gradeLevel);
            System.out.println();
        }
	}
}

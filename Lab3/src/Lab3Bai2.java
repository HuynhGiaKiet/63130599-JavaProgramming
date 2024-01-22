import java.util.*;
//Viết chương trình xuất ra màn hình bảng cửu chương
public class Lab3Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int x = 8;
		//Xuất bảng cửu chương 8
		for(int i=1; i<=10;i++)
		{
			System.out.printf("%d x %d = %d",x,i,x*i);
			System.out.println();
		}
		/*// xuất 9 bảng cửu chương
		int kq;
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				kq = i*j;
				System.out.printf("%d x %d = %d",i,j,kq);
				System.out.println();
			}

		}*/

	}

}

import java.util.*;
//Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số nguyên tố hay không 
//(số nguyên tố là số chỉ chia hết cho 1 và chính nó).

public class Lab3Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok = true;
		int n;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Hãy nhập số nguyên: ");
		n = scanner.nextInt();
		for(int i=2; i < n-1; i++)
		{ // N là số nhập từ bàn phím
			if(n % i == 0)
			{
				ok = false;
				break;
			}
		}
		if (ok) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
	}

}

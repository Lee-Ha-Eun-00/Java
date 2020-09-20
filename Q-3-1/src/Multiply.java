import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args){
		int n=0,m=0;
		String z;
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("실수는 입력하면 안됩니다.");
				z = scanner.nextLine();
				continue;
			}
			System.out.print(n + "*" + m + "=" + n*m);
			break;
		}
		scanner.close();
	}
}

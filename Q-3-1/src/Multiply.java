import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args){
		int n=0,m=0;
		String z;
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				z = scanner.nextLine();
				continue;
			}
			System.out.print(n + "*" + m + "=" + n*m);
			break;
		}
		scanner.close();
	}
}

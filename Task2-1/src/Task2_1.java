import java.util.Scanner;
public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("����>> ");
		float number1 = scanner.nextFloat();
		String operater = scanner.next();
		float number2 = scanner.nextFloat();
		float result;
		
		if(operater.equals("+"))
		{
			result = number1 + number2;
			System.out.println(number1+operater+number2+"�� ��� ����� "+ result);
		}
		else if(operater.equals("-"))
		{
			result = number1 - number2;
			System.out.println(number1+operater+number2+"�� ��� ����� "+ result);
		}
		else if(operater.equals("*"))
		{
			result = number1 * number2;
			System.out.println(number1+operater+number2+"�� ��� ����� "+ result);
		}
		else if(operater.equals("/"))
		{
			if(number2 == 0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else
			{
				result = number1 / number2;
				System.out.println(number1+operater+number2+"�� ��� ����� "+ result);
			}
		}		
		else
		{
			System.out.println("������ ����");
		}
		scanner.close();

	}

}

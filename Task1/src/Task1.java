import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int circle1X = scanner.nextInt();
		int circle1Y = scanner.nextInt();
		int circle1Radius=scanner.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		int circle2X = scanner.nextInt();
		int circle2Y = scanner.nextInt();
		int circle2Radius=scanner.nextInt();
		
		int distanceSquare = (circle1X-circle2X)*(circle1X-circle2X)+(circle1Y-circle2Y)*(circle1Y-circle2Y);
		int sumRadius = (circle1Radius + circle2Radius)*(circle1Radius + circle2Radius);
		if(distanceSquare<sumRadius)
		{
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else
		{
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		
		scanner.close();

	}

}

Must declare a named package cecause this compilation unit is associated to the named module 'Homework'
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sanner scanner =new Sanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int circle1X = scanner.nextInt();
		int circle1Y = scanner.nextInt();
		int circle1Radius=scanner.nextInt();
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int circle2X = scanner.nextInt();
		int circle2Y = scanner.nextInt();
		int circle2Radius=scanner.nextInt();
		
		int distanceSquare = (circle1X-circle2X)*(circle1X-circle2X)+(circle1Y-circle2Y)*(circle1Y-circle2Y);
		int sumRadius = circle1Radius + circle2Radius;
		if(ditanceSquare<sumRadius)
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
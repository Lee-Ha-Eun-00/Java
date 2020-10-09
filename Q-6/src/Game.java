import java.util.Scanner;

class Person {
	String name;
}


public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.print("1번째 선수 이름>>");
		p1.name=scanner.nextLine();
		System.out.print("2번째 선수 이름>>");
		p2.name=scanner.nextLine();
		
		int count=0;
		int num1=0, num2=0, num3=0;
		String enter = new String();
		while(count==0)
		{
			//1번째 선수
			System.out.print("["+p1.name+"]:<Enter>");
			enter=scanner.nextLine();
			if(enter.equals(""))
			{
				num1=(int)(Math.random()*3+1);
				System.out.print("       "+num1+"  ");
				num2=(int)(Math.random()*3+1);
				System.out.print(num2+"  ");
				num3=(int)(Math.random()*3+1);
				System.out.print(num3+"  ");
				
				if((num1==num2)&&(num2==num3))
				{
					System.out.println(p1.name+"님이 이겼습니다!");
					count++;
					break;
				}
				else
				{
					System.out.println("아쉽군요!");
				}
			}
			
			//2번째 선수
			System.out.print("["+p2.name+"]:<Enter>");
			enter=scanner.nextLine();
			if(enter.equals(""))
			{
				num1=(int)(Math.random()*3+1);
				System.out.print("       "+num1+"  ");
				num2=(int)(Math.random()*3+1);
				System.out.print(num2+"  ");
				num3=(int)(Math.random()*3+1);
				System.out.print(num3+"  ");
				
				if((num1==num2)&&(num2==num3))
				{
					System.out.println(p2.name+"님이 이겼습니다!");
					count++;
					break;
				}
				else
				{
					System.out.println("아쉽군요!");
				}
			}
			
		}
		scanner.close();
	}

}

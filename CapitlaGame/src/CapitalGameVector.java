import java.util.Vector;
import java.util.Scanner;

class Nation{
	String country;
	String capital;
}
public class CapitalGameVector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Nation> v = new Vector<Nation>();
		
		int menu=0;
		int count=0; 
		int checkCount=0;
		int i;
		int num;
		String country;
		String capital;
		String answer;
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		
		while(menu!=3)
		{
			System.out.print("�Է�:1, ����:2, ����:3>>");
			
			menu = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(menu)
			{
			case 1:
				System.out.println("���� " + count + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				do {		
					System.out.print("����� ���� �Է�" + (count+1) + ">> ");
					country=scanner.next();
					for(i=0; i<v.size(); i++)
					{
						Nation check=new Nation();
						check = v.elementAt(i);
						
						if(country.equals(check.country))
						{
							System.out.println(check.country + "�� �̹� �ֽ��ϴ�!");
							scanner.nextLine();
							checkCount++;
							break;
						}
						else if(country.equals("�׸�"))
						{
							checkCount++;
							break;
						}
					}
					if(checkCount==0)
					{
						capital=scanner.next();
						Nation input=new Nation();
						input.country=country;
						input.capital=capital;
						v.add(count,input);
						count++;
					}
					checkCount=0;
				} while(!(country.equals("�׸�")));
				break;
				
			case 2:
				while(true)
				{
					Nation quize=new Nation();
					num=(int)(Math.random()*count);
					quize=v.get(num);
					System.out.print(quize.country + "�� ������?");
					answer = scanner.next();
					if((quize.capital).equals(answer))
					{
						System.out.println("����!!");
					}
					else if(answer.equals("�׸�"))
					{
						break;
					}	
					else
					{
						System.out.println("�ƴմϴ�!!");
					}
						
				}
				break;
				
			case 3:
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}
}

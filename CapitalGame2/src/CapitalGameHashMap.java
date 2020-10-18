import java.util.*;

public class CapitalGameHashMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> Game=new HashMap<String,String>();
		
		int menu=0;
		int count=0; 
		int checkCount=0;
		int i;
		
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
					for(i=0; i<Game.size(); i++)
					{
						
						if(Game.containsKey(country)==true)
						{
							System.out.println(country + "�� �̹� �ֽ��ϴ�!");
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
						Game.put(country, capital);
						count++;
					}
					checkCount=0;
				} while(!(country.equals("�׸�")));
				break;
				
			case 2:
				int check=1;
				while(check==1)
				{
					Set <String> keys = Game.keySet();
					Iterator<String> it = keys.iterator();
					while(it.hasNext())
					{
						String quize = it.next();
						System.out.print(quize + "�� ������?");
						answer = scanner.next();
						if((Game.get(quize)).equals(answer))
						{
							System.out.println("����!!");
						}
						else if(answer.equals("�׸�"))
						{
							check=0;
							break;
						}	
						else
						{
							System.out.println("�ƴմϴ�!!");
						}
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

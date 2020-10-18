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
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(menu!=3)
		{
			System.out.print("입력:1, 퀴즈:2, 종료:3>>");
			
			menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu)
			{
			case 1:
				System.out.println("현재 " + count + "개의 나라와 수도가 입력되어 있습니다.");
				
				do {		
					System.out.print("나라와 수도 입력" + (count+1) + ">> ");
					country=scanner.next();
					for(i=0; i<Game.size(); i++)
					{
						
						if(Game.containsKey(country)==true)
						{
							System.out.println(country + "는 이미 있습니다!");
							scanner.nextLine();
							checkCount++;
							break;
						}
						else if(country.equals("그만"))
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
				} while(!(country.equals("그만")));
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
						System.out.print(quize + "의 수도는?");
						answer = scanner.next();
						if((Game.get(quize)).equals(answer))
						{
							System.out.println("정답!!");
						}
						else if(answer.equals("그만"))
						{
							check=0;
							break;
						}	
						else
						{
							System.out.println("아닙니다!!");
						}
					}
				}
				break;
				
			case 3:
				System.out.println("게임을 종료합니다.");
				break;	
			}
		}	
		scanner.close();
	}

}

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
					for(i=0; i<v.size(); i++)
					{
						Nation check=new Nation();
						check = v.elementAt(i);
						
						if(country.equals(check.country))
						{
							System.out.println(check.country + "는 이미 있습니다!");
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
						Nation input=new Nation();
						input.country=country;
						input.capital=capital;
						v.add(count,input);
						count++;
					}
					checkCount=0;
				} while(!(country.equals("그만")));
				break;
				
			case 2:
				while(true)
				{
					Nation quize=new Nation();
					num=(int)(Math.random()*count);
					quize=v.get(num);
					System.out.print(quize.country + "의 수도는?");
					answer = scanner.next();
					if((quize.capital).equals(answer))
					{
						System.out.println("정답!!");
					}
					else if(answer.equals("그만"))
					{
						break;
					}	
					else
					{
						System.out.println("아닙니다!!");
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

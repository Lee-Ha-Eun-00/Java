import java.util.Scanner;
import java.util.Random;

public class RSP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		int ran = rd.nextInt(3)+1;
		String computer;
		int condition=0;
		 
		 if(ran==1)
			 computer="가위";
		 else if(ran==2)
			 computer="바위";
		 else
			 computer="보";
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String user;
		
		do {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			
			switch(user){
			case"가위":
				if(computer=="가위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 비겼습니다.");
				else if(computer=="바위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
				else if(computer=="보")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
				break;
			case"바위":
				if(computer=="가위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
				else if(computer=="바위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 비겼습니다.");
				else if(computer=="보")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
				break;
			case"보":
				if(computer=="가위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
				else if(computer=="바위")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
				else if(computer=="보")
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + ", 비겼습니다.");
				break;
			case"그만":
				condition=1;
				System.out.println("게임을 종료합니다...");
				break;
			default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
			
		}while(condition==0);

	}

}

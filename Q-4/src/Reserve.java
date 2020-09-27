import java.util.Scanner;

class Seat{
	String name="";
	int reservationSeat = 0;
}


public class Reserve {

	public static void main(String[] args) {

		int condition =1;
		
		Seat [] S=new Seat[10];
		for(int i=0;i<S.length;i++)
			S[i]=new Seat();
		
		Seat [] A=new Seat[10];
		for(int i=0;i<A.length;i++)
			A[i]=new Seat();
		
		Seat [] B=new Seat[10];
		for(int i=0;i<B.length;i++)
			B[i]=new Seat();
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Scanner scanner=new Scanner(System.in);
		
		while(condition==1) {
			
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1: //예약
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				int seatType = scanner.nextInt();
				
				if(seatType==1) //S좌석 예약
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) //S좌석 예약 상태 출력
					{
						if(S[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(S[i].name+" ");
					}
					
					//예약정보입력
					System.out.println(); 
					scanner.nextLine();
					System.out.print("이름>>");
					String name = scanner.nextLine();
					System.out.print("번호>>");
					int number = scanner.nextInt();
					
					if(number>10) //잘못된 좌석번호 입력
					{
						System.out.println("없는 좌석 번호 입니다.");
						continue;
					}
					if(S[number-1].reservationSeat == 1) //이미예약된 자석 입력시 예외처리
					{
						System.out.println("이미 예약된 좌석입니다.");
						continue;
					}
				
					
					//좌석 예약
					S[number-1].reservationSeat = 1;
					S[number-1].name=name;
				}
				
				
				else if(seatType==2) //A좌석
				{
					System.out.print("A>> ");
					for(int i=0; i<10; i++)
					{
						if(A[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(A[i].name+" ");
					}
					
					System.out.println();
					scanner.nextLine();
					System.out.print("이름>>");
					String name = scanner.nextLine();
					System.out.print("번호>>");
					int number = scanner.nextInt();
					
					
					if(number>10) //잘못된 좌석번호 입력
					{
						System.out.println("없는 좌석 번호 입니다.");
						continue;
					}
					if(A[number-1].reservationSeat == 1)
					{
						System.out.println("이미 예약된 좌석입니다.");
						continue;
					}
					
					A[number-1].reservationSeat = 1;
					A[number-1].name=name;
				}
				
				
				else if(seatType==3)//B좌석 예약
				{
					System.out.print("B>> ");
					for(int i=0; i<10; i++)
					{
						if(B[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(B[i].name+" ");
					}
					
					System.out.println();
					scanner.nextLine();
					System.out.print("이름>>");
					String name = scanner.nextLine();
					System.out.print("번호>>");
					int number = scanner.nextInt();
					
					
					if(number>10) //잘못된 좌석번호 입력
					{
						System.out.println("없는 좌석 번호 입니다.");
						continue;
					}
					if(B[number-1].reservationSeat == 1)
					{
						System.out.println("이미 예약된 좌석입니다.");
						continue;
					}
					
					B[number-1].reservationSeat = 1;
					B[number-1].name=name;
				}
				
				
				else 
				{
					System.out.println("없는 메뉴 입니다.");
					continue;
				}
				break;
				
			case 2: //조회
				System.out.print("S>>");
				for(int i=0; i<10; i++)
				{
					if(S[i].reservationSeat==0)
						System.out.print("--- ");
					else
						System.out.print(S[i].name+" ");
				}
				System.out.println();
				
				
				System.out.print("A>>");
				for(int i=0; i<10; i++)
				{
					if(A[i].reservationSeat==0)
						System.out.print("--- ");
					else
						System.out.print(A[i].name+" ");
				}
				System.out.println();
				
				
				System.out.print("B>>");
				for(int i=0; i<10; i++)
				{
					if(B[i].reservationSeat==0)
						System.out.print("--- ");
					else
						System.out.print(B[i].name+" ");
				}
				System.out.println();
				
				
				System.out.println("<<조회를 완료하였습니다.>>");
				break;
				
			case 3://취소
				int count=0;//일치하는 이름이 있는 확인할 변수
				System.out.print("좌석 S:1, A:2, B:3>>");
				int cancelSeat = scanner.nextInt();
				
				
				if(cancelSeat==1) //S좌석 취소
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) //S좌석 예약 상태 출력
					{
						if(S[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(S[i].name+" ");
					}
					
					//취소할 사람 이름 받기
					scanner.nextLine();
					System.out.println(); 
					System.out.print("이름>>");
					String cancelNameS = scanner.nextLine();
					
					//이름찾기
					for(int i=0; i<10; i++)
					{
						
						if(cancelNameS.equals(S[i].name))
						{
							S[i].name=" ";
							S[i].reservationSeat=0;
							count++;
							break;
						}
					}
					
					//해당 이름이 없을 때
					if(count==0)
					{
						System.out.println("없는 이름입니다.");
						continue;
					}
					count=0;
				}
				
				
				else if(cancelSeat==2) //A좌석 취소
				{
					System.out.print("A>> ");
					for(int i=0; i<10; i++) //A좌석 예약 상태 출력
					{
						if(A[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(A[i].name+" ");
					}
					
					//취소할 사람 이름 받기
					scanner.nextLine();
					System.out.println(); 
					System.out.print("이름>>");
					String cancelNameA = scanner.nextLine();
					
					//이름찾기
					for(int i=0; i<10; i++)
					{
						if(cancelNameA.equals(A[i].name))
						{
							A[i].name=" ";
							A[i].reservationSeat=0;
							count++;
							break;
						}
					}
					
					//해당 이름이 없을 때
					if(count==0)
					{
						System.out.println("없는 이름입니다.");
						continue;
					}
					count=0;	
				}
				
				
				else if(cancelSeat==3) //B좌석 취소
				{
					System.out.print("B>> ");
					for(int i=0; i<10; i++) //B좌석 예약 상태 출력
					{
						if(B[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(B[i].name+" ");
					}
					
					//취소할 사람 이름 받기
					scanner.nextLine();
					System.out.println(); 
					System.out.print("이름>>");
					String cancelNameB = scanner.nextLine();
					
					//이름찾기
					for(int i=0; i<10; i++)
					{
						if(cancelNameB.equals(B[i].name))
						{
							B[i].name=" ";
							B[i].reservationSeat=0;
							count++;
							break;
						}
					}
					
					//해당 이름이 없을 때
					if(count==0)
					{
						System.out.println("없는 이름입니다.");
						continue;
					}
					count=0;	
			    }
				
				
				else
				{
					System.out.println("없는 메뉴 입니다.");
					continue;
				}
				break;
				
			case 4:
				System.out.println("<<시스템을 종료합니다.>>");
				condition=0;
				break;
				
			default:
				System.out.println("없는 메뉴입니다.");
				break;
		
			}

		}
		scanner.close();
	}

}

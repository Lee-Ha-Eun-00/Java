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
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Scanner scanner=new Scanner(System.in);
		
		while(condition==1) {
			
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1: //����
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int seatType = scanner.nextInt();
				
				if(seatType==1) //S�¼� ����
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) //S�¼� ���� ���� ���
					{
						if(S[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(S[i].name+" ");
					}
					
					//���������Է�
					System.out.println(); 
					scanner.nextLine();
					System.out.print("�̸�>>");
					String name = scanner.nextLine();
					System.out.print("��ȣ>>");
					int number = scanner.nextInt();
					
					if(number>10) //�߸��� �¼���ȣ �Է�
					{
						System.out.println("���� �¼� ��ȣ �Դϴ�.");
						continue;
					}
					if(S[number-1].reservationSeat == 1) //�̹̿���� �ڼ� �Է½� ����ó��
					{
						System.out.println("�̹� ����� �¼��Դϴ�.");
						continue;
					}
				
					
					//�¼� ����
					S[number-1].reservationSeat = 1;
					S[number-1].name=name;
				}
				
				
				else if(seatType==2) //A�¼�
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
					System.out.print("�̸�>>");
					String name = scanner.nextLine();
					System.out.print("��ȣ>>");
					int number = scanner.nextInt();
					
					
					if(number>10) //�߸��� �¼���ȣ �Է�
					{
						System.out.println("���� �¼� ��ȣ �Դϴ�.");
						continue;
					}
					if(A[number-1].reservationSeat == 1)
					{
						System.out.println("�̹� ����� �¼��Դϴ�.");
						continue;
					}
					
					A[number-1].reservationSeat = 1;
					A[number-1].name=name;
				}
				
				
				else if(seatType==3)//B�¼� ����
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
					System.out.print("�̸�>>");
					String name = scanner.nextLine();
					System.out.print("��ȣ>>");
					int number = scanner.nextInt();
					
					
					if(number>10) //�߸��� �¼���ȣ �Է�
					{
						System.out.println("���� �¼� ��ȣ �Դϴ�.");
						continue;
					}
					if(B[number-1].reservationSeat == 1)
					{
						System.out.println("�̹� ����� �¼��Դϴ�.");
						continue;
					}
					
					B[number-1].reservationSeat = 1;
					B[number-1].name=name;
				}
				
				
				else 
				{
					System.out.println("���� �޴� �Դϴ�.");
					continue;
				}
				break;
				
			case 2: //��ȸ
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
				
				
				System.out.println("<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>");
				break;
				
			case 3://���
				int count=0;//��ġ�ϴ� �̸��� �ִ� Ȯ���� ����
				System.out.print("�¼� S:1, A:2, B:3>>");
				int cancelSeat = scanner.nextInt();
				
				
				if(cancelSeat==1) //S�¼� ���
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) //S�¼� ���� ���� ���
					{
						if(S[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(S[i].name+" ");
					}
					
					//����� ��� �̸� �ޱ�
					scanner.nextLine();
					System.out.println(); 
					System.out.print("�̸�>>");
					String cancelNameS = scanner.nextLine();
					
					//�̸�ã��
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
					
					//�ش� �̸��� ���� ��
					if(count==0)
					{
						System.out.println("���� �̸��Դϴ�.");
						continue;
					}
					count=0;
				}
				
				
				else if(cancelSeat==2) //A�¼� ���
				{
					System.out.print("A>> ");
					for(int i=0; i<10; i++) //A�¼� ���� ���� ���
					{
						if(A[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(A[i].name+" ");
					}
					
					//����� ��� �̸� �ޱ�
					scanner.nextLine();
					System.out.println(); 
					System.out.print("�̸�>>");
					String cancelNameA = scanner.nextLine();
					
					//�̸�ã��
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
					
					//�ش� �̸��� ���� ��
					if(count==0)
					{
						System.out.println("���� �̸��Դϴ�.");
						continue;
					}
					count=0;	
				}
				
				
				else if(cancelSeat==3) //B�¼� ���
				{
					System.out.print("B>> ");
					for(int i=0; i<10; i++) //B�¼� ���� ���� ���
					{
						if(B[i].reservationSeat==0)
							System.out.print("--- ");
						else
							System.out.print(B[i].name+" ");
					}
					
					//����� ��� �̸� �ޱ�
					scanner.nextLine();
					System.out.println(); 
					System.out.print("�̸�>>");
					String cancelNameB = scanner.nextLine();
					
					//�̸�ã��
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
					
					//�ش� �̸��� ���� ��
					if(count==0)
					{
						System.out.println("���� �̸��Դϴ�.");
						continue;
					}
					count=0;	
			    }
				
				
				else
				{
					System.out.println("���� �޴� �Դϴ�.");
					continue;
				}
				break;
				
			case 4:
				System.out.println("<<�ý����� �����մϴ�.>>");
				condition=0;
				break;
				
			default:
				System.out.println("���� �޴��Դϴ�.");
				break;
		
			}

		}
		scanner.close();
	}

}

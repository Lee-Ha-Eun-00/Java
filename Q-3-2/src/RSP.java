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
			 computer="����";
		 else if(ran==2)
			 computer="����";
		 else
			 computer="��";
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String user;
		
		do {
			System.out.print("���� ���� ��!>>");
			user = scanner.next();
			
			switch(user){
			case"����":
				if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", �����ϴ�.");
				else if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(computer=="��")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ����ڰ� �̰���ϴ�.");
				break;
			case"����":
				if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ����ڰ� �̰���ϴ�.");
				else if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", �����ϴ�.");
				else if(computer=="��")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ��ǻ�Ͱ� �̰���ϴ�.");
				break;
			case"��":
				if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(computer=="����")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", ����ڰ� �̰���ϴ�.");
				else if(computer=="��")
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + ", �����ϴ�.");
				break;
			case"�׸�":
				condition=1;
				System.out.println("������ �����մϴ�...");
				break;
			default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
			}
			
		}while(condition==0);

	}

}

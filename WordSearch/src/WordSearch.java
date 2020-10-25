import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		String search;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		String file =scanner.nextLine();
		
		int count=0;//������ ��ü ��θ����� Ȯ���ϱ� ���� ����
		for(int i=0; i<file.length(); i++)
		{
			if(file.charAt(i)=='/')
			{
				count++;
			}
			
		}
		
		
		do {
			BufferedReader fin = null;
			
			System.out.print("�˻��� �ܾ ����>> ");
			search =scanner.nextLine();
			
			try {
				if(count!=0)
				{
					fin = new BufferedReader(new FileReader(file));
				
				}
				else
				{
					fin = new BufferedReader(new FileReader("C:\\Users\\������\\eclipse-workspace\\WordSearch\\"+file));
				}
				
				String str; //�о�� ���� ������ string
				while(true)
				{
					str=fin.readLine();
					if(str==null) 
						break;
					else
						v.add(str);
				}
				
				
				String check;
				for(int i=0; i<v.size(); i++)
				{
					check=v.get(i);
					if(check.contains(search)==true)
					{
						System.out.println(check);
					}
				}
					
				fin.close();
			}
			
			catch(IOException e) {
				System.out.println("����� ����");
			}
			
		}while(!(search.equals("�׸�")));
		
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}

}
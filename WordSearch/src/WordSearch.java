import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		String search;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		String file =scanner.nextLine();
		
		int count=0;//파일이 전체 경로명인지 확인하기 위한 변수
		for(int i=0; i<file.length(); i++)
		{
			if(file.charAt(i)=='/')
			{
				count++;
			}
			
		}
		
		
		do {
			BufferedReader fin = null;
			
			System.out.print("검색할 단어나 문장>> ");
			search =scanner.nextLine();
			
			try {
				if(count!=0)
				{
					fin = new BufferedReader(new FileReader(file));
				
				}
				else
				{
					fin = new BufferedReader(new FileReader("C:\\Users\\이하은\\eclipse-workspace\\WordSearch\\"+file));
				}
				
				String str; //읽어온 문장 저장할 string
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
				System.out.println("입출력 오류");
			}
			
		}while(!(search.equals("그만")));
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

}
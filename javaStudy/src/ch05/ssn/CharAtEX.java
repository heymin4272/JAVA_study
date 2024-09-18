
package ch05.ssn;

import java.util.Scanner;

public class CharAtEX 
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("주민등록 번호 전체를 입력하시오. (예시 : 9809252123456)");
			String inputID = scanner.nextLine();
			
			System.out.println("이름을 입력하시오. (예시 : 홍길동)");
			String inputName = scanner.nextLine();
			
			if(inputID.length() != 13)
			{
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
			else
			{
				
				personalInfo person1 = new personalInfo(inputID);
				
				System.out.print("이름 : " + inputName + ", ");
				System.out.print("성별 : " +person1.gender + ", ");
				System.out.print("나이 : " +person1.age + ", ");
				System.out.print("생년월일 : " + person1.birthYear + "년 ");
				System.out.print(person1.birthMonth + "월 ");
				System.out.println(person1.birthDay + "일 ");
				
			}
		
		}
		
		System.out.println("프로그램이 종료됩니다. ");
				
	}
}

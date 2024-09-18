// 주민번호 앞자리와 이름을 입력 받아 다시 이름과 생년월일로 나누어 출력하시오.

package ch05.exam;

import java.util.Scanner;

public class StringEX 

{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("주민등록 번호 앞자리 6자 입력하시오. (예시 : 980925)");
			String inputID = scanner.nextLine();
			
			System.out.println("이름을 입력하시오. (예시 : 홍길동)");
			String inputName = scanner.nextLine();
			
			if(inputID.length() != 6)
			{
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
			else
			{
				
				String birthYear =inputID.substring(0,2);
				String birthMonth = inputID.substring(2,4);
				String birthDay = inputID.substring(4,6);
				
				System.out.print("이름 : " + inputName + ", ");
				System.out.print("생년월일 : " + birthYear + "년 ");
				System.out.print(birthMonth + "월 ");
				System.out.println(birthDay + "일 ");
				
			}
			System.out.println("프로그램을 계속합니까? (no 입력시 종료)");
			String isEnd = scanner.nextLine();
			
			if(isEnd == "no" || isEnd == "No" || isEnd == "NO" || isEnd == "nO") 
			{
				break;
			}
		
		}
		
		System.out.println("프로그램이 종료됩니다. ");
				
	}
}

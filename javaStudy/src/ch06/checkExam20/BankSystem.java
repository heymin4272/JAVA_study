package ch06.checkExam20;

import java.util.Scanner;

public class BankSystem 
{
	

	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.계정 만들기  2.입금  3.출금  4.잔액 조회  5.계좌 찾기  6.계좌 삭제  7.계좌 목록 출력  0.시스템 종료 ");
			
			String menuSelect = scan.nextLine();
			
			if(menuSelect.equals("0"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else
			{
				switch(menuSelect)
				{
				
				case "1":		// 계정 만들기
					{
						
						System.out.println("이름을 입력하세요 ");
						String inputName = scan.nextLine();
						
						System.out.println("만들 계좌의 계좌 번호 6자리를 입력하세요 ");
						String inputNum = scan.nextLine();
						
						System.out.println("만들 계좌의 초기 예금 금액을 임력하세요  ");
						int inputFirstDeposit = Integer.parseInt(scan.nextLine());
						
						BankApplication newAccount = new BankApplication();
						newAccount.createAccount(inputName, inputNum, inputFirstDeposit);
						break;
					}
					
				case "2":		// 입금
					{
				
						break;
					}
				
				case "3":		// 출금
					{
				
						break;
					}
				
				case "4":		// 잔액 조회
					{
				
						break;
					}
				
				case "5":		// 계좌 찾기
					{
				
						break;
					}
				
				case "6":		// 계좌 찾기 
					{
				
						break;
					}
				
				case "7":		// 계좌 목록 출력 
				{
				
					break;
				}
				
				
				
				}
			}
			
		}
		
		
		
		
	
	}
	
	
	
}

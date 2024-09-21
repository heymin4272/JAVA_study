package ch06.checkExam20;


public class BankApplication extends Account
{
	
	//field
	int amount; // 입출금시 사용자가 입력한 금액
	int currentListNum;
	
	String searchNum;
	String searchName;
	Account searchOutput;
	
	
	Account[] list = new Account[100];
		
	
	//method
	public void createAccount(String name, String accountNum, int firstDeposit)
	{
		Account newAccount = new Account(name, accountNum, firstDeposit);
		currentListNum = 1;
		
		if(list[99] != null)		// 목록이 가득 찬 경우 
		{
			System.out.println("계좌 목록이 가득 찼습니다.");
			
		}
		else if(list[0] == null) 		// 목록의 시작일 경우 
		{
			list[0] = newAccount;
			list[0].balance = list[0].firstDeposit;
		}
		
		else							// 1~98번 배열에 저장될 경우
		{
			while(true)
			{
				for(int i = 1; i < 100; i++)
				{
					if(list[i]== null)
					{
						currentListNum = i;
						break;  // for 문 탈출
					}
				}
				
				list[currentListNum] = newAccount;
				list[currentListNum].balance = list[currentListNum].firstDeposit;
				break; // while 문 탈출 
				
			}
		}
	}
	
	
	public int deposit(int amount)
	{
		return balance + amount;
	}
	
	public int withdraw(int amount)
	{
		return balance - amount;
	}
	
	public void searchAccount(String searchNum, String searchName)
	{
		for(int i = 0; i < 100; i++)
		{
			if(searchNum.equals(list[i].accountNum) && searchName.equals(list[i].name))
			{
				searchOutput = list[i];
				break;
			}
		}
	}
	
	public void checkAccount(Account searchOutput)
	{
		System.out.println("Name : " + searchOutput.name + " ");
		System.out.println("Account Number : " + searchOutput.accountNum + " ");
		System.out.println("Balance : " + searchOutput.balance +" ");
		
	}
		
	
	
	
}

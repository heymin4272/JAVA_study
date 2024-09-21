package ch06.checkExam20;


public class Account 
{
	String name;  // 계좌 사용자 
	String accountNum;	// 계좌번호
	int firstDeposit;	// 초기 예금
	int balance; // 잔액
	
	
	
	
	public Account() {}
	public Account(String name, String accountNum, int firstDeposit)
	{
		this.name = name;
		this.accountNum = accountNum;
		this.firstDeposit = firstDeposit;
	}
	
	
	
	
	
}

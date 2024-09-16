

package ch06.sec08.exam03;

public class Car 
{
	// 리턴문
	// 리턴 뒤에는 문장이 올 수 없음
	//Unreachable code 컴파일 에러 발생
	
	int gas;
	
	// 리턴 값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas( int gas )
	{
		this.gas = gas;
	}
	
	// 리턴값이 boolean
	// gas 필드 값이 0이면 false
	// gas 필드 값이 0이 아니면 true
	boolean isLeftGas()
	{
		if( gas == 0)
		{
			System.out.println("가스가 없습니다.");
			return false;		
		}
		
		System.out.println("가스가 있습니다.");
		return true;
	}
	// 하나의 블럭에서 리턴문이 2개일 수 있는 이유
	// if문이 정상적으로 실행되면 그 아래에 오는 코드는 실행되지 않기 때문
	
	
	// 리턴값이 없는 메소드로 필드 값이 0이면 return문으로 메소드 종료 
	void run()
	{
		while( true )
		{
			if(gas > 0)
			{
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1; // run 메소드로 입력 받은 값을 1씩 감산한다. 0이 될 때 까지. 
			}
			
			else
			{
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
	
}

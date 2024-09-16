


package ch06.sec08.exam03;

public class CarEX 
{
	public static void main(String[] args)
	{
		Car myCar = new Car();
		
		// 리턴값이 없는 메소드 호출
		myCar.setGas(5);
		
		//isLeftGas 메소드를 호출, 받은 리턴값이 true일 경우
		//if 블록 실행
		if( myCar.isLeftGas())
		{
			System.out.println("출발합니다.");
			
			// 리턴값이 없는 메소드 호출
			myCar.run();
		}
		
		System.out.println("가스를 주입해주세요.");	
	}
}

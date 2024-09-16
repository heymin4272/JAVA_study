
package ch06.sec06.exam02;

public class CarEX 
{
	public static void main(String[] args)
	{
		// Car 객체 생성
		Car myCar = new Car();
		
		// Car 객체 필드값 읽
		System.out.println("제작 회사 : " +myCar.company );
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("배기량 : " + myCar.displacement);
		
		// Car 객체 필드 값 변경
		myCar.displacement = 3000;
		
		System.out.println("수정된 배기량 : " + myCar.displacement);
		
		
	}
}



package ch06.sec06.exam01;

public class CarEX 
{
	public static void main(String[] args)
	{
		// Car 객체 생성 
		Car myCar = new Car();
		Car yourCar = new Car();
		
		// 비교를 위해 필드 값 대입 
		myCar.model = "BMW";
		myCar.start = true;
		myCar.speed = 210;
		
		// 필드 값을 대입한 객체
		System.out.println("1. 모델명 : " + myCar.model + "  시동 여부 : " + myCar.start);
		System.out.println("  최고 속도 : " + myCar.speed);
		
		// 필드 값을 대입하지 않은 객
		System.out.println("2. 모델명 : " + yourCar.model + "  시동 여부 : " + yourCar.start);
		System.out.println("  최고 속도 : " + yourCar.speed);
		
		
	}
}

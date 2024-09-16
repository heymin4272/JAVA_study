


package ch06.sec09;

public class Car 
{
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model)
	{
		this.model = model; 
		// 인스턴스 멤버에 접근하기 위한 this 키워드
		//this 생략 불가
	}
	
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	
	//이하에 쓴 this는 생략이 가능하다
	void run()
	{
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다. (시속 :" + this.speed + "km/h )");
	}
	
}

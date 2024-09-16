

package ch06.sec07.exam04;

public class Car 
{
	//생성자 오버로딩
	// 매개변수의 티입, 개수 그리고 선언된 순서가 다르게 
	// 여러 개의 생성자를 선언하는 것
	String company = "현대 자동차 ";
	String model;
	String color;
	int maxSpeed;
	
	
	// new 연산자로 생성자를 호출할 때 제공된 매개값의 타입과 수에 따라 
	// 실행될 생성자가 결정된다
	
	// 생성자 1
	Car() {}
	
	
	// 생성자 2
	Car(String model)
	{
		this.model = model;
	}
	
	// 생성자 3
	Car(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	// 생성자 4
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

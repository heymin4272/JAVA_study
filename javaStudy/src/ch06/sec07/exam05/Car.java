

package ch06.sec07.exam05;

public class Car 

{
	// 중복 코드 피하기 위해
	// 코드를 한 생성자에만 작성하고
	// 나머지는 this를 사용하여 그 생성자를 호출하여 사
	
	// 필드 선언
	String company = "현대 자동차 ";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 1
	Car(String model)
	{
		this(model, "Silver", 250); // 20라인 생성자 호출
	}
	
	// 생성자 2
	Car(String model, String color)
	{
		this(model, color, 250); // 20라인 생성자 호출
	}
	
	// 호출이 끝나면 호출된 생성자로 되돌아가서 다음 실행문 실행
	
	// 생성자 3, 공통의 초기화 코드
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

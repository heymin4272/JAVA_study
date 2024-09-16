

package ch06.sec07.exam05;

public class CarEX 
{
	public static void main(String[] args)
	{
		// 생성자 1 호출 -> 생성자 3 호출
		
		Car car1 = new Car("BMW");		
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		// 생성자 2 호출 -> 생성자 3 호출
		
		Car car2 = new Car("BMW", "BLACK");		
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		//생성자 3 호출
		
		Car car3 = new Car("LandRover", "RED", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
				
	}
}

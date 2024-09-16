

package ch06.sec07.exam04;

public class CarEX 
{
	public static void main(String[] args)
	{
		// 생성자 1 호출
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		// 생성자 2 호출
		Car car2 = new Car("BMW");		// String
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		// 생성자 3 호출
		Car car3 = new Car("BMW", "BLACK");		// String, String
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		// 생성자 4 호출
		Car car4 = new Car("LandRover", "RED", 200);	// String, String, int
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
				
	}
}







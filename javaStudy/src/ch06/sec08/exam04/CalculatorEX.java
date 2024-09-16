




package ch06.sec08.exam04;

public class CalculatorEX 
{
	public static void main(String[] args)
	{
		Calculator myCalcu = new Calculator();
		
		// 매개값의 타입에 따라 오버로딩된 메소드 중 하나를 실행
		
		double result1 = myCalcu.areaRectangle( 10 );
		// 매개값이 하나이므로 areaRectangle( double width ) 실행
		
		double result2 = myCalcu.areaRectangle( 10, 20 );
		// 매개값이 두개이므로 areaRectangle( double width,double height ) 실행
		
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}
}

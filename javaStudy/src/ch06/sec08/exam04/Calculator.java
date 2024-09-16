


package ch06.sec08.exam04;

public class Calculator 
{
	
	// 메소드 오버로딩
	
	// 리턴 타입 / 메소드 이름 / ( 타입 변수, ... )
	// 무관		  동일		타입, 개수, 순서가 달라야 함
	
	// 정사각형의 넓이
	double areaRectangle( double width )
	{
		return width * width;
	}
	
	
	// 직사각형의 넓이
	double areaRectangle( double width, double height )
	{
		return width * height;
	}
}

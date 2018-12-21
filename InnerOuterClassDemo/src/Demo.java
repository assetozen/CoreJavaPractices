/**
 * Reference:- https://www.youtube.com/watch?v=iqp7NQCN2ck&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&index=21
 * @author a.asfaw
 *
 */



class Outer // Class name: Outer.class 
{
	int a;

	public void show() {
		System.out.println("show method in outer class");
	}
	
	
	class Inner // Class name: Outer$Inner.class
	{
		public void display() {
			System.out.println("Display method in inner class under outer class");
		}
		
	}
	
	
	static class StaticInner  // Class name: Outer$StaticInner.class  
	{
		public void display()
		{
			System.out.println("Display method in the static inner class under outer class");
			
		}
	}

}

public class Demo //Class name:- Demo.class 
{

	public static void main(String[] args) {

		Outer outerObj = new Outer();
		outerObj.show();
		
		System.out.println("");
		
		// accessing a method inside inner class
		Outer.Inner innerObj = outerObj.new Inner();
		innerObj.display();
		
		System.out.println("");
		
		
		// accessing a method inside a static inner class
		Outer.StaticInner staticInnerObj = new Outer.StaticInner();
		staticInnerObj.display();
		
		
		
		
	}
}

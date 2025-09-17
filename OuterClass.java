package packagePoly;
/*Java Inner Classes
 * In java, it is also possible to nest classes (a class within a class).
 * The purpose of nested classes is to group classes that belong together,
 * which makes your code more readable and maintainable.
 * To access the inner class, create an object of the outer class,
 * and than create an object of the inner class:
 * ExampleGet Own Java Server*/
class OuterClass //1st class---Outer class
{ 
	int x = 10;
   class InnerClass //2nd class-- Inner class
   {
	   int y = 10;
   }
}//----outer class closes here
public class JavaInnerClass{
	public static void main(String[] args) {
		OuterClass myOuter=new OuterClass();
		//OuterClassName.InnerClassName InnerClassobject=OuterClassName.InnerClassName 
	OuterClass.InnerClass myInner=myOuter.new InnerClass();
	System.out.println(myInner.y+ myOuter.x);

	}

}

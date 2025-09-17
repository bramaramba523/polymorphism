package packagePoly;
class Kia //base or parent or super class
{
	void safety()
	{
		System.out.println("Drive carefully");
	}
}
class Car extends Kia//Derived or child or sub class
{
	//its optional but catch mistakes(eg wrong method signature0
	@override
	void safety()
	{
		System.out.println("car is safe but even though drive carefully");
	}
}


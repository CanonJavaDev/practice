
// Example for "Instance and Static method with passing objects"
class X {}
class Emp{}
class Y{}
class Student{}
class Test  
{
	void m1(X x, Emp e) 
	{
		System.out.println("-------Instance Method--------");
		}
		static void m2(Y y,Student s)
	{
		System.out.println("-------Static  Method--------");
		}
	public static void main(String[] args) 
	{
		System.out.println("-----Object Parameters-----");
		Test t = new Test();
		X x = new X();
		Emp e1 = new Emp();
		t.m1(x,e1); // Single line can be t.m1(new X(), new Emp());

		Y y = new Y();
		Student s = new Student();
		Test.m2(y, s); //Test.m2(new y(), new Student());
		}
	}


// Example for "Instance and Static method parameter passing at "initial" "
class Test  
{
	void m1(int a, char ch) //local variables
	{
		System.out.println("-------Instance Method--------");
		System.out.println(a);
		System.out.println(ch);
		}
		static void m2(String s,double d) //local variables
	{
		System.out.println("-------Static  Method--------");
		System.out.println(s);
		System.out.println(d);
		}
	public static void main(String[] args) 
	{
		System.out.println("-----Calling Two Methods From Main Method-----");
		Test t = new Test();
		t.m1(10,'c');
		Test.m2("ritesh", 10.5);
		
		}
	}

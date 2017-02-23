// Object clonning

class Test implements Cloneable // to peform clonning process
{
	int a = 10;
	int b = 20;
	public static void main(String[] args) throws Exception // throws exception 
	{
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a = 30;
		t.b = 40;
		System.out.println(t.a);
		System.out.println(t.b);
		t.a = 50;
		t.b = 60;
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1 =(Test)t.clone(); // clonning 
		t.a = 60;
		t.b = 70;
		System.out.println(t.a);
		System.out.println(t.b);
		// clonning process
		System.out.println(t1.a);
		System.out.println(t1.b);
	
	}
}
/* if not added implements Cloneable
C:\Users\Ritesh\Desktop\corejava\Sample>java Test
10
20
30
40
50
60
Exception in thread "main" java.lang.CloneNotSupportedException: Test
        at java.lang.Object.clone(Native Method)
        at Test.main(test.java:20)

*/

/* after adding implements Cloneable to class.
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java

C:\Users\Ritesh\Desktop\corejava\Sample>java Test
10
20
30
40
50
60
60
70
50
60
*/
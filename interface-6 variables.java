//interface variables 


	/*														//Case- I
interface It1
{
	int a=10; // variabels of interface are by default " public static final"
	void m1();
}
class Test implements It1
{
	public void m1(){
								a  = a+10;
								System.out.println(a);
								}
public static void main(String[] args){
					Test t = new Test();
					t.m1();
							}
}
		*/								/*
														C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java
														test.java:11: error: cannot assign a value to final variable a
                                                                a  = a+10;
                                                                ^
																1 error
										*/

	
														
														// Case-II generates ambigious  error
/*

interface It1
{
	int a = 10;
}
interface It2
{
	int a = 100;
}
class Test implements It1, It2
{
	public void m1(){System.out.println(a);}
	public static void main(String[] args){
																Test t = new Test();
																t.m1();
																		}
}
*/
											/*  
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java
test.java:40: error: reference to a is ambiguous
        public void m1(){System.out.println(a);}
                                            ^
  both variable a in It1 and variable a in It2 match
1 error

											*/	

interface It1
{
	int a = 10;
}
interface It2
{
	int a = 100;
}
class Test implements It1, It2
{
	public void m1(){
		System.out.println(It1.a);  // calling variable with respective interface
		System.out.println(It2.a);
	}
	public static void main(String[] args){
																Test t = new Test();
																t.m1();
																		}
}

/*
C:\Users\Ritesh\Desktop\corejava\Sample>javac test.java

C:\Users\Ritesh\Desktop\corejava\Sample>java Test
10
100
*/
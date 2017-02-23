//initializing variables static block
class Emp
{
	static int eid;
		static{ 
				eid=111;
		}
	static void disp()         
		{ 
				System.out.println(eid);
		}
	public static void main(String[] args) 
	{
		 Emp.disp (); 
	}
}
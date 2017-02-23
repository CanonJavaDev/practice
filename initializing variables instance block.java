//initializing variables instance block
class Emp
{
	int eid;
		{ 
				eid=111;
		}
	void disp()         
		{ 
				System.out.println(eid);
		}
	public static void main(String[] args) 
	{
		new Emp().disp ();  // nameless object creation
	}
}
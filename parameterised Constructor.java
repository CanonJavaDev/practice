// parameterised Constructor
class Emp 
{
			int eid; String ename; float esal;
		
	Emp(int eid, String ename, float esal) 
		{			this.eid=eid;
					this.ename=ename;
					this.esal=esal;
		}
	
	void disp()
	{ 
			System.out.println(eid);
			System.out.println(ename);
			System.out.println(esal);
	} 
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111,"ritesh",1000000);
		e1.disp();
		Emp e2 = new Emp(111,"roja",3000000);
		e2.disp();
	}
}


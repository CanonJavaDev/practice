// employee Emp method
import java.io.*;
class Emp implements Serializable 
{
	int eid;
	String ename;
	Emp(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
}
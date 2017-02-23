import java.util.*;

class AwsExercise {

	public static void main(String[] args) {
		
		System.out.println("Student");				
		myHandler();
	}
	public static Test myHandler()
	{
		Test T = new Test();
		T.setSname("rithu");
		T.setSid(12);
		return T;
		
	}

}
class Test {

	String sname;
	int sid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
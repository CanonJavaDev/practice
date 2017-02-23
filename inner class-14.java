// static inner class variables

class test
{
	int x=10;
	static int y = 20;
	static class inner
	{
		public void num(){
		System.out.println(x); //error: non-static variable x cannot be referenced from a static context
		System.out.println(y);
		}
	}
	public static void main(String args[]){
		inner i = new inner();
		i.num();
}
}
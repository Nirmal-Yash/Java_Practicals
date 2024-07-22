class SuperDemo
{
	protected int i;
	

}
class SubDemo extends SuperDemo
{
	int j;
}

public class  Single{
	public static void main(String[] args) {
		SubDemo sd=new SubDemo();
		SuperDemo sd1=new SuperDemo();
		sd1.i=100;
		sd.j=10;
		sd.i=5;
		//sd.show();
		System.out.println("j is:"+sd.j+ sd.i + sd1.i);
	}
}
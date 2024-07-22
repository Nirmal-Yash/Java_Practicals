class Student
{
	String name;
	String enrolment;
	
	void setData(String n,String en)
	{
		name=n;
		enrolment=en;		
	}
	void showData()
	{
		System.out.println("Student Name is "+name+" and Enrolment no is "+enrolment);
	}
	
}
public class StudentMain
{
	public static void main(String []args)
	{
		Student s=new Student();
		s.setData("Yash","139");
		s.showData();
		Student s1=new Student();
		s1.setData("Avpt","001");
		s1.showData();
	}	
} 
class Pr13{
	public static void main(String[] args){
		Employee obj1=new Employee("Yash","Nirmal",50000.00);
		Employee obj2=new Employee("Yash","Nirmal",60000.00);
		Employee obj3=new Employee("Yash","Nirmal",90000.00);
		obj1.TestEmployee();
		obj2.TestEmployee();
	}
}
class Employee{
	String first_name;
	String last_name;
	double salary;
	Employee(String fname,String lname,double sal){
		first_name=fname;
		last_name=lname;
		if(sal<0.0){
			salary=0.0;
		}else{
			salary=sal;
		}
	}
	Employee(){
		first_name=null;
		last_name=null;
		salary=0.0;
	}
	void TestEmployee(){
		System.out.println("The Yearly Salary of Employee is :"+salary);
		salary+=(salary*0.10);
		System.out.println("The Incremented Salary of Employee is :"+salary);
	}
	
}
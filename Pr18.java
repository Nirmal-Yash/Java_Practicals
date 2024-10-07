class Member{
	String name,address;
	int age,no,salary;
	void printSalary(){
		System.out.println("Salary is :"+salary);
	}

}
class Employee extends Member{
	String special;
	Employee(String name,int age,int no,String address,int salary,String special){
		this.name=name;
		this.age=age;
		this.no=no;
		this.address=address;
		this.salary=salary;
		this.special=special;
	}
	void DisplayEmp(){
		System.out.println("The Name of Employee : "+name);
		System.out.println("The Age of Employee : "+age);
		System.out.println("The Phone Number of Employee : "+no);
		System.out.println("The Address of Employee : "+address);
		System.out.println("The Salary of Employee : "+salary);
		System.out.println("The Specialization of Employee : "+special);
	}
	
}
class Manager extends Member{
	String dept;
	Manager(String name,int age,int no,String address,int salary,String dept){
		this.name=name;
		this.age=age;
		this.no=no;
		this.address=address;
		this.salary=salary;
		this.dept=dept;
	}
	void DisplayMan(){
		System.out.println("The Name of Manager : "+name);
		System.out.println("The Age of Manager : "+age);
		System.out.println("The Phone Number of Manager: "+no);
		System.out.println("The Address of Manager : "+address);
		System.out.println("The Salary of Manager : "+salary);
		System.out.println("The Department of Manager: "+dept);
	}
}
public class Pr18{
	public static void main(String[] args){
		Employee emp = new Employee("Om",19,88888,"BVM",39000,"IT");
		Manager mg = new Manager("Hardik",19,77777,"LTCE",41000,"CE");
		emp.DisplayEmp();
		System.out.println("");
		mg.DisplayMan();
	}
}
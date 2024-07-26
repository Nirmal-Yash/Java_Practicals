import java.util.*;
class Pr14{
	public static void main(String[] args){
		Date obj1=new Date(2,12,2005);
		Date obj2=new Date(25,8,2006);
		Date obj3=new Date(18,8,2008);
		obj1.DisplayDate();
		obj2.DisplayDate();
	}
}
class Date{
	int day,month,year;
	Date(int d,int m,int y){
		if(d>0&&d<=31){
			day=d;
		}else{
			System.out.println("Enter Date in proper format.");
		}
		if(m>0&&m<=12){
			month=m;
		}else{
			System.out.println("Enter Month in proper format.");
		}
		if(y>0&&y<=9999){
			year=y;
		}else{
			System.out.println("Enter Year in proper format.");
		}	
	}
	void DisplayDate(){
		System.out.println("Date :"+day+"/"+month+"/"+year);
	}
	
}
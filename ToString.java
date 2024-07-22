class Car{
	String name;
	int speed;
	Car(String name,int speed){
		this.name=name;
		this.speed=speed;
	}
	public String toString(){
		return name+" has top speed of "+speed+" kmph. ";
	}
}
class ToString{
	public static void main(String[] args){
		Car obj1=new Car("Bugatti Chiron",304);	
		Car obj2=new Car("Venom F5",272);
		Car obj3=new Car("SSC Tuatara",268);
		Car obj4=new Car("Rimac Nevera",258);
		Car obj5=new Car("McLaren Speedtail",250);
		String s1="The Car - "+obj1;
		String s2="The Car - "+obj2;
		String s3="The Car - "+obj3;
		String s4="The Car - "+obj4;
		String s5="The Car - "+obj5;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
import java.util.LinkedList;
	public class LinkedlistAdd 
	{ 
  		public static void main(String[] args) 
		{ 
    			LinkedList<String> cars = new LinkedList<String>();
    			cars.add("Volvo");
    			cars.add("BMW");
    			cars.add("Ford");
    			cars.add("Mazda");
    			System.out.println(cars);
    			cars.addFirst("Hello");
    			System.out.println(cars);
    			cars.addLast("AVPTI");
    			System.out.println(cars);
    			cars.removeFirst();
    			System.out.println(cars);
    			cars.removeLast();
    			System.out.println(cars);
  		} 
	}

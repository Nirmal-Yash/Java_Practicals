public class FinalDemo {
  public static void main(String[] args) {
    final int x = 10; 
	// x = 20; // error: cannot assign a value to final variable x
    System.out.println("The value of x is " + x);

    final String message = "Hello, world!"; 
	//message = "Hiii" //error: cannot assign a value to final variable message
    System.out.println(message);
  }
}

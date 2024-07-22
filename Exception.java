public class Exception {
    public static void main(String[] args) {
        String name = new String();
	name=null;
	try{
        int length = name.length(); // Throws NullPointerException
        }
	catch(NullPointerException e){
	System.out.println("String Name throws this exception ->"+e);	
}
    }
}

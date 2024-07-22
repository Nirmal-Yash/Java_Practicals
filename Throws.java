public class Throws{
	static void ThrowsF() throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException("Found Array Index Exception ");
	}
	public static void main(String[] args){
		try{ThrowsF();}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error:"+ e);
		}
	}
	finally{
		System.out.println("Code will run at the End of Program..");
	}
}
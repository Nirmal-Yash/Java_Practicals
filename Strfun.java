class Strfun{
	public static void main(String []args){
        String str = "Hello, World!";

        char ch = str.charAt(0);
        System.out.println("The first character of the string is: " + ch);

        boolean containsWorld = str.contains("World");
        System.out.println("The string contains 'World'? " + containsWorld);

        String formattedStr = String.format("The string is: %s, and its length is: %d", str, str.length());
        System.out.println(formattedStr);

        int strLength = str.length();
        System.out.println("The length of the string is: " + strLength);
    		String[] words = str.split(" ");
	        System.out.println("The string contains " + words.length + " words.");
        	for (String word : words) {
	            System.out.println(word);
        	}
}

}
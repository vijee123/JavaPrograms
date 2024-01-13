package JavaPrograms;

public class TRial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myWord = "Hello";
		String second = myWord.concat("World");
		System.out.println(second);
		int x = myWord.length();
		System.out.println(x);
		
		StringBuffer myBuffer = new StringBuffer("Hello");
		myBuffer.append(" World!");
		System.out.println(myBuffer);
		System.out.println(myBuffer.length());
		
		
				
	}

}

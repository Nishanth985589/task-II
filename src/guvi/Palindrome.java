package guvi;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "tenet";
        String rev = "";
        for(int i =0; i<str.length();i++) {
        	rev=str.charAt(i)+rev;
        }
        if (rev.equals(str)) {
        	System.out.println(str+ " is a palindrome");}
        else {
        	System.out.println(str+ "  is not a palindrome");
        	
            }
	}

}

package stringManipulationpkg;

public class SubStringSubSequence {

	public static void main(String[] args) {
		
		//substring subsequence
      
		String text="automatedscript";
		
		String val1=text.substring(5);
		String val2=text.substring(3,8);
		CharSequence val3=text.subSequence(3,8);
		String val4=text.substring(6,9);
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}

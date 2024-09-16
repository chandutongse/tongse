package stringManipulationpkg;

public class StartsWithEndsWith {

	public static void main(String[] args) {
		//startsWith endsWith
		
		String text="automatedscript";
		
		boolean val=text.startsWith("auto");
		boolean val2=text.endsWith("script");
		boolean val3=text.endsWith("auto");
		
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);

	}

}

package stringManipulationpkg;

public class CompareToCompareToIgnore {

	public static void main(String[] args) {
		// compareto and CompareToIgnore case
		
		String text="automatedscript";
		
		int a=text.compareTo("Auto");
		int b=text.compareTo("Automated");
		int c=text.compareToIgnoreCase("AutomatedScript");
		int d=text.compareTo("automatedscript");
		System.out.println("if value is 0,both are equal,otherwise not equal");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}

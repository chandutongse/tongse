package stringManipulationpkg;

public class ReplaceReplaceAllReplaceFirst {

	public static void main(String[] args) {
		// Replace,ReplaceAll,ReplaceFirst
		
		String text="automatedscript";
		
		String val=text.replace("a", "A");
		String val1=text.replace(text, "Hello java Hello");
		String val2=val1.replaceFirst("Hello","selenium");
		String val3=text.replaceAll(text,"java selenium");
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		

	}

}

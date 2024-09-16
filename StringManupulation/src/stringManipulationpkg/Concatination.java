package stringManipulationpkg;

import javax.sound.midi.SysexMessage;

public class Concatination {

	public static void main(String[] args) {
		// concatination
		
		String text="automatedscript";
		String text1="com";
		
		String val=text.concat(".").concat("com");
		String val1="automatedscript".concat(".").concat("com");
		String val2=text.concat(".").concat(text1);
		String val3=text+"."+text1;
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3); 
		
		

	}

}

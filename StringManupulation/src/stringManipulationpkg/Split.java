package stringManipulationpkg;

public class Split {

	public static void main(String[] args) {
		// Split
		
		String text="a,b,c,d,e";
		
		String[] val=text.split(",");
		for(int a=0;a<val.length;a++) {
			System.out.print(""+val[a]);
		}
		

	}

}

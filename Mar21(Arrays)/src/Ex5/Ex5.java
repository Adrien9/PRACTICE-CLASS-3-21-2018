package Ex5;

public class Ex5 {

	public static void main(String[]args){

		String[]names={"John","Alfred","Hector"};

		for(int i=0; i<names.length; i++){
			
			if(names[i].charAt(0)=='A'){

				System.out.println(names[i]);
			}
		}
	}
}
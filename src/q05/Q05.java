package q05;

public class Q05 {

	private enum Color{BLACK, WHITE}
	
	public static void Main(String[] args) {
		System.out.println(Color.values()[1]); //WHITE
		System.out.println(Color.values()[0]); //BLACK
	}

}

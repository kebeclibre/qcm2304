package q03;

public class Q03 {

	private static int id = 1;
	private static Q03 a;
	private static Q03 b;
	public static void main(String[] args) {
		a = new Q03(); // marche
		b = new Q03(); // marche
		a.setId(2); //marche
		System.out.println(a.equals(b)); //false
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Q03.id = id;
	}
	public boolean equals(){
		if(a.id == b.id)
			return true;
		return false;
	}
}

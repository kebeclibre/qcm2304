package q02;


public class Q02 {

	public static void main(String[] args) { // no args + are you sure + no length on null
		String a = null;
		try {
			a = args[0];
		} catch (Exception e) {
			System.out.println("No args present.");
		}finally{
			System.out.println("Are you sure?");
			try{
				System.out.println(a.length());
			}catch(Exception e){
				System.out.println("There is no length on null!");
			}
		}
	}

}

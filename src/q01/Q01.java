package q01;

import java.io.FileInputStream;

public class Q01 {

	public static void main(String[] args) { // affiche file not found exception
		try{
			new FileInputStream("nexistepas.txt");
		}catch(Exception ex){
			System.out.println(ex.getClass().getSimpleName());
		}finally{
			
		}

	}

}

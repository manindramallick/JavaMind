package p;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerilization {

	public static void main(String[] args) {
		
		try(
			ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\manindra.mallick\\Desktop\\caveprogram6\\test.txt")));	
			)
		   {
				CountInstnace countInstnace1 =(CountInstnace)obj1.readObject();
		 		countInstnace1.show();
			}catch (Exception e) {
				System.out.println(e);
			}
		
	}
}

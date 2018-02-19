package p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		
		try(
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\manindra.mallick\\Desktop\\caveprogram6\\test.txt")));
			)
		   {
			CountInstnace countInstnace = new CountInstnace();
		    obj.writeObject(countInstnace);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

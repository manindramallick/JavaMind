package pack;

public class CheckObj {

	
	public int processor() {
		
		try {

			int i = 1/0;
			System.out.println(i);
		}catch (Exception e) {
			//System.out.println(e);
			return 2;
		}
		finally {
			
			System.out.println("sssss");
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		CheckObj obj = new CheckObj();
		obj.processor();
		
	}

}

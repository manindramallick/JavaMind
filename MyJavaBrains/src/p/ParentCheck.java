package p;



class  BaseCheck{

	
	void test(int i) {
		
	}
	
   /*final void test(int i,int j) {
		
	}*/
	
	
}

public class ParentCheck  extends BaseCheck  {

	/*public void test() {
		Check.super.test();
	}*/
  final void test(int i) {
		
	}
	
	public static void main(String[] args) {
		
		ParentCheck parentCheck = new ParentCheck();
		parentCheck.test(1);
		
	}

}

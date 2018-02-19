package Caveprogram18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkjoinTest extends RecursiveAction{

	private static final long serialVersionUID = 1L;
	private long load=0;
	
	ForkjoinTest(long load){
		this.load=load;
	}
	
   protected void compute() {

	   if(load>16) {
	   List<RecursiveAction> listRecursiveActions = new ArrayList<>();
	   ForkjoinTest forkjoinTest1 = new ForkjoinTest(load/2);
	   ForkjoinTest forkjoinTest2 = new ForkjoinTest(load/2);
	   listRecursiveActions.add(forkjoinTest1);
	   listRecursiveActions.add(forkjoinTest2);
	   for(RecursiveAction recursiveAction : listRecursiveActions) {
		   System.out.println("start fork");
		   recursiveAction.fork();
		   System.out.println("end fork");
	   }
	   }
	   else {
		   System.out.println("do by own");
	   }
		
	}
	
	
	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		forkJoinPool.invoke(new ForkjoinTest(120));
		
		
	}


	
	
}

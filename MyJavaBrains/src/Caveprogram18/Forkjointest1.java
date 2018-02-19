package Caveprogram18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Forkjointest1 extends RecursiveTask<Long>{

	private static final long serialVersionUID = 1L;
	private long load=0;
	
	Forkjointest1(long load){
		this.load = load;
	}
	
	protected Long compute() {
	
		long result =0;
		if(load>16) {
			
			List<RecursiveTask<Long>> list = new ArrayList<RecursiveTask<Long>>();
			Forkjointest1 forkjointest1 = new Forkjointest1(load/2);
			Forkjointest1 forkjointest2 = new Forkjointest1(load/2);
			list.add(forkjointest1);
			list.add(forkjointest2);
			
			for(RecursiveTask<Long> recursiveTask : list) {
				System.out.println("start fork");
				recursiveTask.fork();
				System.out.println("end fork");
			}
			for(RecursiveTask<Long> recursiveTask : list) {
				System.out.println("start fork");
				result = result + recursiveTask.join();
			}
			
			
		}
		else {
			result = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		forkJoinPool.invoke(new Forkjointest1(120));
		
	}
	
}

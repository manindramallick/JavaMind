package caveprogram1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		Processo p = new Processo();
		
		p.start();
		Scanner sc =null;
		try{
		 sc = new Scanner(System.in);
		sc.nextLine();
		
		p.finsih();
		
		}finally {
			sc.close();
		} 
		
		
		
		
		
		
		/*Processo p = new Processo();
		p.start();
		
		Processo p1 = new Processo();
		p1.start();*/
		
		
		/*Thread t1 = new Thread(new Processo());
		t1.start();
		

		Thread t2 = new Thread(new Processo());
		t2.start();*/
		
		
		/*Thread t1= new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(" Hi am "+i);
				}
			}
		});
		
		t1.start();
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(" Hi am "+i);
				}
			}
		}).start();
		*/
	}

}

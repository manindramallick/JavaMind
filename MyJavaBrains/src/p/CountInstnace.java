package p;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class CountInstnace implements Serializable{

	private static final long serialVersionUID = 2l;
	private int counter;
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}


	private static AtomicInteger atm = new AtomicInteger(0);
	
	public CountInstnace() {
		counter = atm.incrementAndGet();
	}
	
	public void show() {
		System.out.println(counter);
	}
	
	private void writeObject(ObjectOutputStream out) throws Exception{
		out.defaultWriteObject();
		out.writeInt(counter);
	}
	
	private void readObject(ObjectInputStream in) throws Exception{
		in.defaultReadObject();
		setCounter(in.readInt());
	}
	

	/*public static void main(String[] args) {
		
		CountInstnace countInstnace = new CountInstnace();
		countInstnace.show();
		CountInstnace countInstnace1 = new CountInstnace();
		countInstnace1.show();
		
		
		}*/
	
}

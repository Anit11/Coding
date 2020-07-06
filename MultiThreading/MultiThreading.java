import java.util.*;
import java.util.concurrent.*;

class ThreadClass implements Runnable {
	private int count;
	private String name;

	public ThreadClass(int count, String name) {
		this.count = count;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println("Printing thread "+name+" from count "+count);
		}
	}
}

/*
 * Using Semaphore: Making semaphore to act like binary semaphore
 * Syntax: Semaphore s1 = new Semaphore(1); //creating 1 permit semaphore
 * s1.acquire or s1.acquireUninterruptedly(); //wait for permit
 * s1.release();  // release the permit for other threads to use
 * Trick: Semaphore s2 = new Semaphore(0); creates a semaphore with 0 permits and s2.release() adds 1 permit to that. This makes them work like binary semaphore
 */
class PrintList1 implements Runnable {
	List<Integer> list = new ArrayList<>();
	Semaphore s1, s2;

	public PrintList1(List<Integer> givenList, Semaphore s1, Semaphore s2) {
		list = givenList;
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < list.size(); i++) {
			try {
				s1.acquire();
			} catch (Exception e) {
				System.out.println("Exception caught: "+e);
			}
			System.out.println(list.get(i));
			s2.release();
		}
	}
}

class PrintList2 implements Runnable {
  List<Character> list = new ArrayList<>();
	Semaphore s1, s2;

  public PrintList2(List<Character> givenList, Semaphore s1, Semaphore s2) {
    list = givenList;
		this.s1 = s1;
		this.s2 = s2;
  }

  @Override
  public void run() {
		System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < list.size(); i++) {
			try {
				s2.acquire();
			} catch (Exception e) {
				System.out.println("Exception caught: "+e);
			}
      System.out.println(list.get(i));
			s1.release();
    }
  }
}

public class MultiThreading {

	public static void main(String args[]) {

/*
		Runnable obj1 = new ThreadClass(10, "Thread 1");
		Thread t1 = new Thread(obj1);
		t1.setName("t1");
//		t1.setPriority(10);
		t1.start();

		Runnable obj2 = new ThreadClass(5, "Thread 2");
		Thread t2 = new Thread(obj2);
		t2.setName("t2");
//		t2.setPriority(1);
		t2.start();

*/

		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Character> l2 = Arrays.asList('a','b','c');
		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(0);
		Runnable r1 = new PrintList1(l1, s1, s2);
		Thread t1 = new Thread(r1);
		Runnable r2 = new PrintList2(l2, s1, s2);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

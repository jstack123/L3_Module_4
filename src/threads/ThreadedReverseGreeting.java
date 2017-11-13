package threads;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public static void main(String[] args) {
		printRecursive(50);
	}
	
	public static void printRecursive(int i) {
		//System.out.println(i);
		
		if(i>0) {
		Thread t1 = new Thread(()-> {
			System.out.println("Hello from Thread <" + i + ">");
			printRecursive(i-1);
		});
		t1.start();
		}
	}
}

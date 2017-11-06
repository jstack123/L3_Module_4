package threads;

public class ThreadRunner implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		
	}

}

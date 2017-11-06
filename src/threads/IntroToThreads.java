package threads;

public class IntroToThreads {
	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			for(int i = 0; i < 1000000; i++) {
				System.out.println(i);
			}
		});
		t1.start();
		String s = "";
		//for(int i = 0; i < 1000000; i++) {
		//	s += "" + i;
		//}
		//System.out.println(s);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

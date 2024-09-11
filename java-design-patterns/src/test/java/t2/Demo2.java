package t2;

/**
 * ?????????????
 * 
 * @author worker
 *
 */
public class Demo2 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("thread running ...");
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Demo2());
		thread.start();
	}
	
}

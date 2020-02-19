package ques2;

public class Tester implements Runnable {
	static PingPong2 pingPong2=new PingPong2();

	public void run() {
		pingPong2.hit(Thread.currentThread().getId());

	}

	public static void main(String[] args) {
		new Thread(new Tester()).start();
		new Thread(new Tester()).start();

	}

}
class PingPong2{
	synchronized void hit(long n) {
		for(int i=1;i<3;i++) {
			System.out.println(n+"-"+i);
		}
	}
	
}
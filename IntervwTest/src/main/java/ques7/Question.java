package ques7;

public class Question implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread(new Question());
		thread.start();
		//Thread.sleep(1000);
		System.out.printf("%d",1);
		thread.join();
		System.out.printf("%d",2);

	}

	public void run() {
		System.out.printf("%d",3);
		
	}

}

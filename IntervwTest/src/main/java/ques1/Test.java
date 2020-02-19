package ques1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		new Test().waitForSignal();// TODO Auto-generated method stub

	}
void waitForSignal() throws InterruptedException {
	Object obj=new Object();
	synchronized (Thread.currentThread()) {
		obj.wait();
		obj.notify();
	}
}
}

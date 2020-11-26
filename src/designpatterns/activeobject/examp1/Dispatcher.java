package designpatterns.activeobject.examp1;

import java.util.concurrent.PriorityBlockingQueue;

public class Dispatcher extends Thread {

	private PriorityBlockingQueue<Task> priorityBlockingQueue;

	public Dispatcher(PriorityBlockingQueue<Task> priorityBlockingQueue) {
		super();
		this.priorityBlockingQueue = priorityBlockingQueue;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true) {
			try {
				Task task = priorityBlockingQueue.take();
				System.out.println("Executing task " + task.getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}

		}

	}

}

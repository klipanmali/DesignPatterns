package designpatterns.activeobject.examp1;

import java.util.concurrent.PriorityBlockingQueue;

public class ActiveObject implements Proxy {

	private PriorityBlockingQueue<Task> prioQueue;
	
	public ActiveObject(PriorityBlockingQueue<Task> prioQueue) {
		this.prioQueue = prioQueue;
	}

	@Override
	public void execute(String name, int prio) {
		Task task = new Task(name,prio);
		prioQueue.put(task);
	}

}

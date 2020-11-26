package designpatterns.activeobject.examp1;

//https://www.topcoder.com/thrive/articles/Concurrency%20Patterns%20-%20Active%20Object%20and%20Monitor%20Object

import java.util.concurrent.PriorityBlockingQueue;

public class ActiveObjectExamp {

	public static void main(String[] args) {
		
		PriorityBlockingQueue<Task> prioQueue = new PriorityBlockingQueue<>();
		ActiveObject ao = new ActiveObject(prioQueue);
		Dispatcher disp = new Dispatcher(prioQueue);
		Client cl1 = new Client(ao, "cl1", 4);
		Client cl2 = new Client(ao, "cl2", 3);
		Client cl3 = new Client(ao, "cl3", 6);
		cl1.start();
		cl2.start();
		cl3.start();
		disp.start();
		
	}

}

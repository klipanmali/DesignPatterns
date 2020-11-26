package designpatterns.activeobject.examp1;

import java.util.Random;

public class Client extends Thread {
	
	private Proxy proxy;
	private String name;
	private int prio;

	public Client(Proxy proxy, String name, int prio) {
		super();
		this.proxy = proxy;
		this.name = name;
		this.prio = prio;
	}

	@Override
	public void run() {
		
		Random rnd = new Random();
		try {
			Thread.sleep(rnd.nextInt(10)*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format("Client %s executing", this.name));
		proxy.execute(name, prio);
		System.out.println(String.format("Client %s executed", this.name));
		
	}
	
}

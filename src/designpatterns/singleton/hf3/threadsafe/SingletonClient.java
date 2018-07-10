package designpatterns.singleton.hf3.threadsafe;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
	}
}

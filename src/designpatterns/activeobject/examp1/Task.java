package designpatterns.activeobject.examp1;

public class Task implements Comparable<Task> {

	private String name;
	private Integer prio;
	
	public Task(String name, Integer prio) {
		this.name = name;
		this.prio = prio;
	}

	public String getName() {
		return name;
	}

	public Integer getPrio() {
		return prio;
	}

	@Override
	public int compareTo(Task other) {
		return Integer.compare(this.prio, other.prio);
	}

}

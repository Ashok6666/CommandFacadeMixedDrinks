package command;

public class BloodyMary {
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addCelerySalt() {
		System.out.println("Add celery salt");
	}
	public void addPepper() {
		System.out.println("Add pepper");
	}
	public void addVodka() {
		System.out.println("Add vodka");
	}
	public void shake() {
		System.out.println("Shaking mixture");
	}
	public void serve() {
		System.out.println("Serving " + name);
	}
}

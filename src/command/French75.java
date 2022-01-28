package command;

public class French75 {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addGin() {
		System.out.println("Add 1 oz gin");
	}
	public void addLemon() {
		System.out.println("Add 1/2 oz Lemon");
	}
	public void addChampagne() {
		System.out.println("Add 2 oz Champagne");
	} 
	public void addSyrup() {
		System.out.println("Add 2 Dashes Simple Syrup");
	}
	public void shake() {
		System.out.println("Shaking mixture");
	}
	public void serve() {
		System.out.println("Serving " + name);
	}
	
}

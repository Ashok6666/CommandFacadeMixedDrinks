package command;

public class Mixer {
	Command slot;
	
	public Mixer() {}
		
	public void setCommand(Command makeCommand) {
		slot  = makeCommand;
	}
	public void makeBloodyMary() {
		slot.excecute();
	}
	public void makeFrench75() {
		slot.excecute();
	}

}

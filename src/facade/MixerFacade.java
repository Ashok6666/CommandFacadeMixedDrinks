package facade;
import command.*;
public class MixerFacade {
	Command bloodyMaryCommand;
	Command french75Command;
	Mixer mixer;
	
	public MixerFacade(Command bloodyMaryCommand, Command french75Command, Mixer mixer) {
		this.bloodyMaryCommand = bloodyMaryCommand;
		this.french75Command = french75Command;
		this.mixer = mixer;
		
	}
	
	public void prepareBloodyMary() {
		System.out.println("Preparing BloodyMary");
		mixer.setCommand(bloodyMaryCommand);
		mixer.makeBloodyMary();
		
	}
	public void prepareFrench75() {

		System.out.println("Preparing French75");
		mixer.setCommand(french75Command);
		mixer.makeFrench75();
	}
}

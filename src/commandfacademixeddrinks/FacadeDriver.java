package commandfacademixeddrinks;
import command.*;
import facade.*;
public class FacadeDriver {

	public static void main(String[] args) {
		BloodyMary bloodyMary =new BloodyMary();
		
		French75 french75 = new French75();
		
		MakeBloodyMaryCommand bloodyMaryCommand = new MakeBloodyMaryCommand(bloodyMary);
		MakeFrench75Command french75Command = new MakeFrench75Command(french75);
		
		Mixer mixer = new Mixer();
		
		MixerFacade mixerFacade = new MixerFacade(bloodyMaryCommand, french75Command, mixer);
		
		//create bloodyMary
		mixerFacade.prepareBloodyMary();
		
		System.out.println();
		
		mixerFacade.prepareFrench75();
		
		
		
	}

}

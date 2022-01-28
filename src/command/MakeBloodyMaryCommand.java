package command;

public class MakeBloodyMaryCommand implements Command {
	BloodyMary bloodyMary;
	
	public MakeBloodyMaryCommand(BloodyMary bloodyMary) {
		this.bloodyMary = bloodyMary;
	}
	
	public void excecute() {
		// TODO Auto-generated method stub
		bloodyMary.addCelerySalt();
		bloodyMary.addPepper();
		bloodyMary.addVodka();
		
		
	}

}

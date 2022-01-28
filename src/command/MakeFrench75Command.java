package command;

public class MakeFrench75Command implements Command {
	French75 french75;
	
	public MakeFrench75Command(French75 french75) {
		this.french75 = french75;
	}
	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		french75.addChampagne();
		french75.addGin();
		french75.addLemon();
		french75.addSyrup();
	}

}

package day6;

public class MSWord implements MSOffice, MSProduct{

	@Override
	public void save() {
		System.out.println("save from MSWord");
		
	}

	@Override
	public void saveAs() {
		System.out.println("save as from MSWord");
		
	}

	@Override
	public void open() {
		System.out.println("Open from MSWord");
		
	}
	
	public void restart(){
		System.out.println("Restart from word");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

}

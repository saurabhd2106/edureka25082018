package day6;

public class MSExcel implements MSOffice {

	@Override
	public void save() {
		System.out.println("Save method");

	}

	@Override
	public void saveAs() {
		System.out.println("Save as method");

	}

	@Override
	public void open() {
		System.out.println("Open method");

	}

}

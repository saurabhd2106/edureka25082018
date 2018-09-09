package day6;

public class DemoMultipleBrowser {

	public static void main(String[] args) {
		MultipleBrowser mb = new MultipleBrowser();

		mb.invokeBrowser("edge");
		
		mb.navigateCommands();
		
		System.out.println(mb.getPageTitle());
		
		mb.closeBrowser();
	}

}

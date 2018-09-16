package day6;

public class DemoMultipleBrowser {

	public static void main(String[] args) {
		MultipleBrowser mb = new MultipleBrowser();

		try {
			mb.invokeBrowser("safari");
			
			mb.navigateCommands();
			
			System.out.println(mb.getPageTitle());
			
			mb.closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}

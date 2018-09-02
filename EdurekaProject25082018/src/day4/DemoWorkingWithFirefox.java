package day4;

public class DemoWorkingWithFirefox {

	public static void main(String[] args) {
		WorkingWithMozilla wm = new WorkingWithMozilla();
		
		wm.invokeBrowser();
		
		System.out.println(wm.getPageTitle());

		wm.navigateCommands();
		
		wm.closeBrowser();
	}

}

package day3.selenium;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		
		String titleOfThePage = wc.getPageTitle();
		System.out.println("Title of the page : "+ titleOfThePage);
		
		wc.navigateCommands();
		
		wc.closeBrowser();

	}

}

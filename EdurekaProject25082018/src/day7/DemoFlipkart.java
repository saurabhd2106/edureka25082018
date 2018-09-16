package day7;

public class DemoFlipkart {
	
	public static void main(String[] args) {
		FlipkartProject fp = new FlipkartProject();
		
		fp.invokeBrowser();
		
		int linkCount = fp.getCountOfLinks();
		
		System.out.println("Number of links : "+ linkCount);
		
		fp.printAllLinksAndUrl();
	}

}

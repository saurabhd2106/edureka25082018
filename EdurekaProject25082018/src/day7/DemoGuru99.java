package day7;

public class DemoGuru99 {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();

		try {
			guru.invokeBrowser();

			guru.login();

			guru.addCustomer();

			guru.logout();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}

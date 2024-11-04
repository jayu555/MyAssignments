package Day7.Assignment_Override;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("New action performed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.performCommonTasks();
		
		System.out.println("----------------------------------------------------------");
		
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.performCommonTasks();
	}

}

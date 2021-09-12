package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		OrgMaster om = new OrgMaster();
		
		String res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin("Automation1TestAuto1", "Sample@0987654321@");
		System.out.println("Application User Login "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");

	}

}

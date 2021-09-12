package methods;

import java.io.IOException;

public class OrgHRMSuite {

	public static void main(String[] args) throws InterruptedException, IOException {

		//Login
		OrgMaster om = new OrgMaster();
		
		String res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin(om.u, om.p);
		System.out.println("Application Login "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");
		
		//EmpReg
		res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin(om.u, om.p);
		System.out.println("Application Login "+res);
		
		res = om.orgEmpReg("Automation2", "TestAuto2", "ATA4356");
		System.out.println("Employee registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");
		
		//UserReg
		
		res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin(om.u, om.p);
		System.out.println("Application Login "+res);
		
		res = om.orgUserReg("Automation2 TestAuto2", "Automation2TestAuto2", "Sample@0987654321@");
		System.out.println("User registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");
		
		//UserLogin
		
		res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin("Automation2TestAuto2", "Sample@0987654321@");
		System.out.println("Application User Login "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");

		
	}

}

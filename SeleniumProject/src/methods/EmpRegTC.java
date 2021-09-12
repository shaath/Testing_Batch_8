package methods;

import java.io.IOException;

public class EmpRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		OrgMaster om = new OrgMaster();
		
		String res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin(om.u, om.p);
		System.out.println("Application Login "+res);
		
		res = om.orgEmpReg("Automation1", "TestAuto1", "ATA4355");
		System.out.println("Employee registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application closed successfully");

	}

}

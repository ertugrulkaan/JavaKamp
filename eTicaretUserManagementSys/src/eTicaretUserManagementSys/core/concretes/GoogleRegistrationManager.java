package eTicaretUserManagementSys.core.concretes;

import eTicaretUserManagementSys.core.abstracts.AuthService;
import eTicaretUserManagementSys.core.utils.GoogleHelper;

public class GoogleRegistrationManager implements AuthService{

	@Override
	public void loginToSystem() {
		
		GoogleHelper.login();
		
	}

}

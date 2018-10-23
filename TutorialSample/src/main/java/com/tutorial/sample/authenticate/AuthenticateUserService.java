/**
 * 
 */
package com.tutorial.sample.authenticate;

/**
 * @author Admin
 *
 */
public class AuthenticateUserService {

	DAOSample doamockSample;
	
	public AuthenticateUserService(DAOSample daomock) {
		
		doamockSample = daomock;
				
	}

	public boolean verifyUser(UserInformationStub ui_userInfo) {
		
		String keyFromUI = ui_userInfo.getName()+ui_userInfo.getLastName()+ui_userInfo.getState();
		
		System.out.println("value of the keyFromUI is "+keyFromUI);
		
		System.out.println("Value of the daoMock reference is "+doamockSample);
		
		UserInformationStub storedUserInfo = (UserInformationStub) doamockSample.getStoredUserInfo();
		
		System.out.println("Value of the storedUserInfo is  "+storedUserInfo);
		
		String keyFromStorage = storedUserInfo.getName()+storedUserInfo.getLastName()+storedUserInfo.getState();
				
		System.out.println("value of the keyFromStorage is "+keyFromStorage);
		
		if(keyFromUI.equals(keyFromStorage)){
			return true;
		}else {
			return false;
		}
				
	}

}

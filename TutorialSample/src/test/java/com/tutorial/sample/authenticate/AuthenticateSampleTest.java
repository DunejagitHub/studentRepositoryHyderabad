/**
 * 
 */
package com.tutorial.sample.authenticate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Admin
 *
 */
public class AuthenticateSampleTest {
	
	private UserInformationStub ui_userInfo;
	private UserInformationStub stored_userInfo;
	private DAOSample daomock;
	
	private void ui_userInfo_Stub () {
		ui_userInfo = new UserInformationStub();
		ui_userInfo.setName("Puneet");
		ui_userInfo.setLastName("Duneja");
		ui_userInfo.setState("Karnataka");
	}
	
	private void ui_userInfo_stored_stub(){
		stored_userInfo = new UserInformationStub();
		stored_userInfo.setName("Puneet");
		stored_userInfo.setLastName("Duneja");
		stored_userInfo.setState("Karnataka");
	}
	
	
	private void createDaoMock(){
		
		daomock= mock(DAOSample.class);
		ui_userInfo_stored_stub();
		when(daomock.getStoredUserInfo()).thenReturn((UserInformationStub)stored_userInfo);
	}
	
	
	AuthenticateUserService authUserService;
	
	
	@Before
	public void setUp(){
		createDaoMock();
		authUserService = new AuthenticateUserService(daomock);
	}
	
	
	@Test
	//userInfo sent to the class and stored entity are same
	public void authenticUserVerificationTest() {
		boolean expected = true;
		boolean actual;
		
		
		ui_userInfo_Stub();
		
		actual=authUserService.verifyUser(ui_userInfo);
		Mockito.verify(daomock).getStoredUserInfo();
		assertEquals(expected,actual);
		
		
		
	}
	

}

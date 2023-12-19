package com.demoblaze.tests;

import org.testng.annotations.Test;

import com.demoblaze.utils.Demoblazewrappers;
import com.demoblaze.utils.sewrappers;


public class logintests extends sewrappers{
	Demoblazewrappers demo=new Demoblazewrappers();

	@Test
	public void loginWithCreditals() {
		launchBrowser("https://www.demoblaze.com/");
		demo.loginDemoblaze();
	}
}

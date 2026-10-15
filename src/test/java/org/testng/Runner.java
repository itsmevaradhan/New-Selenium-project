package org.testng;

import org.junit.Test;
import org.testng.annotations.AfterClass;
public class Runner 
{
	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
	}
	
}

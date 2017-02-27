package com.cleartrip.SampleProject;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.cleartrip.SampleProject.utility.AppConfig;

public class BaseTest {
	
	protected static DesiredCapabilities capabilities = null;
	
	@BeforeTest
	public void setUp() {
		
		AppConfig config;
		capabilities = new DesiredCapabilities();
		
		
		
	}
}

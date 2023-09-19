package TestCases;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Recruitment;

public class Recruitement extends Recruitment {
	
	@Test(priority =2)
	public void recruitement() {
		navigatingtoRecruitpage();
	}

}

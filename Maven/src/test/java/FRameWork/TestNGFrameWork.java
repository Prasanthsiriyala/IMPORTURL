package FRameWork;

import org.testng.annotations.Test;


@Test(priority = 1)
public class TestNGFrameWork {
	

	public void CreateContact() {
		System.out.println("Contact Created");		
	}
	public void modifyContact() {
		System.out.println("contact modified");
	}
	public void DeleteContact() {
		System.out.println("Contact Deleted");
		}

}
//  Bydefault it will execute in Alphabetical order//-- so to make it execute in the specified order mentioned in code
// we give priority//

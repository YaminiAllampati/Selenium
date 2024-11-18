package testNG_Assignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Registration {
	
	@DataProvider(name="Registration")
	public Object[] test()
	{
		Object i[][] = new Object[3][6];
		//first row
		i[0][0] = "yamini";
		i[0][1] = "Allampati";
		i[0][2] = "14/10/1999";
		i[0][3] = 'f';
		i[0][4] = "yamini1428@gmail.com";
		i[0][5] = 998989987;
		//2nd row
		i[1][0] = "sai";
		i[1][1] = "Allampati";
		i[1][2] = "14/10/1997";
		i[1][3] = 'm';
		i[1][4] = "sai14@gmail.com";
		i[1][5] = 998989985;
		//3rd row
		i[2][0] = "pandu";
		i[2][1] = "allam";
		i[2][2] = "14/10/2000";
		i[2][3] = 'f';
		i[2][4] = "pand674@gmail.com";
		i[2][5] = 998989878;
				
		

		
		return i;
		
	}

	@Test(dataProvider="Registration")
	public void register(String fname, String lname, String dob, char gender, String email, long phonenum)
	{
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(phonenum);
		System.out.println(email);
		
	}
}

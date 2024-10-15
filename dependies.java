package nun;

import org.testng.annotations.Test;
public class dependies {
	
	@Test(enabled=true)

	public void highschool()

	{

	System.out.println("high school ");

	}

	@Test(dependsOnMethods="highschool")

	public void higherSecondary()

	{

	System.out.println("+2 ");

	}

	@Test(dependsOnMethods="higherSecondary")

	public void engineering()

	{

	System.out.println(" engineering");

	}

	}

	
	
	
	

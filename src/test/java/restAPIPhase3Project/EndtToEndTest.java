package restAPIPhase3Project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class EndtToEndTest extends ReusableMethods {

	@Test
	public void runtestCases() {
		
	/*	Response response = getEmployee();
		// validating ResponseCode as 200
		Assert.assertEquals(response.statusCode(), 200);
		// Validating count of Employees
		Assert.assertEquals(numberOfEmployees, 3);*/

		
		Response response = createNewEmployee("John", "Dae", "100000", "johnDae@gmail.com");
		// validating ResponseCode as 200
		Assert.assertEquals(response.statusCode(), 201);
		// Validating the name in the response is John
		Assert.assertEquals(employeeName, "John");
		response = getEmployee();
		int EmployeeId = response.jsonPath().get("id");
		//int EmployeeId = response.jsonPath().getInt("id");
		numberOfEmployees = response.jsonPath().getList("employees").size();
	//	Assert.assertEquals(numberOfEmployees, 4);

	/*	response = updateEmployee("EmployeeId");
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(employeeName, "Tom");
		Assert.assertNotEquals(response.jsonPath().getString("firstName"), "John");


		response = getEmployee("EmployeeId");
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(employeeName, "Tom");
	
		response = deleteEmployee("EmployeeId");
		Assert.assertEquals(response.statusCode(), 200);
		response=getEmployee("EmployeeId");
		Assert.assertNotEquals(response.jsonPath().getString("firstName"), "Tom");

		response=getEmployee("EmployeeId");
		Assert.assertEquals(response.statusCode(), 400);
		
		
		response = getEmployee();
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(numberOfEmployees, 3);*/
	}
}
package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCall {
     
	@Test
	public void test_NoOfCircuitsFor2017Season() {
		
		
		given().
		when().
		    get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().
		body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
		and().
		statusCode(200).
		and().
		header("Content-Length",equalTo("4551"));

	    
		
	}
	
}

package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		logRequest(requestSpec);
		Response response=ctx.next(requestSpec, responseSpec); //req executed
		logResponse(response);
		return null;
	}
	public void logRequest(FilterableRequestSpecification requestSpec)
	{
		logger.info("BASE_URI"+requestSpec.getBaseUri());
		logger.info("Request_Header"+requestSpec.getHeaders());
		logger.info("Request_Payload"+requestSpec.getBody());
		
	}
	public void logResponse(Response response)
	{
		logger.info("STATUS_CODE"+response.getStatusCode());
		logger.info("Response_Body_"+response.getBody().prettyPrint());
		logger.info("Response_Header"+response.headers());
	}

	
}

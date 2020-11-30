package com.cxy.test;

import static org.junit.Assert.*;

import com.cxy.service.commissionservice;

public class Test {

	public commissionservice c=new commissionservice();
	
	@org.junit.Test
	public void test() {
		  float except = (float)98;
	        float actual =  c.commission(10,10,10);

	        assertEquals(except,actual,0); 
	}

}

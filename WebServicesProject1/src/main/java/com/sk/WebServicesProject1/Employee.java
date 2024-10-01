package com.sk.WebServicesProject1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class Employee {
	int c;
	@WebMethod
	public int add(int a, int b) {
		return  c=a+b;
	}

}

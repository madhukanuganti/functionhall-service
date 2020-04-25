package com.vedika.functionhall.model;

import java.util.List;

public class Response {

	private List<FunctionHallUIResponse> functionHalls;

	public List<FunctionHallUIResponse> getFunctionHalls() {
		return functionHalls;
	}

	public void setFunctionHalls(List<FunctionHallUIResponse> functionHalls) {
		this.functionHalls = functionHalls;
	}

	@Override
	public String toString() {
		return "Response [functionHalls=" + functionHalls + "]";
	}



}


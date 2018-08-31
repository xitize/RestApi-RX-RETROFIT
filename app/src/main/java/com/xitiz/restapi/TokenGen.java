package com.xitiz.restapi;

public class TokenGen {
	private String token;

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	@Override
 	public String toString(){
		return 
			"TokenGen{" +
			"token = '" + token + '\'' + 
			"}";
		}
}

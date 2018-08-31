package com.xitiz.restapi;

public class SingleUser{
	private Data data;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"SingleUser{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}

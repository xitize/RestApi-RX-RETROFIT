package com.xitiz.restapi;

public class SingleResource{
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
			"SingleResource{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}

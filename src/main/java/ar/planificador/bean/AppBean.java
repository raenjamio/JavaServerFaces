package ar.planificador.bean;

import ar.planificador.util.MyUtil;

public class AppBean {
	private String baseUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = MyUtil.baseUrl();
	}

	public AppBean(){
		
	}
	
	public String baseUrl(){
		return MyUtil.baseUrl();
	}

}

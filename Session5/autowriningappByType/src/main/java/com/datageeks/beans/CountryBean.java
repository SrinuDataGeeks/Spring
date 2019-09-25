package com.datageeks.beans;

public class CountryBean {
	
	private StateBean stateBean = null;

	public void setStateBean(StateBean stateBean) {
		this.stateBean = stateBean;
	}
	
	
	public void getCountryInfo()
	{
		System.out.println(" From CountryBean :: INDIA");
		stateBean.getStateInfo();
	}

}

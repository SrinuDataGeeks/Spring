package com.datageeks.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryBean {
	
	private StateBean stateBean = null;

	@Autowired
	public void setStateBean(StateBean stateBean) {
		this.stateBean = stateBean;
	}
	
	
	public void getCountryInfo()
	{
		System.out.println(" From CountryBean :: INDIA");
		stateBean.getStateInfo();
	}

}

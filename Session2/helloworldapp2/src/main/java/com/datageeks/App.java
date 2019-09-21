package com.datageeks;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.datageeks.bean.HelloBean;

public class App 
{
	

	
	//JDA 8L
	//ADP 6 L 
	//OPTUM(PEDS) 8 - 10 L
	//BOA(BankOfAmerica) 6 L
	//JPMC8 - 10 L
	//ServiceNow 8 - 10 L
	//InFor 6 L
	//IVYComptech 6 - 8
	//BrodComm  8 - 10 L
	//Intralinks & SSC 8 - 10 L
	//GAP 6 L
	//DBS 8 - 10 L
	//Amazon
	//Google
	//CGI 6L
	//Microsoft
	//BroadRiche 6 - 8 L
	//Qualcomm 8 - 10 L
	//Delliote 6 L 
	//SumTotal 6 L
	//Welsforgo 6 L
	//Oracle 6 - 8 L
	//Dell 6 - 8 L
	//HP 6 - 8 L
	//PEGA 6 - 8 L
	//NCR 6 L
	//OpenText 6 - 8 L
	//TeraData 6 - 8 L
	//PaySafe 6 - 8 L
	//PayPal 10 - 12L
	//ThamsonRouters 6 - 8 L
	//Experion 6 - 8 L
	//Thought Works 6 - 8 L
	//OpenText 6 - 8 L
    public static void main( String[] args )
    {
    	System.out.println(" Spring Demo Application");
    	
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
		
		  System.out.println(" \n\nRequest 1"); HelloBean bean1 =
		  container.getBean(HelloBean.class); bean1.getInfo();
		  
		  System.out.println(" \n\nRequest2"); HelloBean bean2 =
		  container.getBean(HelloBean.class);
		  
		  System.out.println(" \n\nRequest3"); HelloBean bean3 =
		  container.getBean(HelloBean.class);
		 
		 
    }
}
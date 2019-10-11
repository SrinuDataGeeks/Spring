package com.datageeks.advice;

import org.aspectj.lang.JoinPoint;

public class SampleServiceAdvice {
	
	//Before Advice Logic
	
	public void checkCashBack(JoinPoint joinpoint)
	{
		System.out.println(" \n\n From SampleServiceAdvice :: BeforeAdvice Method checkCashBack(...) Started  ");
		System.out.println("PointCut Expression => "+joinpoint.getSignature());
		System.out.println(" Type of selecting JoinPoint => "+joinpoint.getKind());
		Object[] objArry = joinpoint.getArgs();
		String cardType = (String)objArry[0];
		System.out.println(" Crad Type => "+cardType);
		if(cardType.equalsIgnoreCase("HDFC"))
		{
			System.out.println("===> Congrats Cashback Applied for 10% ");
		}else
		{
			System.out.println("!!! Sorry not eligible for cashback");
			
		}
		System.out.println(" From SampleServiceAdvice :: BeforeAdvice Method checkCashBack(...) Ended ");
		
	}

}

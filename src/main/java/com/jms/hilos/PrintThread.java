package com.jms.hilos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrintThread extends Thread{

	@Override
	public void run() {
		
		System.out.println(getName() + " is running1111");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " is running1111");
	}

}
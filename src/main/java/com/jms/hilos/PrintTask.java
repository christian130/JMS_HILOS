package com.jms.hilos;

public class PrintTask implements Runnable{

	String name;
	
	public PrintTask(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + " is running0001");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " is running0002");
	}

}
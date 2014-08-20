package org.jacoco.issue.lambda;

public class Caller {

	public void doSomething(){
		Triggerer t = new Triggerer();
		t.trigger(new Runnable() {
			
			@Override
			public void run() {
				int a = 0; //coverage reported
				int b = 12; //coverage reported
				int c = a+b-a+b+b-a; //coverage reported
				System.out.println(c); //coverage reported
		}});
		
		t.trigger(() -> {
			int a = 10; //no coverage reported here
			int b = 20; //no coverage reported here
			int c = a+b-a+b+b-a; //no coverage reported here
			System.out.println(c); //no coverage reported here
		});
	}
	
}

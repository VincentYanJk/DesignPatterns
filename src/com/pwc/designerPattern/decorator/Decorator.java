package com.pwc.designerPattern.decorator;

public abstract class Decorator implements Component {

   protected Component component;
	
   public Decorator(Component component) {
	 super();
	 this.component = component;
	   
   }
   
   
   @Override
	public void method() {
		// TODO Auto-generated method stub
	   component.method();
	}

}

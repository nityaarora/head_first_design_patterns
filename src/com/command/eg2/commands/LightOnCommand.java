package com.command.eg2.commands;

import com.command.eg2.vendor.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Execute of LightOnCommand");
		light.on();
	}
	
	@Override
	public void undo() {
		System.out.println("Undo of LightOnCommand");
		light.off();
	}
	
}

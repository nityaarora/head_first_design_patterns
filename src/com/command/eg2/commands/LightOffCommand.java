package com.command.eg2.commands;

import com.command.eg2.vendor.Light;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Execute of LightOffCommand");
		light.off();
	}
	

	@Override
	public void undo() {
		System.out.println("Undo of LightOffCommand");
		light.on();
	}
}

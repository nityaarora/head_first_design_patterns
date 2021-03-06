package com.command.eg2.tester;

import com.command.eg2.client.Remote;
import com.command.eg2.commands.Command;
import com.command.eg2.commands.FanHighCommand;
import com.command.eg2.commands.FanLowCommand;
import com.command.eg2.commands.FanOffCommand;
import com.command.eg2.commands.MacroCommand;
import com.command.eg2.vendor.Fan;
import com.command.eg2.vendor.Light;
import com.command.eg2.commands.LightOffCommand;
import com.command.eg2.commands.LightOnCommand;

public class TestPartyMode {

	public static void main(String[] args) {
		Remote remote = new Remote();
		
		Fan fan = new Fan();
		FanHighCommand fanHighCommand = new FanHighCommand(fan);
		FanLowCommand fanLowCommand = new FanLowCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		
		Command[] onCommands = {fanHighCommand, lightOnCommand, fanLowCommand};
		Command[] offCommands = {fanOffCommand, lightOffCommand, fanOffCommand};
		
		MacroCommand onMacroCommand = new MacroCommand(onCommands);
		MacroCommand offMacroCommand = new MacroCommand(offCommands);
		remote.setCommand(0, onMacroCommand, offMacroCommand);
		
		System.out.println("Testing.....");
		
		remote.onButtonPressed(0);
		remote.offButtonPressed(0);
	}
}

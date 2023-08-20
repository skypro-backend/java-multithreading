package patterns.behaviour.command;

import patterns.behaviour.command.command.Command;
import patterns.behaviour.command.command.LightOffCommand;
import patterns.behaviour.command.command.LightOnCommand;
import patterns.behaviour.command.light.Light;
import patterns.behaviour.command.light.RemoteControl;


public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton(); // Включить свет

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton(); // Выключить свет
    }
}


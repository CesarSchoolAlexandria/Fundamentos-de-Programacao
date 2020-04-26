package com.command;

public class Client{
  public static void main(String[] args)    {
    RemoteControl control = new RemoteControl();
    Door door = new Door();
    command open = new DoorOpenCommand(door);
    command close = new DoorCloseCommand(door);
    System.out.println(door.on);
    //Door starts closed
    
    control.setCommand(open);
    control.pressButton();
    //Door was opened
    System.out.println(door.on);    

    control.setCommand(close);   
    control.pressButton();
    //Door was closed
    System.out.println(door.on); 
  }
}

package com.command;

public class DoorOpenCommand implements command{
  Door door;
  public DoorOpenCommand(Door door){
    this.door = door;
  }
  public void execute(){
    door.open();
  }
}
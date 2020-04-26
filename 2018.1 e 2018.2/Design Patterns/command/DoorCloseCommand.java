package com.command;

public class DoorCloseCommand implements command{
  Door door;
  public DoorCloseCommand(Door door){
    this.door = door;
  }
  public void execute(){
    door.close();
  }
}

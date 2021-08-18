//TV class and method practice


//create a TV class
public class TV{
   int channel = 1; //default channel is 1 these are the data fields of the TV class
   int volume = 1; //default volume is 1
   
   boolean on = false; //TV is off
   
   //create a TV object
   public TV(){
   }
   
   //create a method to turn the TV on
   public void turnOn() {
      on = true;
   }
   //create a method to turn the TV off
   public void turnOff(){
      on = false;
   }
   //Create a method to change the channel
   public void setNewChannel(int newChannel){
      if(on && newChannel >= 1 && newChannel <= 120)
         channel = newChannel;
         
   //Create a method to change the volume
   public void setVolume(int newVolumeLevel){
      if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
         volume = newVolumeLevel;
   }
   //create a method to increase the channel
   public void channelUp(){
      if(on && channel < 120)
         channel++;
   }
   //create a method to decrease the channel
   public void channelDown(){
      if(on && channel > 1)
         channel--;
   }
   //create a method to increase the volume
   public void volumeUp(){
      if(on && volumeLevel < 7)
         volumeLevel++;
   }
   //create a method to decrease the volume
   public void volumeDown(){
      if(on && volumeLevel > 1)
         volumeLevel--;
   }
    
   }
}
public class Droid {
    int batteryLevel;
  String name;
  
  public Droid(String droidName){
    name=droidName;
    batteryLevel=100;
    }
      
  public String toString(){
      return "Hello, I'm the droid: " + name;
    }
 
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  
  public void energyReport(){
    System.out.println("Energy: " + batteryLevel);
  }
  
  public int energyTransfer(int addEnergy){
    batteryLevel = batteryLevel + addEnergy;
    return batteryLevel;
  }
  
  
public static void main(String[] args){
  
  Droid droidOne = new Droid("Codey");
  System.out.println(droidOne);
  
  droidOne.performTask("crying");
  droidOne.performTask("dancing");
  droidOne.performTask("coding");

  droidOne.energyReport();
  droidOne.energyTransfer(50);
  droidOne.energyReport();
  
 }
  
}
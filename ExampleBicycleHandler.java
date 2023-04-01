import java.util.Scanner;

class Bicycle {        
    // the Bicycle class has five fields
    public int cadence, gear, speed;
    String owner, type;
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear, String startType, String startOwner) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.type = startType;
        this.owner = startOwner;
    }
    // the Bicycle class has a method to print information
    public String getInfo (){
    	String message;
    	message = this.owner + " owns this " + this.type + " bicycle.";
    	message += "\nCurrently we are in gear "+ this.gear + " and going " + this.speed + " MPH.";
    	message += "\nThe cadence is " + this.cadence + " RPM.";
    	return message;
    }
}

public class ExampleBicycleHandler {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args)
	{
		Bicycle myBike = new Bicycle(45, 25, 7, "Schwinn", "Jon");
		System.out.println(myBike.getInfo());
		
	} 
} 

package fixtures;

public class Room extends Fixture {
//	Array for holding each rooms info
	private Room[] exits = new Room[5];
	
//	constructor
	public Room(String name, String shortDescription, String longDescription) {
		this.setName(name);
		this.setShortDescription(shortDescription);
		this.setLongDescription(longDescription);
	}
	
//	Get currently set exits
	public Room getExit(String direction) {		
		switch(direction) {
		case "north":
			return exits[0];
			
		case "east":
			return exits[1];
			
		case "south":
			return exits[2];
			
		case "west":
			return exits[3];
			
		default:
			return exits[4];
		}
	}
	
//	Set current exits based on template
	public void setExits(Room north, Room east, Room south, Room west, Room error) {
		exits[0] = north;
		exits[1] = east;
		exits[2] = south;
		exits[3] = west;
		exits[4] = error;				
	}

//	Return room information
	@Override
	public String toString() {
		return this.getName() + "\n" + "\n" + this.getShortDescription() + "\n" + this.getLongDescription();
	}
	
	
	
	
}

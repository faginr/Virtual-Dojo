package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;

	public void init() {
//		Room 1
		Room entrance = new Room(
//				Name
				"Entrance Hall",
//				Short Description
				"The entrance to the Dojo",
//				Long Description
				"You are currently standing at the entrance of the Dojo." + "\n" + "Spartan in furnishings, the intense smell of sweat mixed with wood and cotton hits you immediately." + "\n"
				+ "As you focus ahead of you, the hall continues a shortways, opening out into the main hardwood training floor." + "\n"
				+ "To your [north] you see - The Training Floor");
//		Room 2
		Room trainingFloor = new Room(
//				Name
				"Training Floor", 
//				Short Description
				"The main training room in the Dojo.", 
//				Long Description
				"A hardwood floor extends in a rectangle taking up almost the entirety of the inside of the Dojo." + "\n" + "The once white walls are beaten, battered, scuffed and scratched, with the occasional patched hole informing the martial nature of the space." + "\n" + "To the [south] you see - The Entrance Hall" + "\n" + "To your [west] you see - The Bathroom" + "\n" + "To your [east] you see - The Chaning Room");
//		Room 3
		Room bathroom = new Room(
//				Name
				"Bathroom",
//				Short Description
				"The sparse yet functional bathroom.",
//				Long Description
				"There are actually two bathroom doors, but only one opens freely." + "\n" + "The interior of the bathroom is unfinshed; cinderblock  walls build around a single fog-glass window." + "\n" + "In the corner of the room you see a shower (do people actually shower here?)." + "\n" + "The toilet is simple but clean. The sink is old. There is soap but only an empty paper towel roll to dry with." + "\n" + "To the [east] you see - The Training Floor"
				);
//		Room 4
		Room changeRoom = new Room(
//				Name
				"Changing Room",
//				Short Description
				"Spare room used for changing clothes",
//				Long Description
				"The door to this room sticks and you have to press hard with both hands to get it to open." + "\n" + "Maybe its meant as a deterrant for those who aren't serious about their training." + "\n" + "Inside you see a long coat rack hammered into the far wall, two chairs, and an old tournament trophy." + "\n" + "To the [west] you see - The Training Floor"
				);
		//		Room object for invalid inputs
		Room errorRoom = new Room("Invalid input", "Please enter a valid input:", "");
		
		//		Set Exits
//		setExits parameters: (north, east, south, west, error)
		entrance.setExits(trainingFloor, errorRoom, errorRoom, errorRoom, errorRoom);
		trainingFloor.setExits(errorRoom, changeRoom, entrance, bathroom, errorRoom);
		bathroom.setExits(errorRoom, trainingFloor, errorRoom, errorRoom, errorRoom);
		changeRoom.setExits(errorRoom, errorRoom, errorRoom, trainingFloor, errorRoom);
// 		Define starting room
		this.startingRoom = entrance;

	}

}

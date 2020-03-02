package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
//	Setup Scanner
	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
//		Setup Player
		Player player = new Player();
//		Instantiate RoomManager
		RoomManager rM = new RoomManager();
//		Initialize rooms, set exits
		rM.init();
		player.setCurrentRoom(rM.startingRoom);
		String menuSelect = null;
//		Intro
		System.out.println("Welcome to the Virtual Dojo. Valid player inputs will be given between [].\n*Please type [q] at any time to quit.\n");
		
//		Sequence of play
		while(!"q".equals(menuSelect)) {	
//		Print out room info
			System.out.println(player.getCurrentRoom());
//		Collect user input
			System.out.println("Choose a direction to move:");
			menuSelect = userInput.next();
//			validate input
			if (!"q".equals(menuSelect)) {
				Room nextRoom = player.getCurrentRoom().getExit(menuSelect);
				if (nextRoom != null & !"Invalid input".equals(nextRoom.getName())) {
//					update current room
					player.setCurrentRoom(nextRoom);
				} else {
					System.out.println(nextRoom);
				}
			}
			

		
		}
		
//		Quit, close resources
		System.out.println("You decide your training is complete, for now...");
		
		userInput.close();
	}
	
//	private static void printRoom(Player) print current room long description
	
//	private static String[] getInput() use scanner to collect input from user
	
//	private static void parse(String[], Player player)
	
}

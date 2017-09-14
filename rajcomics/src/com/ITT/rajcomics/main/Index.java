package com.ITT.rajcomics.main;

import com.ITT.rajcomics.validator.*;

class Index {
	public static void main(String[] args) {
		Index index = new Index();
		index.MainMenu();
	}
/*	
 Menu options. 
	Game_Manager
		Manage Characters//name list already displayed with hero/ villain . 
			Display	Detailed Table
			Add new Heroes/Villains
			Remove new Heroes/Villains
			Return to Game Manager 
		Manager Attribute Table//list displayed automatically
			Add new Attributes
			Remove Attributes
			Return to Game Manager
		Return to Main Menu
	 Go to Arena
		Start a New Arena
		Open past Arena
		Return to Main Menu
		                            //Into Arena
			Manage Characters in Arena
				Pick from table
				Create new Characters
				Delete Characters from Arena. //If from DB, press please.
		 	Organize fight
			Go to main Menu
			Save game and Exit
			Return to Go to Arena Page
	Exit
*/
	
	public void MainMenu() {
		String mainMenu = "Chose the appropriate option\n" + "1. Game Manager\n" + "2. Go to Arena\n"
				+ "3. Exit\n";
		System.out.println(mainMenu);
		int option = -1;
		switch(option){
		case 1:
			GameManagerMenu();
			break;
		case 2:
			arenaMenu();
			break;
		case 3:
			Exit();
			break;
		}
	}
	
	private void GameManagerMenu(){
		String menu = "Chose the appropriate option\n" + "1. Manage Charachters\n" + "2. Manager Attributes\n"
	+"3. Return to Main Menu";
		System.out.println(menu);
		int option = -1;
		switch(option){
		case 1:
			manageCharacterMenu();
			break;
		case 2:
			manageAttributeMenu();
			break;
		case 3:
			//returnToMainMenu
			break;
		}
	}
	
	private void manageCharacterMenu(){
		String menu = "Chose the appropriate option\n" + "1. Display details\n" + "2. Add Characters\n" + "3. Remove Charachters"+  "4. Retutn to Game Manager";
		int option = -1;
		switch(option){
		case 1:
			displayCharacterDetails();
			break;
		case 2:
			addCharacter();
			break;
		case 3: 
			removeCharacter();
			break;
		case 4:
			//returnToGameManager
			break;
		}
	}
	
	private void manageAttributeMenu(){
		String menu = "Chose the appropriate option\n" + "1. Add new Attributes\n" + "2. Remove new Attributes\n"+ "3. Return to Game Manager";
		int options = -1;
		switch(option){
		case 1:
			addAttribute();
			break;
		case 2:
			removeAttribute();
			break;
		case 3:
			//returnToGameManager
		}
	}

	private void arenaMenu(){
		String menu = "Chose the appropriate option\n" + "1. Start new Arena\n" + "2. Open a previous Arena";
		int option = -1;
		switch(option){
		case 1:
			Arena arena = newArena();
			break;
		case 2:
			Arena arena = openPreviousArena();
			break;
		case 3: 
			//returnToMainMenu
			break;
		}
		//in arena
		String inArenaMenu = "Chose the appropriate option\n" + "1. Manage Characters in\n" + "2. Organize Fight"+ "3. Save the Arena and return to go to arena Menu";
		int inArenaMenuOption = -1;
		switch(inArenaMenuOption){
		case 1:
			manageCharacters();
			break;
		case 2:
			organizeFight();
			break;
		case 3:
			saveArena();
			//to go to arena menu();
			break;
	}
}
}	
	

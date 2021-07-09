package game;

import fixtures.Flower;
import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		Room foyer = new Room(
				"The foyer",
				"a small foyer",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen.\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor.\n"
						+ "To the north is the staircase, to the west a living room, to the east a hallway, to the south an exit.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		
		Room livingRoom = new Room("The living room", "wide space for activities", 
				"This large room can serve many purposes ranging from gathering to excercising. It will commonly be used for "
				+ "lounging and some social interaction with the family. To the East is the foyer, to the wes a bedroom");
		this.rooms[1] = livingRoom;
		
		Room bedRoom = new Room("The bed room", "Personal quarters for a resident of the house", 
				"This small room is meant to house a single person (or a few if you have a big family). Has one closet "
				+ "Though sharing is caring, privacy is alway needed even briefly. To the East is the living room, to the south a closet");
		this.rooms[2] = bedRoom;
		
		Room closet = new Room("The closet", "A small room of storage", 
				"This closet is meant to store not much more than clothing. Though a person might be able to fit in this place, "
				+ "it is the first place one would check in a game of hide and seek. There is also a lack of skeletons for the"
				+ "morbidly curious. To the north is the bedroom");
		this.rooms[3] = closet;
		
		Room hallway = new Room("The hallway", "A space connecting two other rooms",
				"There isn't much to say about this place. It connects two rooms, one being the foyer, the other the master bedroom"
				+ "To the west is the foyer, to the east is the master bedroom");
		this.rooms[4] = hallway;
		
		Room balcony = new Room("The balcony", "A space that looks over the foyer", 
				"In this elevated space, you can see down to the foyer. This can be used to get the attention of a crowd of people"
				+ "you invited to the home. Though it is advised to not lean on the railing, it should hold one person leaning on it."
				+ " To the south is the foyer, to the east is a lounge, to the west a smoking room");
		this.rooms[5] = balcony;
		
		Room lounge = new Room("The lounge", "A space like a living room",
				"This room seems to have many places to sit. It is likely ot be used for waiting as opposed to anything more active."
				+"The couches are unfortunately covered in a thick protective plastic. Safe from stains, but lack comfort. To the weast"
				+ "is the balcony");
		this.rooms[6] = lounge;
		
		Room smokingRoom = new Room("The smoking room", "A space meant for smoking", 
				"Though becoming rare in modern times, this smoking room allows for anyone looking to enjoy a cigar, cigarette, or "
				+ "a certain medicine a quiet room to do so. There are ash trays all around, and enough bins to make sure there are"
				+ "no butts on the floor. There are also many windows to enjoy the outside view. To the west is the balcony");
		this.rooms[7] = smokingRoom;
		
		Room outside = new Room("Outside", "You are no longer in the house", "Thank you for moving having a look");
		this.rooms[8] = outside;
		
		Room master = new Room("The master bedroom", "A space intended for the owner of the house", 
				"This room was made for a king. A large bed that covers most of the floor is here. It seems to almost block the "
				+ "closet. Though that is the only set back as the room has its own bathroom. To the west is the hallway");
		this.rooms[9] = master;
		
		
		Room[] foyerExits = {balcony,livingRoom,hallway,outside};
		foyer.setExits(foyerExits);
		
		Room[] livingExits = {foyer, bedRoom};
		livingRoom.setExits(livingExits);
		
		Room[] bedExits = {livingRoom, closet};
		bedRoom.setExits(bedExits);
		
		Room[] closetExits = {bedRoom};
		closet.setExits(closetExits);
		
		Room[] hallwayExits = {foyer, master};
		hallway.setExits(hallwayExits);
		
		Room[] balconyExits = {foyer, smokingRoom, lounge};
		balcony.setExits(balconyExits);
		
		Room[] loungeExits = {balcony};
		lounge.setExits(loungeExits);
		
		Room[] smokingExits = {balcony};
		smokingRoom.setExits(smokingExits);
		
		Room[] masterExits = {hallway};
		master.setExits(masterExits);
		
		//objects
		Flower flower = new Flower("flower", "a red flower", 
				"The Spider lily (Lycoris) gets its name from its striking blooms."
				+ " Thin, delicate petals and long stamens result in blooms that resemble spider legs.");
		foyer.setItems(flower);
		
		this.startingRoom = foyer;
	}
	
	public Room getStartingRoom() { return this.startingRoom; }
	public void setStartingRoom(Room startingRoom) { this.startingRoom = startingRoom; }
	
	public Room[] getRooms() { return this.rooms; }
	public void setRooms(Room[] rooms) { this.rooms = rooms; }
	
}

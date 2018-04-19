package Wake2;
public class Map {

    //public Object currentRoom;
    public static int currentRoom;
    
    public Map() {

        Room one = new Room("Dark room", "You are in a small, dimly lit room.", "You are in a small concrete room with very little illumination.");
        Room two = new Room("Hallway", "You are in a dimly lit hallway.", "You are in a dim hallway, the only source of illumination coming from the southern door");
        Room three = new Room("4-way room", "You are in a large room lit by torches", "You are in a large stone room, well illuminated by torches.  Each of the four walls has a door.");

        Object[] roomList = {one, two, three};
        currentRoom = 0;

    }//map

    //createRoom is no longer used
    public void createRoom() {
        Room one = new Room("First Room", "This is a room", "This is a small room.  It is quite small"); //add exits and items later
        System.out.println("You are in");
        System.out.println(one.roomName); //changed from one.returnName();
    }//createRoom



} //Map

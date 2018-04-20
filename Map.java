package Wake2;
public class Map {

        Room one = new Room("Dark room", "You are in a small, dimly lit room.", "You are in a small concrete room with very little illumination.");
        Room two = new Room("Hallway", "You are in a dimly lit hallway.", "You are in a dim hallway, the only source of illumination coming from the southern door");
        Room three = new Room("4-way room", "You are in a large room lit by torches", "You are in a large stone room, well illuminated by torches.  Each of the four walls has a door.");

        Room[] roomList = {one, two, three};
        private Room currentRoom = one;

        public Map() {

    }//map

    public Room getRoom() {
        return currentRoom;
    }//getRoom()

    public void setRoom(Room room) {
        this.currentRoom = room;
        System.out.println(currentRoom.returnShortDesc());
    }

} //Map

package Wake2;
public class Room {

    public String roomName;
    public String roomShortDesc;
    public String roomLongDesc;
    //public ArrayList exits = new ArrayList();
    public Room north;
    public Room south;
    public Room east;
    public Room west;
    //public ArrayList items = new ArrayList();
    
    public Room(String name, String shortDesc, String longDesc, Room goNorth, Room goSouth, Room goEast, Room goWest) {
        roomName = name;
        roomShortDesc = shortDesc;
        roomLongDesc = longDesc;
        north = goNorth;
        south = goSouth;
        east = goEast;
        west = goWest;
    }//room()

    //remove this
    public Room(String name, String shortDesc, String longDesc) {
        roomName = name;
        roomShortDesc = shortDesc;
        roomLongDesc = longDesc;

    }//room()

//    public void room(String name, String shortDesc, String longDesc, ArrayList exits, ArrayList items) {
//    }//room()

    public String returnName() {
        return roomName;
    }//returnName

    public String returnShortDesc() {
        return roomShortDesc;
    }//returnShortDesc()

    public String returnLongDesc() {
        return roomLongDesc;
    }//returnLongDesc

    public Room returnNorth() {
        return north;
    }
    public Room returnSouth() {
        return south;
    }
    public Room returnEast() {
        return east;
    }
    public Room returnWest() {
        return west;
    }

    //setters for map()
    public void setNorth(Room dest) {
        north = dest;
    }
    public void setSouth(Room dest) {
        south = dest;
    }
    public void setEast(Room dest) {
        east = dest;
    }
    public void setWest(Room dest) {
        west = dest;
    }
}//Room

package Wake2;
public class Room {

    public String roomName;
    public String roomShortDesc;
    public String roomLongDesc;
    //public ArrayList exits = new ArrayList();
    //public ArrayList items = new ArrayList();
    
    public Room(String name, String shortDesc, String longDesc) {
        roomName = name;
        roomShortDesc = shortDesc;
        roomLongDesc = longDesc;

    }//room()

//    public void room(String name, String shortDesc, String longDesc, ArrayList exits, ArrayList items) {
//    }//room()

    public String returnName() {
        return this.roomName;
    }//returnName

    public String returnShortDesc() {
        return this.roomShortDesc;
    }//returnShortDesc()

    public String returnLongDesc() {
        return roomLongDesc;
    }//returnLongDesc
    
}//Room

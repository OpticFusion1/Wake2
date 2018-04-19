package Wake2;
public class Map {


    public void map() {

        //create rooms here?
        createRoom();
    }//map

    public void createRoom() {
        Room one = new Room("First Room", "This is a room", "This is a small room.  It is quite small"); //add exits and items later
        System.out.println("You are in");
        System.out.println(one.roomName); //changed from one.returnName();
    }//createRoom

} //Map

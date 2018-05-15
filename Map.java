import java.util.ArrayList;

public class Map{

  //create rooms here;
  Room blank = new Room();
  Room one = new Room();
  Room two = new Room();
  Room three = new Room();
  Room four = new Room();
  Room five = new Room();

  //Room[] roomArray = {one, two, three};
  //ArrayList roomList = new ArrayList(roomArray); 

//Item itemName = new Item("a nameofitem", "a sentancedescribingtheitem.", trueIfItCanBeTaken);
  Item coin = new Item("coin", "a small silver coin.", true);
  Item pen = new Item("pen", "a tiny silver pen with cap.", true);
  Item paper = new Item("paper", "a white sheet of paper with writing on it.", true);
  Item fountain = new Item("fountain", "a large stone fountain, water trickling down its sides.", false);
  Item flower = new Item("flower", "a colorful flower.", true);
  Item flower1 = new Item("flower", "a colorful flower.", true);
  Item flower2 = new Item("flower", "a colorful flower.", true);
  Item flower3 = new Item("flower", "a colorful flower.", true);
  Item egg = new Item("egg", "an incredible, edible, egg!", true);

  private Room currentRoom = one;

  public Map() {
    //assign all room parameters here;
    one.setName("Dark room");
    one.setShortDesc("You are in a small, dimly lit room.");
    one.setLongDesc("You are in a small concrete room with very little illumination.");
    one.addExit(0, blank);  //this is to prevent an array out of bounds error
    one.addExit(1, two);
    one.addExit(2, blank);
    one.addExit(3, blank);
    //items;
    one.addItem(coin);
    one.addItem(egg);
    one.addItem(flower);

    two.setName("Hallway");
    two.setShortDesc("You are in a dimly lit hallway.");
    two.setLongDesc("You are in a dim hallway, the only source of illumination coming from the southern door");
    two.addExit(0, one);
    two.addExit(1, three);
    two.addExit(2, blank);
    two.addExit(3, blank);
    //items
    two.addItem(fountain);

    three.setName("Four-way room");
    three.setShortDesc("You are in a large room lit by torches.");
    three.setLongDesc("You are in a large stone room, well illuminated by torchs.  Each of the four walls has a door.");
    three.addExit(0, two);
    three.addExit(1, blank);
    three.addExit(2, four);
    three.addExit(3, five);
    //items

    four.setName("Green room");
    four.setShortDesc("You are in a small, green room.");
    four.setLongDesc("You are in a small green room. It is quite green.");
    four.addExit(0, blank); 
    four.addExit(1, blank);
    four.addExit(2, blank);
    four.addExit(3, three);
    //items;
    four.addItem(pen);
    four.addItem(paper);

    five.setName("Blue room");
    five.setShortDesc("You are in a small, blue room.");
    five.setLongDesc("This is most definitely the bluest room that you have ever seen.");
    five.addExit(0, blank);  
    five.addExit(1, blank);
    five.addExit(2, three);
    five.addExit(3, blank);
    //items;
    five.addItem(flower1);
    five.addItem(flower2);
    five.addItem(flower3);

  }//Map()

  public Room getCurrentRoom() {
    return currentRoom;
  }//getRoom

  public void setCurrentRoom(Room x) {
    currentRoom = x;
  }//setRoom



}//Map        

import java.util.Scanner;

public class Prompt{
  public boolean running = true;
  Scanner in = new Scanner(System.in);
  public Map map = new Map();
  public Inventory inventory = new Inventory();

  public void loop(){
    System.out.println(map.getCurrentRoom().getShortDesc());
    while (running == true){
      listExits();
      listItems();
      //prompt
      System.out.print("[" + map.getCurrentRoom().getName() + "]: ");
      String usrInput = in.nextLine();
      System.out.println("");
      usrInput = usrInput.toLowerCase();

      switch (usrInput) {

        //quit
        case "quit":
        case "q": running = false;
          System.out.println("Farewell.");
          break;

        //look
        case "l": System.out.println(map.getCurrentRoom().getLongDesc());
          break;
        case "look": System.out.println(map.getCurrentRoom().getLongDesc());
          break;

        //navigation (north, south, east, west)
        case "north":
        case "n": if (map.getCurrentRoom().exits.get(0).equals(map.blank)){
           System.out.println("You can't go that way.");
           } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(0));
               System.out.println(map.getCurrentRoom().getShortDesc());
           } 
          break;
        case "south":
        case "s": if (map.getCurrentRoom().exits.get(1).equals(map.blank)){
           System.out.println("You can't go that way.");
           } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(1));
               System.out.println(map.getCurrentRoom().getShortDesc());
           }
          break;
        case "east":
        case "e": if (map.getCurrentRoom().exits.get(2).equals(map.blank)){
           System.out.println("You can't go that way.");
           } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(2));
               System.out.println(map.getCurrentRoom().getShortDesc());
           }
          break;
        case "west":
        case "w": if (map.getCurrentRoom().exits.get(3).equals(map.blank)){
           System.out.println("You can't go that way.");
           } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(3));
               System.out.println(map.getCurrentRoom().getShortDesc());
           }
          break;
        case "get coin": 

        default: System.out.println("I'm not sure what you mean.");
          break;

      }//switch (usrInput)
    }//while (running = true)
  }//run()

  public void listExits(){

   System.out.print("There are exits to the ");
   // (0 = north, 1 = south, 2 = east, 3 = west)
   int x = 0;
   int y = map.getCurrentRoom().exits.size();
   while (y > 0){
      if (map.getCurrentRoom().exits.get(x).equals(map.blank)){
        y--;
        x++;
        continue;
      }
      switch (x) {
        case 0: System.out.print("north");
          y--;
          x++;
          break;
        case 1: System.out.print("south");
          y--;
          x++;
          break;
        case 2: System.out.print("east");
          y--;
          x++;
          break;
        case 3: System.out.print("west");
          y--;
          x++;
          break;
    } System.out.print(" ");
  } System.out.println("");
 }//listExits()

  public void listItems(){
    if (map.getCurrentRoom().items.size() < 1){ 
      return; 
    } else {
      System.out.print("You can see ");
      int x = 0; 
      for (int y = map.getCurrentRoom().items.size(); y > 0; y--){
        System.out.print(map.getCurrentRoom().items.get(x).getName() + " ");
        x++;
      }//for y > 0;
    } System.out.println("here.");
  }//listItems()

}//Prompt

import java.util.Scanner;
import java.util.ArrayList;

public class Prompt{
  public boolean running = true;
  Scanner in = new Scanner(System.in);
  public Map map = new Map();
  public Inventory inventory = new Inventory();

  public void loop(){
    System.out.println(map.getCurrentRoom().getShortDesc());
    listItems();
    listExits();
    while (running == true){
      //prompt
      System.out.print("[" + map.getCurrentRoom().getName() + "]: ");
      String usrInput = in.nextLine();
      System.out.println("");
      usrInput = usrInput.toLowerCase();
      String[] tokenized = usrInput.split("\\s");

      //2-word input
      if (tokenized.length == 2){
        switch (tokenized[0]){
            case "take":
            case "t":
            case "get":
            case "g":
                //get
                boolean getFail = true;
                for (int x = 0; x < map.getCurrentRoom().items.size(); x++){
                    if (map.getCurrentRoom().items.get(x).getName().equals(tokenized[1])){
                        if (map.getCurrentRoom().items.get(x).getObtainable()){
                          System.out.println("You take the " + tokenized[1]);
                          inventory.addItem(map.getCurrentRoom().items.get(x));
                          map.getCurrentRoom().removeItem(x);
                          getFail = false;
                        } else {
                            getFail = false;
                            System.out.println("You can't seem to pick that up.");
                        }
                    }//if
                }//for
                if (getFail){
                    System.out.println("You don't see one of those here.");
                }
                break;
            case "drop":
            case "d":
                //drop
                boolean dropFail = true;
                for (int x = 0; x < inventory.inv.size(); x++){
                    if (inventory.inv.get(x).getName().equals(tokenized[1])){
                        System.out.println("You drop the " + tokenized[1]);
                        map.getCurrentRoom().addItem(inventory.getItem(x));
                        inventory.removeItem(x);
                        dropFail = false;
                    }//if
                }
                if (dropFail){
                    System.out.println("You don't have one of those.");
                }
                break;
            case "look":
            case "l":
                //look
                boolean lookFail = true;
                for (int x = 0; x < inventory.inv.size(); x++){
                    if (inventory.inv.get(x).getName().equals(tokenized[1])){
                        System.out.println(inventory.getItem(x).getDesc());
                        lookFail = false;
                    }//if
                }//check inventory
                for (int x = 0; x < map.getCurrentRoom().items.size(); x++){
                    if (map.getCurrentRoom().items.get(x).getName().equals(tokenized[1])){
                        System.out.println(map.getCurrentRoom().items.get(x).getDesc());
                        lookFail = false;
                    }
                }//check room
                if (lookFail) {
                    System.out.println("You don't see one of those here.");
                }

                break;

        }//switch (tokenized[0])
      }//tokenized.length.equals(2);

      else { //1-word input
        switch (usrInput) {

          //quit
          case "quit":
          case "q": running = false;
            System.out.println("Farewell.");
            break;

          //look
          case "l": 
          case "look": System.out.println(map.getCurrentRoom().getLongDesc());
            listItems();
            listExits();
            break;

          //navigation (north, south, east, west)
          case "north":
          case "n": if (map.getCurrentRoom().exits.get(0).equals(map.blank)){
             System.out.println("You can't go that way.");
             } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(0));
               System.out.println(map.getCurrentRoom().getShortDesc());
               listItems();
               listExits();
             } 
            break;
          case "south":
          case "s": if (map.getCurrentRoom().exits.get(1).equals(map.blank)){
             System.out.println("You can't go that way.");
             } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(1));
               System.out.println(map.getCurrentRoom().getShortDesc());
               listItems();
               listExits();
             }
            break;
          case "east":
          case "e": if (map.getCurrentRoom().exits.get(2).equals(map.blank)){
               System.out.println("You can't go that way.");
             } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(2));
               System.out.println(map.getCurrentRoom().getShortDesc());
               listItems();
               listExits();
             }
            break;
          case "west":
          case "w": if (map.getCurrentRoom().exits.get(3).equals(map.blank)){
             System.out.println("You can't go that way.");
             } else {
               map.setCurrentRoom(map.getCurrentRoom().exits.get(3));
               System.out.println(map.getCurrentRoom().getShortDesc());
               listItems();
               listExits();
             }
            break;
          //utility commands
          case "inventory":
          case "inv": 
          case "i": if (inventory.inv.size() > 0){
            inventory.listItems();
            } else {
              System.out.println("You are not carrying anything.");
            }
            break;

          default: System.out.println("I'm not sure what you mean.");
            break;

        }//switch (usrInput)
      }
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

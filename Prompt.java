package Wake2;
import java.util.Scanner;

public class Prompt {
    
    public boolean running = true;
    Scanner in = new Scanner(System.in);
    public Map map = new Map();
    

    public void run() {
        
        //Map map = new Map();
        //map.createRoom();
        loop();
    }//run()

    public void loop() {
        while (running == true) {
           
            System.out.print(map.getRoom().returnName() + ": "); //return roomname
            String usrInput = in.nextLine();
            usrInput = usrInput.toLowerCase();

            switch (usrInput) {
                case "q": running = false;
                System.out.println("Farewell.");
                break;
                case "m": System.out.println("You pressed m.");
                break;
                //look
                case "l": System.out.println(map.getRoom().returnLongDesc());
                break;
                case "look": System.out.println(map.getRoom().returnLongDesc());
                break;
                //navigation
                case "n": if (map.getRoom().returnNorth().equals(null)) {
                    //map.setRoom(map.getRoom().returnNorth());
                    System.out.println("You can't go that way");
                } else {
                    map.setRoom(map.getRoom().returnNorth()); //needs to be updated!!!!!!!!!!
                    //System.out.println("You can't go that way");
            }
                break;
                //default
                default: System.out.println("I'm not sure what you mean.");
                break;
            }//switch(usrInput)
        }//while(running==true)
    }//loop()
}//prompt()

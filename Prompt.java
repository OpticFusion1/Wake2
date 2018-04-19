package Wake2;
import java.util.Scanner;

public class Prompt {
    
    public boolean running = true;
    Scanner in = new Scanner(System.in);
    

    public void run() {
        
        Map map = new Map();
        map.createRoom();
        loop();
    }//run()

    public void loop() {
        while (running == true) {
           
            //print current room name and short desc\\ System.out.print(currentRoom.roomName);
            String usrInput = in.nextLine();
            usrInput = usrInput.toLowerCase();

            switch (usrInput) {
                case "q": running = false;
                System.out.println("Farewell.");
                break;
                case "m": System.out.println("You pressed m.");
                break;
                default: System.out.println("I'm not sure what you mean.");
                break;
            }//switch(usrInput)
        }//while(running==true)
    }//loop()
}//prompt()

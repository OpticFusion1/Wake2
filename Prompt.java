package Wake2;
import java.util.Scanner;

public class Prompt {
    
    public boolean running = true;
    Scanner in = new Scanner(System.in);
    public Object currentRoom;

    public void run() {
        
        Map map = new Map();
        //map.createRoom();
        loop();
    }//run()

    public void loop() {
        while (running == true) {
           
            System.out.print(map.roomList[Map.currentRoom].returnName());
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

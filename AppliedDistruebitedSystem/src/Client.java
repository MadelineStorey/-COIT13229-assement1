import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author madel
 */
public class Client 
{
// make this the main class 
   public static void main (String args[]) throws IOException{
       Socket s= null; // need to explain what this one does
       // need to put this all in a try block but I want to get it working first 
       int serverPort = 8888; // This is setup to be udp for now  

			s = new Socket("localhost", serverPort);
       try{
                        // initalise the objec  streams for both the fire and the drones 
        ObjectInputStream droneIn = null;
        ObjectOutputStream droneOut =null;
        ObjectOutputStream fireOut = null;
        ObjectInputStream fireIn= null;
// wonder if this makes 2 threads and if so is this exessive?
			droneOut =new ObjectOutputStream(s.getOutputStream());
			droneIn = new ObjectInputStream( s.getInputStream());
			fireOut = new ObjectOutputStream( s.getOutputStream());
                        fireIn = new ObjectInputStream( s.getInputStream());
                        Scanner sa=new Scanner(System.in); // this will be replaced with the gui once server client communcication is working 
                        
// This is reading everything in.
			System.out.println("Enter Drone ID");
			int droneID=sa.nextInt();
                        
			System.out.println("Enter Drone name:");
			String name =sa.nextLine();
                        
                        System.out.println("Enter Drone position");
                        String position =sa.nextLine(); // need to do some error handling here to get (x,y) to be the only accepted input
                        
                        System.out.println("Enter Fire ID ");
                        int fireID =sa.nextInt(); // error handling must be unqinue 
                        
                        System.out.println("Enter fire Category: ");
                        String fireCat =sa.nextLine();
                        
                        System.out.println(" Enter fire location :");
                        String fireLocation = sa.nextLine();
                        
           // features needed on the client side 

   }catch (UnknownHostException e){System.out.println("Socket:"+e.getMessage());
		}catch (EOFException e){System.out.println("EOF:"+e.getMessage());
		}catch (IOException e){System.out.println("readline:"+e.getMessage());
		}catch(ClassNotFoundException ex){
					 ex.printStackTrace();
		}finally {if(s!=null) try {s.close();}catch (IOException e){System.out.println("close:"+e.getMessage());}}
     }
}

   
}

 
   void moveDrone() 
            {}
   void registerDrone()
   {}
   void returnDroneToBase()
           {
                
            }
   void fireReport()
   {}
  void  deleteFireReport()
  {}
  void  exitServerApp(){
  returnDroneToBase();
  }
  
           
            }
                        
   
    


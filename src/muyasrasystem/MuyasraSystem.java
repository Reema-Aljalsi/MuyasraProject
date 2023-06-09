package muyasrasystem;

import static java.lang.System.exit;
import java.util.Scanner;

public class MuyasraSystem {
    //creat scanner 
    static Scanner scan = new Scanner(System.in);
    //declar trip list  
    static TripList2 Trip = new TripList2();
    //declar user list
    static UserList users = new UserList();
    
//==============================================================================
//                                   MAIN                                
//==============================================================================
    
    public static void main(String[] args) {
        //declear the choice
        int choice;
       
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        //                       DO-WHILE LOOP                            \\
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\ 
        do{
            firstMenu();
            //user choice from menu
            choice= scan.nextInt();
           
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        //                       CREAT ACOUNT                             \\
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\ 
            if (choice ==1){
                //passing the user list to adding the new user 
                creatAcount(users);
               
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        //                          LOG-IN                                \\
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\    
            }else if(choice ==2){
                System.out.println("Enter your id: ");
                int userId=scan.nextInt();
                
                System.out.println("Enter your password");
                String pass=scan.next();
                
                //passing the id and pass to log in 
                User user= users.logIn(userId,pass);
                
                //check if the user exist or wrong information  
                if(user==null){
                    System.out.println("there is no user with this user Id or wrong password!!\n");
                                      
                }else{
                    System.out.println("\n WELLCOME "+user.getName()+" in MUYASARA!!!\n");
                    if(user.getUserType().equalsIgnoreCase("admin")){
                        showAdminMenue(user); 
                    }else if(user.getUserType().equalsIgnoreCase("visitor")){
                        showVisitorMenue(user); 
                    }
                }
                
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        //                       QUIT THE SYSTEM                          \\
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\ 
            }else if(choice == 3){
                System.out.println("Thank you for using MUYASARA system");
                System.exit(0);
            }
        }while(choice!=3);
    }
   
//==============================================================================
//                                FIRST MENU                                  
//==============================================================================
    
    public static void firstMenu(){
        System.out.println("--------MUYASRA---------");
        System.out.println("1- creat acount");
        System.out.println("2- log in");
        System.out.println("3- quit the system");
    } 
    
//==============================================================================
//                               CREAT ACOUNT                                 
//==============================================================================
    
    public static void creatAcount (UserList users){
        //declaring the storage variables 
        String name,gendar,pass;
        int id,age,phoneNumber;
        
        //Enter the personal information 
        System.out.println("are you admin (a) or visitor (v)?");
        String userType=scan.next();
        
        //error checking
        if(checkError(userType).equalsIgnoreCase(null)){
            return;
        }else{
            userType= checkError(userType);
        }
        System.out.println("what's your name?");
        name=scan.next();
               
        System.out.println("Enter your ID: ");
        id=scan.nextInt();
                
        System.out.println("how old are you?");
        age=scan.nextInt();
                
        System.out.println("Female (F) or male (M)?");
        gendar=scan.next();
                
        System.out.println("Enter your phone number: (05..)");
        phoneNumber=scan.nextInt();
                
        System.out.println("Enter your password:");
        pass=scan.next();
        
        //spacifaing the user
        System.out.println("\n WELLCOME "+name+" in MUYASARA!!!\n");
        if(userType.equalsIgnoreCase("a")){  
            //for admin
            users.insert(name,id,pass,age,gendar,"admin",phoneNumber);
            User admin = users.findNode(id,pass);
            showAdminMenue(admin); 
                   
        }else if(userType.equalsIgnoreCase("v")){
            //for visitor
            users.insert(name,id,pass,age,gendar,"visitor",phoneNumber);
            User visitor = users.findNode(id,pass);
            showVisitorMenue(visitor); 
        }
    }
    
//==============================================================================
//                            SHOW ADMIN MENUE                                 
//==============================================================================
    
    private static void showAdminMenue(User admin) {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- add trip");//--> israa
        System.out.println("2- show total number of visitor in the trip");// --> reema 
        System.out.println("3- log out");
        
        //passing the selection to AdminSelect 
        System.out.println("------------------------");
        System.out.println(admin.getName()+", Could you enter your choice?");
        AdminSelect(scan.nextInt(),admin);
    }
    
//==============================================================================
//                               ADMIN SELECT                                 
//==============================================================================
    
    //this method perfome the task for admin
    private static void AdminSelect(int selection, User admin) {
    
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                         add trip                               \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\    
        if (selection == 1) {
            //declare storege virable 
            int TripID, numOfChairs, AdminID, busID;
            String date, location, adminName;
            boolean Availability;
            
            System.out.println("Enter Trip ID: ");
            TripID = scan.nextInt();

            System.out.println("Enter Trip's Date: ");
            date = scan.next();

            System.out.println("Enter Trip's departure: ");
            String departure = scan.next();
             
             System.out.println("Enter Trip's arrival: ");
             String arrival = scan.next();

            System.out.println("Enter number of chairs: ");
            numOfChairs = scan.nextInt();

            System.out.println("Enter bus ID: ");
            busID = scan.nextInt();

            //insert the trip in the trip list 
            Trip.AddTrip(TripID, date, departure,arrival, numOfChairs, 
                    admin.getName(),admin.getUserID(),true, busID);
        
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                show total visitor in the trip                  \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        }else if (selection == 2){
          System.out.println("Enter the trip ID: ");
          int TId = scan.nextInt();
          
          // call the VistorNumber function
          Trip.VistorNumber(TId);

                  
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                          log-out                               \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\ 
        }else if (selection == 3){
            return;
        }
        //if the user remaining logged in to account show the menu again
        if(selection != 3){
           showAdminMenue(admin); 
        }
    }    
    
//==============================================================================
//                            SHOW VISITOR MENUE                                 
//==============================================================================
    
    private static void showVisitorMenue(User visitor) {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- browse trip"); // --> joud 
        System.out.println("2- booking trip");//--> reema
        System.out.println("3- cancel trip");
        System.out.println("4- log out");
        System.out.println("------------------------");
        System.out.println(visitor.getName()+", Could you enter your choice?");
        VisitorSelect(scan.nextInt(),visitor);
          
    }
    
//==============================================================================
//                             VISITOR SELECT                                  
//==============================================================================
    
    //this method perfome the task for visitor 
    private static void VisitorSelect(int selection, User visitor) {
        
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                       BROWSE TRIP                              \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        if (selection == 1) {
            Trip.browseTrip();
            
 
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                       BOOKING TRIP                             \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        }else if (selection == 2){
         //call browse trip
          Trip.browseTrip();
         //take user input
            System.out.print("Enter the trip ID: ");
            int TId = scan.nextInt();
            
            // call book trip function
            Trip.bookTrip(TId,visitor.getUserID() );
          
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                          cancel trip                           \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\         
        }else if (selection == 3){
            int idT,idV;
            
            System.out.println("Choose the trip ID that you want to deleted: ");
            idT=scan.nextInt();
                        
           Trip.cancelTrip(idT);
            
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
       //                          log-out                               \\
       //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        }else if (selection == 4){
            return;
        }
        
        //if the user remaining logged in to account show the menu again
        if(selection != 4){
           showVisitorMenue(visitor); 
        }
    }

//==============================================================================
//                               CHECK ERROR                                 
//==============================================================================    

    private static String checkError(String userType) {
        int i=0;
        while(!userType.equalsIgnoreCase("a")&&!userType.equalsIgnoreCase("v")){
            System.out.println("you must write (a) as admin or (v) as visitor, try again!!");
            userType=scan.next(); 
            i++;
            if(i==4){
                System.out.println("\t\t!!!ERORE!!!\nFive times you entered incorrect information :/ ");
                return null;
            }
        }
        return userType;
    }
}

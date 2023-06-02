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
    
//-------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        //declear the choice
        int choice;
       
        //do while loop to run the program
        do{
           
            firstMenu();
            //user choice from menu
            choice= scan.nextInt();
           
            //if the user choose 1 --> creat acount 
            if (choice ==1){
               
                //passing the user list to adding the new user 
                creatAcount(users);
               
            //log-in    
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
                        showAdminMenue(); 
                        
                    }else if(user.getUserType().equalsIgnoreCase("visitor")){
                      showVisitorMenue(); 
                    }
                }
                
            //quit the system
            }else if(choice == 3){
                System.out.println("Thank you for using MUYASARA system");
                System.exit(0);
            }
           
        }while(choice!=3);
        
    }
   
//-------------------------------------------------------------------------------------------  
    public static void firstMenu(){
        System.out.println("--------MUYASRA---------");
        System.out.println("1- creat acount");
        System.out.println("2- log in");
        System.out.println("3- quit the system");
    } 
    
    public static void creatAcount (UserList users){
        
        //declaring the storage variables 
        String name,gendar,pass;
        int id,age,phoneNumber;
        
        //Enter the personal information 
        System.out.println("are you admin (a) or visitor (v)?");
        String userType=scan.next();
        
        //error checking
        int i=0;
        while(!userType.equalsIgnoreCase("a")&&!userType.equalsIgnoreCase("v")){
            System.out.println("you must write (a) as admin or (v) as visitor, try again!!");
            userType=scan.next(); 
            i++;
            if(i==4){
                System.out.println("\t\t!!!ERORE!!!\nFive times you entered incorrect information :/ ");
                return;
            }
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
               
        /*
        after entering the information the system specify the user to admin or
        visitor and insert it to user list
        */ 
        System.out.println("\n WELLCOME "+name+" in MUYASARA!!!\n");
        if(userType.equalsIgnoreCase("a")){  
            //for admin
            users.insert(name,id,pass,age,gendar,"admin",phoneNumber);
            showAdminMenue(); 
                   
        }else if(userType.equalsIgnoreCase("v")){
            //for visitor
            users.insert(name,id,pass,age,gendar,"visitor",phoneNumber);
            showVisitorMenue(); 
        }
        
    }

//-------------------------------------------------------------------------------------------
    private static void showAdminMenue() {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- add trip");//--> israa
        System.out.println("2- show total visitor in the trip");// --> reema 
        System.out.println("3- remove a visitor from trip");// --> haneen
        System.out.println("4- log out");
        
        //passing the selection to AdminSelect 
        AdminSelect(scan.nextInt());
    }
    
    //this method perfome the task for admin
    private static void AdminSelect(int selection) {
        //1- add trip 
        if (selection == 1) {
            //declare storege virable 
            int TripID, numOfChairs, AdminID, busID;
            String date, location, adminName;
            boolean Availability;
            
            System.out.println("Enter Trip ID: ");
            TripID = scan.nextInt();

            System.out.println("Enter Trip's Date: ");
            date = scan.next();

            System.out.println("Enter Trip's location: ");
            location = scan.next();

            System.out.println("Enter number of chairs: ");
            numOfChairs = scan.nextInt();

            System.out.println("Enter your name: ");
            adminName = scan.next();

            System.out.println("Enter your ID: ");
            AdminID = scan.nextInt();

            System.out.println("Is this trip available? true/false");
            if ((scan.next()).equalsIgnoreCase("true")) {
                Availability = true;
            } else {
                Availability = false;
            }

            System.out.println("Enter bus ID: ");
            busID = scan.nextInt();

            //insert the trip in the trip list 
            Trip.AddTrip(TripID, date, location, numOfChairs, adminName, AdminID, Availability, busID);
        
        
        //2- show total visitor in the trip
        }else if (selection == 2){
            
        
        
        //3- remove a visitor from trip
        }else if (selection == 3){
            int idT,idV;
            System.out.println("choose the trip: ");
          //browse trip();
            System.out.println("Enter the trip ID: ");
            idV=scan.nextInt();
            
            System.out.println("Enter the visitor id: ");
            idV=scan.nextInt();
            
           //Trip.search(idT,idv);
            
        //4- log out
        }else if (selection == 4){
            return;
        }
        
        //if the user remaining logged in to account show the menu again
        if(selection != 4){
           showAdminMenue(); 
        }
        
    }    
    
//-------------------------------------------------------------------------------------------    
    private static void showVisitorMenue() {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- browse trip"); // --> joud 
        System.out.println("2- booking trip");//--> reema
        System.out.println("3- log out");
        VisitorSelect(scan.nextInt());
          
    }
    
    //this method perfome the task for visitor 
    private static void VisitorSelect(int selection) {
        //1- browse trip
        if (selection == 1) {
            

        //2- booking trip
        }else if (selection == 2){
            
            
        //3- log out
        }else if (selection == 3){
            return;
        }
        
        //if the user remaining logged in to account show the menu again
        if(selection != 3){
           showAdminMenue(); 
        }
    }    
}

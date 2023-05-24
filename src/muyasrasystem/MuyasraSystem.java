/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muyasrasystem;

import java.util.Scanner;

/**
 *
 * @author hanee
 */
public class MuyasraSystem {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       UserList users = new UserList();
       TripList Trip = new TripList();
       
       int choice;
       
       do{
           
           firstMenu();
           choice= scan.nextInt();
           
           //creat acount 
           if (choice ==1){
               creatAcount(users);
               
           //log-in    
           }else if(choice ==2){
               //if els اذا كان ادمن او اذا كان فيسيتور
               System.out.println("Enter your id: ");
               int userId=scan.nextInt();
               System.out.println("Enter your password");
               String pass=scan.nextLine();
               User user= users.logIn(userId,pass);
               if(user==null){
                   System.out.println("there is no user with this user Id!!\n go to creat acount ");
                   creatAcount(users);
                   
               }else{
                   if(user.getUserType().equalsIgnoreCase("admin")){
                      showAdminMenue(); 
                       
                       
                   }else if(user.getUserType().equalsIgnoreCase("visitor")){
                      showVisitorMenue(); 
                       
                       
                     
                   }
                   
               }
           //quit the system
           }else if(choice == 3){
               System.out.println("quit the system!");
           }
           
       }while(choice!=3);
        
    


    }
    
    public static void firstMenu(){
        System.out.println("--------MUYASRA---------");
        System.out.println("1- creat acount");
        System.out.println("2- log in");
        System.out.println("3- quit the system");
    } 
    
    public static void creatAcount ( UserList users){
        Scanner scan= new Scanner(System.in);
        String name,gendar , pass;
        int id,age,phoneNumber;
        System.out.println("are you (admin) or (visitor)?");
        String userType=scan.next();
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
               if(userType.equalsIgnoreCase("admin")){  
                   users.insert(name,id,pass,age,gendar,"admin",phoneNumber);
               } else if(userType.equalsIgnoreCase("visitor")){
                   users.insert(name,id,pass,age,gendar,"visitor",phoneNumber);
               }
               
        
    }


    private static void showAdminMenue() {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- add trip");
        System.out.println("2- show total visitor in the trip");
        System.out.println("3- remove a visitor from trip");
        System.out.println("4- edit time and location in trip");
        System.out.println("5- change bus in the trip");
    }

    private static void showVisitorMenue() {
        System.out.println("--------MUYASRA---------");
        System.out.println("1- booking trip");
        System.out.println("2- get ticket");
        
    }
    
}

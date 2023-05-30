package muyasrasystem;


public class User {
    //data filds: 
    private String name;
    private int userID; //userID الي هو رقم الهوية او الاقامة تبع اليوزر 
    private String pass;
    private int age;
    private String gender;
    private String userType; //هل هو ادمن ولا فيستور 
    private int phoneNum;
    private User next;
    //constructor

    public User() {
    }
    
    public User(String name, int userID ,String pass, int age, String gender, String userType, int phoneNum, User next) {
        this.name = name;
        this.userID = userID;
        this.pass= pass;
        this.age = age;
        this.gender = gender;
        this.userType = userType;
        this.phoneNum = phoneNum;
        this.next=next;
    }

    
    
    public User(String name, int userID ,String pass, int age, String gender, String userType, int phoneNum) {
        this.name = name;
        this.userID = userID;
        this.pass= pass;
        this.age = age;
        this.gender = gender;
        this.userType = userType;
        this.phoneNum = phoneNum;
        next=null;
    }
    
    
    

    //setters and getters
    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAge() {
        return age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
  
    
    
    
}

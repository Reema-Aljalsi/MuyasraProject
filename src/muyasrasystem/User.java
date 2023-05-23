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
    //constructor
    public User(String name, int userID ,String pass, int age, String gender, String userType, int phoneNum) {
        this.name = name;
        this.userID = userID;
        this.pass= pass;
        this.age = age;
        this.gender = gender;
        this.userType = userType;
        this.phoneNum = phoneNum;
    }
    
    
    

    //setters and getters
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    //METHODS:
    //creat acount 
    public void creatAcount(){
        
    }
    
    //sign-in (check in user list if found log-in else creat acount)
    //  هذي الميثود تستقبل الارراي تبع اليوزرز من المين وتعمل سيرش 
    // اذا حصل اليوزر يطبع مرحبا مع اسم اليوزر  
    public void logIn(){
    
    }
    
}

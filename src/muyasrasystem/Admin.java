package muyasrasystem;


public class Admin extends User {
    //data filds 
    private int adminId; //هذا الي يكون رقمه في السستم نفسه 

    //constructor
    public Admin(int asminId, String name, String pass, int userID, int age, String gender,String userType, int phoneNum) {
        super(name, userID, pass, age, gender,userType, phoneNum);
        this.adminId = asminId;
    }

    public Admin(String name, int userID,String pass, int age, String gender,String userType, int phoneNum) {
        super(name, userID,pass, age, gender,userType, phoneNum);
    }
    
    
    //setters and getters
    public int getAsminId() {
        return adminId;
    }

    public void setAsminId(int asminId) {
        this.adminId = asminId;
    }
   
    //METHODS:
    /*
    وصف:
    غالبا كل الميثود تستقبل الارراي ليست حقت التريب وتعدل
    عليها فحتكون نوع الميثود ارراي ليست
    
    نحن حنسوي المنيو في المين بحيث يختارالادمن 
    الفنكشن الي يبيها ويرسل لها الليست 
    */
    
    
    /*
    حيكون عندنا ليست اوف تريب نرسلها من المين لهذي الفنكشن
    علشان تعدل عليها بانها تضيف رحلة 
    */
    //add trip 
    
    
    /*
    حنرسل نفس الليست تبع التريب و نستخدم فنكشن تعد
    المحتويات وتظهرها في الاوتبوت 
    */
    //show total vistor trip 
    
    
    /*
    هنا نرسل نفس الليست ونحذف الفيستور الي م نبيه  
    */
    //remove a visitor from trip 
    
    
    /*
    نفس الكلام هنا يستقبل الليست ويعدل عليها 
    */
    //edit time and location 
    
    /*
    لو حابب يغير الباص لباص ثاني من هنا
    لكن لا ننسى انو يعمل تشييك عالباص هل هو افايلبل او لا
    */
    //change bus in trip 
    
    
}

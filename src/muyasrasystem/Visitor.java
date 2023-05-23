//gvgvhbvi
package muyasrasystem;

import java.util.ArrayList;


public class Visitor extends User {
    //data filds 
    private ArrayList TripID; // حجوزات اليوزر هنا تنحفظ ارقام التريب هنا
    
    
    public Visitor(String name, int userID ,String pass, int age, String gender, String userType, int phoneNum) {
        super( name, userID , pass, age, gender,  userType,  phoneNum);
    }

    //setters and getters
    public ArrayList getTripID() {
        return TripID;
    }

    public void setTripID(ArrayList TripID) {
        this.TripID = TripID;
    }
  
    //METHODS:
    //booking method 
    /*
    حنستعمل الارراي ليست تبع التريب ونضهرها لليوزر ويختار التريب الي يبغاها 
    التعديلات الي بتحصل في التريب نفسها انو يقل عدد المقاعد ويزيد عدد الفيستور
    راح ينضاف الايدي حق التريب داخل الارراي حق الفيستور نفسه الي سويتها بالداتافيلدز +
    */
    
    //get Tiket 
    /*
    بعد ما انضافت بنجاح راح ناخذ المعلومات حقت التريب اللوكيشن والديت ونزبطها
    في فورمة معينة كانها تيكت 
    */
  
    
}

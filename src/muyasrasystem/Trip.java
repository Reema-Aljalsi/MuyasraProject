
package muyasrasystem;


public class Trip {
   //data filds 
   private int tripID;
   private String date;
   private String location;
   private int numberOfChairs;
   private int[] arrayChairs; 
   private String adminName;
   private int adminID;
   private boolean availability= true;
   private int[] VistorID;
   private int busID;
  
   //constraint
    public Trip(int tripID, String date, String location, int numberOfChairs, int[] Chairs, String adminName, int adminID, boolean availability, int busID) {
        this.tripID = tripID;
        this.date = date;
        this.location = location;
        this.numberOfChairs = numberOfChairs;
        this.arrayChairs = Chairs;
        this.adminName = adminName;
        this.adminID = adminID;
        this.availability = availability;
        this.busID = busID;
    }

    //   منفصلة عن الباقي عشان لمن نجي نعمل ادد للتريب(المشتركين في هذي الرحلة)خليت الفيستور ليست في الكونستريت
    // محا يكون من المنطقي انو كمان نعبي الليست حق المشتركين من البداية 
   

    
    //seters and getters
    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public int[] getChairs() {
        return arrayChairs;
    }

    public void setChairs(int[] Chairs) {
        this.arrayChairs = Chairs;
    }
    
    public int[] getVistorID() {
        return VistorID;
    }

    public void setVistorID(int[] VistorID) {
        this.VistorID = VistorID;
    }

    
    //METHODS:
    //chairs is full???
    /*
    علشان نقدر نتأكد لو مليان الفيستور محا يقدر يسجل 
    او في حالة لمن نجي نعرض الافايلبل تريب م تضهر لانها فلل
    */
    
    // ممكن ميثود تشيك على الافيلابيلتي حق التريب بحيث لو كانت الكراسي فلل
    //يغير الافايلبيلتي لفولس
    //cheack avilability of trip
    
    
    //مدري اذا فيه اشياء اضافية
   
   
   
}

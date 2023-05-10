
package utsoor;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.


public class modeltablefinal {
    private final IntegerProperty ID;
    private final StringProperty BLOOD_GROUP;
    private final StringProperty NAME;
     private final StringProperty WEIGHT;
      private final StringProperty PROFESSION;
       private final StringProperty FNAME;
        private final StringProperty DISTRICT;
   private final StringProperty THANA;
   

      private final StringProperty PHONE;
      
        private final StringProperty VILLAGE;
    private final StringProperty AGE;
 /*  //  private final StringProperty phone;
      private final StringProperty phone;
       private final StringProperty phone;
        private final StringProperty phone;
         private final StringProperty phone;
      
     
         private final StringProperty username;
    private final StringProperty fathername;
     private final StringProperty phone;
      private final StringProperty phone;
       private final StringProperty phone;
        private final StringProperty phone;
         private final StringProperty phone;
      
         private final StringProperty username;
    private final StringProperty fathername;
     private final StringProperty phone;
      private final StringProperty phone;
       private final StringProperty phone;
        private final StringProperty phone;
         private final StringProperty phone;
      
         private final StringProperty username;
    private final StringProperty fathername;
     private final StringProperty phone;
      private final StringProperty phone;
       private final StringProperty phone;
        private final StringProperty phone;
         private final StringProperty phone;
      
     */
     
  //   private final DateProperty date;

    public modeltablefinal(Integer id, String name,String fname,String pphone,String bgroup,String weight,String age,String thana,String district,String village,String profession)//must be same as orginal database field name
    {

        this.ID = new SimpleIntegerProperty(id);
        this.NAME = new SimpleStringProperty(name);
           this.FNAME= new SimpleStringProperty(fname);
             this.PHONE= new SimpleStringProperty(pphone);
        this.BLOOD_GROUP = new SimpleStringProperty(bgroup);
            this.WEIGHT= new SimpleStringProperty(weight);
              this.AGE= new SimpleStringProperty(age);
        
    
        
      
    
     
    this.THANA= new SimpleStringProperty(thana);
        this.DISTRICT = new SimpleStringProperty(district);
    this.VILLAGE= new SimpleStringProperty(village);
      this.PROFESSION= new SimpleStringProperty(profession);
   
   
       
    }

    /**
     *
     * @return
     */
     public Integer getid() {
        return ID.get();
    }
    
    public String getbgroup() {
        return BLOOD_GROUP.get();
    }
 public String getname() {
        return NAME.get();
    }   

    
     public String getprofession() {
        return PROFESSION.get();
    }

    public void setid(Integer value) {
        ID.set(value);
    }

    public void setbgroup(String value) {
        BLOOD_GROUP.set(value);
    }
     public void setname(String value) {
        NAME.set(value);
    }
     

    public void setprofession(String value) {
       PROFESSION.set(value);
    }


    /**
     *
     * @return
     */
    public StringProperty bgroupProperty() {
        return BLOOD_GROUP;//////////////////////////////////////
    }

    public StringProperty nameProperty() {
        return NAME;
    }

    public IntegerProperty idProperty() {
        return ID;
    }
   
      public StringProperty professionProperty() {
        return PROFESSION;
    }
      
      public String getdistrict() {
        return DISTRICT.get();
    }
      
       public void setdistrict(String value) {
        DISTRICT.set(value);
    }
      
        public StringProperty districtProperty( ){
        return DISTRICT;////////////////////////////////////////////////
    }
        
        
          public String getfname() {
        return FNAME.get();
    }
      
       public void setfname(String value) {
        FNAME.set(value);
    }
      
        public StringProperty fnameProperty() {
        return FNAME;
    }
        public String gethana() {
        return THANA.get();
    }
      
       public void setthana(String value) {
         THANA.set(value);
    }
      
        public StringProperty thanaProperty() {
        return THANA;///////////////////////////////////////////
    }
    
         public String getvillagae() {
        return VILLAGE.get();
    }
      
       public void setvillage(String value) {
        VILLAGE.set(value);
    }
      
        public StringProperty villageProperty() {
        return VILLAGE;//////////////////////////////////
    }
        
        
            
        
     public String getweight() {
        return WEIGHT.get();
    }      
       public void setweight(String value) {
        WEIGHT.set(value);
    }
      
        public StringProperty weightProperty() {
        return WEIGHT;
    }
            
   public String getpphone() {
        return PHONE.get();
         }
      
       public void setpphone(String value) {
        PHONE.set(value);
    }
      
        public StringProperty pphoneProperty() {
        return PHONE;
    }
            
         public String getage() {
        return AGE.get();
    }
      
       public void setage(String value) {
        AGE.set(value);
    }
      
        public StringProperty ageProperty() {
        return AGE;
    }
}

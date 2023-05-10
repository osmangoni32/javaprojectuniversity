
package utsoor;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
//import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class SearchController implements Initializable {

    @FXML
    private TableView<modeltablefinal> TABLE1;
    @FXML
    private TableColumn<modeltablefinal,Integer> ID;
    @FXML
    private TableColumn<modeltablefinal,String> NAME;
    @FXML
    private TableColumn<modeltablefinal,String> FATHER;
    @FXML
    private TableColumn<modeltablefinal,String> PHONE;
    @FXML
    private TableColumn<modeltablefinal,String> AGE;
    @FXML
    private TableColumn<modeltablefinal,String> THANA;
    @FXML
    private TableColumn<modeltablefinal,String> DISTRICT;
    @FXML
    private TableColumn<modeltablefinal,String> VILLAGE;
    private ObservableList<modeltablefinal>dat;

    /**
     * Initializes the controller class.
     */
    DbConnectionfinal d;
    @FXML
    private TableColumn<modeltablefinal,String> BLOOD_GROUP;
    @FXML
    private TableColumn<modeltablefinal,String> PROFESSION;
    @FXML
    private TableColumn<modeltablefinal,String> WEIGHT;
    @FXML
    private TextField namewise;
   
    @FXML
    private TextField villagewise;
      //      
    @FXML
    private TextField districtwise;
    // 
    @FXML
    private TextField idwise;  //   
    
    @FXML
    private TextField awardwise; //   
    @FXML
    private TextField genderwise;  //   
    @FXML
    private TextField birthdaywise;  //   
    @FXML
    private TextField mid;     //
    @FXML
    private TextField mgen;     //
    @FXML
    private TextField mvi;  // 
    @FXML
    private TextField mdis;  //   
    @FXML
    private TextField agewise;// 
    @FXML
    private TextField bloodgroup; //   
    @FXML
    private TextField nidwise;     //
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   d=new DbConnectionfinal ();
    }    

    @FXML
    private void showtable(ActionEvent event) {
        
        try{
          
    Connection conn=d.con();

    dat=FXCollections.observableArrayList();
  
    ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM ut");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");
     
    while(rs.next()){
            //System.out.println("no problem in starting rs");
    dat.add(new modeltablefinal(rs.getInt("id"),rs.getString("name"),rs.getString("fname"),rs.getString("pphone"),rs.getString("bgroup"),rs.getString("weight"),rs.getString("age"),rs.getString("thana"),rs.getString("district"),rs.getString("village"),rs.getString("profession")));
     
    }
 
      }
   catch(Exception e){System.out.println("Loading ERROR IN five TABLE  :  "+e);}
    //prepare value factory must be same with

  ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
   NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
      FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
              PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));
        
        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));
   //  PHONE.setCellValueFactory(new PropertyValueFactory<>("nname"));


      THANA  .setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));


        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
              PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
       // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
        
        
    }

    @FXML
    private void namewise(ActionEvent event) {
        try {
            String name = namewise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE name='" + name + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void villagewise(ActionEvent event) {
         try {
          String village=villagewise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE village='" + village + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void districtwise(ActionEvent event) {
        
         try {
       String district=districtwise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE district='" + district + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void idwise(ActionEvent event) {
         try {
     String id=idwise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE id='" + id + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void awardwise(ActionEvent event) {
    
     try {
       String award=awardwise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE bdts='" + award + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    
    }

    @FXML
    private void genderwise(ActionEvent event) {
         try {
String gender=genderwise.getText();
            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE sex='" + gender + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void birthdaywise(ActionEvent event) {
         try {
      String birthday=birthdaywise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE bdate='" + birthday + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void agewise(ActionEvent event) {
         try {
           String age=agewise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE age='" + age + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void mastersearch(ActionEvent event) {
         try {
   String mi=mid.getText();
     String mv=mvi.getText();String mdiss=mdis.getText();String mg=mgen.getText();
   

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE village='" + mv + "' and id='" + mi + "' and district='" + mdiss + "'and sex='" + mg + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void nidwise(ActionEvent event) {
         try {
       String nid=nidwise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE nid='" + nid + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void bloadgroup(ActionEvent event) {
          try {
       String blood=bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                      
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

          
               
             
                  }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void BIRTHDAY(ActionEvent event) {
             try {
       String blood=bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                           DbConnectionfinal dc;
    String[] faruk = new String[10];
     String[] osman = new String[10];

    int j, k, l=-1, m,z=-1;
    int i=-1;
    String[] name = new String[10];
    Date[] date = new Date[10];
     SimpleDateFormat  mdy=new   SimpleDateFormat("MM/dd/yyyy");
             
           osman[++l] = rs.getString("bdate");  
             Date fulldate=mdy.parse(osman[l]);

        faruk[++i] = rs.getString("bdate");
            // System.out.println("print"+date[i]);
            

             SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
             Date d2=sdf.parse(faruk[i]);
             String date1 = sdf.format(d2);//date to string=format

             Date localdate = new Date();
             Date localdatee=new Date();
             
       long ms=System.currentTimeMillis()-fulldate.getTime();
       long age=(long)((long)ms/(1000*60*60*24));
       System.out.println("jhfdv:"+age);
          
             String date3 = sdf.format(localdate);
             if (date1.equals(date3)) {
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

          
                 name[++z] = rs.getString("name");
                Notifications.create()
                         .title("BIRTHDAY")
                         .text("HAPPY BIRTHDAY  " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i))
                         .show();
            
                 }
             
                  }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
       
        
    }

    @FXML
    private void ENABLE(ActionEvent event) {
        
              try {
       String blood=bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ut"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                           DbConnectionfinal dc;
    String[] faruk = new String[10];
     String[] osman = new String[10];

    int j, k, l=-1, m,z=-1;
    int i=-1;
    String[] name = new String[10];
    Date[] date = new Date[10];
     SimpleDateFormat  mdy=new   SimpleDateFormat("MM/dd/yyyy");
             
           osman[++l] = rs.getString("bdate");  
             Date fulldate=mdy.parse(osman[l]);

        faruk[++i] = rs.getString("bdate");
            // System.out.println("print"+date[i]);
            

             SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
             Date d2=sdf.parse(faruk[i]);
             String date1 = sdf.format(d2);//date to string=format

             Date localdate = new Date();
             Date localdatee=new Date();
             
       long ms=System.currentTimeMillis()-fulldate.getTime();
       long age=(long)((long)ms/(1000*60*60*24));
       
       System.out.println("jhfdv:"+age);
          
             String date3 = sdf.format(localdate);
        //     String comaparedate=DAY.getText();
             if (age>=120) {
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

          
                 name[++z] = rs.getString("name");
             /*    Notifications.create()
                         .title("BIRTHDAY")
                         .text("HAPPY BIRTHDAY  " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i))
                         .show();*/
             }
             
                  }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
       
        
         
    }
    
    
}

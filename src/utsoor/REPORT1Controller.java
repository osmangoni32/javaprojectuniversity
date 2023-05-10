/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author user
 */
public class REPORT1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void birthday_report(ActionEvent event) {
          try {

            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM ut"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                           //DbConnectionfinal dc;
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
      
                 name[++z] = rs.getString("name");
                Notifications.create()
                         .title("BIRTHDAY")
                         .text("HAPPY BIRTHDAY  " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i+2))
                         .show();
            
                 }
             
                  }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
    }

    @FXML
    private void enable_report(ActionEvent event) {
                  try {
          String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM ut"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                           DbConnectionfinal dc;
    String[] faruk = new String[10];
     String[] osman = new String[10];

    int j, kkk=3, l=-1, m,z=-1;
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
  //  dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("fname"), rs.getString("pphone"), rs.getString("bgroup"), rs.getString("weight"), rs.getString("age"), rs.getString("thana"), rs.getString("district"), rs.getString("village"), rs.getString("profession")));

          
                 name[++z] = rs.getString("name");
                Notifications.create()
                         .title("ELIGIBLE")
                         .text(" " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i+3.5))
               
                        .show();
               kkk++; 
             }
             
                  }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
    }
    
}

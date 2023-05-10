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
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import static javax.management.Query.value;
import static javax.management.Query.value;

/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class InputController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField nbdt;
    @FXML
    private TextField prof;
    @FXML
    private TextField udpbdd;
    private TextField bgpno;
    private TextField date;
    private TextField place;
    private TextField bgpid;
    private TextField phn;
    private TextField age;
    private TextField weight;
    private TextField bgroup;
    private TextField phone;
    private TextField rid;
    private TextField rcardno;
    private TextField rdate;
    @FXML
    private Button update;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   

  
    void bgp(ActionEvent event) {
        
                    try 
                    {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
     String sq="INSERT INTO `bgp`(`bgpno`, `bgpid`, `date`, `place`, `name`, `phn`, `age`, `weight`, `bgroup`)"
             + " VALUES (' "+bgpno.getText()+ " '   ,' "+bgpid.getText()+ " ' ,' "+date.getText()+ " ' ,' "+place.getText()+ " ' ,' "+name.getText()+ " ',' "+phn.getText()+ " '   ,' "+age.getText()+ " ' ,' "+weight.getText()+ " ' ,' "+bgroup.getText()+ " ' )";
            st.execute(sq);
            System.out.println("eeeee");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
        
    }
    //updatef

    private void getupdate1(ActionEvent event) {
            
                    try 
         {
             String url = "jdbc:mysql://localhost:3306/student";
             String uname = "root";
             String pass = "";
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection(url, uname, pass);
                  Statement st=con.createStatement();
                   
                String sst= id.getText() ;
                   
             String sq="  UPDATE ut SET name='"+name.getText()+ "',bddate='"+udpbdd.getText()+ "',`profession`='"+prof.getText()+ " ' WHERE id='"+sst+" '";//,bdd=' "+udpbdd.getText()+ " ' ,`profession`='"+prof.getText()+ " ',`bdts`=' "+nbdt.getText()+ " ', WHERE id='"+sst+" '";
          // String sq=" INSERT INTO `udf`(`id`, `name`, `bdd`, `professeion`, `nbdt`)"
             //      + " VALUES (' "+id.getText()+ " '   ,' "+name.getText()+ " ' ,' "+udpbdd.getText()+ " ' ,' "+prof.getText()+ " ' ,' "+nbdt.getText()+ " ' )";
            st.execute(sq);
   
            System.out.println("Update success");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("update error :"+e);
                                                    }
        
    }
    
    void getdetails(ActionEvent event) {
        
                       try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
                         ResultSet rs; 
            //String sq="SELECT * FROM `udf` WHERE id='"+id.getText()+" ' ";
            String nmm=id.getText();
            
              String sql="SELECT * FROM utt WHERE id='"+nmm+" ' ";
               System.out.println("yes"+nmm);
            
          rs=  st.executeQuery(sql);
          int c=0;
          while(rs.next()){
               c=c+1;
             
              String nm=rs.getString("name");
              System.out.println("jhdf"+nm);
              name.setText(nm);
                String bdd1=rs.getString("bddate");
              udpbdd.setText(bdd1);
                String pro=rs.getString("profession");
              prof.setText(pro);
                String nbd=rs.getString("bdts");
              nbdt.setText(nbd);     
              
          }
            System.out.println("eehjfjadfee");
             System.out.println("gdghs"+c);
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
        

    }

    private void bgp_save(ActionEvent event) {
          try 
                    {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
     String sq="INSERT INTO `bgp`(`bgpno`, `id`, `date`, `place`, `name`,  `age`, `weight`, `phone`,`blood`)"
             + " VALUES ('"+bgpno.getText()+"'   ,'"+bgpid.getText()+"' ,'"+date.getText()+"' ,'"+place.getText()+"','"+name.getText()+"','"+age.getText()+"' ,'"+weight.getText()+"' ,'"+phone.getText()+"','"+bgroup.getText()+"')";
            st.execute(sq);
            System.out.println("success in bgp");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in bgp :"+e);
                                                    }
    }

    private void get_remind_card_issue(ActionEvent event) {
                  try 
                    {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
    // String sq="INSERT INTO `bgp`(`bgpno`, `id`, `date`, `place`, `name`,  `age`, `weight`, `phone`,`blood`)"
      //       + " VALUES ('"+bgpno.getText()+"'   ,'"+bgpid.getText()+"' ,'"+date.getText()+"' ,'"+place.getText()+"','"+name.getText()+"','"+age.getText()+"' ,'"+weight.getText()+"' ,'"+phone.getText()+"','"+bgroup.getText()+"')";
      String sq="INSERT INTO `remind`(`id`, `cardno`, `date`) VALUES ('"+rid.getText()+"'   ,'"+rcardno.getText()+"'   ,'"+rdate.getText()+"')";  
      st.execute(sq);
            System.out.println("success in bgp");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in bgp :"+e);
                                                    }
    }

    @FXML
    private void getdetails33(ActionEvent event) {
        
                       try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
                         ResultSet rs; 
            //String sq="SELECT * FROM `udf` WHERE id='"+id.getText()+" ' ";
            String nmm=id.getText();
            
              String sql="SELECT * FROM ut WHERE id='"+nmm+" ' ";
               System.out.println("yes"+nmm);
            
          rs=  st.executeQuery(sql);
          int c=0;
          while(rs.next()){
               c=c+1;
             
              String nm=rs.getString("name");
              System.out.println("jhdf"+nm);
              name.setText(nm);
                String bdd1=rs.getString("bddate");
              udpbdd.setText(bdd1);
                String pro=rs.getString("profession");
              prof.setText(pro);
                String nbd=rs.getString("bdts");
              nbdt.setText(nbd);     
              
          }
            System.out.println("eehjfjadfee");
             System.out.println("gdghs"+c);
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
    }

    @FXML
    private void getupdate33(ActionEvent event) {
        
            
                    try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                  Statement st=con.createStatement();
                   
                String sst= id.getText() ;
                   
             String sq="  UPDATE ut SET name='"+name.getText()+ "',bddate='"+udpbdd.getText()+ "',`profession`='"+prof.getText()+ " ',bdts='"+nbdt.getText()+ "' WHERE id='"+sst+" '";//,bdd=' "+udpbdd.getText()+ " ' ,`profession`='"+prof.getText()+ " ',`bdts`=' "+nbdt.getText()+ " ', WHERE id='"+sst+" '";
          // String sq=" INSERT INTO `udf`(`id`, `name`, `bdd`, `professeion`, `nbdt`)"
             //      + " VALUES (' "+id.getText()+ " '   ,' "+name.getText()+ " ' ,' "+udpbdd.getText()+ " ' ,' "+prof.getText()+ " ' ,' "+nbdt.getText()+ " ' )";
            st.execute(sq);
   
            System.out.println("Update success");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("update error :"+e);
                                                    }
    }

    
}

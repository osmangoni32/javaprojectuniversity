/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class App11Controller implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField nname;
    @FXML
    private TextField profession;
    @FXML
    private TextField id;
    @FXML
    private TextField fname;
    @FXML
    private TextField mname;
    @FXML
    private TextField rname;
    @FXML
    private TextField rphone;
    @FXML
    private TextField bgroup;
    @FXML
    private TextField bpressure;
    @FXML
    private TextField age;
    @FXML
    private TextField weight;
    @FXML
    private TextField pphone;
    @FXML
    private TextField email;
    @FXML
    private TextField fb;
    @FXML
    private TextField thana;
    @FXML
    private TextField district;
    @FXML
    private TextField village;
    @FXML
    private TextField division;
    @FXML
    private TextField nid;
    @FXML
    private TextField bddate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getapp11save(ActionEvent event) {
                   try 
         {
             
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
    /*  String sq=" INSERT INTO `tt`"
                   + "(`id`, `name`, `nname`, `professeion`) "
                   + "VALUES (' "+id.getText()+ "' ,' null',' "+nnm.getText()+ "',' "+pro.getText()+ "')";*/
            
                 String sq= " INSERT INTO ut"
              + "(id, type, name, nname, profession, fname, mname, rname, rphone,nid,bdate,bgroup,bpressure,age,weight,pphone,email,village,thana,district)"
              + " VALUES ('"+id.getText()+"',' null ','"+name.getText()+"',' "+nname.getText()+ " ',' "+profession.getText()+ " ',' "+fname.getText()+ " ',' "+mname.getText()+ " ',' "+rname.getText()+ " ',' "+rphone.getText()+ " ',' "+nid.getText()+ " ','"+bddate.getText()+ "','"+bgroup.getText()+ "','"+bpressure.getText()+ "','"+age.getText()+ "','"+weight.getText()+ "','"+pphone.getText()+ "','"+email.getText()+ "','"+village.getText()+ "','"+thana.getText()+ "','"+district.getText()+ "')"; 
            st.execute(sq);
            System.out.println("eeeee");
        //,' "+nid.getText()+ " ','null','  ','null','nul',' "+bg.getText()+ " ',' "+bp.getText()+ " ',' "+age.getText()+ " ',' "+wei.getText()+ " ',' "+ppn.getText()+ " ',' "+fb.getText()+ " ',' "+hpn.getText()+ " ',' "+re.getText()+ " ',' "+eml.getText()+ " ',' "+on.getText()+ " ',' "+vill.getText()+ " ',' "+dg.getText()+ " ',' "+th.getText()+ " ',' "+di.getText()+ " ',' "+div.getText()+ " ',' "+pa.getText()+ " ',' null','null',  ' null ',  ' null ',' "+bdn.getText()+ " '
      //, nid,  nationality, religion, sex, bgroup, bpressure, age, weight, pphone, facebook, hphone, relation, email, woard, vilage, post, thana, district, division, paddress, isaddicted, isinterested, cause, socialwork, number
         
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
           //  JOptionPane.showMessageDialog(null,"please enter your birthday or exception is:"+e);
                                                    }
    }
    
}

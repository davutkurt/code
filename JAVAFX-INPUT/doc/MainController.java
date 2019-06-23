package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	@FXML
	private Label lblstatus;
	
	@FXML
	private TextField idText;
	
	@FXML
	private TextField first_nameText;
	
	@FXML
	private TextField last_nameText;

	
	
	public void Save(ActionEvent event) {
		
		String id =  idText.getText();
		String first_name = first_nameText.getText();
		String last_name = last_nameText.getText();
		System.out.println("" +id + " "+ first_name + " "+ last_name);
		
		String insertQuery = "insert into test values( '" + id +"'"+ ","+"'"+ first_name +"'"  + ","+"'"+ last_name +"')";
		
		try{
			  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.99.100:32769:xe","SYSTEM","oracle");
			  Statement statement = conn.createStatement();
			  statement.executeUpdate(insertQuery);
			  
		  }catch(SQLException e){
			  e.printStackTrace();
		  }
		

		
	}
	
	
}

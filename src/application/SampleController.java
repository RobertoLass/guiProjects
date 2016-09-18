package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SampleController implements Initializable {

@FXML private Label lbl_above;
@FXML private TextField tf_name;
@FXML private PasswordField ptf_password;


public void login(ActionEvent event) throws IOException{
		
		if(tf_name.getText().equals("admin") && ptf_password.getText().equals("admin")){
			
			Stage second = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
			Scene scene = new Scene(root);					
			second.setScene(scene);
			second.setTitle("second");
			second.show();
		}else{
			lbl_above.setText("Login warnicht erfolgreich erfolgrein");
		}
}


	@Override
	public void initialize(URL url, ResourceBundle bundle) {
		// TODO Auto-generated method stub

	}

}

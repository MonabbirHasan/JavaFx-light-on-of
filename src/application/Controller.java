package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	
	@FXML
	private CheckBox myCheckBox;
	@FXML
	private Label myLabel;
	@FXML
	private ImageView myImageView;
	
	
	Image MyImageOne=new Image(getClass().getResourceAsStream("img4.png"));
	Image MyImageTow=new Image(getClass().getResourceAsStream("img3.png"));
	
	public void change(ActionEvent event) {
		if(myCheckBox.isSelected()) {
			myLabel.setText("LIGHT IS ONE");
			myImageView.setImage(MyImageTow);
		}else {
			myLabel.setText("LIGHT IS OFF");
			myImageView.setImage(MyImageOne);
		}
	}
	
	
	
}

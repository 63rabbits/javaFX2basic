package javaFX2basic;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BasicController {

	@FXML
	private Label label01;

	@FXML
	void initialize() {
		assert label01 != null : "fx:id=\"label01\" was not injected: check your FXML file 'Basic.fxml'.";

		this.label01.setText("Hello World!!");
	}

}

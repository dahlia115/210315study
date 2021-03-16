package quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Parent root =
				FXMLLoader.load(getClass().getResource("quiz02.fxml"));
		Scene scenc = new Scene(root);
		arg0.setScene(scenc);
		arg0.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

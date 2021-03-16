package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Label01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox h = new HBox();
		Label lbl = new Label("lbl test");
		
		lbl.setText("setText test");//초기화가능
		lbl.setPrefSize(200, 30);//배경을 키우는?
		lbl.setStyle("-fx-background-color:yellow;");
		lbl.setAlignment(Pos.CENTER_RIGHT);//라벨 위치 변경
		
		h.setPadding(new Insets(20));
		h.getChildren().addAll(lbl);
		h.setPrefSize(300, 200);
		arg0.setScene(new Scene(h));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

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
		
		lbl.setText("setText test");//�ʱ�ȭ����
		lbl.setPrefSize(200, 30);//����� Ű���?
		lbl.setStyle("-fx-background-color:yellow;");
		lbl.setAlignment(Pos.CENTER_RIGHT);//�� ��ġ ����
		
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

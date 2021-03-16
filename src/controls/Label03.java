package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Label03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox h = new HBox(10);
		h.setPadding(new Insets(10));
		
		Label lbl = new Label("�ƹ� �����̳� ���ϴٿ�~");
		lbl.setWrapText(true);//Ʋ�ȿ� ���� �ؽ�Ʈ�� ����.
		
		h.getChildren().addAll(lbl);
		h.setPrefSize(100, 100);
		
		arg0.setScene(new Scene(h));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

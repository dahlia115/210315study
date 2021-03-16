package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Label02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//라벨에 이미지를 넣을 수 있다.
		HBox h = new HBox();
		h.setPadding(new Insets(10));
		Label lbl = new Label("",new ImageView("/resources/img/search.png"));
		
		Label lbl02 = new Label("search");
		lbl02.setGraphic(new ImageView("/resources/img/SmileReRe.png"));
		lbl02.setRotate(48);
		
		Label lbl03 = new Label("Hello World!!!");
		lbl03.setFont(new Font("Segoe Print",32));
		lbl03.setRotate(48);
		lbl03.setTranslateY(50);//Y축 이동
		
		h.getChildren().addAll(lbl,lbl02,lbl03);

		arg0.setScene(new Scene(h,600,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

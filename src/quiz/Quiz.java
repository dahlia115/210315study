package quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox h = new HBox();
		Label lbl01 = new Label("Search",new ImageView("/resources/img/search.png"));
		Label lbl02 = new Label("Values");
		Label lbl03 = new Label("A label that needs to be wrapped");
		lbl01.setTextFill(Color.CADETBLUE);
		
		lbl01.setPrefSize(150, 0);
		lbl02.setPrefSize(200, 0);
		lbl03.setPrefSize(70, 100);
		lbl02.setRotate(270);
		lbl01.setFont(new Font(20));
		lbl02.setFont(new Font(32));
		
		lbl01.setWrapText(true);
		lbl02.setWrapText(true);
		lbl03.setWrapText(true);
		
		lbl02.setTranslateX(-20);
		lbl02.setTranslateY(30);
		lbl03.setTranslateX(-40);
		lbl03.setTranslateY(30);
		
		lbl01.setOnMouseEntered(e ->{
			lbl01.setScaleX(1.5);
			lbl01.setScaleY(1.5);
		});
		lbl01.setOnMouseExited(e ->{
			lbl01.setScaleX(1.0);
			lbl01.setScaleY(1.0);
		});
		lbl02.setOnMouseEntered(e ->{
			lbl02.setScaleX(1.5);
			lbl02.setScaleY(1.5);
		});
		lbl02.setOnMouseExited(e ->{
			lbl02.setScaleX(1.0);
			lbl02.setScaleY(1.0);
		});
		lbl03.setOnMouseEntered(e ->{
			lbl03.setScaleX(1.5);
			lbl03.setScaleY(1.5);
		});
		lbl03.setOnMouseExited(e ->{
			lbl03.setScaleX(1.0);
			lbl03.setScaleY(1.0);
		});
		
		h.getChildren().addAll(lbl01,lbl02,lbl03);
		arg0.setScene(new Scene(h,400,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

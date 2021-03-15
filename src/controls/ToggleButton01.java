package controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//토글버튼
public class ToggleButton01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox h = new HBox(10);
		ToggleButton tb01 = new ToggleButton("T01");
		ToggleButton tb02 = new ToggleButton("T02");
		ToggleButton tb03 = new ToggleButton("T03");
		Button btn = new Button("btn");
		
		h.getChildren().addAll(tb01,tb02,tb03,btn);
		
		ToggleGroup tg = new ToggleGroup();
		tb01.setToggleGroup(tg);
		tb02.setToggleGroup(tg);
		tb03.setToggleGroup(tg);
		
		arg0.setScene(new Scene(h,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println();
	}
}

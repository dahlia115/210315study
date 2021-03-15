package controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//체크박스
public class CheckBox01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		VBox v = new VBox(10);
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		
		chk1.setText("취미생활");//글씨바꾸기
		
		chk2.setSelected(true);//체크된 상태로 나온다
		
		v.getChildren().addAll(chk1,chk2);
		arg0.setScene(new Scene(v,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		VBox v = new VBox(10);
		v.setPadding(new Insets(20));
		
		//텍스트 입력
		TextField tf = new TextField();
		tf.setText("가나다라마바사");
		
		//입력값이 보이지 않는다.
		PasswordField pf = new PasswordField();
		pf.setText("아자차카타파하");
		
		//날짜 입력 버튼
		DatePicker dp = new DatePicker();
		
		//여러줄 입력할 수 있는 창
		TextArea ta = new TextArea();
		ta.setText("아무내용이나");
		
		//목록 중 선택
		ComboBox<String> cd = new ComboBox<>();
		cd.getItems().addAll("달리기","멍","술");
		cd.setValue("선택하세요");
		
		v.getChildren().addAll(tf,pf,dp,ta,cd);
		
		arg0.setScene(new Scene(v,300,400));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

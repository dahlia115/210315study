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
		
		//�ؽ�Ʈ �Է�
		TextField tf = new TextField();
		tf.setText("�����ٶ󸶹ٻ�");
		
		//�Է°��� ������ �ʴ´�.
		PasswordField pf = new PasswordField();
		pf.setText("������īŸ����");
		
		//��¥ �Է� ��ư
		DatePicker dp = new DatePicker();
		
		//������ �Է��� �� �ִ� â
		TextArea ta = new TextArea();
		ta.setText("�ƹ������̳�");
		
		//��� �� ����
		ComboBox<String> cd = new ComboBox<>();
		cd.getItems().addAll("�޸���","��","��");
		cd.setValue("�����ϼ���");
		
		v.getChildren().addAll(tf,pf,dp,ta,cd);
		
		arg0.setScene(new Scene(v,300,400));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

package controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButton01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox h = new HBox();
		RadioButton rdo01 = new RadioButton();
		RadioButton rdo02 = new RadioButton();
		rdo01.setText("���̿�01");
		rdo02.setText("���̿�02");
		
		ToggleGroup tp = new ToggleGroup();//�׷����ؼ� �ϳ��� �����ϰ� �Ѵ�
		rdo01.setToggleGroup(tp);
		rdo02.setToggleGroup(tp);
		rdo01.setSelected(true);
		
		h.getChildren().addAll(rdo01,rdo02);
		
		arg0.setScene(new Scene(h,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

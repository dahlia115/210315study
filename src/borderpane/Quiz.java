package borderpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		FlowPane flowTop = new FlowPane();
		FlowPane flowRigth = new FlowPane();
		FlowPane flowBotton = new FlowPane();
		FlowPane flowLeft = new FlowPane();
		FlowPane flowCenter = new FlowPane();
		
		flowTop.setStyle("-fx-background-color:pink;");
		flowRigth.setStyle("-fx-background-color:FAED7D;");
		flowBotton.setStyle("-fx-background-color:CCA63D;");
		flowLeft.setStyle("-fx-background-color:B2EBF4;");
		flowCenter.setStyle("-fx-background-color:CEF279;");
		
		flowTop.setPrefSize(500, 50);
		flowBotton.setPrefSize(500, 50);
		flowLeft.setPrefSize(100, 200);
		flowCenter.setPrefSize(150, 200);
		flowRigth.setPrefSize(250, 200);
		
		Label lb1Top = new Label("�޴�    Ȩ      �α���");
		flowTop.getChildren();
		
		
		Button btnId = new Button("���̵� �Է�");
		Button btnPwd = new Button("��й�ȣ �Է�");
		Button btnLog = new Button("�α���");
		FlowPane flow = new FlowPane();
		FlowPane vFlow = new FlowPane(Orientation.VERTICAL);
		vFlow.getChildren().addAll(btnId,btnPwd);
		vFlow.setPrefSize(100, 100);
		vFlow.setPadding(new Insets(28,0,0,0));
		btnId.setPrefSize(100, 20);
		btnPwd.setPrefSize(100, 20);
		btnLog.setPrefSize(60, 45);
		flow.getChildren().addAll(vFlow,btnLog);
		flowRigth.getChildren().add(flow);
		
		
		Button btnBottom = new Button("�Ʒ� ��");
		flowBotton.getChildren().add(btnBottom);
		Button btnLeft = new Button("�޴�");
		flowLeft.getChildren().add(btnLeft);
		Button btnCenter = new Button("Ȩ �Դϴ�");
		flowCenter.getChildren().add(btnCenter);
		flowCenter.setPadding(new Insets(50,50,50,50));
		bp.setTop(lb1Top);
		bp.setRight(flowRigth);
		bp.setBottom(flowBotton);
		bp.setLeft(flowLeft);
		bp.setCenter(flowCenter);
		
		arg0.setScene(new Scene(bp,500,300));
		arg0.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

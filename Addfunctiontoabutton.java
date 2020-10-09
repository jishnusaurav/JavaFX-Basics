package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class helloworld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	Button btn=new Button("click me");
    	btn.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
    			System.out.println("Helloworld!!");
    		}
    		 
    	}); 
    	StackPane root = new StackPane();
    	root.getChildren().add(btn);
    	Scene scene = new Scene(root,500,300);
    	primaryStage.setScene(scene);
        primaryStage.show();
    }
}

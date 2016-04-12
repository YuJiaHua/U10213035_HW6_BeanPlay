import java.util.ArrayList;
import javafx.animation.Timeline;
import javafx.application.Application;  
import javafx.stage.Stage;  
import javafx.scene.Scene;  
import javafx.scene.input.KeyCode;  
  
public class BeanGame extends Application {  
	
	//Add ArrayList to store bean
	ArrayList<BeanPane> bean = new ArrayList<>();
	Timeline animation;
	int i;
	@Override // Override the start method in the Application class  
	public void start(Stage primaryStage) {  
	BeanPane beanPane = new BeanPane(); // Create a ball pane 

	// Create a scene and place it in the stage 
	Scene scene = new Scene(beanPane, 300,300);
	//Mouse event
	beanPane.setOnMousePressed(e -> {
		bean.add(new BeanPane());
		beanPane.getChildren().add(bean.get(i));
		bean.get(i).requestFocus(); 		
		i++;			
	}); 
	primaryStage.setResizable(false);
	primaryStage.setTitle("BeanGame"); // Set the stage title 
	primaryStage.setScene(scene); // Place the scene in the stage 
	primaryStage.show(); // Display the stage 
	} 
}

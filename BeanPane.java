import java.util.Random;
import javafx.animation.KeyFrame;  
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.util.Duration;  

public class BeanPane extends Pane { 
	 
	private double x = 149.5, y = 15;
	private double dx = 0, dy = 1;
	private Circle circle;
	private Timeline animation;
	
	public BeanPane() { 
		
		Line line1 = new Line(170,40,170,80);
		Line line2 = new Line(130,40,130,80);
		Line line3 = new Line(130,80,60,225);
		Line line4 = new Line(60,225,60,270);
		Line line5 = new Line(60,270,240,270);
		Line line6 = new Line(170,80,240,225);
		Line line7 = new Line(240,270,240,225);
		Line line8 = new Line(82.5,270,82.5,225);
		Line line9 = new Line(105,270,105,225);
		Line line10 = new Line(127.5,270,127.5,225);
		Line line11 = new Line(150,270,150,225);
		Line line12 = new Line(172.5,270,172.5,225);
		Line line13 = new Line(195,270,195,225);
		Line line14 = new Line(217.5,270,217.5,225);
		
		//Set lines Width
		line1.setStrokeWidth(3);
		line2.setStrokeWidth(3);
		line3.setStrokeWidth(3);
		line4.setStrokeWidth(3);
		line5.setStrokeWidth(3);
		line6.setStrokeWidth(3);
		line7.setStrokeWidth(3);
		line8.setStrokeWidth(3);
		line9.setStrokeWidth(3);
		line10.setStrokeWidth(3);
		line11.setStrokeWidth(3);
		line12.setStrokeWidth(3);
		line13.setStrokeWidth(3);
		line14.setStrokeWidth(3);
		
		//Set lines Color for green
		line1.setStroke(Color.GREEN);
		line2.setStroke(Color.GREEN);
		line3.setStroke(Color.GREEN);
		line4.setStroke(Color.GREEN);
		line5.setStroke(Color.GREEN);
		line6.setStroke(Color.GREEN);
		line7.setStroke(Color.GREEN);
		line8.setStroke(Color.GREEN);
		line9.setStroke(Color.GREEN);
		line10.setStroke(Color.GREEN);
		line11.setStroke(Color.GREEN);				
		line12.setStroke(Color.GREEN);			
		line13.setStroke(Color.GREEN);					
		line14.setStroke(Color.GREEN);
		
		//Add lines from the pane
		getChildren().addAll(line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14);
				
		//Creates a new instance of Circles with a specified position and radius.
		Circle circle1 = new Circle(217.5,223,4);
		Circle circle2 = new Circle(195,223,4);
		Circle circle3 = new Circle(172.5,223,4);
		Circle circle4 = new Circle(150,223,4);
		Circle circle5 = new Circle(127.5,223,4);
		Circle circle6 = new Circle(105,223,4);
		Circle circle7 = new Circle(82.5,223,4);
		
		//Add seven circles from the first line
		getChildren().addAll(circle7,circle6,circle5,circle4,circle3,circle2,circle1);
		
		Circle circle8 = new Circle(93.75,203,4);
		Circle circle9 = new Circle(115.75,203,4);
		Circle circle10 = new Circle(138.25,203,4);
		Circle circle11 = new Circle(160.75,203,4);
		Circle circle12 = new Circle(183.25,203,4);
		Circle circle13 = new Circle(205.75,203,4);
		
		//Add six circles from the second line
		getChildren().addAll(circle8,circle9,circle10,circle11,circle12,circle13);
		
		Circle circle14 = new Circle(194.5,183,4);
		Circle circle15 = new Circle(172,183,4);
		Circle circle16 = new Circle(149.5,183,4);
		Circle circle17 = new Circle(127,183,4);
		Circle circle18 = new Circle(104.5,183,4);
		
		//Add five circles from the third line
		getChildren().addAll(circle14,circle15,circle16,circle17,circle18);
		
		Circle circle19 = new Circle(115.75,163,4);
		Circle circle20 = new Circle(138.25,163,4);
		Circle circle21 = new Circle(160.75,163,4);
		Circle circle22 = new Circle(183.25,163,4);
		
		//Add four circles from the fourth line
		getChildren().addAll(circle19,circle20,circle21,circle22);
		
		Circle circle23 = new Circle(172,143,4);
		Circle circle24 = new Circle(149.5,143,4);
		Circle circle25 = new Circle(127,143,4);
		
		//Add three circles from the fifth line
		getChildren().addAll(circle23,circle24,circle25);
		
		Circle circle26 = new Circle(138.25,123,4);
		Circle circle27 = new Circle(160.75,123,4);
		
		//Add two circles from the sixth line
		getChildren().addAll(circle26,circle27);
		
		Circle circle28 = new Circle(149.5,103,4);
		
		//Add one circles from the seventh line
		getChildren().add(circle28);
		
		
		//Set circles Width
		circle1.setStrokeWidth(3);
		circle2.setStrokeWidth(3);			
		circle3.setStrokeWidth(3);			
		circle4.setStrokeWidth(3);			
		circle5.setStrokeWidth(3);			
		circle6.setStrokeWidth(3);
		circle7.setStrokeWidth(3);				
		circle8.setStrokeWidth(3);			
		circle9.setStrokeWidth(3);			
		circle10.setStrokeWidth(3);			
		circle11.setStrokeWidth(3);			
		circle12.setStrokeWidth(3);			
		circle13.setStrokeWidth(3);						
		circle14.setStrokeWidth(3);						
		circle15.setStrokeWidth(3);			
		circle16.setStrokeWidth(3);			
		circle17.setStrokeWidth(3);			
		circle18.setStrokeWidth(3);									
		circle19.setStrokeWidth(3);			
		circle20.setStrokeWidth(3);			
		circle21.setStrokeWidth(3);					
		circle22.setStrokeWidth(3);						
		circle23.setStrokeWidth(3);				
		circle24.setStrokeWidth(3);			
		circle25.setStrokeWidth(3);									
		circle26.setStrokeWidth(3);			
		circle27.setStrokeWidth(3);			
		circle28.setStrokeWidth(3);
		
		//Create a circle
		double radius = 4;
		circle = new Circle(x, y, radius);
		circle.setFill(Color.RED); // Set ball color
	    getChildren().add(circle); // Place a ball into this pane
	    // Create an animation for moving the ball
	    animation = new Timeline(
	      new KeyFrame(Duration.millis(10), e -> moveBean()));
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play(); // Start animation
	} 
			    
	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}
	
	//MoveBean method 
	protected void moveBean() {


        if(y < 265){
        	//Determine the direction of the bean
        	if(y == 95 || y == 115 || y ==135 || y == 155 || y == 175 || y == 195 || y == 215){
        		dx = 0.5625;
        		int d = (int)(Math.random() * 2);
        		
				if (d == 0) {
					dx *= 1;// Change ball move direction
				}
				else{
					dx *= -1;// Change ball move direction
				}
			}		
			
			if(y >= 235){
				dx *= 0;
			}
			
			 x += dx;				 
			 y += dy;				
			 circle.setCenterY(y);
			 circle.setCenterX(x);
		 }
		
	 }	 
}

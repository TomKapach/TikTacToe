/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 *
 * @author user
 */
public class ButtonInPane extends Application {

    @Override
    public void start(Stage PrimaryStage){
        
        //Declarations of objects
        Circle circle=new Circle();
        Pane pane=new Pane();
        
        //Define circle
        circle.centerXProperty().bind(pane.widthProperty().divide(3));
        circle.centerYProperty().bind(pane.widthProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        
        
        
        //Sets the circle to the pane
        pane.getChildren().add(circle);
        pane.getChildren().add(new Button("OkButton"));
        
        //Declare new scene
        Scene scene=new Scene(pane,200,200);
        
        
        //Sets properties for the Stage
        PrimaryStage.setTitle("MyFirstCircle");
        
        //Sets the scene to the Stage
        PrimaryStage.setScene(scene);
        
        //Shows the stage
        PrimaryStage.show();
        
    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
}

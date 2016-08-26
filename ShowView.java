/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ShowView extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Pane pane=new HBox(10);
       pane.setPadding(new Insets(5, 5, 5, 5));
       Image image=new Image("http://www.stanford.edu/dept/CTL/cgi-bin/academicskillscoaching/wp-content/uploads/2012/07/baby-duck.jpg");
       ImageView imageView=new ImageView(image);
       imageView.setFitHeight(100);
       imageView.setFitWidth(100);
       pane.getChildren().add(imageView);
       
       ImageView imageView2=new ImageView(image);
       imageView2.setFitHeight(100);
       imageView2.setFitWidth(100); 
       pane.getChildren().add(imageView2);
       
       ImageView imageView3=new ImageView(image);
       imageView3.setFitHeight(100);
       imageView3.setFitWidth(100);
       pane.getChildren().add(imageView3);
       
       Scene scene= new Scene(pane);
       primaryStage.setTitle("The first pic");
       primaryStage.setScene(scene);
       primaryStage.show();
       
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

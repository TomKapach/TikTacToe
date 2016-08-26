/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class fPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane fPane=new FlowPane();
        fPane.setOrientation(Orientation.HORIZONTAL);
        fPane.setPadding(new Insets(30,30,30,30));
        
        Label label=new Label("Name: ");
        
        TextField tF=new TextField();
        tF.setPrefColumnCount(2);
        tF.setPrefWidth(70);
        
        
        
        Button bt=new Button("Ok");
        
        fPane.getChildren().addAll(label,tF,bt);
        
        bt.setText("ClickMe");
        
        Scene scene=new Scene(fPane,300,250);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("TheStage");
        primaryStage.show();
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

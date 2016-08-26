/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.
/**
 *
 * @author user
 */
public class NodeStyle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane=new StackPane();
        Button btOK=new Button("Ok");
        btOK.setStyle("-fx-border-color: blue");
        
        
        
        Scene scene=new Scene(pane,200,250);
        
        pane.setRotate(30);
        pane.setStyle("-fx-border-color: red; -fx-background-color: yellow;");
        
        Label label=new Label("This is a label");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        
        pane.getChildren().addAll(label,btOK);
        
        primaryStage.setTitle("My title");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

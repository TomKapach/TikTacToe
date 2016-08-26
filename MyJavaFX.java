/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author user
 */


public class MyJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
      Button btOk=new Button("OK");
      Scene scene=new Scene(btOk, 400, 550);
      primaryStage.setTitle("MyJavaFX");
      primaryStage.setScene(scene);
      
      
      
      primaryStage.setScene(new Scene(new Button("New Stage"),50,50));
      primaryStage.show();
      
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

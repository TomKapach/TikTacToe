/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;

/**
 *
 * @author user
 */
public class HandleEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        HBox pane=new HBox();
        pane.setAlignment(Pos.CENTER);
        Button bOK=new Button("Ok");
        Button bCANCEL=new Button("Cancel");
        pane.getChildren().addAll(bOK,bCANCEL);
        
        OKHandlerClass handler1=new OKHandlerClass();
        bOK.setOnAction(handler1);
        
        CANCELHandlerClass handler2=new CANCELHandlerClass();
        bCANCEL.setOnAction(handler2);
        
        Scene scene=new Scene(pane);
        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}    
    

class OKHandlerClass implements EventHandler<ActionEvent>{
   @Override
   public void handle(ActionEvent e){
       System.out.println("OK clicked");
      
   }
    
}


class CANCELHandlerClass implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
        System.out.println("Cancel");
    }
}
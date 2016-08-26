/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ButtonDemo extends Application {
    
    protected Text text=new Text(50,50,"JavaFX test");
    
    protected BorderPane getPane(){
        
        HBox paneForButtons=new HBox(20);
        
        Button btLeft=new Button("Left");
        Button btRight=new Button("Right");
        
        paneForButtons.getChildren().addAll(btLeft,btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        
        BorderPane pane=new BorderPane();
        
        pane.setBottom(paneForButtons);
        
        Pane paneForText=new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        
        btLeft.setOnAction(e -> text.setX(text.getX()-10));
        
        
        
        return pane;
    }
    
    
    
    @Override
    public void start(Stage primaryStage) {
    
        
        Scene scene=new Scene(getPane(),400,200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

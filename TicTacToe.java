/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    
    
    final private Cell[][] cell=new Cell[3][3];
    static char whoseTurn='X';
    
        
    
    @Override
    public void start(Stage primaryStage) {
    
        
        //Pane will hould everything
        GridPane pane=new GridPane();
        
        
        //Data structure
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                  pane.add(cell[i][j]=new Cell(),j,i);
            }    
        }
       
        
        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(pane);
        
        
        
        Scene scene=new Scene(borderPane,1000,1000);
        primaryStage.setTitle("TikTakToe");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    public class Cell extends StackPane{
        
        private char token=' ';
        final static private long width=2000;
        final static private long height=2000;
        
//        GridPane pane - not sure why used it for init the cell main
        public Cell(){
            
            setStyle("-fx-border-color: black; background-color: red");
            this.setPrefSize(width, height);
            this.setOnMouseClicked(e -> handleMouseClick());
        }
        
        
        //Check if the cell is empty or not
        public Boolean isEmpty(){
            if(this.token==' '){
            return true;
            }else{
                return false;
            }
        }
        
        
        //Get the token status
        public char getToken(){
            return this.token;
        }
        
        
        //Set the new token to the cell
        public void setToken(char c){
            
            
            //Case that there is already something inside the cell
            if(!this.isEmpty()){
                return;
            }
            
            //Case this turn is X- set X
            if(c=='X'){
               
               //Set the new status
               this.token='X';
               
               ImageView imageO=new ImageView("http://www.oaa-accessibility.org/media/examples/images/game-piece-ex.png");
               imageO.setFitHeight(100);
               imageO.setFitWidth(100);
               
               this.getChildren().add(imageO);
               this.setAlignment(imageO, Pos.CENTER);
               
               //Set the static variable to the opposite
               whoseTurn='O';
            
            //Case this turn is O- set O
            }else if(c=='O'){
               
               this.token='O';
               
               ImageView imageO=new ImageView("https://1.bp.blogspot.com/-lyELSi3oPWc/Ux3UlhpiAWI/AAAAAAAAEGI/VLvmMCW7aco/s1600/playO.png");
               imageO.setFitHeight(100);
               imageO.setFitWidth(100);
               
               this.getChildren().add(imageO);
               this.setAlignment(imageO, Pos.CENTER); 
               
                
               whoseTurn='X';
            }
                
        }
        
        
        
        public boolean checkIfFull(){
            
            //Loop through the array and check if the game is over
            int countNumberOfEmptyCells = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(cell[i][j].isEmpty()){
                        countNumberOfEmptyCells++;
                    }
                }
            }
            
            //Return the status
            if(countNumberOfEmptyCells>0){
                return false;
            }else{
                System.out.println("This is the end");
                return true;
            }
            
            
        }
        
        public char checkIfWonHorizontal(){
        
            int Xcounter=0;
            int Ocounter=0;
            
            //Loop horizental
            
            char switchChecker;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    
                    switchChecker=cell[i][j].getToken();
                    switch(switchChecker){
                        case 'X':
                            Xcounter++;
                            break;
                        case 'O':
                            Ocounter++;
                            break;
                        case ' ': 
                            break;
                    }
                }
                
                if (Xcounter==3){
                    //Declare Won and finish
                    System.out.println("X won horizintal");
                    return 'X';
                }else if(Ocounter==3){
                    //Declare Won and finish
                    System.out.println("O won horizintal");
                    return 'O';
                }
                
                Xcounter=0;
                Ocounter=0;
                }
            
            
            return ' ';
            
            }
            
        public char checkIfWonVertical(){
            
            int Xcounter=0;
            int Ocounter=0;
            
            //Loop horizental
            
            char switchChecker;
            
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    
                    switchChecker=cell[i][j].getToken();
                    switch(switchChecker){
                        case 'X':
                            Xcounter++;  
                            break;
                        case 'O':
                            Ocounter++;
                            break;
                        case ' ': 
                            break;
                    }
                }
                if (Xcounter==3){
                    System.out.println("X won vertical");
                    return 'X';
                }else if(Ocounter==3){
                    //Declare Won and finish
                    System.out.println("O won vertical");
                    return 'O';
                }
                
                Xcounter=0;
                Ocounter=0;
                }
            
            
            return ' ';
        }
        
        public char checkIfWonDiagonal(){

            /*Check if X won diagonal
            Check if most left equal to the middle, middle is equal to the right and one of the cells is X
            */
            if(
                ((cell[0][0].getToken()==cell[1][1].getToken()) && (cell[1][1].getToken()==cell[2][2].getToken()) && (cell[0][0].getToken()=='X'))
                ||    
                ((cell[0][2].getToken()==cell[1][1].getToken()) && (cell[1][1].getToken()==cell[2][0].getToken()) && (cell[0][2].getToken()=='X'))    
                    ){
                System.out.println("X won diagonal");
                return 'X';
            }
            
            /*Check if O won diagonal
            Check if most left equal to the middle, middle is equal to the right and one of the cells is O
            */            
            if(
                ((cell[0][0].getToken()==cell[1][1].getToken()) && (cell[1][1].getToken()==cell[2][2].getToken()) && (cell[0][0].getToken()=='O'))
                ||    
                ((cell[0][2].getToken()==cell[1][1].getToken()) && (cell[1][1].getToken()==cell[2][0].getToken()) && (cell[0][2].getToken()=='O'))    
                    ){
                System.out.println("O won diagonal");
                return 'O';
            }
                
           return ' ';
        }
        
        //Handles the click situation
        public void handleMouseClick(){
            
            /*
            1.Play next turn
            2.Check if game ended- draw or win
            3.If not ended- keep playing
            4.If ended- Declare the winner
            */
            
            this.setToken(whoseTurn);
            this.checkIfFull();
            this.checkIfWonHorizontal();
            this.checkIfWonVertical();
            this.checkIfWonDiagonal();
            
        }
    }
        
        
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

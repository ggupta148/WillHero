package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import  javafx.stage.Stage;
import java.util.BitSet;

public class Tables extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @FXML private Button t1;
    @FXML private Button t2; @FXML private Button t3; @FXML private Button t4; @FXML private Button t5; @FXML private Button exit;

    @Override
    public void start(Stage stage) throws Exception {

         t1=new Button("Table of 1");
         t2=new Button("Table of 2");
         t3=new Button("Table of 3");
         t4=new Button("Table of 4");
         t5=new Button("Table of 5");
         exit = new Button(" EXIT ");
        Label b = new Label();
        VBox root =new VBox();
        Scene scene=  new Scene(root,1100,900,Color.BLUE);
        t1.setOnAction(e-> {
            System.out.println("Table of 1");
            for(int i=0;i<11;i++){
                System.out.println(1+" x "+" "+i+" "+" = "+1*i);
            }
            b.setText("4");
        });
        t2.setOnAction(e-> {
            System.out.println("Table of 2");
            for(int i=0;i<11;i++){
                System.out.println(2+" x "+" "+i+" "+" = "+2*i);
            }
        });
        t3.setOnAction(e-> {
            System.out.println("Table of 3");
            for(int i=0;i<11;i++){
                System.out.println(3+" x "+" "+i+" "+" = "+3*i);
            }
        });
        t4.setOnAction(e-> {
            System.out.println("Table of 1");
            for(int i=0;i<11;i++){
                System.out.println(4+" x "+" "+i+" "+" = "+4*i);
            }
        });
        t5.setOnAction(e-> {
            System.out.println("Table of 5");
            for(int i=0;i<11;i++){
                System.out.println(5+" x "+" "+i+" "+" = "+5*i);
            }
        });
        exit.setOnAction(e -> {
            System.out.println("Game Exited");
            System.exit(0);
        });

        root.getChildren().addAll(b,t1,t2,t3,t4,t5,exit);

        stage.setTitle("TABLES");
        stage.setScene(scene);
        stage.show();
    }
}

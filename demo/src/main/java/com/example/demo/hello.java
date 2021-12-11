package com.example.demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class hello  extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn =new Button(" CLICK TO JUMP ");
        Button exit = new Button(" EXIT ");
        Button pause =new Button(" PAUSE ");
        pause.setOnAction(e-> System.out.println("Paused"));
        exit.setOnAction(e -> {
            System.out.println("Game Exited");
            System.exit(0);
        });
        btn.setOnAction(e -> {
            System.out.println("^^ JUMP ^^");
            for(int i=0;i<11;i++){
                System.out.println(2+" x "+" "+i+" "+" = "+2*i);
            }
        });
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println(" ^^JUMP^^ ");
//            }
//        });
        VBox root =new VBox();
        root.getChildren().addAll(btn,pause,exit);
        Scene scene = new Scene(root,400,400);
        stage.setTitle("WILL HERO");
        stage.setScene(scene);
        stage.show();

    }
}

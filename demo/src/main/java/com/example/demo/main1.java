package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main1 extends Application{
    public void start (Stage stage) {
        try {
           // Parent root = FXMLLoader.load(getClass().getResource("picture.fxml"));
           // Scene scene = new Scene(root);
           // stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

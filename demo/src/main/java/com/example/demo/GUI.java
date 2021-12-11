package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GUI extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene1=new Scene(root);
            stage.setScene(scene1);
            Image image=new Image("file:///Users/xanirudhsharmax/Desktop/sound1.png");

            stage.getIcons().setAll(image);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

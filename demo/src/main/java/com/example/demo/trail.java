package com.example.demo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class trail extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene= new Scene(root,600,600, Color.GOLD);
        Text text= new Text();
        text.setText("Tap to start");
        text.setX(150);text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.BLACK);
        Line line = new Line();
        line.setStartX(1);
        line.setStartY(80);
        line.setEndX(600);
        line.setEndY(80);
        line.setStrokeWidth(7);
        line.setStroke(Color.LIGHTPINK);
        Image image=new Image("file:///Users/xanirudhsharmax/Desktop/w.png");
        ImageView i =new ImageView(image);
        i.setX(300);i.setY(100);
        stage.setTitle("Trial");
        stage.setFullScreen(true);
        root.getChildren().addAll(text,line,i);
        stage.setScene(scene);
        stage.show();
    }
}

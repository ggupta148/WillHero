package com.example.demo;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class piccont implements Initializable {
    @FXML
    private ImageView orc;
    @FXML
    private ImageView orc2;
    @FXML
    private  ImageView orc1;

    @FXML
    private ImageView island1;
    @FXML
    private ImageView island2;
    @FXML
    private ImageView island3;
    @FXML
    private ImageView island4;
    @FXML
    private ImageView island5;
    @FXML
    private ImageView island6;
    @FXML
    private ImageView hero;
    @FXML
    private ImageView settings;
    @FXML
    private ImageView tresure;
    @FXML
    private ImageView tresure1;
    @FXML
    private Button pause;
    @FXML
    private ImageView tnt;
    @FXML
    private ImageView tnt1;
    @FXML
    private Label myscore;

    private Scene scene;
    private Stage stage;
    private Parent root;
    int my_score=0;

    public void Home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private double x;
    private double y;
    public void up(ActionEvent e){
        //System.out.println("UP");
        hero.setY(y-=30);
    }
    public void down(ActionEvent e){
        //System.out.println("down");
        hero.setY(y+=30);
    }
    public void left(ActionEvent e){
        //System.out.println("left");
        hero.setX(hero.getX()-10);
//        island1.setX(x+=20);
//        island2.setX(x+=20);
//        island3.setX(x+=8);
//        orc.setX(x+=8);
//        orc1.setX(x+=8);
//        orc2.setX(x+=8);
//        tresure.setX(x+=8);
//        tnt.setX(x+=8);

    }
    public void right(ActionEvent e){
        //System.out.println("right");
//          int temp = (int)hero.getX() + 30;
//          int temp1=(int)island1.getX()-20;
            hero.setX(hero.getX()+10);
            island1.setX(island1.getX()-10);
            island2.setX(island2.getX()-10);
            island3.setX(island3.getX()-10);
            island4.setX(island4.getX()-10);
            island5.setX(island5.getX()-10);
            island6.setX(island5.getX()-10);
            orc.setX(orc.getX()-10);
            orc1.setX(orc1.getX()-10);
            orc2.setX(orc2.getX()-10);
            tresure.setX(tresure.getX()-10);
            tresure1.setX(tresure.getX()-10);
            tnt.setX(tnt.getX()-10);
            tnt1.setX(tnt.getX()-10);
            my_score+=1;
            myscore.setText("Score : "+Integer.toString(my_score));

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate = new TranslateTransition();
        TranslateTransition translate1 = new TranslateTransition();
        TranslateTransition translate2 = new TranslateTransition();
        TranslateTransition translate3 = new TranslateTransition();
        TranslateTransition translate4 = new TranslateTransition();
        TranslateTransition translate5 = new TranslateTransition();

        translate.setNode(orc);
        translate.setDuration(Duration.millis(600));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(90);
        translate.setAutoReverse(true);
        translate.play();

        translate5.setNode(hero);
        translate5.setDuration(Duration.millis(700));
        translate5.setCycleCount(TranslateTransition.INDEFINITE);
        translate5.setByY(120);
        translate5.setAutoReverse(true);
        translate5.play();

        translate1.setNode(orc2);
        translate1.setDuration(Duration.millis(800));
        translate1.setCycleCount(TranslateTransition.INDEFINITE);
        translate1.setByY(90);
        translate1.setAutoReverse(true);
        translate1.play();

        translate2.setNode(orc1);
        translate2.setDuration(Duration.millis(1000));
        translate2.setCycleCount(TranslateTransition.INDEFINITE);
        translate2.setByY(90);
        translate2.setAutoReverse(true);
        translate2.play();

//        translate3.setNode(island);
//        translate3.setDuration(Duration.millis(2000));
//        translate3.setCycleCount(TranslateTransition.INDEFINITE);
//        translate3.setByY(80);
//        translate3.setAutoReverse(true);
//        translate3.play();
    }
    public void Setting_(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("settings.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

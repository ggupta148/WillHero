package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class controler {
    @FXML
    private Circle mycircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        //System.out.println("UP");
        mycircle.setCenterY(y-=20);
    }
    public void down(ActionEvent e){
        //System.out.println("down");
        mycircle.setCenterY(y+=20);
    }
    public void left(ActionEvent e){
        //System.out.println("left");
        mycircle.setCenterX(x-=20);
    }
    public void right(ActionEvent e){
        //System.out.println("right");
        mycircle.setCenterX(x+=20);
    }
}

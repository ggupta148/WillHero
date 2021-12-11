package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class High_score_cont {
    @FXML
    Label nameLabel;

    public void displayName(String player_name){
        nameLabel.setText(player_name);
    }
}

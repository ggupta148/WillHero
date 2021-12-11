package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene_controler  {
    @FXML
    private Button quit;
    @FXML
    private AnchorPane scenepane;
   @FXML
   TextField nametextfield;
   @FXML
   private Label nameLabel;
   @FXML
   private  Label namelabel;
   @FXML
   private Button loginbutton;

   @FXML
   private CheckBox mycheckbox;

//   @FXML
//   private ImageView sound;
//   Image soundmute=new Image(getClass().getResourceAsStream("file:///Users/xanirudhsharmax/Desktop/sound2.png"));
//   Image soundplay=new Image(getClass().getResourceAsStream("file:///Users/xanirudhsharmax/Desktop/sound1.png"));

   String Pname;

    private Scene scene;
    private Stage stage;
    private Parent root;

    public void change(ActionEvent event){
        if(mycheckbox.isSelected()){
            System.out.println("ON");
//            sound.setImage(soundmute);
        }else {
            System.out.println("OFF");
//           sound.setImage(soundplay);
        }
    }

    public void Home(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Play_game(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("picture.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void High_score(ActionEvent event) throws IOException {
//        String playername =textField.getText();
//        FXMLLoader loader =new FXMLLoader(getClass().getResource("highscore.fxml"));
//        root=loader.load();
//        High_score_cont high_score_cont = loader.getController();
//        high_score_cont.displayName(playername);
        root= FXMLLoader.load(getClass().getResource("highscore.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Load_game(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("loadgame.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Save_game(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("savegame.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void login(ActionEvent event) /*throws IOException*/ {
        try {
            Pname= nametextfield.getText();
//            FXMLLoader loader =new FXMLLoader(getClass().getResource("highscore.fxml"));
//            root=loader.load();
//            High_score_cont high_score_cont = loader.getController();
//            high_score_cont.displayName(Pname);
//            //root= FXMLLoader.load(getClass().getResource("try.fxml"));
//            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
          //  System.out.println(Pname);
            if(Pname.length()==0){
                nameLabel.setText("No Input");
                namelabel.setText("No input");
            }else {
                nameLabel.setText("Welcome "+Pname);
                namelabel.setText("Welcome "+Pname);
            }
        }catch (Exception e){
            System.out.println(e);
        }

//        System.out.println("In login");
//        String playername =nametextfield.getText();
//        FXMLLoader loader =new FXMLoader(getClass().getResource("try.fxml"));
//        root=loader.load();
//        High_score_cont high_score_cont = loader.getController();
//        high_score_cont.displayName(playername);
//        //root= FXMLLoader.load(getClass().getResource("try.fxml"));
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }

    public void exit(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Game ");
        alert.setHeaderText("You are about to Quit");
        alert.setContentText("Do you want to save before quiting");
        if (alert.showAndWait().get()== ButtonType.OK) {
            stage=(Stage) scenepane.getScene().getWindow();
            System.out.println("you are successfully logged out ");
            stage.close();
        }
    }

}

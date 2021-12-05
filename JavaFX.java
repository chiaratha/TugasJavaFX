/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

/**
 *
 * @author Chiara
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class JavaFX extends Application  {
    private final StackPane root = new StackPane();
    private Stage stage;

    @Override
    public void init() {
        
        Button Tombol = new Button();
        Tombol.setText("Buka");
        VBox kolom= new VBox();
        kolom.setSpacing(10);
        kolom.setPadding(new Insets(5,5,5,5));
        
        kolom.getChildren().addAll(
                new Label("Registrasi"),
                new Label("First Name "),
                new TextField(),
                new Label("Last Name "),
                new TextField(),
                new Label("E-Mail Address "),
                new TextField(),
                new Label("Contact No "),
                new TextField(),
                new Label("Password"),
                new PasswordField(),
                new Label("Confirm Password"),
                new PasswordField(),
                new Button("Register"));
        
        root.getChildren().addAll(kolom);

        Tombol.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            
            stage = new Stage();
            StackPane Pane = new StackPane();
            stage.setScene(new Scene(Pane, 500,500));
            stage.show();
        });
    }

    @Override
    public void start(Stage primaryStage) {
        Scene sc = new Scene(root,500,500);
        primaryStage.setScene(sc);
        primaryStage.show();
        primaryStage.setTitle("Tugas JavaFX ");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}


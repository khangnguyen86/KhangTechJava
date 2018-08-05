package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Hashtable;

public class Main extends Application {
    private GridPane gridPane = new GridPane();
    private Label lblTile = new Label("Total Pay");
    private ObservableList<String> tenMobiles = FXCollections.observableArrayList(
            "iPhone 8x",
            "iPhone 6s Plus",
            "Samsung Note");
    private String selectedMobileName = "";
    private ComboBox comboBoxTenMobiles = new ComboBox(tenMobiles);
    private Button button = new Button("Move to 2");


    public static void main(String[] args) {
//        System.out.println("a");
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        gridPane.add(lblTile,0,0);
        Scene scene = new Scene(gridPane, 400,220);
        primaryStage.setScene(scene);
        primaryStage.show();
        lblTile.setFont(Font.font("Arial"));
        gridPane.add(comboBoxTenMobiles, 0,2);
        gridPane.add(button, 0,3);
        gridPane.setVgap(20.0);
        comboBoxTenMobiles.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("c = "+comboBoxTenMobiles.getValue());
            }
        });
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Hashtable<String, String> parameters = new Hashtable<String, String>();
                parameters.put("phoneName", comboBoxTenMobiles.getValue().toString());
                //parameters.put("tenMobiles", tenMobiles.get());
                SecondStage secondStage = new SecondStage (300, 400, parameters);
                secondStage.setTitle("SecondStage");
                secondStage.showAndWait();
            }

        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

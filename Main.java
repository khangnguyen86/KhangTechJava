package com.company;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    private GridPane gridPane = new GridPane();
    private Label lblTile = new Label("Total Pay");
    private ObservableList<String> tenMobiles = FXCollections.observableArrayList(
            "iPhone 8x",
            "iPhone 6s Plus",
            "Samsung Note");
    private ComboBox comboBoxTenMobiles = new ComboBox(tenMobiles);


    @Override
    public void start(Stage primaryStage) {
    }

    public static void main(String[] args) {
	// write your code here
        Application.launch(args);
    }
}

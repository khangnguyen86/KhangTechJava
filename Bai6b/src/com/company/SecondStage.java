package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Hashtable;

public class SecondStage extends Stage {
    private Hashtable<String, String> parameters;
    private Scene scene;
    private Label lbl1 = new Label();
    private Label lbl2 = new Label();
    private VBox vbox = new VBox();

    SecondStage(double width, double height, Hashtable<String, String> parameters){
        super();
        this.parameters = parameters;
        vbox.getChildren().addAll(lbl1, lbl2);
        lbl1.setText(parameters.get("phoneName"));
        scene = new Scene(vbox, width, height);
        this.setScene(scene);
    }

}

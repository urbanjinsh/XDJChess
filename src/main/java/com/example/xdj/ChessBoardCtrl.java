package com.example.xdj;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class ChessBoardCtrl {

    @FXML
    private AnchorPane board;

    @FXML
    private Circle p1_d_circle;

    @FXML
    private Label p1_d_text;

    @FXML
    private Circle p1_j_circle;

    @FXML
    private Label p1_j_text;

    @FXML
    private Circle p1_x_circle;

    @FXML
    private Label p1_x_text;

    @FXML
    private Circle p2_d_circle;

    @FXML
    private Label p2_d_text;

    @FXML
    private Circle p2_j_circle;

    @FXML
    private Label p2_j_text;

    @FXML
    private Circle p2_x_circle;

    @FXML
    private Label p2_x_text;

    @FXML
    void click(MouseEvent event) {
//        p1_d_circle.setLayoutX(event.getX());
//        p1_d_circle.setLayoutY(event.getY());


        System.out.println("("+ event.getX() + "," + event.getY() + ")");

    }

    @FXML
    void p1_click(MouseEvent event) {
        System.out.println("dianji");

    }

}

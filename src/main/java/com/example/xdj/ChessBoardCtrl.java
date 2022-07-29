package com.example.xdj;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ChessBoardCtrl {

    @FXML
    private AnchorPane board;

    @FXML
    void click(MouseEvent event) {
        board.getLayoutX();

        System.out.println("("+ event.getX() + "," + event.getY() + ")");

    }

}

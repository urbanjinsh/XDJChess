package com.example.xdj;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ChessBoard {
    public AnchorPane getBoard() {
        return board;
    }

    @FXML
    AnchorPane board;
}

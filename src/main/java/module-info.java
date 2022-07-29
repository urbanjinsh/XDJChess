module com.example.xdj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.xdj to javafx.fxml;
    exports com.example.xdj;
}
module com.example.ppiproject {

    requires com.jfoenix;
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;

    opens com.example.ppiproject to javafx.fxml;
    exports com.example.ppiproject;
}
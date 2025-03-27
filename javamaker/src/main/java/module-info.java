module com.javamaker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javamaker to javafx.fxml;
    exports com.javamaker;
}

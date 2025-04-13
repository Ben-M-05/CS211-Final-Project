module com.javamaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.javamaker to javafx.fxml;
    exports com.javamaker;
}

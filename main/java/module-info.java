module com.texier.orowan2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;


    opens orowan2 to javafx.fxml;
    exports orowan2;
}
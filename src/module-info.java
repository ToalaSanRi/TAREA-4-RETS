module DiseñoFormulario {
    requires javafx.controls;
    requires javafx.fxml;

    opens application to javafx.fxml, javafx.graphics;
    opens resources to javafx.fxml;
}

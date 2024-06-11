# TAREA-4-RETS
Diseña el siguiente formulario en JavaFx

  **CAPTURA DE EJECUCIÓN**
  ![image](https://github.com/ToalaSanRi/TAREA-4-RETS/assets/169106800/4dc035d9-c29f-409c-b7d9-7cc18e2ee341)

  **MAIN**
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/allControls.fxml"));
        root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("JavaFX Controls Example");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


**FXML**
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<VBox xmlns:fx="http://javafx.com/fxml" spacing="10" alignment="CENTER">
    <children>
        <GridPane hgap="10" vgap="10">
            <columnConstraints>
                <ColumnConstraints halignment="RIGHT"/>
                <ColumnConstraints halignment="LEFT"/>
            </columnConstraints>

            <Label text="Button:" GridPane.rowIndex="0" GridPane.columnIndex="0"/>
            <Button text="Button" GridPane.rowIndex="0" GridPane.columnIndex="1"/>

            <Label text="CheckBox:" GridPane.rowIndex="1" GridPane.columnIndex="0"/>
            <CheckBox text="CheckBox" GridPane.rowIndex="1" GridPane.columnIndex="1"/>

            <Label text="Hyperlink:" GridPane.rowIndex="2" GridPane.columnIndex="0"/>
            <Hyperlink text="Hyperlink" GridPane.rowIndex="2" GridPane.columnIndex="1"/>

            <Label text="ToggleButton:" GridPane.rowIndex="3" GridPane.columnIndex="0"/>
            <ToggleButton text="ToggleButton" GridPane.rowIndex="3" GridPane.columnIndex="1"/>

            <Label text="RadioButton:" GridPane.rowIndex="4" GridPane.columnIndex="0"/>
            <RadioButton text="RadioButton" GridPane.rowIndex="4" GridPane.columnIndex="1"/>

            <Label text="Label:" GridPane.rowIndex="5" GridPane.columnIndex="0"/>
            <Label text="Label" GridPane.rowIndex="5" GridPane.columnIndex="1"/>

            <Label text="TextField:" GridPane.rowIndex="6" GridPane.columnIndex="0"/>
            <TextField promptText="some text..." GridPane.rowIndex="6" GridPane.columnIndex="1"/>

            <Label text="PasswordField:" GridPane.rowIndex="7" GridPane.columnIndex="0"/>
            <PasswordField GridPane.rowIndex="7" GridPane.columnIndex="1"/>

            <Label text="TextArea:" GridPane.rowIndex="8" GridPane.columnIndex="0"/>
            <TextArea prefRowCount="3" wrapText="true" text="This is very long text that will wrap to several lines." GridPane.rowIndex="8" GridPane.columnIndex="1"/>

            <Label text="ProgressIndicator:" GridPane.rowIndex="9" GridPane.columnIndex="0"/>
            <ProgressIndicator progress="0.49" GridPane.rowIndex="9" GridPane.columnIndex="1"/>

            <Label text="ProgressBar:" GridPane.rowIndex="10" GridPane.columnIndex="0"/>
            <ProgressBar progress="0.49" GridPane.rowIndex="10" GridPane.columnIndex="1"/>

            <Label text="Slider:" GridPane.rowIndex="11" GridPane.columnIndex="0"/>
            <Slider min="0" max="100" value="49" GridPane.rowIndex="11" GridPane.columnIndex="1"/>
        </GridPane>
    </children>
</VBox>

**APLICACIÓN**
.button {
    -fx-font-size: 12px;
}

.check-box {
    -fx-font-size: 12px;
}

.hyperlink {
    -fx-text-fill: #0066cc;
}

.toggle-button {
    -fx-font-size: 12px;
}

.radio-button {
    -fx-font-size: 12px;
}

.label {
    -fx-font-size: 12px;
}

.text-field {
    -fx-font-size: 12px;
}

.password-field {
    -fx-font-size: 12px;
}

.text-area {
    -fx-font-size: 12px;
}

.progress-indicator {
    -fx-progress-color: #1e90ff;
}

.progress-bar {
    -fx-accent: #1e90ff;
}

.slider {
    -fx-base: #1e90ff;
}


module dev.swellington.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.swellington.tictactoe to javafx.fxml;
    exports dev.swellington.tictactoe;
}
module foofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.joeclark to javafx.fxml;
    exports net.joeclark;
}
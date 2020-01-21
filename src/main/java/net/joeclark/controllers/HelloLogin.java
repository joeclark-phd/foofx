package net.joeclark.controllers;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloLogin {

    public Label nameLabel;

    public void clickButton(MouseEvent mouseEvent) {
        nameLabel.setRotate(nameLabel.getRotate()+5);
    }
}

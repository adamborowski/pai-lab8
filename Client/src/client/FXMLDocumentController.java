/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.stub.car.Car;
import client.stub.tower.Tower;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author adam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        RandomizeTowersActivator activator = new RandomizeTowersActivator();
        activator.activate((towers) -> {
            StringBuilder sb = new StringBuilder();
            sb.append("Przetasowane wieże:\n");
            for (Tower i : towers) {
                sb.append(towerToString(i)).append("\n");
            }
            label.setText(sb.toString());
        });
        label.setText(label.getText()+"\nAktywowano wywołanie usługi...");
    }
    private BusinessDelegate delegat;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        delegat = new BusinessDelegate();
        StringBuilder sb = new StringBuilder();
        sb.append("Wieże:\n");
        for (Tower i : delegat.getTowers()) {
            sb.append(towerToString(i)).append("\n");
        }
        sb.append("Pojazdy:\n");
        for (Car i : delegat.getCars()) {
            sb.append(carToString(i)).append("\n");
        }
        label.setText(sb.toString());
    }

    private String towerToString(Tower tower) {
        return "\tWieża " + tower.getTower() + " o wysokości: " + tower.getHeight() + "m.";
    }

    private String carToString(Car car) {
        return "\tPojazd " + car.getName() + " o cenie: " + car.getPrice() + "PLN.";
    }

}

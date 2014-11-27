/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.stub.tower.Tower;
import java.util.List;
import javafx.application.Platform;

/**
 *
 * @author adam
 */
public class RandomizeTowersActivator {

    public RandomizeTowersActivator() {

    }

    public void activate(RandomizeTowersCallback callback) {
        final BusinessDelegate delegat = new BusinessDelegate();
        new Thread(() -> {
            System.out.println("poczatek wolania");
            final List<Tower> randomizedTowers = delegat.randomizeTowers();
            System.out.println("koniec wolania");
            Platform.runLater(() -> {
                callback.onRandomizeTowersCallback(randomizedTowers);
            });
        }).start();
    }
}

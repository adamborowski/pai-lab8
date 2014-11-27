/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import pl.adamborowski.pai8.entity.Tower;

/**
 *
 * @author adam
 */
@Stateless
@LocalBean
public class TowerEnterprise {

    public List<Tower> getTowers() {
        return mock;
    }
    private List<Tower> mock;

    @PostConstruct
    private void initMe() {
        mock = new ArrayList<>();
        mock.add(new Tower("Burj Dubai", 980));
        mock.add(new Tower("Sea Towers", 116));
        mock.add(new Tower("World Trace Center", 324));
    }

    public List<Tower> randomizeTowers() {
        Collections.shuffle(mock, new Random());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            return mock;
        }
        return mock;
    }

}

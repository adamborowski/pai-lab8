/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.stub.tower.Tower;
import java.util.List;

/**
 *
 * @author adam
 */
public interface RandomizeTowersCallback {
    void onRandomizeTowersCallback(List<Tower> towers);
}

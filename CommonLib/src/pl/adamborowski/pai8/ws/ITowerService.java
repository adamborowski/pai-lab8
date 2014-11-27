/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8.ws;

import java.io.Serializable;
import java.util.List;
import pl.adamborowski.pai8.entity.Tower;

/**
 *
 * @author adam
 */
public interface ITowerService extends Serializable{

    List<Tower> getTowers();
    List<Tower> randomizeTowers();
    
}

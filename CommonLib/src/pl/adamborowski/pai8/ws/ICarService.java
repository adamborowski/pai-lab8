/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8.ws;

import java.util.List;
import pl.adamborowski.pai8.entity.Car;

/**
 *
 * @author adam
 */
public interface ICarService {

    List<Car> getCars();
    
}

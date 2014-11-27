/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import pl.adamborowski.pai8.entity.Car;

/**
 *
 * @author adam
 */
@Stateless
@LocalBean
public class CarEnterprise {

    public List<Car> getCars() {
        return mock;
    }
    private List<Car> mock;

    @PostConstruct
    private void initMe() {
        mock = new ArrayList<>();
        mock.add(new Car("Maluch", 2000));
        mock.add(new Car("Saab 123", 60000));
        mock.add(new Car("Mercedes 456", 120000));
    }

}

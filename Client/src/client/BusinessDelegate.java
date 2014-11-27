/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.stub.car.Car;
import client.stub.car.CarService;
import client.stub.car.CarService_Service;
import client.stub.tower.Tower;
import client.stub.tower.TowerService;
import client.stub.tower.TowerService_Service;
import client.ws.LocatorService;
import client.ws.LocatorService_Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 *
 * @author adam
 */
public class BusinessDelegate {

    TowerService towerService;
    CarService carService;

    public BusinessDelegate() {
        try {
            LocatorService locator = new LocatorService_Service().getLocatorServicePort();
            List<String> towerLocation = locator.getServiceURL("towers");
            List<String> carLocation = locator.getServiceURL("cars");
            towerService = new TowerService_Service(new URL(towerLocation.get(0)), new QName(towerLocation.get(1), towerLocation.get(2))).getPort(new QName(towerLocation.get(3), towerLocation.get(4)), TowerService.class);
            carService = new CarService_Service(new URL(carLocation.get(0)), new QName(carLocation.get(1), carLocation.get(2))).getPort(new QName(carLocation.get(3), carLocation.get(4)), CarService.class);

        } catch (MalformedURLException ex) {
            Logger.getLogger(BusinessDelegate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public List<Tower> getTowers(){
        return towerService.getTowers();
    }
    public List<Car> getCars(){
        return carService.getCars();
    }
    public List<Tower> randomizeTowers(){
        return towerService.randomizeTowers();
    }

}

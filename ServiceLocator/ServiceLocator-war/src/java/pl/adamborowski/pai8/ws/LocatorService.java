/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pl.adamborowski.pai8.ws.client.tower.TowerService;
import pl.adamborowski.pai8.ws.client.tower.TowerService_Service;

/**
 *
 * @author adam
 */
@WebService(serviceName = "LocatorService")
public class LocatorService {

    /**
     * This is a sample web service operation
     */
    @WebMethod
    public String[] getServiceURL(String serviceId) {
        if ("towers".equals(serviceId)) {
            return new String[]{"http://localhost:8080/TowerService-war/TowerService?wsdl", "http://ws.pai8.adamborowski.pl/", "TowerService","http://ws.pai8.adamborowski.pl/", "TowerServicePort" };
        }
        if ("cars".equals(serviceId)) {
            return new String[]{"http://localhost:8080/CarService-war/CarService?wsdl", "http://ws.pai8.adamborowski.pl/", "CarService","http://ws.pai8.adamborowski.pl/", "CarServicePort"};
        }
        return null;
    }
}

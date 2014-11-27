/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.pai8.ws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import pl.adamborowski.pai8.CarEnterprise;
import pl.adamborowski.pai8.entity.Car;

/**
 *
 * @author adam
 */
@WebService(serviceName = "CarService")
public class CarService implements ICarService {

    @EJB CarEnterprise carEnterprise;
    @WebMethod
    @Override
    public List<Car> getCars(){
        return carEnterprise.getCars();
    }
}

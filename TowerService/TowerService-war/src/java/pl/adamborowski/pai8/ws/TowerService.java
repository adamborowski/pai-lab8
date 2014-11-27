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
import javax.jws.WebParam;
import pl.adamborowski.pai8.TowerEnterprise;
import pl.adamborowski.pai8.entity.Tower;

/**
 *
 * @author adam
 */
@WebService(serviceName = "TowerService")
public class TowerService implements ITowerService {

    @EJB TowerEnterprise towerEnterprise;
    @WebMethod
    @Override
    public List<Tower> getTowers(){
        return towerEnterprise.getTowers();
    }
    @WebMethod
    @Override
    public List<Tower> randomizeTowers(){
        return towerEnterprise.randomizeTowers();
    }
}

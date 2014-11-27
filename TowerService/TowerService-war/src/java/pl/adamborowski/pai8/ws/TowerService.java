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
public class TowerService {

    @EJB TowerEnterprise towerEnterprise;
    @WebMethod
    public List<Tower> getTowers(){
        return towerEnterprise.getTowers();
    }
}

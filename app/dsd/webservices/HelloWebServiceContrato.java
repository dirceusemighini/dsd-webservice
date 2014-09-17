package dsd.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by dirceu on 9/16/14.
 */
@WebService
public interface HelloWebServiceContrato {

    @WebMethod(action="http://localhost:9000/servico/ola")
    public String sayHi(String text);
}

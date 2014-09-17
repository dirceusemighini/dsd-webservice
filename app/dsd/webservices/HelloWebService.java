package dsd.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by dirceu on 9/16/14.
 */
@WebService(endpointInterface = "dsd.webservices.HelloWebServiceContrato", targetNamespace = "http://localhost:9000/")
public class HelloWebService implements HelloWebServiceContrato {


//    @Override
//    public String testeGet(String resposta) {
//        return "abc "+resposta;
//    }

//    @WebMethod(action = "servico/ola")
    @Override
    public String sayHi(String text) {
        return "Hello " + text;
    }
}

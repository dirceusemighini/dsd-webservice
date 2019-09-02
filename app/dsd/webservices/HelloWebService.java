package dsd.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * Created by dirceu on 9/16/14.
 */
@WebService(endpointInterface = "dsd.webservices.HelloWebServiceContrato", targetNamespace = "http://localhost:9000")
public class HelloWebService implements HelloWebServiceContrato {

    @Override
    public String olaMsg(String text) {
        lista.add("Teste1");
        lista.add("teste2");
        lista.add("Claudio");
        lista.add("AWS");
        for(String atributo:lista){
            System.out.println(atributo);
        }

        lista.stream().forEach(f -> System.out.println(f));
        List<Integer> listaInt = lista.stream().mapToInt(
                new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String value) {
                return value.hashCode();
            }
        }).boxed().collect(Collectors.toList());
        return "Hello " + text;
    }

    public List<String> lista = new ArrayList<String>();


}

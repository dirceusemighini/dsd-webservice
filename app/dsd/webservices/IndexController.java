package dsd.webservices;

import play.*;
import play.mvc.*;

/**
 * Created by dirceu on 9/16/14.
 */

public class IndexController extends Controller {
    public static Result index() {
        return ok("Servidor Inicializado com sucesso " + request() + "!");
    }
}

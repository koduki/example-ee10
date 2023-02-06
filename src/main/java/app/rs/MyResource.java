package app.rs;

/**
 *
 * @author koduki
 */
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@RequestScoped
public class MyResource {

    @Inject
    private Book book;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/rest")
    public HelloRecord rest() {
        return new HelloRecord("Hello from Jakarta EE");
    }

    @GET
    @Path("/jsp")
    @Produces("text/html")
    @Controller
    public String jsp() {
        book.setTitle("Some title");
        book.setAuthor("Some author");
        book.setIsbn("Some ISBN");
        return "book.jsp";
    }

    @GET
    @Path("/jsf")
    @View("greet.xhtml")
    @Controller
    public void jsf() {

    }

    @GET
    @Path("/")
    @Produces("text/html")
    @Controller
    public String index() {
        return "index.jsp";
    }
}

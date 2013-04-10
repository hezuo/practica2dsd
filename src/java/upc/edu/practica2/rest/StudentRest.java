package upc.edu.practica2.rest;

import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import upc.edu.practica2.servicios.StudentService;
import upc.edu.practica2.model.Student;

/**
 *
 * @author cesar
 */
@Path("/students")
@Produces({"application/json"})
public class StudentRest {

    private static final Logger log = Logger.getLogger(StudentRest.class.getName());

    @GET
    @Path("/{id}")
    public Student getStudentById(@PathParam("id") String id) {

        StudentService ss = new StudentService();
        log.info("buscar x id");
        System.out.println(" buscar x id");
        return ss.getStudent(id);

    }

    @GET
    @Path("/")
    public List<Student> getStudents() {

        StudentService ss = new StudentService();
        log.info("buscar todos");
        System.out.println(" buscar todos ");
        
        return ss.getStudents();
    }
    
    
    @POST
    @Path("/{id}")
    public Student addStudentById(@PathParam("id") String id) {

        StudentService ss = new StudentService();
        log.info("buscar x id");
        System.out.println(" buscar x id");
        return ss.getStudent(id);

    }
    
    
    @DELETE
    @Path("/{id}")
    public List<Student> removeStudentById(@PathParam("id") String id) {

        StudentService ss = new StudentService();
        
        return ss.removeStudent(id);
    }
    
    @PUT
    @Path("/{id}")
    public Student editStudentById(@PathParam("id") String id) {

        StudentService ss = new StudentService();
        log.info("buscar x id");
        System.out.println(" buscar x id");
        return ss.getStudent(id);

    }
}

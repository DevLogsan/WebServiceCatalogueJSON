package jaxws;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import travail.Courir;
import travail.Course;
import travail.GestionCourir;

@Path("course")
public class CourseResource
{

    @Context
    private UriInfo context;

    public CourseResource()
    {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Course> getJson()
    {
        ArrayList<Course> lesCourses = GestionCourir.ListeDesCourses();
        return lesCourses;
    }
    
    @GET // Méthode HTTP utilisée pour afficher les resultats d'une course dont le nom est passé en paramètre
    @Path("nomJSON")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<Courir> getJson(@QueryParam("nomCourse") String pnomCourse)
    {
        ArrayList<Courir> lesResultats = GestionCourir.ResultatCourse(pnomCourse);
        return lesResultats;
    }

   }

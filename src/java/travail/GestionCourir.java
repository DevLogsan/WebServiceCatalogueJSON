package travail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class GestionCourir
{
 private static ArrayList<Courir> lesResultats = new ArrayList<Courir>();
 private static ArrayList<Course> lesCourses;
 private static Course maCourse;
 private static Connection conn;
 private static Statement stmt;
 private static ResultSet rs;
 private static String pilote = "org.gjt.mm.mysql.Driver";
 private static String url = new String("jdbc:mysql://localhost/fbcn_2021");
 public static ArrayList<Course> ListeDesCourses()
 {
 try
 {
 lesCourses = new ArrayList<Course>();
 Class.forName(pilote);
 conn = DriverManager.getConnection(url,"root","");
 stmt = conn.createStatement();
 rs = stmt.executeQuery("select distinct nomcourse from courir");
 while (rs.next())
 {
 maCourse = new Course(rs.getString("nomcourse"));
 lesCourses.add(maCourse);
 }
 rs.close();
 stmt.close();
 conn.close();
 return lesCourses;
 }
 catch (SQLException e)
 {
 System.out.println(e.getMessage());
 return null;
 }
 catch (ClassNotFoundException e)
 {
 System.out.println(e.getMessage());
 return null;
 }
 }
 public static ArrayList<Courir> ResultatCourse(String nomCourse)
 {
 try
 {
 Courir uneCourse;
 lesResultats = new ArrayList<Courir>();
 Class.forName(pilote);
 conn = DriverManager.getConnection(url,"root","");
 stmt = conn.createStatement();
 rs = stmt.executeQuery("select * from courir where nomcourse = '" + nomCourse + "' order by place limit 10");
 while (rs.next())
 {
 uneCourse = new Courir(rs.getString("nomcourse"), rs.getString("nomcoureur"),
rs.getString("prenomcoureur"), rs.getInt("place"), rs.getTime("temps").toString());
 lesResultats.add(uneCourse);
 }
 rs.close();
 stmt.close();
 conn.close();
 return lesResultats;
 }
 catch (SQLException e)
 {
 System.out.println(e.getMessage());
 return null;
 }
 catch (ClassNotFoundException e)
 {
 System.out.println(e.getMessage());
 return null;
 }
 }
}
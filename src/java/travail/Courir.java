package travail;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="course")
public class Courir
{
 private String nomCourse;
 private String prenomCoureur;
 private String nomCoureur;
 private int place;
 private String temps;
 public Courir()
 {
 }
 public Courir(String nomCourse, String nomCoureur, String prenomCoureur, int place, String temps) {
 this.nomCourse = nomCourse;
 this.nomCoureur = nomCoureur;
 this.prenomCoureur = prenomCoureur;
 this.place = place;
 this.temps = temps;
 }
 public String getNomCourse()
 {
 return nomCourse;
 }
 @XmlElement
 public void setNomCourse(String nomCourse)
 {
 this.nomCourse = nomCourse;
 }
 public String getPrenomCoureur()
 {
 return prenomCoureur;
 }
 @XmlElement
 public void setPrenomCoureur(String prenomCoureur)
 {
 this.prenomCoureur = prenomCoureur;
 }
 public String getNomCoureur()
 {
 return nomCoureur;
 }
 @XmlElement
 public void setNomCoureur(String nomCoureur)
 {
 this.nomCoureur = nomCoureur;
 }
 public int getPlace()
 {
 return place;
 }
 @XmlElement
 public void setPlace(int place)
 {
 this.place = place;
 }
 public String getTemps()
 {
 return temps;
 }
 @XmlElement
 public void setTemps(String temps)
 {
 this.temps = temps;
 }
}

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Etudiant extends Personne{
    Date annéeEtude;
    int note;
    ArrayList<Matiere>matiere;
    public Etudiant(String name,String surname,String mail,String tel,ArrayList<Matiere>matiere,Date d){
        super(name,surname,mail,tel);
        annéeEtude = new Date(d.getDay(),d.getMonth(),d.getYear());

    }
public Date  getD(){
        return  annéeEtude;
}
public ArrayList<Matiere> getMat(){
    return matiere;
}

    @Override
    public String toString() {
        return super.toString()+" " +
                "annéeEtude=" + annéeEtude +
                ", note=" + note +
                ", matiere=" + matiere +
                '}';
    }
}

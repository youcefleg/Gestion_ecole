import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Matiere implements Cloneable {
    public Matiere(){

    }
    ArrayList<Teacher>enseignerpar=new ArrayList<Teacher>() ;
    Sale sale;
    int note;
    public Matiere(ArrayList<Teacher>t,Sale s,int n){
        sale=new Sale();
        note=n;
        enseignerpar=t;
    }

        public void getEnseignerpar(){
                     for(int i =0;i<enseignerpar.size();i++){
            System.out.println(enseignerpar.toString());
        }

        }

       /* public static void main(String args[]){
        Teacher t= new Teacher("ahmed","Ben","jih@","775485",new Date(1996,11,18),"Assistant");
        Sale y = new Sale();
        ArrayList<Teacher>tech=new ArrayList<>();
            tech.add(t);
            Matiere m = new Matiere(tech,y,11);

            m.getEnseignerpar();

    }*/

    }


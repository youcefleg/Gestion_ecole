/**
 * Created by Youcef LEG on 30/10/2017.
 */
import java.util.ArrayList;
import java.util.Date;
public class Main {


    public static void main(String args[]){

        Teacher t0 = new Teacher("Morad","Hadi","moad@gmail.com","066547895",new Date(),"Maitre Assistant");
        Teacher t1 = new Teacher("Nabila","Mokhtari","Nab@gmail.com","0778451263",new Date(),"Chargé de cours");
        Teacher t2 = new Teacher("Mohamed","Senouci","senouci@gmail.com","0584785236",new Date(),"Assistant");
        Teacher t3 = new Teacher("Marwa","Deba","deba@gmail.com","0778965412",new Date(),"Maitre de Conference A");
        Teacher t4 = new Teacher("Malika","Amran","mokran@gmail.com","0777117712",new Date(),"Maitre de conference B");
        Teacher t5 = new Teacher("Ilyes","Haffaf","haffaf23@gmail.com","0774123698",new Date(),"Proffesseur");
        ArrayList<Teacher>enseignant=new ArrayList<Teacher>();
        enseignant.add(t0);
        enseignant.add(t1);
        enseignant.add(t2);
        enseignant.add(t3);
        enseignant.add(t4);
        Departement dep1 = new Departement(t0,"M.I");
        System.out.println(dep1.getName());
        System.out.println(dep1.getResponsable().toString());
       // dep1.getEnseignants();
       // Departement dep2 = new Departement(t5,,"Math");
        Ecole université = new Ecole("IGMO","www.AhmedBenbella.com",dep1);
        dep1.affPar("Assistant");

        //System.out.println("hello");

    }
}

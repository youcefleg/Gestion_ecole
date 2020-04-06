import java.util.ArrayList;

/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Departement {
    private String name;
    private  Teacher responsable ;
    private ArrayList<Teacher>Enseignants;
    private ArrayList<Sale>sales;

    public Departement (Teacher t,String name) //ArrayList<Teacher>te
    {
        this.name=name;
        responsable=new Teacher(t.getName(),t.getSurname(),t.getMail(),t.getTel(),t.getDatejob(),t.getGrade());
    }

    public String getName() {
        return name;
    }

    public Teacher getResponsable() {
        return responsable;
    }

    public void getEnseignants(){
        for(int i = 0; i<Enseignants.size();i++){
            System.out.println(Enseignants.toString());
        }

    }

    public void affPar(String grade ){
        for(int i=0;i<Enseignants.size();i++){
            if(Enseignants.get(i).Grade.equals(grade)){
                System.out.println(Enseignants.get(i).getName()+" "+Enseignants.get(i).getSurname()+" "+Enseignants.get(i).getMail() );
                                                      }
        }
    }


    @Override

    public String toString() {
        String t = "Departement " +
                "name='" + name + '\'' +
                ", sous la responsabilité de " + responsable;
        String s = "";
        for (int i = 0; i < Enseignants.size(); i++) {

            s = s + ", Enseignants=" + Enseignants.get(i).toString() +
                    ", sales=" + sales ;
        }
        return t+s;
    }


}

import java.util.ArrayList;

/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Ecole {
    private String site;
    private String name;
    private ArrayList<Departement>departements;
int i =0;
    public Ecole(String name,String site,Departement d){
        this.name=name;
        this.site=site;
        Departement p =  new Departement(d.getResponsable(),d.getName());
       departements.add(p);
    }


    public String getSite() {
        return site;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartements(Departement dep) {
        departements.add(dep);
    }

    public void affiche(Ecole e){
        for(int i =0;i<departements.size();i++){
            System.out.println(e.departements.get(i).toString());
        }
    }


}

/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Personne {
    private String name;
    private String surname;
    private String mail;
    private String tel;
    Personne(String name,String surname,String mail,String tel){
        this.mail=mail;
        this.name=name;
        this.surname=surname;
        this.tel=tel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return
                " name : '" + name + '\'' +
                ", surname : '" + surname + '\'' +
                ", mail :'" + mail + '\'' +
                " , tel:" + tel
                ;
    }
}

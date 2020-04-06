import java.util.Date;

/**
 * Created by Youcef LEG on 30/10/2017.
 */
public class Teacher extends Personne {
    Date datejob;
    String Grade;
    public Teacher(String name,String surname ,String mail,String tel ,Date d,String grade){
        super(name,surname,mail,tel);
        this.datejob=new Date(d.getYear(),d.getMonth(),d.getDay());
        this.Grade=grade;
    }

    public Date getDatejob() {
        return datejob;
    }

    public String getGrade() {
        return Grade;
    }

    @Override
    public String toString() {
        return super.toString()+ " became a Teacher on " +
                ": " + datejob +
                " ,his  Grade='" + Grade + '\''
                ;
    }




}

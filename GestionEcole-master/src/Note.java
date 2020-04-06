/**
 * Created by Youcef LEG on 05/11/2017.
 */
public class Note {
    Etudiant e ;
    Matiere m;
    int note;

    public Etudiant getE() {
        return e;
    }

    public Note(Etudiant e, Matiere m, int note) {
        this.e = new Etudiant(e.getName(),e.getSurname(),e.getMail(),e.getTel(),e.getMat(),e.getD());
        this.m = new Matiere();
        this.note = note;

    }

    public void setE(Etudiant e) {
        this.e = e;
    }

    public Matiere getM() {
        return m;
    }

    public void setM(Matiere m) {
        this.m = m;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }
}

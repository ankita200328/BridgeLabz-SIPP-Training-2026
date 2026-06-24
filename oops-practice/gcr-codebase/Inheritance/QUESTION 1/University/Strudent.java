package University;

public class Strudent extends Person {
    protected int studentId;
    protected  double studentGpa;


    public Strudent( int id, String name,int studentId, double studentGpa){
        super(id,name);
        this.studentId=studentId;
        this.studentGpa=studentGpa;

    }
}

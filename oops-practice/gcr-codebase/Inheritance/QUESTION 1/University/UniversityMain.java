package University;

public class UniversityMain {
    public static void main(String [] args){
        GradStudent studentOne=new GradStudent(
                101,
                "Sahil",
                1234567,
                70.0,
                "Artifical Inteligence"
        );
        System.out.println(studentOne);
        GradStudent studentTwo =new GradStudent(
                102,
                "ankita",
                12367,
                80.0,
                "Computer"
        );
        System.out.println(studentTwo);
    }
}

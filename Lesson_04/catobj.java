package Lesson_04;

public class catobj {
    public static void main(String[] args) {
        cat catobj = new cat();
        catobj.vaccinated = false;
        catobj.name = "Мурзик";
        catobj.vaccinatedKOT();
        System.out.println(catobj);
    }
}

package Homework8;

public interface CreateVacancy {

    public default String createVacancy(){
        Vacancy vac = new Vacancy();
         return vac.nameVacancy;
    }
    
}

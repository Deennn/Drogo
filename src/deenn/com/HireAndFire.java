package deenn.com;

public interface HireAndFire {
    Drogo drogo = new Drogo();
    Applicants applicants = new Applicants();
//    Employee employee = new Employee();


    default void hire(Drogo drogo) {

    }

    default void fire(Drogo drogo) {

    }
}

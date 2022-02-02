package deenn.com;

public class Ceo extends Employees implements HireAndFire{
//    Applicants applicants = new Applicants();

    private Ceo(String name, int id, String email, String qualification, boolean isGraduate) {
        super(name, id, email, qualification, isGraduate);
    }

    @Override
    public void hire(Drogo drogo) {
        if (drogo.vacancy.size() > 0 ||applicants.isGraduate() ) {
           drogo.employee.add(applicants.getName());
            System.out.println("Dear " + applicants.getName() + "");
        } else if (drogo.vacancy.size() > 0 || !applicants.isGraduate()){
            drogo.employee.add(applicants.getName());
        } else {
            System.out.println("");
        }

    }

    @Override
    public void fire(Drogo drogo) {
        if (drogo.getEmployees().) {

        }
    }
}

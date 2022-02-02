package deenn.com;

abstract class Employees extends Person{
    private double salary;
    private String rank;
    private String Role;
    private int sales;
    private String offense;
    private float workRate;

    public Employees(String name, int id, String email, String qualification, boolean isGraduate) {
        super(name, id, email, qualification, isGraduate);
        this.salary = salary;
        this.rank = rank;
        Role = role;
        this.sales = sales;
        this.offense = offense;
        this.workRate = workRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public float getWorkRate() {
        return workRate;
    }

    public void setWorkRate(float workRate) {
        this.workRate = workRate;
    }

}

package deenn.com;

abstract class Person {
    private String name;
    private int id;
    private String email;
    private String qualification;
    private boolean isGraduate;

    public Person(String name, int id, String email, String qualification, boolean isGraduate) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.qualification = qualification;
        this.isGraduate = isGraduate;
    }

    public Employees getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }
}

package problem1;

public abstract class Person {

    protected String name;
    protected String address;
    protected String nationality;
    protected boolean gender;
    protected int yOB;
    protected String qualification;
    protected String matialStatus;

    public Person(String name, String address, String nationality, boolean gender, int yOB, String qualification, String matialStatus) {
        this.name = name;
        this.address = address;
        this.nationality = nationality;
        this.gender = gender;
        this.yOB = yOB;
        this.qualification = qualification;
        this.matialStatus = matialStatus;
    }

    public abstract void showJob();

    public void showInformation() {
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.nationality);
        if (this.gender) {
            System.out.println("male");
        }
        else 
            System.out.println("female");
        System.out.println(this.yOB);
        System.out.println(this.qualification);
        System.out.println(this.matialStatus);
        this.showJob();
    }
}

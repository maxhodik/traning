package student;

public class Aspirant extends Student {
    private String sWork;


    public String getsWork() {
        return sWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sWork) {
        super(firstName, lastName, group, averageMark);
        this.sWork = sWork;
    }

    public void test() {

    }

    @Override
    public void getScholarship() {
        if (this.getAverageMark() == 5) {
            System.out.println(toString() + "sum=  200");
        } else {
            System.out.println(toString() + "sum=  180");
        }
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "sWork='" + sWork + '\'' +
                "} " + super.toString();
    }
}

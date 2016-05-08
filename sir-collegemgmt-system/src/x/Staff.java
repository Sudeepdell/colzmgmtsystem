package x;

/**
 *
 * @author sudeep
 */
public class Staff {

    private String name;
    private int totalPresentDays;
    private double basicSalary;
    private int totalAbsentDays;

    public int getTotalAbsentDays() {
        return totalAbsentDays;
    }

    public void setTotalAbsentDays(int totalAbsentDays) {
        this.totalAbsentDays = totalAbsentDays;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTotalPresentDays() {
        return totalPresentDays;
    }

    public void setTotalPresentDays(int totalPresentDays) {
        this.totalPresentDays = totalPresentDays;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

  

}

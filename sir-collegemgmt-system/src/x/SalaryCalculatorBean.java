package x;

/**
 *
 * @author sudeep
 */
public class SalaryCalculatorBean implements SalaryCalculator {

    @Override
    public double calculate(Staff staff) {
        SalaryCalculator calculator = null;
        if (staff instanceof FullTimeTeachingStaff) {
            calculator = new FullTimeTeachingSalaryCalculator();
        }
        if (staff instanceof PartTimeTeachingStaff) {
            calculator = new PartTimeTeachingSalaryCalculator();
        }
        return calculator.calculate(staff);
    }

}

package y;

import x.FullTimeTeachingStaff;
import x.SalaryCalculator;
import x.SalaryCalculatorBean;
import x.Staff;

/**
 *
 * @author sudeep
 */
public class EntryPoint {

    public static void main(String[] args) {
        Staff staff = new FullTimeTeachingStaff();
        SalaryCalculator calculator = new SalaryCalculatorBean();
        calculator.calculate(staff);
    }
}

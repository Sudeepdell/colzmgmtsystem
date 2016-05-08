/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x;

import java.util.logging.Logger;

/**
 *
 * @author sudeep
 */
class FullTimeTeachingSalaryCalculator extends TeachingSalaryCalculator {

    private static final Logger LOG = Logger.getLogger(FullTimeTeachingSalaryCalculator.class.getName());

    @Override
    public double calculate(Staff staff) {
        LOG.info("Inside FullTimeTeachingSalaryCalculator");
        return super.calculate(staff); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x;

/**
 *
 * @author sudeep
 */
class TeachingSalaryCalculator implements SalaryCalculator{

    @Override
    public double calculate(Staff staff) {
        return staff.getBasicSalary();
    }
    
}

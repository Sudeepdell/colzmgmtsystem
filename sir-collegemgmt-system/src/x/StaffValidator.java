package x;

/**
 *
 * @author sudeep
 */
class StaffValidator {

    public void validate(Staff staff) {
        if(staff.getName()== null)
            throw new IllegalArgumentException("invalid name it should be length > 5");
    }
}

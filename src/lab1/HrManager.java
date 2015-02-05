
package lab1;

/**
 *
 * @author nmarks3
 */
public class HrManager {
   private Employee employee;
   
    public void newEmployee() {
        employee = new Employee();
        employee.setFirstName("Peter");
        employee.setLastName("Piper");
        employee.setSsn("333-1234");
        
        employee.firstDay("23");
        
        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
}

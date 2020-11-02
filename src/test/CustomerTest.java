package test;
import domain.Customer;
public class CustomerTest {
    
    public static void main(String[] args){
        Customer cus = new Customer();
        cus.displayCustomerInfo();
        cus.setIsNew(false);
        cus.setID(35);
        cus.setTotal(554.93);
        cus.displayCustomerInfo();
        
    }
    
}
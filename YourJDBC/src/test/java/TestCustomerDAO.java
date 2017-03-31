import com.yourcodelab.dao.CustomerDAO;
import com.yourcodelab.model.Customer;

public class TestCustomerDAO {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("Alex");
		c.setEmail("alex@yourcodelab.com");
		c.setPassword("1212");
		
		CustomerDAO dao = new CustomerDAO();
		dao.insertCustomer(c);
	}
}

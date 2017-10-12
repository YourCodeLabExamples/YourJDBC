import com.yourcodelab.dao.CustomerDAO;
import com.yourcodelab.model.Customer;

public class TestCustomerDAO {
	public static void main(String[] args) {
		Customer c = new Customer(0, "Alex", "alex@yourcodelab.com", "1212");
		
		CustomerDAO dao = new CustomerDAO();
		dao.insertCustomer(c);
	}
}

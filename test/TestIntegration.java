import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import javax.xml.stream.events.ProcessingInstruction;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.*;
import Stock.AdminLogin;
import Stock.Dashboard;
import Stock.Product;
import Stock.TestProgress;
import Stock.Vendor;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestIntegration{

	@Test
	@Order(1)
	public void AddVendor() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Vendor ven = new Vendor();
		ven.txtvendor.setText("CandyMan");
		ven.txtphone.setText("9112113113");
		ven.txtPincode.setText("414141");
		ven.txtEmail.setText("CandyMan@gmail.com");
		ven.jButton5.doClick();
		
	}
	@Test
	@Order(2)
	public void UpdateVendor() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Vendor ven = new Vendor();
		ven.defaultsel();
		
		
	}
	@Test
	@Order(3)
	public void DeleteVendor() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Vendor ven = new Vendor();
		ven.DeleteTest();
		
		
	}
	@Test
	@Order(4)
	public void closing() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Vendor ven = new Vendor();
		ven.jButton2.doClick();
	}
	@Test
	@Order(5)
	public void backtodashboard() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Vendor ven = new Vendor();
		ven.jButton6.doClick();
	}
	@Test
	@Order(6)
	public void addProduct() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton2.doClick();
		Product pro = new Product();
		pro.txtproductname.setText("testadd");
		pro.txtdescription.setText("adding product testcase");
		pro.txtcostprice.setText("1001");
		pro.txtquantity.setText("2");
		pro.txtretailprice.setText("1001");
		pro.txtreorderlevel.setText("0");
		pro.jButton1.doClick();
		
	}
	@Test
	@Order(7)
	public void UpdateProduct() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton2.doClick();
		Product pro = new Product();
		pro.UpdateProductTestMethod();
	}
	@Test
	@Order(8)
	public void DeleteProduct() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Product pro = new Product();
		pro.DeleteProductTestMethod();
		
		
		
	}
	@Test
	@Order(9)
	public void closingProduct() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton2.doClick();
		Product pro = new Product();
		pro.jButton5.doClick();
	}
	@Test
	@Order(10)
	public void backtodashboardProduct() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.setVisible(true);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard dash = new Dashboard();
		dash.jButton1.doClick();
		Product product = new Product();
		product.jButton5.doClick();
	}
	

}

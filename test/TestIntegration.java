import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import org.junit.jupiter.api.Test;
import org.junit.*;
import Stock.AdminLogin;
import Stock.Dashboard;
import Stock.Product;
import Stock.Vendor;

public class TestIntegration{

	@Test
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
		ven.txtvendor.setText("J");
		ven.txtphone.setText("9112113113");
		ven.txtPincode.setText("414141");
		ven.txtEmail.setText("J@G.co");
		ven.jButton5.doClick();
		
	}
	@Test
	public void UpdateVendor() {
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
		
	}
	@Test
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
	

}

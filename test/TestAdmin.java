import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Stock.*;
import junit.framework.Assert;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestAdmin {
	
	@Test
	@Order(1)
	public void loginSuccess() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		assertTrue(confirmString);
	}
	
	@Test
	@Order(2)
	public void loginFailed() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin123";
		AdminLogin al= new AdminLogin();
		al.validate_login(adminUsernameString, adminPasswordString);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		assertFalse(confirmString);
	}
	
	@Test
	@Order(3)
	public void EmptyField() {
		String adminUsernameString = "";
		String adminPasswordString = "";
		AdminLogin al= new AdminLogin();
		al.validate_login(adminUsernameString, adminPasswordString);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		assertFalse(confirmString);
	}
	
	@Test
	@Order(4)
	public void logout() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard db = new Dashboard();
		db.jButton4.doClick();
		assertTrue(true);
	}
}

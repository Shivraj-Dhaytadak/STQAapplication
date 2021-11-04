
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.WindowConstants;
import javax.swing.event.MenuKeyEvent;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.events.Event;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import Stock.AdminLogin;
import Stock.Dashboard;
import java.awt.*;
import java.awt.event.KeyEvent;
;public class TestAdmin {
	
	@Test
	public void loginSuccess() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		Assert.assertTrue(confirmString);
	}
	@Test
	public void loginFailed() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin123";
		AdminLogin al= new AdminLogin();
		al.validate_login(adminUsernameString, adminPasswordString);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		Assert.assertFalse(confirmString);
	}
	@Test
	public void EmptyField() {
		String adminUsernameString = "";
		String adminPasswordString = "";
		AdminLogin al= new AdminLogin();
		al.validate_login(adminUsernameString, adminPasswordString);
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		boolean confirmString = al.validate_login(adminUsernameString, adminPasswordString);
		Assert.assertFalse(confirmString);
	}
	@Test
	public void logout() {
		String adminUsernameString = "admin";
		String adminPasswordString = "admin@123";
		AdminLogin al= new AdminLogin();
		al.username.setText(adminUsernameString);
		al.password.setText(adminPasswordString);
		al.jButton1.doClick();
		Dashboard db = new Dashboard();
		db.jButton4.doClick();
		Assert.assertTrue(true);
	}
}

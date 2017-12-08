package tp.data;

import java.util.Date;

public class UserBean {
	public  String login;

	public  Date loginDate;

	public UserBean(String login, Date loginDate) {
		super();
		this.login = login;
		this.loginDate = loginDate;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
}

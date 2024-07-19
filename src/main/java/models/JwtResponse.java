package models;


public class JwtResponse implements Builder{
	private String jwtToken;
	private String userName;

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "JwtResponse [jwtToken=" + jwtToken + ", userName=" + userName + "]";
	}

	@Override
	public void jwtToken(String jwtToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userName(String userName) {
		// TODO Auto-generated method stub
		
	}

}

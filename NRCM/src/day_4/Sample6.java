//encapsulation
package day_4;

public class Sample6 {
	private String firstname;
	private String lastname;
	private String email;
	private long phno;
	
	public void setFirstName(String fn) {
		firstname=fn;
	}
	public void setLastName(String ln) {
		lastname=ln;
	}
	public void setEmail(String em) {
		email=em;
	}
	public void setPhno(long ph) {
		phno=ph;
	}
	
	
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public long getPhno() {
		return phno;
	}

	
	public static void main(String[] args) {
		Sample6 e1=new Sample6();
		e1.setFirstName("prabhakar");
		e1.setLastName("chaubey");
		e1.setEmail("pchoubey611@gmail.com");
		e1.setPhno(8143727178l);
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getPhno());
		
	}
}
	
	
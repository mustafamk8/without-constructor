package StudentResult.withoutConstructor;

public class Address {

	private int rno;
	private String city;
	private String pincode;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(int rno, String city, String pincode) {
		super();
		this.rno = rno;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [rno=" + rno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}

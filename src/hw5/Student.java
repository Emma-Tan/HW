package hw5;

public class Student {
	private String name;
	private int id;
	private String phone;
	private String address;
	private int age;
	private String department;
	
	public Student(int id, String name) {
		this.id= id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getId() {
		return id;
	}
	
	void setAddress(String address) {
		this.address = address ;
	}
	
	String getAddress() {
		return address;	
	}
	
	
	protected void setPhone(String phone) {
		this.phone= phone;
	}

	protected String getPhone() {
		return phone;
	}	
	
	
	public void setAge(int age) {
		this.age = age ;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDepartment(String department) {
		this.department = department ;
	}
	
	public String getDepartment() {
		return department;	
	}
	
	public void printStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Phone: "+phone);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 =new Student(66199,"Emma");
		stu1.setAddress("Highland Ave");
		stu1.setPhone("518-xxx-xxxx");
		stu1.setDepartment("ITWS");
		stu1.setAge(22);
		stu1.printStudentInfo();
		
					

	}

}

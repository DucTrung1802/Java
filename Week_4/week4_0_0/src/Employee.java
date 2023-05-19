/*
 * Lập chương trình quản lí nhân viên của một công ty
 * 1. Nhân viên cơ bản: tên, quê quán, lương cơ bản, số ngày làm việc
 * Lương = Lương cơ bản * số ngày làm việc
 * 2. Nhân viên lập trình: số dự án tham gia
 * Lương = Lương cơ bản * số ngày làm việc + số dự án * 100(USD)
 * 3. Trưởng phòng: hệ số lương của trưởng phòng
 * Lương = Lương cơ bản * số ngày làm việc * hệ số lương của trưởng phòng
 * 
 * Yêu cầu:
 * 1. Nhập vào danh sách các nhân viên từ tệp tin
 * Tệp tin gồm
		// Loại nhân viên: 0 - Employee, 1 - Developer, 2 - Manager
		// Thông tin của các nhân viên, mỗi thông tin trên 1 dòng
		 * theo thứ tư: tên, quê quán, lương cơ bản, số ngày làm việc, [số project/hệ số lương]
 * 2. In ra các nhân viên và lương họ nhận được
 * 3. Tìm nhân viên có lương cao nhất, và in ra xem thuộc loại nào?
 */
public class Employee {
	
	private String name;
	private String hometown;
	private int basicSalary;
	private int days;
	public Employee(String name, String hometown, int basicSalary, int days) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.basicSalary = basicSalary;
		this.days = days;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	public int computeSalary()
	{
		return basicSalary*days;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hometown=" + hometown + ", basicSalary=" + basicSalary + ", days=" + days
				+ ", computeSalary()=" + computeSalary() + "]";
	}
	
	
	

}

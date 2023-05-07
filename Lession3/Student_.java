
/*
 * Chương trình quản lí sinh viên của một trường:
 * Sinh viên có các thuộc tính: họ và tên, mã sinh viên, quê quán, điểm TB học kì
 * 1. Nhập vào một danh sách sinh viên (n sinh viên từ bàn phím)?
 * 2. Tìm sinh viên có quê ở Hà Nội?
 * 3. Tìm sinh viên có điểm trung bình lớn nhất? 
 */

public class Student {
	// thuộc tính
	private String name;
	private String id;
	private String hometown;
	private double score;
	
	// hàm dựng
	// hàm dựng không đối
	public Student()
	{}
	
	// hàm dựng có tất cả thuộc tính
	public Student(String name, String id, String hometown, double score)
	{
		this.name = name;
		this.id = id;
		this.hometown = hometown;
		this.score = score;
	}
	
	// Các hàm setter và getter
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	// Có bao nhiêu thuộc tính thì sẽ có bấy nhiêu cặp set-get
	public String getHometown()
	{
		return this.hometown;
	}
	
	// phương thức
	public String toString()
	{
		return "[" + this.name + ", " + this.id + ", " + this.hometown + ", " + this.score + "]";
	}
	
	

}

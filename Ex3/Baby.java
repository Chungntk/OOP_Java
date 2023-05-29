

public class Baby {
    
    // khai báo các thuộc tính của một baby
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    private String bbDay = "01/01/2020";
    private String bbName = "UnRegistered";
    private boolean bbGender;
    private double bbWeight, bbLength;
	public Baby() {
	}

	public Baby(String bbName, String bbDay, boolean bbGender, double bbWeight, double bbLength) {
	    this.bbName = bbName;
	    this.bbDay = bbDay;
	    this.bbGender = bbGender;
	    this.bbWeight = bbWeight;
	    this.bbLength = bbLength;
	}
	
	public String getName(){
	    return this.bbName;
	}

    public Double getWeight(){
	    return this.bbWeight;
	}
	
	public String getGender(){
	    if(this.bbGender = false) 
	        return "Boy";
	    else
	        return "Girl";
	}
    /*
        Lưu ý, đối với hàm public String getGender() sẽ trả về Boy nếu gender = false, ngược lại trả về "Girl"
    */
    // in ra thong tin cua baby theo thu tu: ten, ngay thang nam sinh, gioi tinh, can nang, chieu cao
	public String toString() {
	    return getName() + " " + this.bbDay + " " + getGender() + "  " + this.bbWeight + " " + this.bbLength;
	}

}
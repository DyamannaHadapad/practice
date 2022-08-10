class Trainer{
	String name;
	long contactNo;
	double exp;
	Gender gender;
	int age;
	
	
	Trainer(String name,Gender gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
  void setContactNo(long contactNo){
	  this.contactNo=contactNo;
  }
   void setExp(double exp){
	  this.exp=exp;
  }
  void setPrintData(){
	  System.out.println(this.name);
	  System.out.println(this.gender.value);
	  System.out.println(this.age);
	  System.out.println(this.contactNo);
	  System.out.println(this.exp);
  }
}
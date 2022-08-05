	//Jail : name(String),noOfCells(int),staffNames(String[]),noOfGates(int)
	//two properties init using methods
	//two properties init using constructor
	//printData();


class Jail{//BluePrint,non-premitive datatype,desing,className

	String name1="Central jail";//litrals
	double salary;
	String name;//constructor
	int noOfCells;//methods
	String [] staffNames;//methods
	int noOfGates;//Constructor
	
	Jail(String name)//SpecialMethod
	{
		this.name=name;
	}
	Jail(String name,int noOfCells,int noOfGates)//SpecialMethod
	{
		this (name);
		this.noOfCells=noOfCells;
		this.noOfGates=noOfGates;
	}
	void setnoOfCells(int noOfCells){//method
		this.noOfCells=noOfCells;
	}
	void setStaffNames(String[] staffNames){//method
		this.staffNames=staffNames;
	}
	
	void setPrint()//method
	{
		System.out.println(this.name1);
		System.out.println(this.salary);
		System.out.println(this.name);
		for(int i=0;i<this.staffNames.length;i++){
			System.out.println(this.staffNames[i]);
		}
		System.out.println(this.noOfCells);
		System.out.println(this.noOfGates);
	}
}



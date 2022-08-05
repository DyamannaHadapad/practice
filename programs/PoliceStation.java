class PoliceStation{    //dec of class
	
	String name="Shivakumar";//litrals
	int noOfStaffs;//method
	String inspectorName;//ref
	String[] kaidiNames;//const
	
	PoliceStation(String[] kaidiNames)//Special method
	{
		this.kaidiNames=kaidiNames;
	}
	
	void setnoOfStaffs(int noOfStaffs){//method
		this.noOfStaffs=noOfStaffs;
	}
	void setPrint(){//ref method
		System.out.println(this.name);
		System.out.println(this.noOfStaffs);
		System.out.println(this.inspectorName);
	
	for(int i=0; i<this.kaidiNames.length; i++)
	{
		System.out.println(this.kaidiNames[i]);
	}
	}
}
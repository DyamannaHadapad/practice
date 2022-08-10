class Hospital
{
	String name;
	Specialization specialization;
	String[] equipments;
	double  consultationFees;
	Founder founder;
	
	Hospital(String name,Specialization specialization,Founder founder)
	{
		this.name=name;
		this.specialization=specialization;
		this.founder=founder;
	}
	void setConsultationFees(double  consultationFees)
	{
		this.consultationFees=consultationFees;
	}
	void setEquipments(String[] equipments)
	{
		this.equipments=equipments;
	}
	void setPrintData()
	{
		System.out.println(this.name);
		System.out.println(this.specialization);
		for(int i=0;i<this.equipments.length; i++)
		{
		System.out.println(this.equipments[i]);
		}
		System.out.println(this.consultationFees);
		//System.out.println(this.founder);
		this.founder.setPrintAllData();
	}
	
}

class Founder
{
	String name;
	String from;
	Profession profession;
	int  since;
	boolean alive;
	double income;
	
	Founder(String name,String from,Profession profession,int since)
	{
		this.name=name;
		this.from=from;
		this.profession=profession;
		this.since=since;
	}
	
	void setAlive(boolean alive)
	{
	this.alive=alive;	
	}
	void setIncome(double income)
	{
	this.income=income;	
	}
	
	void setPrintAllData()
	{
		System.out.println(this.name);
		System.out.println(this.from);
		System.out.println(this.profession.types);
		System.out.println(this.since);
		System.out.println(this.alive);
		System.out.println(this.income);

	}
}
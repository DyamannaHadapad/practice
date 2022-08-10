class Gym{
	String name;
	double fees;
	String[] equipments;
	Trainer trainer;
	
	void setMethod(String name,double fees,String[] equipments,Trainer trainer)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		this.trainer=trainer;
	}
	void printData(){
		System.out.println(this.name);
		System.out.println(this.fees);
		for(int i=0; i<this.equipments.length; i++){
			System.out.println(this.equipments[i]);
		}		
		this.trainer.setPrintData();
	}
}
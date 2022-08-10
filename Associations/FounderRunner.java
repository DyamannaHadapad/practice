class FounderRunner
{
	public static void main(String[] args)
	{
		
	Founder founder=new Founder("Shivakumar","Linganur",Profession.ENGENEERING,1991);
	
	founder.setAlive(true);
	founder.setIncome(20000.00d);
	Hospital hospital=new Hospital("Banashankari",Specialization.HEART,founder);
	
	hospital.setConsultationFees(200d);
	
	String [] eqp={"Ceser","X-Ray","Ambulence","Strecher","Light","Cotton"};
	hospital.setEquipments(eqp);

	hospital.setPrintData();
	
	
	
	}
	
}
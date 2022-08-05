class JailRunner{
	public static void main(String[] args)
	{
		String[] names={"Dyamanna","Dada","Basavaaraaj","Shashi"};
		Jail jail=new Jail("Sachin in incharge");
		jail.salary=1250;
		jail.noOfGates=10;
		jail.setnoOfCells(20);
		jail.setStaffNames(names);
		jail.setPrint();
		System.out.println("=========================================");
	
	    String[] names1={"SI","DSP","IAS","IPS"};
		Jail jail1=new Jail("Ningappa in incharge",55,66);
		jail1.salary=1250;
		//jail1.noOfGates;
		//jail1.setnoOfCells();
		jail1.setStaffNames(names1);
		jail1.setPrint();
		System.out.println("=========================================");
	
	
	}
	
}
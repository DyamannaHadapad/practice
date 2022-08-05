class PoliceStationRunner{
	public static void main(String [] args)
	{
		String[] names={"Dyamann","Nandish","Santossh"};
		PoliceStation policeStation=new PoliceStation(names);
		//policeStation.name;
		policeStation.inspectorName="Agni";
		policeStation.setnoOfStaffs(20);
	//	policeStation.kaidiNames(names);
		
		
	   policeStation.setPrint();
	}
}
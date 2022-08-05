	class BusStopRunner{
	
	public static void main (String [] args) {
		String[] names={"Dyamanna","Dadasaheb","Basavaraj","Shiva"};
		double[] times1={6d,7d,8d,9d,10d};
		BusStop busStop=new BusStop(names,20);
		busStop.setStartingPoint("JP NAGAR");
		busStop.setEndPoint("MEJESTIC");
		//busStop.totalBench();
		busStop.timeOfArrival=times1;
		busStop.setPrint();
		
		
		System.out.println("=========================================");
	
		
		String[] names1={"Dyamanna","Dadasaheb","Basavaraj","Shiva"};
		double[] times={6d,7d,8d,9d,10d};
		BusStop busStop1=new BusStop(names1,times,30);
		busStop1.setStartingPoint("JP NAGAR");
		busStop1.setEndPoint("MEJESTIC");
		//busStop.totalBench();
		busStop1.timeOfArrival=times;
		busStop1.setPrint();
	}
}
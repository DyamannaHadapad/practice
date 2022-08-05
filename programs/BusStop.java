/*BusStop : stopName(String),startingPoint(String),endPoint(String),totalBench(int),passengerNames(String[]),timeOfArrival(double[])
 properties init using methods
 properties init using constructor
printData();*/

class BusStop{//BluePrint,non-premitive datatype,desing,className
	
	String stopName="BTM";//litrals
	String startingPoint;//method
	String endPoint;//method
	int totalBench;//reference
	String[] passengerNames;//constructor
	double[] timeOfArrival;//constructor
	
	BusStop(String [] passengerNames,int totalBench){//SpecialMethod
		this.passengerNames=passengerNames;
		this.totalBench=totalBench;
	}
	BusStop(String [] passengerNames,double[] timeOfArrival,int totalBench){//SpecialMethod
		this(passengerNames,totalBench);
		this.timeOfArrival=timeOfArrival;
	}
	
	void setStartingPoint(String startingPoint){//method
		this.startingPoint=startingPoint;
	}	
	void setEndPoint(String endPoint){//method
		this.endPoint=endPoint;
	}
	void setPrint()//method
	{
		System.out.println(this.stopName);
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.totalBench);
		for(int i=0;i<this.passengerNames.length; i++)
		{
		System.out.println(this.passengerNames[i]);
		}
		
			for(int i=0;i<this.timeOfArrival.length; i++)
			{
			System.out.println(this.timeOfArrival[i]);
			}
    }

}
class TrainerRunner{
	public static void main (String [] args){
	String [] eqp={"Dumbbells","Singlebar","doubleBar","weight","Speaker","mirror"};
		
	
		Trainer trainer=new Trainer("Dada",Gender.MALE,28);
		trainer.setContactNo(9880455468l);
		trainer.setExp(3.8d);
		Gym gym=new Gym();
		gym.setMethod("Fitness",2000d,eqp,trainer);
	    gym.printData();
	}		
}
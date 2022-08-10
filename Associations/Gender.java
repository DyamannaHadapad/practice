 /*Gym : name,fees, equipments;
 trainer(class);
printData()--> this.trainer.printData();
 
Trainer : name,contactNo,exp,gender(enum),age
printData()

Hospital: name,specialization(enum),equipments([]),
consultationFees,Founder
printData();-->this.founder.printData();

Founder : name,from,profession(enum with String const),since,alive,income
printData();*/



enum Gender
{
	MALE('M'),FEMALE('F'),OTHER('O');
	char value;
	Gender(char value)
	{
		this.value=value;
	}
}
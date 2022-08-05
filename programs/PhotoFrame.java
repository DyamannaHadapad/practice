class PhotoFrame{
	
	int size;
	PhotoFrameMaterial material;
	String shape;
	double price;
	int warrenty;
	PhotoFrameColor[] color;
	
	PhotoFrame(int size,double price,int warrenty)
	{
		this.size=size;
		this.price=price;
		this.warrenty=warrenty;
	}
	
	void setShape(String shape){
		this.shape=shape;
	}
	void setColor(PhotoFrameColor[] color){
		this.color=color;
	}
	void setMaterial(PhotoFrameMaterial material){
		this.material=material;
	}
	void setPrintData(){	
		System.out.println(this.size);
		System.out.println(this.material);
		System.out.println(this.shape);
		for(int i=0; i<this.color.length; i++){
			
			System.out.println(this.color[i]);
		}
		System.out.println(this.price);
		System.out.println(this.warrenty);	  
	}
}
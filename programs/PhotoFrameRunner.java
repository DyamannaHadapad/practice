class PhotoFrameRunner
{
	public static void main(String [] args)
	{
		int a=10;
	  PhotoFrame photoFrame=new PhotoFrame(a,200d,2023);
	  
	  photoFrame.setShape("Square");
	  PhotoFrameColor[] colors={PhotoFrameColor.BLACK,PhotoFrameColor.BLUE,PhotoFrameColor.RED,PhotoFrameColor.ORENGE};
	  photoFrame.setColor(colors);
	  photoFrame.setMaterial(PhotoFrameMaterial.ALUMINIUM);
	  photoFrame.setPrintData();
	}
}
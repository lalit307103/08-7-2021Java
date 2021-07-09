package com.demo.traininfo;
public abstract class TrainInfo {
	//properties
	private String source;
	private String dest;
	public  String name_train;
	public int distance;
	public final float MIN_CHGS=25.75f;
	 
	public TrainInfo(){}
		public TrainInfo(String src,String dest,String name,int dist){
			 source = src;
			 this.dest= dest;
			 name_train=name;
			 distance= dist;
		 }
	public void dispTrainDetail() {
		 System.out.println("train data is"+name_train +""+source+""+dest+""+distance);
	 }
public abstract int calcFare();

}

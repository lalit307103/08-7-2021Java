package com.demo.passanger;

import com.demo.traininfo.TrainInfo;

public class PassangerTrain extends TrainInfo{
	final float RATE_PER_KM=2.5f;
	public PassangerTrain(){}
	
	public PassangerTrain(String source,String dest,String name_train,int distance){
		super(source,dest,name_train,distance);
		
	}
	public int calcFare() {
		int fare=(int)((RATE_PER_KM*distance)+MIN_CHGS);  //type casting into int
		return fare;
	}
	
	

}

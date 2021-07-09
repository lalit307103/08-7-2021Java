package com.demo.passenger;

import com.demo.traininfo.TrainInfo;

public class PassengerTrain extends TrainInfo{
final float  RATE_PER_KM=2.5f;
public PassengerTrain(){}
public PassengerTrain(String src,String dest,String name,int dist){
super(src,dest,name,dist);
}
public int calcFare() {
	//int fare = (int)((RATE_PER_KM * distance)+MIN_CHGS);
	//return fare;
	return (int)((RATE_PER_KM * distance)+MIN_CHGS);
}
}

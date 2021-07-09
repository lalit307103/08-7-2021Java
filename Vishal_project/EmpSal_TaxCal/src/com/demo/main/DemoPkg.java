package com.demo.main;

import com.demo.passenger.PassengerTrain;
import com.demo.traininfo.TrainInfo;

public class DemoPkg {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
    TrainInfo ti = new PassengerTrain("pune","mum","pune-mum",130);
	ti.dispTrainDetail();  
	System.out.println("train fare for the train  "+ti.name_train+""+ti.calcFare() );
	}

}

 
public class TrainFairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TrainFair tf;
     
     PassTrain pt=new PassTrain("Ordinary",150,"Vishal");
     
     tf=pt;
     tf.calTrFair();
     
     ExpTrain er=new ExpTrain("Express Geetanjali",210,"Lallit");
     tf=er;
     tf.calTrFair();
     
	}

}

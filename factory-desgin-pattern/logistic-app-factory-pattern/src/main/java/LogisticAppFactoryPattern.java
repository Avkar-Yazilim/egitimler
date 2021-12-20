import tr.com.avkaryazilim.logisticapp.transportation.logisticfactory.Logistic;
import tr.com.avkaryazilim.logisticapp.transportation.logisticfactory.RoadLogistic;
import tr.com.avkaryazilim.logisticapp.transportation.logisticfactory.SeaLogistic;

public class LogisticAppFactoryPattern {

	public static void main(String[] args) {

		Logistic logistic = new RoadLogistic();
		logistic.planDelivery();

		logistic = new SeaLogistic();
		logistic.planDelivery();
	}
}

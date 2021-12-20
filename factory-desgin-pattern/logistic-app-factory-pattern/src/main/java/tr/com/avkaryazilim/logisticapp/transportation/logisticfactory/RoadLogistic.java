package tr.com.avkaryazilim.logisticapp.transportation.logisticfactory;

import tr.com.avkaryazilim.logisticapp.transportation.Transport;
import tr.com.avkaryazilim.logisticapp.transportation.Truck;

public class RoadLogistic extends Logistic {

	@Override
	Transport createTransport() {

		return new Truck();
	}

}

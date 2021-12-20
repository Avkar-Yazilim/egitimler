package tr.com.avkaryazilim.logisticapp.transportation.logisticfactory;

import tr.com.avkaryazilim.logisticapp.transportation.Ship;
import tr.com.avkaryazilim.logisticapp.transportation.Transport;

public class SeaLogistic extends Logistic {

	@Override
	Transport createTransport() {

		return new Ship();
	}

}

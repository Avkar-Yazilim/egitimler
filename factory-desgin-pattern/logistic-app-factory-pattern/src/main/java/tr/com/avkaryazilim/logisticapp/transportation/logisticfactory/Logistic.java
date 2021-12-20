package tr.com.avkaryazilim.logisticapp.transportation.logisticfactory;

import tr.com.avkaryazilim.logisticapp.transportation.Transport;

public abstract class Logistic {

	public void planDelivery() {
		Transport t = createTransport();
		t.deliver();
	}

	abstract Transport createTransport();
}

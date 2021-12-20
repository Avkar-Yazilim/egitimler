package tr.com.avkaryazilim.factorymethod;

import tr.com.avkaryazilim.factorymethod.creator.DrivingLicenceCreator;
import tr.com.avkaryazilim.factorymethod.license.DrivingLicence;
import tr.com.avkaryazilim.factorymethod.license.LicenceTypes;

public class SimpleFactoryPatternDemo {

	public static void main(String[] args) {
		DrivingLicenceCreator drivingLicenceCreator = new DrivingLicenceCreator();

		DrivingLicence licence = drivingLicenceCreator.createLicence(LicenceTypes.AClass);
		licence.drive();

		licence = drivingLicenceCreator.createLicence(LicenceTypes.EClass);
		licence.drive();

	}

}

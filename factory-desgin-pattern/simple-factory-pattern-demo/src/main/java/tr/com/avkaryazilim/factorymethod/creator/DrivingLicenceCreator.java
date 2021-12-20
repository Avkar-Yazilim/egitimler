package tr.com.avkaryazilim.factorymethod.creator;

import tr.com.avkaryazilim.factorymethod.exception.LicenceTypeIsNotSupportedException;
import tr.com.avkaryazilim.factorymethod.license.AClassDrivingLicence;
import tr.com.avkaryazilim.factorymethod.license.BClassDrivingLicence;
import tr.com.avkaryazilim.factorymethod.license.DrivingLicence;
import tr.com.avkaryazilim.factorymethod.license.EClassDrivingLicence;
import tr.com.avkaryazilim.factorymethod.license.LicenceTypes;

public class DrivingLicenceCreator {

	public DrivingLicence createLicence(LicenceTypes licenceType) throws LicenceTypeIsNotSupportedException {
		DrivingLicence drivingLicence;
		switch (licenceType) {
		case AClass:
			drivingLicence = new AClassDrivingLicence();
			break;
		case BClass:
			drivingLicence = new BClassDrivingLicence();
			break;
		case EClass:
			drivingLicence = new EClassDrivingLicence();
			break;
		default:
			throw new LicenceTypeIsNotSupportedException(String.format("%s type licence is not supported!", licenceType.toString()));
		}
		return drivingLicence;
	}
}

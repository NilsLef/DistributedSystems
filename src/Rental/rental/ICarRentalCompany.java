package Rental.rental;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ICarRentalCompany extends Remote {
		
	public String getName() throws RemoteException; 
	
    public List<String> getRegions() throws RemoteException;
    
    public boolean hasRegion(String region) throws RemoteException;
    
	public Collection<CarType> getAllCarTypes() throws RemoteException;
	
	public CarType getCarType(String carTypeName) throws RemoteException;
	
	public boolean isAvailable(String carTypeName, Date start, Date end) throws RemoteException;
	
	
	public Set<CarType> getAvailableCarTypes(Date start, Date end) throws RemoteException;
	
	
	public Quote createQuote(ReservationConstraints constraints, String client) throws RemoteException, ReservationException;
	
	
	public Reservation confirmQuote(Quote quote) throws RemoteException, ReservationException;
	
	public void cancelReservation(Reservation res) throws RemoteException;
	
	public List<Reservation> getReservationsByRenter(String clientName) throws RemoteException;
	
	public int getNumberOfReservationsForCarType(String carType) throws RemoteException;
	
	
	
	



	
}

package com.airlinereservation;
import java.util.*;

class User {
	private  String name;
	private String emailId;
	private String mobNumber;
	public User(String name, String emailId, String mobNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobNumber = mobNumber;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", mobNumber=" + mobNumber + "]";
	}
}
	class Flights{
		private String flightNumber;
		private int availableSeats;
		private int totalSeats;
		public Flights(String flightNumber, int availableSeats, int totalSeats) {
			this.flightNumber = flightNumber;
			this.availableSeats = availableSeats;
			this.totalSeats = totalSeats;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void reserveSeat() {
			if(availableSeats>0) {
				availableSeats--;
				System.out.println("Seat is reserved");
			}else
				System.out.println("no seat available");
		}
		
		public void cancelSeat() {
			if(availableSeats<totalSeats) {
				availableSeats++;
				System.out.println("seat is cancelled");
			}else
				System.out.println("You haven't reserved a seat");
		}
		@Override
		public String toString() {
			return "Flights [flightNumber=" + flightNumber + ", availableSeats=" + availableSeats + ", totalSeats="
					+ totalSeats + "]";
		}
	}
	class AirlineManagementSystem{
			private static final int nofUsers=10;
			private static final int nofFlights=5;
			private static User[] user=new User[nofUsers];
			private  static Flights[] flights=new Flights[nofFlights];
			private  static int userCount=0;
			private  static int FlightCount=0;
			private  static Scanner sc=new Scanner(System.in);
			
			public static void main(String[] args) {
				initializeFlights();
				while(true) {
					 	System.out.println("1. Register User");
			            System.out.println("2. View Flights Availability");
			            System.out.println("3. Reserve a Seat");
			            System.out.println("4. View Reservations");
			            System.out.println("5. Cancel Reservation");
			            System.out.println("6. Exit");
			            System.out.print("Enter your choice: ");
			            int choice = sc.nextInt();
			            sc.nextLine();
			            switch (choice) {
						case 1:
							registerUser();
							break;
						case 2:
							viewFlights();
							break;
						case 3:
							reserveFlight();
							break;
						case 4:
							viewReservation();
							break;
						case 5:
							cancelReservation();
							break;
						case 6:
							System.out.println("Thanks visit agains...");
							System.exit(0);

						default:
							System.out.println("Invalid choice. Please try again.");
						}
				}
			}
			 private static void initializeFlights() {
			        flights[0] = new Flights("FL001", 5, nofFlights); 
			        flights[1] = new Flights("FL002", 5, nofFlights); 
			        flights[2] = new Flights("FL003", 5, nofFlights); 
			        flights[3] = new Flights("FL004", 5, nofFlights); 
			        flights[4] = new Flights("FL005", 5, nofFlights); 
			    }
			
			private static void registerUser() {
				if(userCount<nofUsers) {
					System.out.print("Enter user name: ");
					String name=sc.next();
					System.out.print("Enter user email Id: ");
					String mailId=sc.next();
					System.out.print("Enter user contact number: ");
					String number=sc.next();
					
					user[userCount++]=new User(name, mailId, number);
					System.out.println("User registered successfully.");
					System.out.println(user[userCount-1]);
				}else
					System.out.println("user registration is full.");
			}
			
			private static void reserveFlight() {
				System.out.println("Enter flight number:		");
				String flightNumber=sc.next();
				Flights flight=findFlight(flightNumber);
				if(flight!=null) {
					flight.reserveSeat();
				}else
					System.out.println("Flightnumber not matched");
				
			}
			
			private static void cancelReservation() {
				System.out.print("Enter flight number:	");
				String flightNumber=sc.next();
				Flights flight=findFlight(flightNumber);
				if(flight!=null) {
					flight.cancelSeat();
				}else
					System.out.println("Flightnumber not matched");
			}
			
			private static void viewFlights() {
				System.out.println("Available flights are :	");
				for(int i=0; i<nofFlights;  i++) {
					System.out.println(flights[i]);
				}			
			}
			
			private static void viewReservation() {
				System.out.print("Enter flight number:		");
				String flightNumber=sc.next();
				Flights flight=findFlight(flightNumber);
				if(flight!=null) {
					if(nofFlights-flight.getAvailableSeats()>=0)
						System.out.println(flight);
				}else
					System.out.println("Flightnumber not matched");
				}
			private static Flights findFlight(String flightNumber) {
					for(Flights flight: flights) {
						if(flights!=null && flight.getFlightNumber().equals(flightNumber)) {
							return flight;
						}else
							flight=null;					
					}	
					return null;
			}
			
		
		
		
		
	}


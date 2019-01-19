
public enum Day { 
	
	// Enumeration de constantes pour lesquelles on va pouvoir associer des elements
	
	MATIN(8,"se lever"),
	MIDI(12,"manger"),
	APREMIDI(15,"faire du sport"),
	SOIR(22,"se coucher"),
	NUIT(2,"rever");
	
	private int hour;
	private String message;
	
	

	private Day(int hour, String message) {
		this.hour = hour;
		this.message = message;
	}

	public int getHour() {
		return hour;
	}

	public String getMessage() {
		return message;
	}
	
	
	

}

//Reagan Chapple
public class TimeConverter {

	private int hours;
	private int minutes;
	private int seconds;
	private String notPM;
	
	//default constructors
	public TimeConverter() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = "true";
	}
	
	//parameterized
	public TimeConverter(int xhours, int xminutes, int xseconds) {
		this.sethours(xhours);
		this.setminutes(xminutes);
		this.setseconds(xseconds);
	}
	
	//accessors
	public int gethours() {
		return this.hours;
	}
	public int getminutes() {
		return this.minutes;
	}
	public int getseconds() {
		return this.seconds;
	}
	
	//mutators
	public void sethours(int xhours) {
		if (xhours >= 0 || xhours <= 24) {
			this.hours = xhours;
		}
		else {
			System.out.println("Invalid hour");
		}
	}
	public void setminutes(int xminutes) {
		if(xminutes >= 0 || xminutes <= 59) {
			this.minutes = xminutes;
		}
		else {
			System.out.println("Invalid minutes");
		}
	}
	public void setseconds(int xseconds) {
		if(xseconds >= 0 || xseconds <= 59) {
			this.seconds = xseconds;
		}
		else {
			System.out.println("Invalid seconds");
		}
	}
	
	//time updater
	public void updateTime(int xhours, int xminutes, int xseconds) throws TimeException {
		//checks to see if time is valid
		if(xhours <= 24 && xhours >= 0) {
			//converting hours from 24 to AM PM		minutes and seconds do not need be to converted
			if(xhours >= 12) {
				this.notPM = "PM";
				xhours = xhours - 12;
			}
			else if(xhours < 12) {
				this.notPM = "AM";
			}
			this.hours = xhours;
			this.minutes = xminutes;
			this.seconds = xseconds;
			}
		else {
			throw new TimeException();
		}
	}
	
	//overloading method
	public void updateTime(String time) throws TimeException{
		String hours = time.substring(0,2);
		String minutes = time.substring(3,5);
		String seconds = time.substring(6,8);
		this.hours = Integer.parseInt(hours);
		this.minutes = Integer.parseInt(minutes);
		this.seconds = Integer.parseInt(seconds);
		if(this.hours <= 24 || this.hours >= 0) {
			if(this.hours >= 12) {
				this.notPM = "PM";
				this.hours = this.hours - 12;
			}
			else if(this.hours < 12) {
				this.notPM = "AM";
			}
		}
			
		else {
			throw new TimeException();
		}
	}
	
	//write out
	//public void writeOutput() {
	public String toString() {
		//System.out.println
		return(this.hours+":"+this.minutes+":"+this.seconds+"	"+this.notPM);
	}
}

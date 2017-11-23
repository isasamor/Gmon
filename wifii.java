package aaa;

public class wifii {
	String Time, ID, Lat, Lon, Alt , SSID , MAC;
	int frequncy,signal;
	//constructor
	public wifii(String Time,String ID,String Lat,String Lon,String Alt,String SSID,String MAC,int frequncy,int signal) {
		this.Time= Time;
		this.ID = ID;
		this.Lat = Lat;
		this.Lon = Lon;
		this.Alt = Alt;
		this.SSID = SSID;
		this.MAC = MAC;
		this.frequncy = frequncy;
		this.signal = signal;
	}
	public wifii() {
		
	}
	public String toString() {
		return "time ="+Time+", "+"id ="+ID+", lat ="+Lat+", "+", lon ="+Lon+",  alt="+Alt+", ssid= "
				+ ""+SSID+", mac= "+MAC+", "+", frequncy ="+
	frequncy+", signal ="+signal;
		
	}//copy constructor
	public wifii(wifii other) {
		this.Time = other.Time;
		this.ID = other.ID;
		this.Lat = other.Lat;
		this.Lon = other.Lon;
		this.Alt = other.Alt;
		this.SSID = other.SSID;
		this.MAC = other.MAC;
		this.frequncy = other.frequncy;
		this.signal = other.signal;
		
		
	}
	//------------------------- Getters & Setters
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
	public String getLon() {
		return Lon;
	}
	public void setLon(String lon) {
		Lon = lon;
	}
	public String getAlt() {
		return Alt;
	}
	public void setAlt(String alt) {
		Alt = alt;
	}
	public String getSSID() {
		return SSID;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
	}
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public int getFrequncy() {
		return frequncy;
	}
	public void setFrequncy(int frequncy) {
		this.frequncy = frequncy;
	}
	public int getSignal() {
		return signal;
	}
	public void setSignal(int signal) {
		this.signal = signal;
	}

}

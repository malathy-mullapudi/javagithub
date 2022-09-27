package InheritanceConcepts;

public class LampInheritance {
	boolean isOn;
	 
	void lampIsOn() {
		isOn = true;
		System.out.println("lamp is on:"+ isOn);
	}
	void lampIsOff() {
		isOn =false;
		System.out.println("lamp is off:" +isOn);
	}

	public static void main(String[] args) {
		LampInheritance led = new LampInheritance();
		led.lampIsOn();
		led.lampIsOff();
		
	}

}

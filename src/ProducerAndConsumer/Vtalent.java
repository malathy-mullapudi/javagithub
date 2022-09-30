package ProducerAndConsumer;

class Vtalent {

private int Courses;
private boolean availability = false;
public synchronized int get(){
	while(availability==false) {
		try {
			wait();
		}catch(Exception ie) {}
	}
	availability=false;
	notifyAll();
	return Courses;
}
public synchronized void put(int value) {
	while(availability==true) {
		try {
			wait();
		}catch(Exception ie) {}
	}
	Courses = value;
	availability = true;
	notifyAll();
	
}
}

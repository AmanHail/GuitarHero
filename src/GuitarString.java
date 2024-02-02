
public class GuitarString {
	double freq;
	RingBuffer str;
	public GuitarString(double frequency) {
		freq = frequency;
	}
	public GuitarString(double[] init) {
		str = new RingBuffer(init.length);
		for (int i = 0; i<init.length; i++) {
			str.enqueue(i);
		}
	}
	public int length() {
		return str.size;
	}
	public void pluck(int n) {
		
	}
	public void tic() {
		
	}
	public double sample() {
		
	}
	public static void main(String[] args) {
		
	}

}

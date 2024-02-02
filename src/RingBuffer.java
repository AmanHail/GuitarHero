import java.util.ArrayList;

public class RingBuffer {
	
	int size;
	double[] buff;
	public RingBuffer(int capacity) {
		buff = new double[capacity];
		size = 0;
	}
	public int capacity() {
		return buff.length;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size == buff.length;
	}
	public void enqueue(double x) {
		if (isFull()) {
			throw new RuntimeException("NOOOOOOO");
		}
		buff[size] =x;
		size++;
	}
	public double dequeue() {
		if (size==0 || isFull()) {
			throw new RuntimeException("nuh uh");
		}
		double temp = buff[0];
		for (int i = 1; i<size; i++) { 
			buff[i-1] = buff[i];
		}
		buff[size]=0;
		size--;
		return temp;
	}
	public double peek() {
		if (size==0 || isFull()) {
			throw new RuntimeException("nuh uh");
		}
		return buff[0];
	}
	public static void main(String[] args) {
		
	}
}

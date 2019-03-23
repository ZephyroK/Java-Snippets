package concurrency;

public class IncrementerThread extends Thread {
    private CounterAtomic counter;

    public IncrementerThread(CounterAtomic counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
	    counter.increment();
	}
    }

    public static void main(String[] args) throws Exception {
        CounterAtomic counter = new CounterAtomic();
	IncrementerThread it1 = new IncrementerThread(counter);
	IncrementerThread it2 = new IncrementerThread(counter);

	it1.start();
	it2.start();
	it1.join();
	it2.join();
	System.out.println(counter.getValue());
    }
}

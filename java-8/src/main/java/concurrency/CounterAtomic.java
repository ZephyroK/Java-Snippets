package concurrency;

import java.util.concurrent.atomic.*;

public class CounterAtomic {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.getAndIncrement();
    }

    public int getValue() {
        return count.intValue();
    }
}

package concurrency;

import java.util.*;
import java.util.concurrent.*;
public class Bovines {
  public static void main(String[] args) throws InterruptedException {
    List<StringBuilder> c = new CopyOnWriteArrayList<>(
      Arrays.asList(new StringBuilder("1"), new StringBuilder("2"),
                      new StringBuilder("3"), new StringBuilder("4")));
    new Thread(new Runnable() {
      public void run() {
        try {
          Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("got exc");
        }
        c.get(3).replace(0,1,"four");
        System.out.print(c + " ");
      }  
     }).start();
     for(StringBuilder s: c) {
       System.out.print(s + " ");
       Thread.sleep(100);
} } }


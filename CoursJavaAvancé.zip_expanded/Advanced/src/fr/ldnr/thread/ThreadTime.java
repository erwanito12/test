package fr.ldnr.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Thread thread = new Thread(new MonRunnable(1000));

    System.out.println(df.format(new Date()));

    thread.start();
  }

  private static class MonRunnable implements Runnable {

    private long delai;

    public MonRunnable(long delai) {
      this.delai = delai;
    }

    @Override
    public void run() {
      try {
        Thread.sleep(delai);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
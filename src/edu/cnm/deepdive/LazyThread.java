package edu.cnm.deepdive;

public class LazyThread extends Thread {

  @Override
  public void run() {
    Utility.takeNap(10_000);
  }
}

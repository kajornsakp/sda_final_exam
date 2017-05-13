package com.company.bridge;

public class WrapScreen extends DrawingService {

  private Screen monitor;

  public WrapScreen() {
    monitor = Screen.getMonitor();
  }

  public void drawLine(int x1, int y1, int x2, int y2) {
    monitor.draw_a_line(x1, y1, x2, y2);
  }

  public void drawCircle(int x, int y, int r) {
    monitor.draw_a_circle(x, y, r);
  }

    @Override
    public void drawPixel(int x, int y) {
        System.out.println("draw pixel");
    }

}

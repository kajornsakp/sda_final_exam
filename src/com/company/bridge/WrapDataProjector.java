package com.company.bridge;

public class WrapDataProjector extends DrawingService {

  private XMLWriter data_projector;

  public WrapDataProjector() {
    data_projector = XMLWriter.getDataProjector();
  }

  public void drawLine(int x1, int y1, int x2, int y2) {
    data_projector.drawLine(x1, y1, x2, y2);
  }

  public void drawCircle(int x, int y, int r) {
    data_projector.drawCircle(x, y, r);
  }

    @Override
    public void drawPixel(int x, int y) {
        System.out.println("draw pixel");
    }

}

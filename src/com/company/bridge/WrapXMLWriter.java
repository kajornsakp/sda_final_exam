/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company.bridge;

/**
 *
 * @author ShubU
 */
public class WrapXMLWriter extends DrawingService{

    private XMLWriter printer;
    public WrapXMLWriter(){
        printer = XMLWriter.getDataProjector();
    }
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("XML draw line");
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        System.out.println("XML draw circle");
    }

    @Override
    public void drawPixel(int x, int y) {
        System.out.println("XML draw pixel");
    }
    
}

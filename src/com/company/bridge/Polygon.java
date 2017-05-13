/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company.bridge;

import java.util.ArrayList;

/**
 *
 * @author ShubU
 */
public class Polygon extends Shape {
    private int x2;
    private int x3;
    private int y2;
    private int y3;
    private ArrayList<Integer> listxy;
    
    public Polygon(ArrayList<Integer> listxy){

        super(listxy.get(0),listxy.get(1));
        this.listxy = listxy;
    }
    @Override
    public void draw() {
        for (int i = 0 ; i < listxy.size()-3; i++){
            draw.drawLine(listxy.get(i), listxy.get(i+1),listxy.get(i+2),listxy.get(i+3));
        }

        draw.drawLine(listxy.get(listxy.size() - 2), listxy.get(listxy.size() - 1), listxy.get(0), listxy.get(1));

    }
    
}


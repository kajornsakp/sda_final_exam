/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.visitor;

/**
 *
 * @author ShubU
 */
class CarElementPrintVisitor implements CarElementVisitor {

    public CarElementPrintVisitor() {
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }
    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }
    
}



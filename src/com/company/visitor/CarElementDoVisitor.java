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
class CarElementDoVisitor implements CarElementVisitor {

    public CarElementDoVisitor() {
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Waxing my body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}



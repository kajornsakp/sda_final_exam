/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.state;


/**
 *
 * @author ShubU
 */
public class Lock implements State{
    
    RemoteDevice remote;
    
    public Lock(RemoteDevice remote){
        this.remote = remote;
    }

    @Override
    public boolean pressPlay() {
        System.out.println("it's locked");
        return false;
    }

    @Override
    public boolean pressPause() {
        System.out.println("it's locked");
        return false;
    }

    @Override
    public boolean pressStop() {
        System.out.println("it's locked");
        return false;
    }

    @Override
    public boolean pressRewind() {
        System.out.println("it's locked");
        return false;
    }

    @Override
    public boolean pressLock() {
        remote.setState(remote.getLastState());
        return false;
    }
    
    
    
}

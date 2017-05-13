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
public class Rewind implements State {
    
    private RemoteDevice remote;
    
    public Rewind(RemoteDevice remote){
        this.remote = remote;
    }
    
    public boolean pressPlay(){
        remote.pressPlay();
        return true;
    }
    
    public boolean pressStop(){
        System.out.println("Cannot stop from rewind");
        return false;
    }
    
    public boolean pressPause(){
        System.out.println("Cannot pause from rewind");
        return false;
    }
    
    public boolean pressRewind(){
        System.out.println("Already rewinded");
        return false;
    }

    @Override
    public boolean pressLock() {
        this.remote.setState(this.remote.getLockState());
        System.out.println("lock");
        return true;
    }
    
    
    
}

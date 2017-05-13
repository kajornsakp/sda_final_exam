
package com.company.state;


/**
 * RemoteDevice.java
 *
 * This is the device that we are controlling with the
 * State pattern.
 */

public class RemoteDevice {
	// the different states the device may be in
	private State playing;
	private State paused;
	private State stopped;
        private State rewind;
        private State lock;

	//the current com.company.state of the player
	private State currentState;
        private State lastState;
	
	/**
	 * the current position of the media
	 * this may be 0 (the beginning of the media)
	 * up to some int value representing  the end of the media
	 */
	private int currentPosition; 

	// initialize the remote device	
	public RemoteDevice() {
		playing = new Playing(this);
		paused = new Paused(this);
		stopped = new Stopped(this);
                rewind = new Rewind(this);
                lock = new Lock(this);
                
		// initial com.company.state is stopped
		currentState = stopped;

		// we are at the beginning of the media
		currentPosition = 0;
	}

	// set the com.company.state of the device
	public void setState(State currentState) {
		this.currentState = currentState;
	}

	// set the position of the media	
	public void setPosition(int position) {
		currentPosition = position;
	}

	// get the current position of the media	
	public int getPosition() {
		return currentPosition;
	}

	// press the Play button	
	public void pressPlay() {
		currentState.pressPlay();
	}
	
	// press the Pause button	
	public void pressPause() {
		currentState.pressPause();
	}
        
        public void pressRewind() {
            currentState.pressRewind();
        }
        
        public void pressLock() {
            lastState = currentState;
            currentState.pressLock();
            
        }
        
        public State getLastState(){
            return this.lastState;
        }
     
	// press the Stop button	
	public void pressStop() {
		currentState.pressStop();
	}
        
        public State getRewindState() {
            return rewind;
        }

	// return the playing com.company.state
	public State getPlayingState() {
		return playing;
	}
        
        public State getLockState(){
            return lock;
        }
	
	// return the paused com.company.state
	public State getPausedState() {
		return paused;
	}
	
	// return the stopped com.company.state
	public State getStoppedState() {
		return stopped;
	}
}

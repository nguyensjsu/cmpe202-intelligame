public interface IGameState
 {
	 
	public abstract void setStateStart();
	public abstract void setStateRunning();
	public abstract void setStatePaused();
	public abstract void setStateStopped();
	public abstract void setStateGameOver();
	public abstract void setStateLevelComplete();

}
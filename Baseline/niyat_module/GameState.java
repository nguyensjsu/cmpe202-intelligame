public class GameState implements IGameState {
 
	GameManager game_manager;
	 
	public GameState(GameManager gm) {
        game_manager = gm ;
	}

	public void setStateStart() {
        System.out.println( "Start is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateRunning() {
        System.out.println( "Game Running is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStatePaused() {
        System.out.println( "Paused is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateStopped() {
        System.out.println( "Stopped is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateGameOver() {
        System.out.println( "Game Over is not valid in " + this.getClass().getName() + " state." );
	}

	public void setStateLevelComplete() {
        System.out.println( "Level Complete is not valid in " + this.getClass().getName() + " state." );
	}
	 
}
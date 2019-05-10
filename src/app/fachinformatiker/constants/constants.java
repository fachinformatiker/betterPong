package app.fachinformatiker.constants;

public interface constants {
    boolean MOVE_BALL_UP = false;
    boolean MOVE_BALL_RIGHT = false;

    String BETTER_PONG = "betterPONG";
    String BATTLE_ROYAL = "Battle Royal";
    String CREDITS = "Credits";

    String LANGUAGE = "en";

    int WIDTH = 1024;
    int HEIGHT = 768;
    int POS_Y_BALL = 612;
    int POS_X_BALL = 384;
    int PADDLE_WIDTH = 100;
    int PADDLE_HEIGHT = 15;
    boolean GAME_STARTED = false;
    int POS_Y_PLAYER_ONE = HEIGHT / 2;
    int POS_Y_PLAYER_TWO = HEIGHT / 2;
    int POS_X_PLAYER_ONE = 0;
    int POS_X_PLAYER_TWO = WIDTH - PADDLE_WIDTH;
    int BALL = 15;
    int BALL_Y_SPEED = 1;
    int BALL_X_SPEED = 1;
    int SCORE_PLAYER_ONE = 0;
    int SCORE_PLAYER_TWO = 0;
}

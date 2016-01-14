package se.milad;

/**
 * Created by MILAD on 2016-01-14.
 */
public enum playerChar {
    players ('X', 'O');

    char x_;
    char o_;


    playerChar(char x, char o) {

        x_ = x;
        x_ = o;

    }

    public char getX() {
        return x_;
    }

    public char getO() {
        return o_;
    }
}

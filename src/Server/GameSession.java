package Server;

public class GameSession {
    private final char[] state = new char[9];

    GameSession() {
        /* initialize state */
        for (int i = 0; i < 9; i++)
            state[i] = ' ';
    }

    public boolean changeState(int idx, char c) {
        state[idx] = c;
        return checkEnd();
    }

    private boolean checkEnd() {
        // check each row
        for (int i = 0; i < 3; i++) {
            if (state[i * 3] == state[i * 3 + 1] && state[i * 3 + 2] == state[i * 3])
                return true;
        }

        // check each col
        for (int i = 0; i < 3; i++) {
            if (state[i] == state[i + 3] && state[i + 6] == state[i])
                return true;
        }

        // check each diagonal
        if (state[0] == state[4] && state[4] == state[8])
            return true;
        if (state[2] == state[4] && state[4] == state[6])
            return true;

        return false;
    }
}

import java.util.Random;

public class Symbol {

    protected char getSymbol(char characterSet[]) {
        char symbolForPassword = ' ';

        symbolForPassword = characterSet[getRandomNumber(characterSet.length)];

        return symbolForPassword;
    }

    protected int getRandomNumber(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }
}

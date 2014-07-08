import java.util.Random;

public class PasswordGenerator {

    private final String passwordMask;
    private char smallSymbols[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'k', 'm', 'n',
            'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char numberSymbols[] = new char[]{'2', '3', '4', '5', '6', '7', '8', '9'};

    public PasswordGenerator(String passwordMask) {
        this.passwordMask = passwordMask;
    }

    public String getNewPassword() {

        String newPassword = "";

        for (int i = 0; i < passwordMask.length(); i ++) {
            newPassword += getSymbolForPassword(passwordMask.charAt(i));
        }

        return newPassword;
    }

    private char getSymbolForPassword(char codeFromPasswordMask) {
        char symbolForPassword = ' ';

        if (codeFromPasswordMask == 'c') {
            symbolForPassword = smallSymbols[getRandomNumber(smallSymbols.length)];
        } else if (codeFromPasswordMask == 'n') {
            symbolForPassword = numberSymbols[getRandomNumber(numberSymbols.length)];
        }

        return symbolForPassword;
    }

    private int getRandomNumber(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }
}

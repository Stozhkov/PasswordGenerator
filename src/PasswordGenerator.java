public class PasswordGenerator {

    private final String passwordMask;

    public PasswordGenerator(String passwordMask) {
        this.passwordMask = passwordMask;
    }

    public String getNewPassword() {

        String newPassword = "";

        for (int i = 0; i < passwordMask.length(); i ++) {
            switch (passwordMask.charAt(i)) {
                case 'c': newPassword += new SmallSymbol().getSymbolForPassword(); break;
                case 'C': newPassword += new UpperSymbol().getSymbolForPassword(); break;
                case 'n': newPassword += new NumericSymbol().getSymbolForPassword(); break;
            }
        }

        return newPassword;
    }
}

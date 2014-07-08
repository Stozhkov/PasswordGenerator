public class PasswordGenerator {

    private final String passwordMask;

    public PasswordGenerator(String passwordMask) {
        this.passwordMask = passwordMask;
    }

    public String getNewPassword() {

        String newPassword = "";

        for (int i = 0; i < passwordMask.length(); i ++) {

            if (passwordMask.charAt(i) == 'c') {
                newPassword += new SmallSymbol().getSymbolForPassword();
            } else if (passwordMask.charAt(i) == 'n') {
                newPassword += new NumericSymbol().getSymbolForPassword();
            }  else if (passwordMask.charAt(i) == 'C') {
                newPassword += new UpperSymbol().getSymbolForPassword();
            }
        }

        return newPassword;
    }
}

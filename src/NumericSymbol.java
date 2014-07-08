public class NumericSymbol extends Symbol {
    private char characterSet[] = new char[]{'2', '3', '4', '5', '6', '7', '8', '9'};

    public char getSymbolForPassword() {
        return super.getSymbol(characterSet);
    }
}

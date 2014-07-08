public class UpperSymbol extends Symbol {
    private char characterSet[] = new char[]{   'A', 'B', 'C', 'D', 'E', 'F', 'G',
                                                'H', 'K', 'M', 'N', 'P', 'R', 'S',
                                                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public char getSymbolForPassword() {
        return super.getSymbol(characterSet);
    }
}

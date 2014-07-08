public class SmallSymbol extends Symbol {
    private char characterSet[] = new char[]{   'a', 'b', 'c', 'd', 'e', 'f', 'g',
                                                'h', 'k', 'm', 'n', 'p', 'r', 's',
                                                't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public char getSymbolForPassword() {
        return super.getSymbol(characterSet);
    }
}

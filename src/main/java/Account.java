public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int spaceCount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        if (name.length() >= 3 && name.length() <= 19) {
            if (name.startsWith(" ")) {
                return false;
            } else if (name.endsWith(" ")) {
                return false;
            } else
                return spaceCount == 1;
        }
        return false;
    }
}
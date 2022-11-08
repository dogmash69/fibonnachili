public class Fibonnachilideux {
    public static Character premierUnique(String suite) {
        for (int i = 0; i < suite.length(); i++) {
            if (suite.indexOf(suite.charAt(i)) == suite.lastIndexOf(suite.charAt(i))) {
                return suite.charAt(i);
            }
        }
        return 'x';
    }
}

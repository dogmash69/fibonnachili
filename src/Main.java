public class Main {
    public static Character premierUnique(String suite) {
        while (suite.length()>0) {
            if (suite.substring(1 , suite.length()).contains(""+suite.charAt(0)))
                suite = suite.replace(""+suite.charAt(0) , "");
            else return  suite.charAt(0);
        }
        return null ;
    }
}
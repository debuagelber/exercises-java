import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN
    public static String convertString(String str) {
        return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
    }
    // END
}

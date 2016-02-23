/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Languages;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author prime
 */
public class LocalizationUtil {
    public static ResourceBundle localizedResourceBundle;
    
    static
    {
        // gets the bundle for the default locale used
        localizedResourceBundle = ResourceBundle.getBundle("language_eng", new Locale("en"));
        localizedResourceBundle = ResourceBundle.getBundle("language_hebrew", new Locale("he"));
        localizedResourceBundle = ResourceBundle.getBundle("language_russian", new Locale("ru"));
    }
}

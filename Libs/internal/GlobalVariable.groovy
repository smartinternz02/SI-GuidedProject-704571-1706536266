package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Staging : URL of the website to be tested
Profile UAT : URL of the website to be tested (UAT)</p>
     */
    public static Object URL
     
    /**
     * <p>Profile Staging : Username to login to website
Profile UAT : Username to login to website (UAT)</p>
     */
    public static Object Username
     
    /**
     * <p>Profile Staging : Password to login to website
Profile UAT : Password to login to website (UAT)</p>
     */
    public static Object Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL = selectedVariables['URL']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object ViewPortWidth
     
    /**
     * <p></p>
     */
    public static Object ViewPortHeight
     
    /**
     * <p></p>
     */
    public static Object globalUsername
     
    /**
     * <p></p>
     */
    public static Object globalPassword
     
    /**
     * <p></p>
     */
    public static Object globalCustomerName
     
    /**
     * <p></p>
     */
    public static Object globalCustomerCountry
     
    /**
     * <p></p>
     */
    public static Object globalCustomerCity
     
    /**
     * <p></p>
     */
    public static Object globalCustomerCreditCard
     
    /**
     * <p></p>
     */
    public static Object globalCustomerMonth
     
    /**
     * <p></p>
     */
    public static Object globalCustomerYear
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseURL = selectedVariables['baseURL']
            ViewPortWidth = selectedVariables['ViewPortWidth']
            ViewPortHeight = selectedVariables['ViewPortHeight']
            globalUsername = selectedVariables['globalUsername']
            globalPassword = selectedVariables['globalPassword']
            globalCustomerName = selectedVariables['globalCustomerName']
            globalCustomerCountry = selectedVariables['globalCustomerCountry']
            globalCustomerCity = selectedVariables['globalCustomerCity']
            globalCustomerCreditCard = selectedVariables['globalCustomerCreditCard']
            globalCustomerMonth = selectedVariables['globalCustomerMonth']
            globalCustomerYear = selectedVariables['globalCustomerYear']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

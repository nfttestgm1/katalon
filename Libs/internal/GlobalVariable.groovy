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
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object Url
     
    /**
     * <p></p>
     */
    public static Object EncryptedPassword
     
    /**
     * <p></p>
     */
    public static Object MKP_url
     
    /**
     * <p></p>
     */
    public static Object listing_collections_path
     
    /**
     * <p></p>
     */
    public static Object listing_nfts_path
     
    /**
     * <p></p>
     */
    public static Object itemToSell
     
    /**
     * <p></p>
     */
    public static Object priceToSell
     
    /**
     * <p></p>
     */
    public static Object priceToBuyNow
     
    /**
     * <p></p>
     */
    public static Object sampleCollectionName
     
    /**
     * <p></p>
     */
    public static Object valueToSendStar
     
    /**
     * <p></p>
     */
    public static Object DEX_url_dev
     
    /**
     * <p></p>
     */
    public static Object WEB3_url_dev
     
    /**
     * <p></p>
     */
    public static Object loginEmail
     
    /**
     * <p></p>
     */
    public static Object loginUsername
     
    /**
     * <p></p>
     */
    public static Object globalDelayTime
     
    /**
     * <p></p>
     */
    public static Object token_amount
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            Url = selectedVariables['Url']
            EncryptedPassword = selectedVariables['EncryptedPassword']
            MKP_url = selectedVariables['MKP_url']
            listing_collections_path = selectedVariables['listing_collections_path']
            listing_nfts_path = selectedVariables['listing_nfts_path']
            itemToSell = selectedVariables['itemToSell']
            priceToSell = selectedVariables['priceToSell']
            priceToBuyNow = selectedVariables['priceToBuyNow']
            sampleCollectionName = selectedVariables['sampleCollectionName']
            valueToSendStar = selectedVariables['valueToSendStar']
            DEX_url_dev = selectedVariables['DEX_url_dev']
            WEB3_url_dev = selectedVariables['WEB3_url_dev']
            loginEmail = selectedVariables['loginEmail']
            loginUsername = selectedVariables['loginUsername']
            globalDelayTime = selectedVariables['globalDelayTime']
            token_amount = selectedVariables['token_amount']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

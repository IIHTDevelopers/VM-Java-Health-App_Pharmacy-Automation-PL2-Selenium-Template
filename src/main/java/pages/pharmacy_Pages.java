package pages;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pharmacy_Pages extends StartupPage {
	
	By usernameTextbox = By.xpath(" ");
	By passwordTextbox = By.xpath(" ");
	By signInButton = By.xpath(" ");
	By pharmacyTabXpath = By.xpath(" ");
	By orderTabXpath = By.xpath(" ");
	By supplierTabXpath = By.xpath(" ");
	By reportTabXpath = By.xpath(" ");
	By settingTabXpath = By.xpath(" ");
	By storeTabXpath = By.xpath(" ");
	By supplierLedgerTabXpath = By.xpath(" ");
	By substoreRequestAndDispatchTabXpath = By.xpath(" ");
	By purchaseOrderSubTabXpath = By.xpath(" ");
	By goodsReceiptSubTabXpath = By.xpath(" ");
	By agingDaysFromXpath = By.xpath(" ");
	By agingDaysToXpath = By.xpath(" ");
	public By searchBarId = By.id(" ");
	public By supplierNameDropdownXpath = By.xpath(" ");
	public By showDetails = By.xpath(" ");
	By calendarFromDropdown = By.xpath(" ");
	By calendarToDropdown = By.xpath(" ");
	By okButtonXpath = By.xpath(" ");
	By filterDropdownXpath = By.xpath(" ");
	By radiButtonCompleteXpath = By.xpath(" ");
	public By radiButtonCancelledXpath = By.xpath(" ");
	By radiButtonAllXpath = By.xpath(" ");
	By homepageLogo = By.cssSelector(" ");
	By printReceiptButtonId = By.id(" ");
	public By updateReceiptButtonId = By.id(" ");
	By itemNameId = By.id("  ");
	By batchNumberId = By.id(" ");
	By quantityId = By.id(" ");
	By rateId = By.id("  ");
	By saveButtonId = By.id(" ");
	By mrpId = By.id(" ");
	By supplierNameDropdownId = By.id(" ");
	By invoiceNumberFieldId = By.id(" ");
	By paymentModeDropdownId = By.id("  ");
	By closeModalButtonXpath = By.xpath(" ");
	public By closeModalButtonXpath2 = By.xpath(" ");
	By expiryDateFieldId = By.id(" ");
	By addNewItemModalXpath = By.xpath(" ");
	By modalXpath = By.xpath(" ");
	By favouriteOrStarIcon = By.xpath(" ");
	By goodReceiptTableDataRow = By.cssSelector(" ");
	public By editGRButton = By.cssSelector(" ");
	public By cancelGoodsReceiptSButton = By.id(" ");
	public By cancelRemarks = By.id(" ");
	public By proceedButton = By.xpath(" ");
	public By editGoodsRecordButton = By.id(" ");
	public By cancelledStamp = By.xpath(" ");
	By actualDatesOfGoodReceiptTableXpath = By
			.xpath(" ");
	By gridXpath = By.xpath(" ");
	By actualDatesOfPurchaseOrderTableXpath = By.xpath(" ");
	By purchaseOrderXpath = By.xpath(" ");
	public By patientTabXpath = By.xpath(" ");
	public By registerPatient = By.xpath(" ");
	public By profilePicture = By.cssSelector(" ");
	public By newPhoto = By.xpath(" ");
	public By chooseFileButton = By.cssSelector(" ");
	public By doneButton = By.xpath(" ");
	public By uploadedImage = By.cssSelector(" ");
	public By uploadedProfilePhotoXpath = By.xpath(" ");

	private By tabXpath;

	

	String pageName = this.getClass().getSimpleName();

	public pharmacy_Pages(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1 about this method loginTohealthAppByGivenValidCredetial()
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}
	
	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		
		return null;
	}

	/**
	 * @Test1.4 about this method clickOnHomePageLogo()
	 * @param : null
	 * @description : This method finds the homepage logo on the screen. If the logo
	 *              is displayed, it highlights the logo and clicks on it.
	 * @return : void
	 * @author : YAKSHA
	 */
	public void clickOnHomePageLogo() {
		
	}

	/**
	 * @Test2.1 about this method scrollDownAndClickPharmacyTab()
	 * 
	 * @param : null
	 * @description : verify the pharmacy tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void scrollDownAndClickPharmacyTab() throws Exception {
		
	}

	/**
	 * @Test2.2 about this method getPharmacyPageUrl()
	 * 
	 * @param : null
	 * @description : This method retrieves the current URL of the page to verify if
	 *              the user is on the Pharmacy page.
	 * @return : String - the current URL of the page
	 * @author : YAKSHA
	 */
	public String getPharmacyPageUrl() throws Exception {
		
		return null;
	}

	/**
	 * @Test3 about this method verifyAndHighlightTab()
	 * @param : String tabName - The name of the tab to verify and highlight
	 * @description : This method locates the tab specified by the tabName parameter
	 *              in the Pharmacy module, highlights it, and returns true if the
	 *              tab is displayed.
	 * @return : boolean - true if the tab is displayed, false otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the tab
	 * @author : YAKSHA
	 */
	public boolean verifyAndHighlightTab(String tabName) throws Exception {
		return false;
	}

	private void setTabXpath(String tabName) {
		
	}

	/**
	 * @Test4.1, @Test5 and @Test6.1 about this method visitOrderTabUnderPharmacy()
	 * 
	 * @param : null
	 * @description : navigates the user to the order screen
	 * @return : void
	 * @author : YAKSHA
	 */
	public void visitTabUnderPharmacy(String tabName) throws Exception {
		
	}

	/**
	 * @Test4.2 about this method isOrderTabSelected()
	 * 
	 * @param : null
	 * @description : verify whether the order tab is the currently selected tab
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean isOrderTabSelected() throws Exception {
		return false;
	}

	/**
	 * @Test4.2 about this method isPurchaseOrderSubTabPresent()
	 * 
	 * @param : null
	 * @description : verify whether the \"purchase order\" sub tab is present
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean isPurchaseOrderSubTabPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.2 about this method isGoodsReceiptSubTabPresent()
	 * 
	 * @param : null
	 * @description : verify whether the \"good receipt\" sub tab is present
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean isGoodsReceiptSubTabPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.3 about this method areSubTabsUnderOrderPresent()
	 * 
	 * @param : null
	 * @description : verify all sub tabs under order are present
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean areSubTabsUnderOrderPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.4 about this method isButtonPresent()
	 * 
	 * @param : String
	 * @description : verify button presence through text
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean isButtonPresent(String buttonText) throws Exception {
		return false;
	}

	/**
	 * @Test4.4 about this method areAgingDaysFieldsPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the 'Aging Days From' and 'Aging Days
	 *              To' fields are present and highlighted.
	 * @return : boolean - true if both fields are displayed, false otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the
	 *           fields
	 * @author : YAKSHA
	 */
	public boolean areAgingDaysFieldsPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.5 about this method isSearchBarPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the search bar is present and
	 *              highlighted on the page.
	 * @return : boolean - true if the search bar is displayed, false otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the
	 *           search bar
	 * @author : YAKSHA
	 */
	public boolean isSearchBarPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.6 about this method areDateDropdownsPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the 'From' and 'To' date dropdowns are
	 *              present and highlighted on the page.
	 * @return : boolean - true if both date dropdowns are displayed, false
	 *         otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the
	 *           dropdowns
	 * @author : YAKSHA
	 */
	public boolean areDateDropdownsPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.7 about this method isSelectSupplierDropdownPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the 'Select Supplier' dropdown is
	 *              present and highlighted on the page.
	 * @return : boolean - true if the 'Select Supplier' dropdown is displayed,
	 *         false otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the
	 *           dropdown
	 * @author : YAKSHA
	 */
	public boolean isSelectSupplierDropdownPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.8 about this method isFilterDropdownPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the filter dropdown is present and
	 *              highlighted on the page.
	 * @return : boolean - true if the filter dropdown is displayed, false otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the
	 *           dropdown
	 * @author : YAKSHA
	 */
	public boolean isFilterDropdownPresent() throws Exception {
		return false;
	}

	/**
	 * @Test4.9 about this method areFilterByStatusRadioButtonsPresent()
	 * 
	 * @param : null
	 * @description : This method verifies if the 'Completed', 'Cancelled', and
	 *              'All' radio buttons are present and highlighted on the page.
	 * @return : boolean - true if all three radio buttons are displayed, false
	 *         otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the radio
	 *           buttons
	 * @author : YAKSHA
	 */
	public boolean areFilterByStatusRadioButtonsPresent() throws Exception {
		return false;
	}

	/**
	 * @Test5 about this method verifySelectedTabIsActiveOrNot()
	 * @param : null
	 * @description : This method verifies if the "Supplier" tab is displayed and
	 *              returns its "class" attribute value. This can be used to
	 *              determine if the tab is active or not based on its class
	 *              attributes.
	 * @return : String - the value of the "class" attribute of the "Supplier" tab
	 *         if it is displayed, an empty string otherwise
	 * @throws : Exception - if there is an issue locating or highlighting the tab,
	 *           or getting its attribute
	 * @author : YAKSHA
	 */
	public String verifySelectedTabIsActiveOrNot() throws Exception {
		return null;
	}

	/**
	 * @Test6.2 about this method clickButtonByText()
	 * 
	 * @param buttonText : String - The text of the button to be clicked
	 * @description : This method locates a button using its text and performs a
	 *              click action on it. If the button is found and successfully
	 *              clicked, it highlights the button first. In case of failure
	 *              (e.g., button not found or click error), an error message is
	 *              printed and an exception is thrown.
	 * @return : void
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action
	 * @author : YAKSHA
	 */
	public void clickButtonByText(String buttonText) throws Exception {
		
	}

	/**
	 * @Test6.3 about this method clickPrintReceipt()
	 * 
	 * @param : null
	 * @description : This method locates the "Print Receipt" button using its
	 *              identifier and performs a click action on it. The button is
	 *              highlighted before clicking to ensure visibility. If an
	 *              exception occurs during the finding or clicking of the button,
	 *              it is re-thrown.
	 * @return : void
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action
	 * @author : YAKSHA
	 */
	public void clickPrintReceipt() throws Exception {
		
	}

	/**
	 * @Test6.4 about this method verifyMessageByText()
	 * 
	 * @param messageText - the text to match within the message element
	 * @description : This method locates a message element on the page by searching
	 *              for a paragraph (`
	 *              <p>
	 *              `) that contains the specified text (`messageText`) or has a
	 *              class `main-message`. It highlights the message element and
	 *              returns its text content. If an exception occurs while finding
	 *              or retrieving the message, it logs an error and re-throws the
	 *              exception.
	 * @return : String - the text content of the located message element
	 * @throws : Exception - if there is an issue finding the message or retrieving
	 *           its text
	 * @author : YAKSHA
	 */
	public String verifyMessageByText(String messageText) throws Exception {
		return null;
	}

	public void addGriItemWithMandatoryFieldsOnly(String itemName, String batchNumber, String quantity, String rate,
			String mrp) throws Exception {
		
	}

	public void enterMandatoryDetailsToPrintGoodReceipt(String invoiceNumber) throws Exception {
		
	}

	/**
	 * @Test6.5 about this method closeAddGoodReceiptModal()
	 * 
	 * @param : null
	 * @description : This method locates the "Close" button of the "Add Good
	 *              Receipt" modal using the provided XPath
	 *              (`closeModalButtonXpath`). It highlights the button and then
	 *              clicks it to close the modal. If an exception occurs while
	 *              finding or interacting with the button, it logs an error and
	 *              re-throws the exception.
	 * @return : void
	 * @throws : Exception - if there is an issue finding or clicking the "Close"
	 *           button
	 * @author : YAKSHA
	 */
	public void closeAddGoodReceiptModal() throws Exception {
		
	}

	/**
	 * @Test8.2 about this method closeModalBySubjectName()
	 * 
	 * @param : String
	 * @description : Closes the modal with the subject name
	 * @return : void
	 * @throws : Exception - if there is an issue finding or clicking the cross
	 *           button
	 * @author : YAKSHA
	 */
	public void closeModalBySubjectName(String modalTitle) throws Exception {
		
	}

	/**
	 * @Test8.5 @Test10.3 @Test14.2 @Test16.2 @Test16.8 about this method
	 * clickViewButtonWithInvoice()
	 * 
	 * @param : String
	 * @description : Clicks on the "view" button next to a particular invoice
	 *              number
	 * @return : void
	 * @throws : Exception - if there is an issue finding or clicking the "view"
	 *           button
	 * @author : YAKSHA
	 */
	public void clickViewButtonWithInvoice(String invoiceNumber) throws Exception {
		
	}

	/**
	 * @Test8.6 @Test10.4 about this method doesPrintContainsInvoiceNumber()
	 * 
	 * @param : String
	 * @description : Verify whether the printed report contains expected invoice
	 *              number
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding or clicking the invoice
	 *           number text button
	 * @author : YAKSHA
	 */
	public boolean doesPrintContainsInvoiceNumber(String invoiceNumber) throws Exception {
		return false;
	}

	/**
	 * @Test8.3 @Test10 @Test14 @Test16 about this method
	 * clickAndEnterValueInSearchField()
	 * 
	 * @param : String
	 * @description : Enters value in the search bar
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding or typing the text
	 * @author : YAKSHA
	 */
	public boolean clickAndEnterValueInSearchField(String searchData) {
		return false;
	}

	/**
	 * @Test12 about this method verifyToolTipText()
	 * @param : null
	 * @description : Verify the text of the tooltip
	 * @return : String
	 * @throws : Exception - if there is an issue finding the text
	 * @author : YAKSHA
	 */
	public String verifyToolTipText() {
		return null;
	}

	/**
	 * @Test13.2 about this method
	 * verifyGoodsReceiptTableDataIsPresentAfterEnteringSupplierName()
	 * 
	 * @param : null
	 * @description : Verify result appears after searching with supplier name
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the result
	 * @author : YAKSHA
	 */
	public boolean verifyGoodsReceiptTableDataIsPresentAfterEnteringSupplierName() {
		return false;
	}

	/**
	 * @Test14.3 about this method clickOnEditGRButton()
	 * 
	 * @param : null
	 * @description : Clicks on the edit GR button
	 * @return : boolean
	 * @throws : Exception - if there is an issue clicking the edit GR button
	 * @author : YAKSHA
	 */
	public boolean clickOnEditGRButton() {
		return false;
	}

	/**
	 * @Test8.4 @Test9.2 @Test10.2 @Test16.3 @Test16.6 @Test16.7 @Test16.10 about
	 * this method highlightAndClickOnButton()
	 * 
	 * @param : By, String
	 * @description : Highlights the provided element and clicks on it
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the element
	 * @author : YAKSHA
	 */
	public boolean highlightAndClickOnButton(By element, String buttonName) {
		return false;
	}

	/**
	 * @Test11 about this method performScrollOperation()
	 * @param : null
	 * @description : Scrolls till Pharmacy tab, selects it, and clicks "Order" sub
	 *              tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the tab
	 * @author : YAKSHA
	 */
	public boolean performScrollOperation() {
		return false;
	}

	/**
	 * @Test9 @Test17 about this method applyDateFilter()
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public void applyDateFilter(String fromDate, String toDate) throws Exception {
		
	}

	/**
	 * @Test9.3 about this method verifyActualDatesAreWithinThisRange()
	 * 
	 * @param : String, String
	 * @description : Verify whether results are within the applied date range
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the actual dates within
	 *           the results
	 * @author : YAKSHA
	 */
	public boolean verifyActualDatesAreWithinThisRange(String fromDate, String toDate) {
		return false;
	}

	/**
	 * @Test21 about this method verifyBrowserUrlAfterRefreshingThePage()
	 * @param : null
	 * @description : Verify the URL is same after refreshing the page
	 * @return : boolean
	 * @throws : Exception - if there is an issue reloading the page
	 * @author : YAKSHA
	 */
	public boolean verifyBrowserUrlAfterRefreshingThePage() {
		return false;
	}

	/**
	 * @Test16.4 about this method enterRemarksAndClickOnProceed()
	 * 
	 * @param : WebElement
	 * @description : Enters remarks and clicks on the "Proceed" button
	 * @return : void
	 * @throws : Exception - if there is an issue finding, filling, or clicking the
	 *           element
	 * @author : YAKSHA
	 */
	public void enterRemarksAndClickOnProceed(By element) {
		
	}

	/**
	 * @Test16.9 about this method verifyRecordStatusFromInvoce()
	 * 
	 * @param : WebElement
	 * @description : Verify the record status from invoice
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the element
	 * @author : YAKSHA
	 */
	public boolean verifyRecordStatusFromInvoce(By element) {
		return false;
	}

	/**
	 * @Test15.3 about this method clickCompleteRadioButton()
	 * 
	 * @param : null
	 * @description : Clicks on the "Complete" radio button
	 * @return : void
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public void clickCompleteRadioButton() throws Exception {
		
	}

	/**
	 * @Test15.4 about this method isCompleteRadioButtonSelectable()
	 * 
	 * @param : null
	 * @description : Verify whether the "Complete" radio button is selectable
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public boolean isCompleteRadioButtonSelectable() throws Exception {
		return false;
	}

	/**
	 * @Test15.5 about this method clickCancelledRadioButton()
	 * 
	 * @param : null
	 * @description : Clicks the "Cancelled" radio button
	 * @return : void
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public void clickCancelledRadioButton() throws Exception {
		
	}

	/**
	 * @Test15.6 about this method isCancelledRadioButtonSelectable()
	 * 
	 * @param : null
	 * @description : Verify whether the "Cancelled" radio button is selectable
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public boolean isCancelledRadioButtonSelectable() throws Exception {
		return false;
	}

	/**
	 * @Test15.7 about this method clickAllRadioButton()
	 * 
	 * @param : null
	 * @description : Clicks the "All" radio button
	 * @return : void
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public void clickAllRadioButton() throws Exception {
		
	}

	/**
	 * @Test15.8 about this method isAllRadioButtonSelectable()
	 * 
	 * @param : null
	 * @description : Verify whether the "All" radio button is selectable
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the radio button
	 * @author : YAKSHA
	 */
	public boolean isAllRadioButtonSelectable() throws Exception {
		return false;
	}

	/**
	 * @Test17.4 about this method
	 * verifyActualDatesForPurchaseOrderAreWithinThisRange()
	 * 
	 * @param : String fromDate, String toDate
	 * @description : Verify if the actual dates for purchase orders are within the
	 *              specified date range
	 * @return : boolean
	 * @throws : Exception - if there is an issue parsing the dates
	 * @author : YAKSHA
	 */
	public boolean verifyActualDatesForPurchaseOrderAreWithinThisRange(String fromDate, String toDate) {
		
		return false;
	}

	/**
	 * @Test17.2 about this method clickPurchaseOrderTab()
	 * 
	 * @param : null
	 * @description : Clicks the "Purchase Order" tab
	 * @return : void
	 * @throws : Exception - if there is an issue finding the tab element
	 * @author : YAKSHA
	 */
	public void clickPurchaseOrderTab() throws Exception {
		
	}

	/**
	 * @Test18.3 about this method verifyFileDownloaded()
	 * 
	 * @param : String partialFileName
	 * @description : Verify if a file with the specified partial name has been
	 *              downloaded
	 * @return : boolean
	 * @throws : InterruptedException - if the thread is interrupted while waiting
	 *           for the file to download
	 * @author : YAKSHA
	 */
	public boolean verifyFileDownloaded(String partialFileName) throws InterruptedException {
		return false;
	}

	/**
	 * @Test19 about this method clickPatientTab()
	 * @param : String
	 * @description : Clicks on the "Patient" tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue clicking the tab
	 * @author : YAKSHA
	 */
	public boolean clickPatientTab() throws Exception {
		return false;
	}

	/**
	 * @Test18 about this method handleFileUpload()
	 * @param : String pathOfTheFile
	 * @description : Handle the file upload process
	 * @return : boolean
	 * @throws : Exception - if there is an issue during the file upload process
	 * @author : YAKSHA
	 */
	public boolean handleFileUpload(String pathOfTheFile) throws Exception {
		return false;
	}

	/**
	 * @Test20.3 about this method isProfilePictureUploaded()
	 * 
	 * @param : null
	 * @description : Verify if the profile picture has been uploaded
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the uploaded profile
	 *           picture
	 * @author : YAKSHA
	 */
	public boolean isProfilePictureUploaded() throws Exception {
		return false; 
	}

}

package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Pom_Class;

public class PatientMainRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximise and Url Launch
		geturl("https://ehr.vozo.xyz:444/");

		// Enter UserName
		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click SignIn Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getPatient().getpatient1());

		// sendkeys(pom.getPatient().getsearchpatient(), "xyz");

		// Clickonelement(pom.getPatient().getsearchpatient());

		Clickonelement(pom.getPatient().getcreatenewclient());

		sendkeys(pom.getPatient().gettypefirstname(), "raman");

		sendkeys(pom.getPatient().gettypelastname(), "k");

		sendkeys(pom.getPatient().sendtypeemail(), "xyz@gmail.com");

		sendkeys(pom.getPatient().gettypephonenumber(), "909090890");

		Clickonelement(pom.getPatient().getcancel());

		// Clickonelement(pom.getPatient().getsave());

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// sendkeys(pom.getPatient().getsearchpatient(), "xyz");

		// Clickonelement(pom.getPatient().getsearchpatient());

//	Clickonelement(pom.getPatient(). getpatientflagtype());
//	
//	
//	Clickonelement(pom.getPatient(). getaddnewpatientflag());
//	
//	sendkeys(pom.getPatient().getaddpatientflagname(), "corona");
//	
//	Clickonelement(pom.getPatient().getsaveflag());
//	
//	Clickonelement(pom.getPatient().getflagedit());
//	
//	sendkeys(pom.getPatient().getflageditdone(), "appendix");
//	Clickonelement(pom.getPatient().getflageditsave());

		Thread.sleep(2000);
		Clickonelement(pom.getPatient().getpatient1());
		Clickonelement(pom.getPatient().getclickonRaviclient());

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getclickaddpayment());

		sendkeys(pom.getPatient().getenteramount(), "20000");

		Clickonelement(pom.getPatient().getclickaddpaymentbutton());

		// Clickonelement(pom.getPatient().getclickedidinsurance());

		Clickonelement(pom.getPatient().getclickinsurancedropdown());

		Clickonelement(pom.getPatient().getclickImmunizationsdropdown());

		Clickonelement(pom.getPatient().getclickFamilyHistorydropdown());

	//	Clickonelement(pom.getPatient().getclickMedicationdropdown());

		Thread.sleep(2000);

		//Clickonelement(pom.getPatient().getclickVitals());

		//Clickonelement(pom.getPatient().getclickeditprofile());

		// Click Future Appointment
		Clickonelement(pom.getPatient().getclickFutureAppointment());

		// click past appointment
		Clickonelement(pom.getPatient().getclickPastAppointment());

		// click past Problems
		Clickonelement(pom.getPatient().getclickProblems());

		// click past Allergies
		Clickonelement(pom.getPatient().getclickAllergies());
		// Thread.sleep(4000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement element3 = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Appointment']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);

		// Clickonelement(pom.getPatient().getclickCreateAppointment());
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement element5 = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='new-app-patient_1']//input[@type='text']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element5);
		// Clickonelement(pom.getPatient().getenterPatient());

		Clickonelement(pom.getPatient().getclickenterPatientname());

		// Clickonelement(pom.getPatient().getclickenterPatientname());

		Clickonelement(pom.getPatient().getclickSelectDate());

		Clickonelement(pom.getPatient().getclickSelectTime());

		Clickonelement(pom.getPatient().getclickAlldayEvent());

		Clickonelement(pom.getPatient().getclickProvider());

		Clickonelement(pom.getPatient().getSelectProviderName());

		Clickonelement(pom.getPatient().getclickProfile());

		Clickonelement(pom.getPatient().getclickSelkecttNoshow());

		Clickonelement(pom.getPatient().getclickoffice());

		// Select Test Facility Phar
		Clickonelement(pom.getPatient().getclickSelectTestFacilityphar());

		// click status
		Clickonelement(pom.getPatient().getclickStatus());
		Thread.sleep(2000);

		// select LeftVisit
		Clickonelement(pom.getPatient().getclickLeftVisit());

		// click cancel button
		Clickonelement(pom.getPatient().getclickCancelButton());

		// click save button
		// Clickonelement(pom.getPatient().getclickSaveButton());
		Thread.sleep(2000);

		// click patient module
		Clickonelement(pom.getPatient().getpatient1());
//		
		// click patient name
		Clickonelement(pom.getPatient().getclickonRaviclient());

		// click the Edit Button
		Clickonelement(pom.getPatient().getclickEditProfile());

		// click the Active Button
		Clickonelement(pom.getPatient().getclickActiveButoon());

		Clickonelement(pom.getPatient().getclicktheActivebutton());

		// Enter the First name

		sendkeys(pom.getPatient().getEntertheFiestName(), "RAJANRA");

		// Enter Middle Name
		sendkeys(pom.getPatient().getEntertheMiddleName(), "Balamurugan");
		// Enter Middle Name
		sendkeys(pom.getPatient().getEntertheLastName(), "Ba");

		// Enter Suffix
		sendkeys(pom.getPatient().getEnterSuffix(), "B");

		// Enter SS
		sendkeys(pom.getPatient().getEnterSS(), "t");

		// Enter Phone Number
		sendkeys(pom.getPatient().getEntePhoneNumber(), "8989898989");

		// Click VoiceMessageFReminder
		Clickonelement(pom.getPatient().getClickVoiceMessageFReminder());

		// Click Text Message Reminder
		Clickonelement(pom.getPatient().getClickTextMessageReminder());

		// click add phone number
		Clickonelement(pom.getPatient().getClickAddPhoneNumber());

		// Delete Add PhoneNumber Button
		// Clickonelement(pom.getPatient().getClickAddPhoneNumberDelete());

		// Delete Add PhoneNumber Button
		sendkeys(pom.getPatient().getEnterTheEmailID(), "abc123@gmail.com");

		// Click Email Remainder
		Clickonelement(pom.getPatient().getClickTheEmailIDRemainder());

		// Click the Add Email
		Clickonelement(pom.getPatient().getClickAddEmail());

		// Click the Delete Add Email
		// Clickonelement(pom.getPatient().getClickDeleteAddEmail());

		// Enter Street Address
		sendkeys(pom.getPatient().getEnterStreetAddress(), "Northstreet");

		// Enter City
		sendkeys(pom.getPatient().getEnterCity(), "Erode");

		// Enter State
		sendkeys(pom.getPatient().getEnterState(), "TAMILNADU");

		// Enter ZIP Code
		sendkeys(pom.getPatient().getEnterZIPCode(), "638007");
		// EnterDOB
		Clickonelement(pom.getPatient().getEnterDOB());

		// Select SEX
		Clickonelement(pom.getPatient().getSelectSex());

		// Select FEMALE in SEX field
		Clickonelement(pom.getPatient().getSelectFEMALE());

		// Select Martial Status
		Clickonelement(pom.getPatient().getSelectMaritalStatus());

		// Select In Relationship
		Clickonelement(pom.getPatient().getSelectInRelationships());

		// Select preferred Language
		Clickonelement(pom.getPatient().getSelectPreferedLanguage());

		// Select Language English
		Clickonelement(pom.getPatient().getSelectLanguageEnglish());

		// Select Race
		Clickonelement(pom.getPatient().getSelectRace());

		// Select Race
		Clickonelement(pom.getPatient().getSelectRaceAsian());

		// Select Ethnicity
		Clickonelement(pom.getPatient().getSelectEthnicity());

		// Select EthnicityHispanicorLatino
		Clickonelement(pom.getPatient().getSelectEthnicityHispanicorLatino());

		// CANCEL Button
		// Clickonelement(pom.getPatient().getSelectCANCELbutton());

		// Save Button
		// Clickonelement(pom.getPatient().getSelectSAVEbutton());
		Thread.sleep(4000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement element4 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element4);

		// Click Insurance Button
		// Clickonelement(pom.getPatient().getclickInsuranceButton());

		// click Primary Insurance
		// Clickonelement(pom.getPatient().getclickPrimaryInsurance());
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		WebElement element1 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/input[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

//		// click Secondary Insurance
//		Clickonelement(pom.getPatient().getclickSecondaryInsurance());
//
//		// click Teritiary Insurance
//		Clickonelement(pom.getPatient().getclickTertiaryInsurance());
//
//		// click Self
//		Clickonelement(pom.getPatient().getclickSelf());
//
//		// click ClientsSpouse
//		Clickonelement(pom.getPatient().getClientsSpouse());
//
//		// click Clients Parent
//		Clickonelement(pom.getPatient().getClientsParent());
//
//		// click Oters
//		Clickonelement(pom.getPatient().getClickOtherts());
//		Thread.sleep(4000);
//		// Click Insurance Player
//		Clickonelement(pom.getPatient().getClickInsurancePlayer());
//
//		// Click unitedHeathcare in Insurance Player
//		Clickonelement(pom.getPatient().getClickUnitedHealthcare());
//
//		// Enter Plan Id
//		sendkeys(pom.getPatient().getEnterMemberID(), "13245");
//
//		// Enter Plan Id
//		sendkeys(pom.getPatient().getEnterPlanID(), "234234");
//
//		// Enter Group ID
//		sendkeys(pom.getPatient().getEnterGroupId(), "4234");
//
//		// Enter Copay
//		sendkeys(pom.getPatient().getEnterCopay(), "34");
//
//		// Enter For SuperBills
//		sendkeys(pom.getPatient().getEnterForSuperbils(), "55");
//
//		// Enter For SuperBills
//		sendkeys(pom.getPatient().getEnterDeductible(), "90");
//
//		// Enter Insurance Payer Phone
//		sendkeys(pom.getPatient().getEnterInsPayerPhone(), "9090909090");
//
//		// Enter Insurance Payer Fax
//		sendkeys(pom.getPatient().getEnterInsPayerFax(), "80808080");
//
//		// Enter Employer/School
//		sendkeys(pom.getPatient().getEnterEmployerSchool(), "SCHOOL");
//
////		// Click Cancel
////		Clickonelement(pom.getPatient().getClickCancel());
////
////		// Click Save
////		Clickonelement(pom.getPatient().getClickSave());
//
//// CONTACTS
//		Thread.sleep(4000);
//		WebDriverWait wait8 = new WebDriverWait(driver, 10);
//		WebElement element8 = wait8
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Contacts']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element8);
//
//		// ClickContacts
//		// Clickonelement(pom.getPatient().getClickContacts());
//
//		// Click Add Contacts
//		Clickonelement(pom.getPatient().getClickAddContacts());
//
//		// Enter Contact First name
//		sendkeys(pom.getPatient().getEnterContactMiddleName(), "murugan");
//
//		// Enter Contact Middle name
//		sendkeys(pom.getPatient().getEnterContactMiddleName(), "Ramu");
//
//		// Enter Contact Last name
//		sendkeys(pom.getPatient().getEnterContactLastName(), "k");
//
//		// ClickSuffix
//		Clickonelement(pom.getPatient().getClickSuffix());
//
//		// Select Mr in Suffix
//		Clickonelement(pom.getPatient().getClickMr());
//
//		// Enter Preferred name
//		sendkeys(pom.getPatient().getEnterPreferedname(), "j");
//
//		// Select Emergency Contact
//		Clickonelement(pom.getPatient().getClickEmergencyContact());
//
//		// Enter Phone Number
//		sendkeys(pom.getPatient().getEnterPhoneNumber(), "987654321");
//
//		// Click Mobile Option
//		Clickonelement(pom.getPatient().getClickMobileOptionr());
//
//		// Select Mobile
//		Clickonelement(pom.getPatient().getSelectMobile());
//
//		// Select Add Phone button
//		// Clickonelement(pom.getPatient().getSelectAddPhoneOption());
//
////		// Enter Add Phone Number
////		sendkeys(pom.getPatient().getEnterAddPhoneNumber(), "987654320");
////
////		// click mobile dropdown
////		Clickonelement(pom.getPatient().getclickmobiledropdown());
////
////		// Select selectWORKoption in dropdown
////		Clickonelement(pom.getPatient().getselectWORKoption());
//
//		// Select select delete option
//		// Clickonelement(pom.getPatient().getselectdeleteoption());
//
//		// Enter Email id
//		// sendkeys(pom.getPatient().getEnterEmail(), "smash001@gmail.com");
//
//		// click Work DropDown
//		Clickonelement(pom.getPatient().getclickWorkBotton());
//
//		// Select contact
//		Clickonelement(pom.getPatient().getselectcontact());
//
//		// Click AddEmail Option
//		Clickonelement(pom.getPatient().getClickAddButton());
//
//		// Enter Add Phone Number
//		sendkeys(pom.getPatient().getEnterphonenumber2(), "1");
//
//		// Click Home Option
//		Clickonelement(pom.getPatient().getclickHomeBotton());
//
//		// Select Home
//		Clickonelement(pom.getPatient().getselectHome());
//
//		// Select Home
//		// Clickonelement(pom.getPatient().getclickDeleteButton());
//
//		// Enter Street Name
//		sendkeys(pom.getPatient().getEnterStreetname(), "EastCarStreet");
//
//		// Enter Street Name
//		sendkeys(pom.getPatient().getEnterCityname(), "Coimbatore");
//
//		// Click State dropdown
//		Clickonelement(pom.getPatient().getClickStatename());
//
//		// Select California State
//		// Clickonelement(pom.getPatient().getclickDeleteButton());
//
//		// Enter ZIP Code
//		sendkeys(pom.getPatient().getEnterZIPCode1(), "638001");
//
//		// Enter Notes
//		sendkeys(pom.getPatient().getEnterNotes(), "HI ALL");
//
//		// Click Cancel
//		Clickonelement(pom.getPatient().getClickCancel1());
//
//		// Click SAVE
//		Clickonelement(pom.getPatient().getClickCSAVE1());
////
////		Thread.sleep(2000);
//
//// PATIENT FLAG TYPE
//
///////////////////// click flags ////////////////
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		WebElement fla = wait2
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='rc-tabs-2-tab-4'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla);
//
////		Thread.sleep(5000);
////
////		Clickonelement(pom.getPatient().getclickflags());
//
//		// click flags
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient().getclickaddpatientflag());
//
//		// click flags
//
//		Thread.sleep(2000);
//
//		Selectone(pom.getPatient().getselectflag(), "Cold");
//
//		// search patient
//
//		sendkeys(pom.getPatient().getsendmsg(), "Hello Welcome ");
//
//		// click save
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getPatient().getclciksave());
//
//		// click edit
//
//		// Clickonelement(pom.getPatient().getclickedit());
//
//		// click close
//
//		// Clickonelement(pom.getPatient().getclickclose());
//
//		///////////////// click appointment////////////
//
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getPatient().getclcikappointment());
//
//		// click future app
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getPatient().getclickpast());
//
//		// click past app
//		Thread.sleep(3000);

	//	Clickonelement(pom.getPatient().getclickfuture());

		// ////////////clcik doument /////////////

		Thread.sleep(3000);
		Clickonelement(pom.getPatient().getdocu());

		// clcik lab
		Thread.sleep(5000);

		Clickonelement(pom.getPatient().getclicklab());

/////////// Click Problems ///////////////

		Thread.sleep(3000);

		Clickonelement(pom.getPatient().getclickproblems());

		// add pro

		Clickonelement(pom.getPatient().getclickaddproblems());

		// send problem

		sendkeys(pom.getPatient().getsendproblems(), "a");

		// sele pro
		Clickonelement(pom.getPatient().getselepro());

		// send icd

		Selectone(pom.getPatient().getsendicd(), "ICD9");

		// send icd

		sendkeys(pom.getPatient().getsendcode(), "1234");

		// send icd

		sendkeys(pom.getPatient().getsendstatus(), "Active ");

		// click calender

		sendkeys(pom.getPatient().getcalenderstart(), "05/01/2022");

		// start calender

//						new  Patient_Module(driver)
//						.Calendersele();

		sendkeys(pom.getPatient().getcalenderend1(), "05/07/2022");

		// end calender
		Thread.sleep(2000);

		// selectone( "2022-03-11");

		// sendkeys(pom.getPatient().getcalenderend(), "2022-03-11");

		// select(, );

		// end calender

		sendkeys(pom.getPatient().getsendct(), "1234");

		// start calender

		sendkeys(pom.getPatient().getsendcomment(), "Hello 123");

		// save button

		Clickonelement(pom.getPatient().getsaveprob());

		// clcik close

		// Clickonelement(pom.getPatient().getclickclose1());

		///////// Click Allergies ////////
		// click aler
		Thread.sleep(4000);

		Clickonelement(pom.getPatient().getclickaler());

		// clcik add

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getclickaddaler());

		// select aler

		Selectone(pom.getPatient().getselectaler(), "Specific Drug allergy");

		// specific drug
		Thread.sleep(2000);

		sendkeys(pom.getPatient().getspeficdrug(), "a");

		// sele Drug

		Clickonelement(pom.getPatient().getseledrug());

		// Click Reaction

		sendkeys(pom.getPatient().getspeficreaction(), "Chills");

		// Click Reaction

		sendkeys(pom.getPatient().getseverity(), "Severe");

		// Click Reaction

		sendkeys(pom.getPatient().getselestatus(), "Active");

		// Click notes

		sendkeys(pom.getPatient().getNotesaler(), "abc");

		// Save alergy

		Clickonelement(pom.getPatient().getSavealer());

////////// click medication ////////////////

		Thread.sleep(5000);

		Clickonelement(pom.getPatient().getclickmedi());

		// add medi

		Thread.sleep(3000);

		Clickonelement(pom.getPatient().getclickaddmedi());

		// add medi

		sendkeys(pom.getPatient().getfinddrug(), "RETIN-A (Topical)");

		// sele medi
		// Thread.sleep(7000);

		// Clickonelement(pom.getPatient().getselemed());

		// add medi

		sendkeys(pom.getPatient().getsignote(), "12344");

		// add status

		Selectone(pom.getPatient().getStatusmedi(), "Active");

		// add status

		sendkeys(pom.getPatient().getappointmedi(), "Thu Jan 01, 1970 12:00 AM ");

		// pres date

		sendkeys(pom.getPatient().getpescribedate(), "05/02/2022");

		// start pres date

		sendkeys(pom.getPatient().getstartpescribedate(), "05/03/2022");

		// stop pres date

		sendkeys(pom.getPatient().getstoppescribedate(), "05/10/2022");

		// dispense quan

		sendkeys(pom.getPatient().getdispensequan(), "1234");

		// n rfills quan

		sendkeys(pom.getPatient().getnrefills(), "1234");

		// dispense quan

		Selectone(pom.getPatient().getorderstat(), "Phoned into Pharmacy");

		// dispense quan

		sendkeys(pom.getPatient().getNotes(), "abcd");

		// save medi

		Clickonelement(pom.getPatient().getclicksavemedi());

/////////////////// Immunization

		Thread.sleep(3000);

		Clickonelement(pom.getPatient().getClickImmunization());

		sendkeys(pom.getPatient().getEnterCVXCode(), "capminds@03");

		sendkeys(pom.getPatient().getEnterManufacturer(), "capminds");

		sendkeys(pom.getPatient().getEnterLotNumber(), "05");

		Clickonelement(pom.getPatient().getEnterLotExpirationDate());

		// Selectone(pom.getPatient().getselectdate(),"21-04-2022" );

		sendkeys(pom.getPatient().getEnteradministeredamount(), "007");

		Clickonelement(pom.getPatient().getClickAdministeredunits());

		Clickonelement(pom.getPatient().getSelect50());

		Clickonelement(pom.getPatient().getSelectvaccineroute());

		Clickonelement(pom.getPatient().getSelectIntradermal());

		Clickonelement(pom.getPatient().getSelectvaccinesite());

		// Select left Upper arm
		Clickonelement(pom.getPatient().getSelectLeftUpperArm());

		// Click vaccination status
		Clickonelement(pom.getPatient().Clickvaccinationstatus());

		// Select vaccination status Complete
		Clickonelement(pom.getPatient().getSelectvaccinationstatusComplete());

		// Selectone(pom.getPatient().getselectdate(),"21-04-2022" );

		// Click Ordering doctor
		Clickonelement(pom.getPatient().getClickOrderingdoctor());

		// select Tech1
		Clickonelement(pom.getPatient().getSelectTech1());

		// Click Administered by
		Clickonelement(pom.getPatient().getClickAdministeredby());

		// Select Tech1
		Clickonelement(pom.getPatient().getSelectTec1Tech1());

		// Click Administered at
		Clickonelement(pom.getPatient().getClickadministeredat());

		// Select Oemrvozo
		Clickonelement(pom.getPatient().getSelectOemrvozo());

		// Enter Comments
		sendkeys(pom.getPatient().getEnterComments(), "capminds@03");

		// Click Administered at
		Clickonelement(pom.getPatient().getclickSave());

////////////////click family/////////////////

		Thread.sleep(5000);

		Clickonelement(pom.getPatient().getclickfamilyhis());

// clcik add family

		Clickonelement(pom.getPatient().getaddfamily());

// relation quan

		Selectone(pom.getPatient().getrelataion(), "Employee");

// clcik name

		sendkeys(pom.getPatient().getclciname(), "abc");

// clcik family

		sendkeys(pom.getPatient().getclcifamily(), "xyz");

// age

		sendkeys(pom.getPatient().getaddage(), "23");

// dob

		sendkeys(pom.getPatient().getdobsele(), "05/10/1999");

// Race

		Thread.sleep(2000);

		Selectone(pom.getPatient().getselerace(), "Abenaki");
// new Patient_Module(driver).selecthracee();

// selectone(pom.getPatient().getselerace(), "Abenaki");

// sele eth

		Thread.sleep(2000);
		Selectone(pom.getPatient().getseleeth(), "Hispanic or Latino");

// new Patient_Module(driver).selecthethen();

// selectone(pom.getPatient().getseleeth(), "Hispanic or Latino");

// gender

		Selectone(pom.getPatient().getselegender(), "Male");

// save

		Clickonelement(pom.getPatient().getfmsave());

// Clickonelement(pom.getPatient().getcancelgh());

		////////// // Click procedure order
 Thread.sleep(4000);
		Clickonelement(pom.getPatient().getclickProcedureOrder());

		// click Ordering Provider
		Clickonelement(pom.getPatient().getclickOrderingProvider());

		// Select Tech1test
		Clickonelement(pom.getPatient().getSelectTech1test());

		// click SendingTo
		Clickonelement(pom.getPatient().getclickSendingTo());

		// Select Capminds
		Clickonelement(pom.getPatient().getSelectCapminds());

		// click Priority
		Clickonelement(pom.getPatient().getClickPriority());

		// Select Medium
		Clickonelement(pom.getPatient().getSelectMedium());

		// click Status
		Clickonelement(pom.getPatient().getClickStatus());

		// Select Pending option
		Clickonelement(pom.getPatient().getSelectpending());

		// click History order
		Clickonelement(pom.getPatient().getClickHistoryOrder());

		// Select Yes
		Clickonelement(pom.getPatient().getSelectYes());

		// Enter Clinical History
		sendkeys(pom.getPatient().getEnterClinicalHistory(), "gfdg");

		// click AppointmentsAppointments
		Clickonelement(pom.getPatient().getClickAppointments());

		// Select Appointments
		Clickonelement(pom.getPatient().getSelectAppointments());

		// enter procedure
		sendkeys(pom.getPatient().getEnterProcedure(), "d");

		// Select procedures
		Clickonelement(pom.getPatient().getSelectprocedure());

		// clcik save
		Clickonelement(pom.getPatient().getclicksave());

		Thread.sleep(4000);

		// click Back
		Clickonelement(pom.getPatient().getclickBack());

////////////////////Click Senderx ///////

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		WebElement element6 = wait6
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'E-Prescriptions')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element6);

// sch cli
// Thread.sleep(6000);

// Clickonelement(pom.getPatient().getclicsene());

// clic fav

		Clickonelement(pom.getPatient().getadpres());

// fin med

		sendkeys(pom.getPatient().getfinmedp(), "a");

// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselmedp());

// sel sig

		Thread.sleep(4000);

		Clickonelement(pom.getPatient().getselsigp());

// sel dos

		Thread.sleep(3000);

		Clickonelement(pom.getPatient().getseldosp());

// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getclidosp());

// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselunip());

// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getcliunip());

// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselroup());

// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getcliroup());

//// sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getselfrep());
//
//// cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getclifrep());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldirp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidirp());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldurp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidurp());

// cli updat

		Clickonelement(pom.getPatient().getcliupdp());

//// eff date
//
//Clickonelement(pom.getPatient().geteffdatp());
//
//// sele eff da
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().geteffdatselp());

// sen di

		sendkeys(pom.getPatient().getsendip(), "10");

// dis un

		Clickonelement(pom.getPatient().getdiunp());

// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getdiunselp());
// sele dis

		sendkeys(pom.getPatient().getrefip(), "10");

// cli up

		sendkeys(pom.getPatient().getnotophap(), "Hello 123 ");

// cli sav

		Clickonelement(pom.getPatient().getclisavp());

///////////// clic compound ///////////

		Thread.sleep(6000);

		Clickonelement(pom.getPatient().getadpres());

// cli comp

//WebDriverWait wait2 = new WebDriverWait(driver, 10);
//WebElement comp = wait2
//		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Compound'])[1]")));
//((JavascriptExecutor) driver).executeScript("arguments[0].click();", comp);

		Thread.sleep(6000);

		Clickonelement(pom.getPatient().getclicomp());

// fin med

		sendkeys(pom.getPatient().getfincompp(), "a");

// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselcomp());

// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselsigp());

// sel dos

		Clickonelement(pom.getPatient().getseldosp());

// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getclidosp());

// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselunip());

// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getcliunip());

// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselroup());

// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getcliroup());

//// sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getselfrep());
//
//// cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getclifrep());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldirp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidirp());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldurp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidurp());
//
// cli updat

		Clickonelement(pom.getPatient().getcliupdp());

//// eff date
//
//Clickonelement(pom.getPatient().geteffdatp());
//
//// sele eff da
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().geteffdatselp());

// sen di

		sendkeys(pom.getPatient().getsendip(), "10");

// dis un

		Clickonelement(pom.getPatient().getdiunp());

// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getdiunselp());
// sele dis

		sendkeys(pom.getPatient().getrefip(), "10");

// cli up

		sendkeys(pom.getPatient().getnotophap(), "Hello 123 ");

// cli sav

		Clickonelement(pom.getPatient().getclisavp());

//////////////// clic Supply ///////////////////

		Thread.sleep(4000);

		Clickonelement(pom.getPatient().getadpres());

// cli sup
//WebDriverWait wait3 = new WebDriverWait(driver, 10);
//WebElement sup = wait3
//		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Supply'])[1]")));
//((JavascriptExecutor) driver).executeScript("arguments[0].click();", sup);

		Thread.sleep(6000);

		Clickonelement(pom.getPatient().getclisupp());

// fin med

		sendkeys(pom.getPatient().getfinsupp(), "a");

// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselsupp());

// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselsigp());

// sel dos

		Clickonelement(pom.getPatient().getseldosp());

// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getclidosp());

// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getselunip());

// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getcliunip());

//// sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getselroup());
//
//// cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getcliroup());
//
//// sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getselfrep());
//
//// cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().getclifrep());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldirp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidirp());
//
//// sel dir
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getseldurp());
//
//// cli dir
//
//Thread.sleep(1000);
//
//Clickonelement(pom.getPatient().getclidurp());

// cli updat

		Clickonelement(pom.getPatient().getcliupdp());

//// eff date
//
//Clickonelement(pom.getPatient().geteffdatp());
//
//// sele eff da
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient().geteffdatselp());

// sen di

		sendkeys(pom.getPatient().getsendip(), "10");

// dis un

		Clickonelement(pom.getPatient().getdiunp());

// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getdiunselp());
// sele dis

		sendkeys(pom.getPatient().getrefip(), "10");

// cli up

		sendkeys(pom.getPatient().getnotophap(), "Hello 123 ");

// cli sav

		Clickonelement(pom.getPatient().getclisavp());

// cli pre pres

		Clickonelement(pom.getPatient().getprepres());

// edi pre pres

		Thread.sleep(2000);

		Clickonelement(pom.getPatient().getedipres());

//CLICK PATIENT EDUCATION			    
		Thread.sleep(4000);

		// click patient education
		Clickonelement(pom.getPatient().getClickPatientEducation());

		// Click Private Radio button
		Clickonelement(pom.getPatient().getClickPatientRadiobutton());

		// Click Practice group button
		// Clickonelement(pom.getPatient().getClickPatientgroupbutton());

		// search the form
		sendkeys(pom.getPatient().getSearchforForm(), "gfdg");

		// Click search button
		Clickonelement(pom.getPatient().getClickPublicbutton());
	}
}
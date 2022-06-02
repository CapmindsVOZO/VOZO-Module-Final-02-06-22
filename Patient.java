package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient {
	public WebDriver driver;

	public Patient(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/nav[1]/div[1]/a[2]")
	private WebElement patient1;

	public WebElement getpatient1() {
		return patient1;
	}

	@FindBy(xpath = "//tbody/tr[1]/th[1]/div[1]")
	private WebElement searchpatient;

	public WebElement getsearchpatient() {
		return searchpatient;
	}

	@FindBy(xpath = "//button[text()='Create New Client']")
	private WebElement createnewclient;

	public WebElement getcreatenewclient() {
		return createnewclient;
	}

	@FindBy(xpath = "//input[@id='formGridEmail']")
	private WebElement typefirstname;

	public WebElement gettypefirstname() {

		return typefirstname;

	}

	@FindBy(xpath = "//input[@id='formGridPassword']")
	private WebElement typelastname;

	public WebElement gettypelastname() {
		return typelastname;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")
	private WebElement typeemail;

	public WebElement sendtypeemail() {
		return typeemail;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")
	private WebElement typephonenumber;

	public WebElement gettypephonenumber() {
		return typephonenumber;

	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement cancel;

	public WebElement getcancel() {
		return cancel;
	}

	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	private WebElement save;

	public WebElement getsave() {
		return save;
	}
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
//    private WebElement allclients;
//
//    public WebElement getallclients() {
//	return allclients;
//}
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]")
//    private WebElement myclients;
//
//    public WebElement getmyclients() {
//	return myclients;
//}
//    @FindBy(xpath = "//td[contains(text(),'golkondakarthi@gmail.com')]")
//    private WebElement text;
//
//    public WebElement gettext() {
//	return text;

//    @FindBy( xpath ="//input[@placeholder='Search']")
//  
//     private WebElement searchpatient;
//
//     public WebElement getsearchpatient() {
//	return searchpatient;
//     }

//    @FindBy(xpath = "//a[contains(text(),'Patient Flag Types')]")
//
//    private WebElement patientflagtype;
//
//    public WebElement getpatientflagtype() {
//	
//     return patientflagtype;
//}
//    @FindBy(xpath = "//button[@id='btn_selected']")
//
//    private WebElement addnewpatientflag;
//
//    public WebElement getaddnewpatientflag() {
//	
//     return addnewpatientflag;
//
//    }
//    @FindBy(xpath = "//input[@id='']")
//
//    private WebElement addpatientflagname;
//
//    public WebElement getaddpatientflagname() {
//	
//     return addpatientflagname;
//
//    }
//    @FindBy(xpath = "//button[contains(text(),'Save')]")
//
//    private WebElement saveflag;
//
//    public WebElement getsaveflag() {
//	
//     return saveflag;
//
//    }
//
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/div[3]/div[1]/div[1]/button[1]/span[1]")
//
//    private WebElement flagedit;
//
//    public WebElement getflagedit() {
//	
//     return flagedit;
//
//    }
//    
//    @FindBy(xpath = "//input[@id='']")
//
//    private WebElement flageditdone;
//
//    public WebElement getflageditdone() {
//	
//     return flageditdone;
//
//    }
//    @FindBy(xpath = "//button[contains(text(),'Save')]")
//
//    private WebElement flageditsave;
//
//    public WebElement getflageditsave() {
//	
//     return flageditsave;

	@FindBy(xpath = "//tbody/tr[1]/th[1]/div[1]")

	private WebElement clickonRaviclient;

	public WebElement getclickonRaviclient() {
		return clickonRaviclient;
	}

	@FindBy(xpath = "//div[@class='spl-color add-pay']")

	private WebElement clickaddpayment;

	public WebElement getclickaddpayment() {
		return clickaddpayment;
	}

	@FindBy(xpath = "//input[@id='amountval']")

	private WebElement enteramount;

	public WebElement getenteramount() {
		return enteramount;
	}

	@FindBy(xpath = "//button[contains(text(),'Add Payment')]")

	private WebElement clickaddpaymentbutton;

	public WebElement getclickaddpaymentbutton() {
		return clickaddpaymentbutton;
	}

	@FindBy(xpath = "//span[contains(text(),'Edit')]")

	private WebElement clickedidinsurance;

	public WebElement getclickedidinsurance() {
		return clickedidinsurance;
	}

	@FindBy(xpath = "//button[@class=' arrow-right-bar btn btn-light']//*[name()='svg']")

	private WebElement clickinsurancedropdown;

	public WebElement getclickinsurancedropdown() {
		return clickinsurancedropdown;
	}

	@FindBy(xpath = "(//button[@aria-controls='open-immun'])[1]")

	private WebElement clickImmunizationsdropdown;

	public WebElement getclickImmunizationsdropdown() {
		return clickImmunizationsdropdown;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]")

	private WebElement clickFamilyHistorydropdown;

	public WebElement getclickFamilyHistorydropdown() {
		return clickFamilyHistorydropdown;
	}

	@FindBy(xpath = "//button[@aria-controls='open-medi']//*[name()='svg']")

	private WebElement Medicationdropdown;

	public WebElement getclickMedicationdropdown() {
		return Medicationdropdown;
	}

	@FindBy(xpath = "//button[normalize-space()='Edit Profile']")

	private WebElement clickeditprofile;

	public WebElement getclickeditprofile() {
		return clickeditprofile;

	}

	@FindBy(xpath = "//button[@class='close-btn vitals-btn btn btn-light']")
	private WebElement clickVitals;

	public WebElement getclickVitals() {
		return clickVitals;
	}

	@FindBy(xpath = "//div[text()='Future Appointments']")

	private WebElement clickFutureAppointment;

	public WebElement getclickFutureAppointment() {
		return clickFutureAppointment;
	}

	@FindBy(xpath = "//div[text()='Past Appointments']")

	private WebElement clickPastAppointment;

	public WebElement getclickPastAppointment() {
		return clickPastAppointment;
	}

	@FindBy(xpath = "//div[text()='Problems']")

	private WebElement clickProblems;

	public WebElement getclickProblems() {
		return clickProblems;
	}

	@FindBy(xpath = "//div[text()='Allergies']")

	private WebElement clickAllergies;

	public WebElement getclickAllergies() {
		return clickAllergies;
	}

	@FindBy(xpath = "//button[text()='Create Appointment']")

	private WebElement clickCreateAppointment;

	public WebElement getclickCreateAppointment() {
		return clickCreateAppointment;

	}

	@FindBy(xpath = "//div[@id='new-app-patient_1']//input[@type='text']")
	private WebElement clickenterPatient;

	public WebElement getenterPatient() {
		return clickenterPatient;
	}

	@FindBy(xpath = "//div[@id='11']")
	private WebElement clickenterPatientname;

	public WebElement getclickenterPatientname() {
		return clickenterPatientname;
	}

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement clickSelectDate;

	public WebElement getclickSelectDate() {
		return clickSelectDate;
	}

	@FindBy(xpath = "//div[contains(text(),'11')]")
	private WebElement clickSelectTime;

	public WebElement getclickSelectTime() {
		return clickSelectTime;
	}

	@FindBy(xpath = " //input[@id='new-app-all-day']")
	private WebElement clickAlldayEvent;

	public WebElement getclickAlldayEvent() {
		return clickAlldayEvent;
	}

	@FindBy(xpath = "//div[@id='new-app-provider new-app-provider_1']//input[@type='text']")
	private WebElement clickSelectProvider;

	public WebElement getclickProvider() {
		return clickSelectProvider;
	}

	@FindBy(xpath = "//div[@class='visible menu transition']//div[@id='17']")
	private WebElement clickSelectProviderName;

	public WebElement getSelectProviderName() {
		return clickSelectProviderName;
	}

	@FindBy(xpath = "//div[@id='new-app-profile_1']//input[@type='text']")
	private WebElement clickProfile;

	public WebElement getclickProfile() {
		return clickProfile;
	}

	@FindBy(xpath = "//div[@title='In Office']")
	private WebElement clickSelectNoshow;

	public WebElement getclickSelkecttNoshow() {
		return clickSelectNoshow;
	}

	@FindBy(xpath = "//div[@id='new-app-facility_1']//input[@type='text']")
	private WebElement clickoffice;

	public WebElement getclickoffice() {
		return clickoffice;
	}

	@FindBy(xpath = "//span[normalize-space()='oemrvozo']")
	private WebElement clickSelectTestFacilityphar;

	public WebElement getclickSelectTestFacilityphar() {
		return clickSelectTestFacilityphar;
	}

	@FindBy(xpath = "//div[@id='new-app-status_1']//input[@type='text']")
	private WebElement clickStatus;

	public WebElement getclickStatus() {
		return clickStatus;
	}

	@FindBy(xpath = "//span[normalize-space()='? No show']")
	private WebElement clickLeftVisit;

	public WebElement getclickLeftVisit() {
		return clickLeftVisit;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement clickCancelButton;

	public WebElement getclickCancelButton() {
		return clickCancelButton;
	}

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement clickSaveButton;

	public WebElement getclickSaveButton() {
		return clickSaveButton;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/button[1]")
	private WebElement clickEditProfile;

	public WebElement getclickEditProfile() {
		return clickEditProfile;
	}

	@FindBy(xpath = "(//span[contains(@class,'badge badge-pill badge-success')])[1]")
	private WebElement clickActiveButoon;

	public WebElement getclickActiveButoon() {
		return clickActiveButoon;
	}

	@FindBy(xpath = "//a[normalize-space()='Active']")
	private WebElement clicktheActivebutton;

	public WebElement getclicktheActivebutton() {
		return clicktheActivebutton;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement EntertheFiestName;

	public WebElement getEntertheFiestName() {
		return EntertheFiestName;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement EntertheMiddleName;

	public WebElement getEntertheMiddleName() {
		return EntertheMiddleName;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement EnterLastName;

	public WebElement getEntertheLastName() {
		return EnterLastName;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement EnterSuffix;

	public WebElement getEnterSuffix() {
		return EnterSuffix;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	private WebElement EnterSS;

	public WebElement getEnterSS() {
		return EnterSS;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	private WebElement EntePhoneNumber;

	public WebElement getEntePhoneNumber() {
		return EntePhoneNumber;
	}

	@FindBy(xpath = "//input[@id='voice_check_']")
	private WebElement ClickVoiceMessageFReminder;

	public WebElement getClickVoiceMessageFReminder() {
		return ClickVoiceMessageFReminder;
	}

	/////////////////////////////////////// 11/03/2022
	@FindBy(xpath = "//input[@id='textsms_check_']")
	private WebElement ClickTextMessageReminder;

	public WebElement getClickTextMessageReminder() {
		return ClickTextMessageReminder;
	}

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	private WebElement ClickAddPhoneNumber;

	public WebElement getClickAddPhoneNumber() {
		return ClickAddPhoneNumber;
	}

	@FindBy(xpath = "//div[@class='p-l-r-0 container-fluid']//div//div[3]//div[1]//div[3]//div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M360 184h-')]")
	private WebElement ClickAddPhoneNumberDelete;

	public WebElement getClickAddPhoneNumberDelete() {
		return ClickAddPhoneNumberDelete;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	private WebElement EnterTheEmailID;

	public WebElement getEnterTheEmailID() {
		return EnterTheEmailID;
	}

	@FindBy(xpath = "//input[@id='email_check_']")
	private WebElement ClickTheEmailIDRemainder;

	public WebElement getClickTheEmailIDRemainder() {
		return ClickTheEmailIDRemainder;
	}

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	private WebElement ClickAddEmail;

	public WebElement getClickAddEmail() {
		return ClickAddEmail;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[5]")
	private WebElement ClickDeleteAddEmail;

	public WebElement getClickDeleteAddEmail() {
		return ClickDeleteAddEmail;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	private WebElement EnterStreetAddress;

	public WebElement getEnterStreetAddress() {
		return EnterStreetAddress;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	private WebElement EnterCity;

	public WebElement getEnterCity() {
		return EnterCity;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/div[2]/div[1]/input[1]")
	private WebElement EnterState;

	public WebElement getEnterState() {
		return EnterState;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/div[3]/div[1]/input[1]")
	private WebElement EnterZIPCode;

	public WebElement getEnterZIPCode() {
		return EnterZIPCode;
	}

	@FindBy(xpath = "//input[@id='patientinfodobval']")
	private WebElement EnterDOB;

	public WebElement getEnterDOB() {
		return EnterDOB;
	}

	@FindBy(xpath = "//input[@id='patientinfodobval']")
	private WebElement SelectSex;

	public WebElement getSelectSex() {
		return SelectSex;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/select[1]/option[2]")
	private WebElement SelectFEMALE;

	public WebElement getSelectFEMALE() {
		return SelectFEMALE;
	}

	@FindBy(xpath = "//select[@id='exampleForm.ControlSelect4']")
	private WebElement SelectMaritalStatus;

	public WebElement getSelectMaritalStatus() {
		return SelectMaritalStatus;
	}

	@FindBy(xpath = "//option[@value='Married']")
	private WebElement SelectInRelationship;

	public WebElement getSelectInRelationships() {
		return SelectInRelationship;
	}

	@FindBy(xpath = "//select[@id='exampleForm.ControlSelect1']")
	private WebElement SelectPreferedLanguage;

	public WebElement getSelectPreferedLanguage() {
		return SelectPreferedLanguage;
	}

	@FindBy(xpath = "//option[contains(text(),'English')]")
	private WebElement SelectLanguageEnglish;

	public WebElement getSelectLanguageEnglish() {
		return SelectLanguageEnglish;
	}

	@FindBy(xpath = "//select[@id='exampleForm.ControlSelect2']")
	private WebElement SelectRace;

	public WebElement getSelectRace() {
		return SelectRace;
	}

	@FindBy(xpath = "//option[contains(text(),'Asian')]")
	private WebElement SelectRaceAsian;

	public WebElement getSelectRaceAsian() {
		return SelectRaceAsian;
	}

	@FindBy(xpath = "//select[@id='exampleForm.ControlSelect2']")
	private WebElement SelectEthnicity;

	public WebElement getSelectEthnicity() {
		return SelectEthnicity;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/div[3]/div[1]/div[1]/select[1]/option[2]")
	private WebElement SelectEthnicityHispanicorLatino;

	public WebElement getSelectEthnicityHispanicorLatino() {
		return SelectEthnicityHispanicorLatino;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement SelectCANCELbutton;

	public WebElement getSelectCANCELbutton() {
		return SelectCANCELbutton;
	}

	@FindBy(xpath = "//button[contains(text(),'Save Patient')]")
	private WebElement SelectSAVEbutton;

	public WebElement getSelectSAVEbutton() {
		return SelectSAVEbutton;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement clickInsuranceButton;

	public WebElement getclickInsuranceButton() {
		return clickInsuranceButton;
	}

	@FindBy(xpath = "//input[@value='primary']")
	private WebElement clickPrimaryInsurance;

	public WebElement getclickPrimaryInsurance() {
		return clickPrimaryInsurance;
	}

	@FindBy(xpath = "//input[@value='secondary']")
	private WebElement clickSecondaryInsurance;

	public WebElement getclickSecondaryInsurance() {
		return clickSecondaryInsurance;
	}

	@FindBy(xpath = "//input[@value='tertiary']")
	private WebElement clickTertiaryInsurance;

	public WebElement getclickTertiaryInsurance() {
		return clickTertiaryInsurance;
	}

	@FindBy(xpath = "//input[@value='self']")
	private WebElement clickSelf;

	public WebElement getclickSelf() {
		return clickSelf;
	}

	@FindBy(xpath = "//input[@value='spouse']")
	private WebElement ClientsSpouse;

	public WebElement getClientsSpouse() {
		return ClientsSpouse;
	}

	@FindBy(xpath = "//input[@value='parent']")
	private WebElement ClientsParent;

	public WebElement getClientsParent() {
		return ClientsParent;
	}

	@FindBy(xpath = "//input[@value='child']")
	private WebElement ClickOtherts;

	public WebElement getClickOtherts() {
		return ClickOtherts;
	}

	@FindBy(xpath = "//select[@name='inspayer']")
	private WebElement ClickInsurancePlayer;

	public WebElement getClickInsurancePlayer() {
		return ClickInsurancePlayer;
	}

	@FindBy(xpath = "//option[normalize-space()='United National']")
	private WebElement ClickUnitedHealthcare;

	public WebElement getClickUnitedHealthcare() {
		return ClickUnitedHealthcare;
	}

	@FindBy(xpath = "//input[@name='memberid']")
	private WebElement EnterMemberID;

	public WebElement getEnterMemberID() {
		return EnterMemberID;
	}

	@FindBy(xpath = "(//input[@name='planid'])[1]")
	private WebElement EnterPlanID;

	public WebElement getEnterPlanID() {
		return EnterPlanID;
	}

	@FindBy(xpath = "(//input[@name='groupid'])[1]")
	private WebElement EnterGroupId;

	public WebElement getEnterGroupId() {
		return EnterGroupId;
	}

	@FindBy(xpath = "(//input[@name='copay'])[1]")
	private WebElement EnterCopay;

	public WebElement getEnterCopay() {
		return EnterCopay;
	}

	@FindBy(xpath = "(//input[@name='superbills'])[1]")
	private WebElement EnterForSuperbils;

	public WebElement getEnterForSuperbils() {
		return EnterForSuperbils;
	}

	@FindBy(xpath = "(//input[@name='dedictible'])[1]")
	private WebElement EnterDeductible;

	public WebElement getEnterDeductible() {
		return EnterDeductible;
	}

	@FindBy(xpath = "//input[@name='inspayerphone']")
	private WebElement EnterInsPayerPhone;

	public WebElement getEnterInsPayerPhone() {
		return EnterInsPayerPhone;
	}

	@FindBy(xpath = "//input[@name='inspayerfax']")
	private WebElement EnterInsPayerFax;

	public WebElement getEnterInsPayerFax() {
		return EnterInsPayerFax;
	}

	@FindBy(xpath = "//input[@name='emplschool']")
	private WebElement EnterEmployerSchool;

	public WebElement getEnterEmployerSchool() {
		return EnterEmployerSchool;
	}

	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}

	@FindBy(xpath = "(//button[text()='Save Patient'])[2]")
	private WebElement ClickSave;

	public WebElement getClickSave() {
		return ClickSave;
	}

//CONTACTS
	@FindBy(xpath = "//div[text()='Contacts']")
	private WebElement ClickContacts;

	public WebElement getClickContacts() {
		return ClickContacts;
	}

	@FindBy(xpath = "//button[@id='Dropdown-basic4']")
	private WebElement ClickAddContacts;

	public WebElement getClickAddContacts() {
		return ClickAddContacts;
	}

	@FindBy(xpath = "//input[@id='contactfname']")
	private WebElement EnterContactFirstName;

	public WebElement getEnterContactFirstName() {
		return EnterContactFirstName;
	}

	@FindBy(xpath = "//input[@id='contactmname']")
	private WebElement EnterContactMiddleName;

	public WebElement getEnterContactMiddleName() {
		return EnterContactMiddleName;
	}

	@FindBy(xpath = "//input[@id='contactlname']")
	private WebElement EnterContactLastName;

	public WebElement getEnterContactLastName() {
		return EnterContactLastName;
	}

	@FindBy(xpath = "//select[@id='contactsuffix']")
	private WebElement ClickSuffix;

	public WebElement getClickSuffix() {
		return ClickSuffix;
	}

	@FindBy(xpath = "//option[text()='Mr']")
	private WebElement ClickMr;

	public WebElement getClickMr() {
		return ClickSuffix;
	}

	@FindBy(xpath = "//input[@id='contactpname']")
	private WebElement EnterPreferedname;

	public WebElement getEnterPreferedname() {
		return EnterPreferedname;
	}

	@FindBy(xpath = "//div[@class='col-6 m-t-35 em-check form-group col']//input[@type='checkbox']")
	private WebElement ClickEmergencyContact;

	public WebElement getClickEmergencyContact() {
		return ClickEmergencyContact;
	}

	@FindBy(xpath = "(//input[@name='phone'])[2]")
	private WebElement EnterPhoneNumber;

	public WebElement getEnterPhoneNumber() {
		return EnterPhoneNumber;
	}

	@FindBy(xpath = "(//select[@name='type'])[3]")
	private WebElement ClickMobileOption;

	public WebElement getClickMobileOptionr() {
		return ClickMobileOption;
	}

	@FindBy(xpath = "//select[@class='procedure-add-btn arrow-adj drop-sel-adcon form-control']//option[@value='mobile'][normalize-space()='Mobile']")
	private WebElement SelectMobile;

	public WebElement getSelectMobile() {
		return SelectMobile;
	}

	@FindBy(xpath = "//form[@class='add-contact-form']//button[@type='button'][normalize-space()='Add Phone']")
	private WebElement SelectAddPhoneOption;

	public WebElement getSelectAddPhoneOption() {
		return SelectAddPhoneOption;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter phone number'])[3]")
	private WebElement EnterAddPhoneNumber;

	public WebElement getEnterAddPhoneNumber() {
		return EnterAddPhoneNumber;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[4]/div[1]/div[2]/div[1]/select[1]")
	private WebElement clickmobiledropdown;

	public WebElement getclickmobiledropdown() {
		return clickmobiledropdown;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[4]/div[1]/div[2]/div[1]/select[1]/option[3]")
	private WebElement selectWORKoption;

	public WebElement getselectWORKoption() {
		return selectWORKoption;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[4]/div[1]/div[3]/div[1]/*[1]")
	private WebElement selectdeleteoption;

	public WebElement getselectdeleteoption() {
		return selectdeleteoption;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Enter E-mail ID')]")
	private WebElement EnterEmail;

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[3]/div[1]/div[2]/div[1]/select[1]")
	private WebElement clickWorkBotton;

	public WebElement getclickWorkBotton() {
		return clickWorkBotton;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[3]/div[1]/div[2]/div[1]/select[1]/option[2]")
	private WebElement selectcontact;

	public WebElement getselectcontact() {
		return selectcontact;
	}

	@FindBy(xpath = "//button[normalize-space()='Add Email']")
	private WebElement ClickAddButton;

	public WebElement getClickAddButton() {
		return ClickAddButton;
	}

	@FindBy(xpath = "(//select[contains(@name,'type')])[5]")
	private WebElement Enterphonenumer;

	public WebElement getEnterphonenumber2() {
		return Enterphonenumer;
	}

	@FindBy(xpath = "(//option[contains(@value,'home')][normalize-space()='Home'])[5]")
	private WebElement clickHomeBotton;

	public WebElement getclickHomeBotton() {
		return clickHomeBotton;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[3]/div[1]/div[2]/div[1]/select[1]/option[3]")
	private WebElement selectHome;

	public WebElement getselectHome() {
		return selectHome;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[4]/div[1]/div[3]/div[1]/svg[1]/path[1]")
	private WebElement clickDeleteButton;

	public WebElement getclickDeleteButton() {
		return clickDeleteButton;
	}

	@FindBy(xpath = "//input[@id='contactstreet']")
	private WebElement EnterStreetname;

	public WebElement getEnterStreetname() {
		return EnterStreetname;
	}

	@FindBy(xpath = "//input[@id='contactcity']")
	private WebElement EnterCityname;

	public WebElement getEnterCityname() {
		return EnterCityname;
	}

	@FindBy(xpath = "//select[@id='contactstate']")
	private WebElement ClickStatename;

	public WebElement getClickStatename() {
		return ClickStatename;
	}

	@FindBy(xpath = "//option[@value='California']")
	private WebElement SelectCalifornia;

	public WebElement getSelectCalifornia() {
		return SelectCalifornia;
	}

	@FindBy(xpath = "//input[@id='contactzip']")
	private WebElement EnterZIPCode1;

	public WebElement getEnterZIPCode1() {
		return EnterZIPCode1;
	}

	@FindBy(xpath = "//textarea[@id='contactnotes']")
	private WebElement EnterNotes;

	public WebElement getEnterNotes() {
		return EnterNotes;
	}

	@FindBy(xpath = "//button[@class='close-btn pf-cancelbtn btn btn-light']")
	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {
		return ClickCancel1;
	}

	@FindBy(xpath = "(//button[text()='Save'])")
	private WebElement ClickCSAVE1;

	public WebElement getClickCSAVE1() {
		return ClickCSAVE1;
	}

	// Patient Flag Type

/////////////////// click flags ////////////////

	@FindBy(xpath = "(//div[@id='rc-tabs-2-tab-4'])[1]")
	private WebElement clickflags;

	public WebElement getclickflags() {
		return clickflags;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Patient Flag'])[1]")
	private WebElement clickaddpatientflag;

	public WebElement getclickaddpatientflag() {
		return clickaddpatientflag;

	}

	@FindBy(xpath = "(//select[@name='outcome'])[1]")
	private WebElement selectflag;

	public WebElement getselectflag() {

		return selectflag;

	}

	@FindBy(xpath = "(//input[@name='description'])[1]")
	private WebElement sendmsg;

	public WebElement getsendmsg() {

		return sendmsg;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement clciksave;

	public WebElement getclciksave() {

		return clciksave;

	}
///////////////// click appointment////////////

	@FindBy(xpath = "(//a[normalize-space()='Appointment'])[1]")
	private WebElement clcikappointment;

	public WebElement getclcikappointment() {

		return clcikappointment;

	}

	@FindBy(xpath = "//div[contains(text(),'Future Appointments')]")
	private WebElement clickfuture;

	public WebElement getclickfuture() {

		return clickfuture;

	}

	@FindBy(xpath = "//div[contains(text(),'Past Appointments')]")
	private WebElement clickpast;

	public WebElement getclickpast() {

		return clickpast;

	}

// ////////////clcik doument /////////////
	@FindBy(xpath = "(//a[normalize-space()='Documents'])[1]")
	private WebElement docu;

	public WebElement getdocu() {

		return docu;

	}

	@FindBy(xpath = "(//div[contains(text(),'Lab Results')])[1]")
	private WebElement clicklab;

	public WebElement getclicklab() {

		return clicklab;

	}

	@FindBy(xpath = "(//div[contains(text(),'Uploaded Documents')])[1]")
	private WebElement clickuploaddoc;

	public WebElement getclickuploaddoc() {

		return clickuploaddoc;

	}

/////////// Click Problems ///////////////
	@FindBy(xpath = "(//a[normalize-space()='Problems'])[1]")
	private WebElement clickproblems;

	public WebElement getclickproblems() {

		return clickproblems;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Problem'])[1]")
	private WebElement clickaddproblems;

	public WebElement getclickaddproblems() {

		return clickaddproblems;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Problem'])[1]")
	private WebElement sendproblems;

	public WebElement getsendproblems() {

		return sendproblems;

	}

	@FindBy(xpath = "(//div[contains(text(),'998.2--Laceration')])[1]")
	private WebElement selepro;

	public WebElement getselepro() {

		return selepro;

	}

	@FindBy(xpath = "(//select[@name='icd_version'])[1]")
	private WebElement sendicd;

	public WebElement getsendicd() {

		return sendicd;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Codes'])[1]")
	private WebElement sendcode;

	public WebElement getsendcode() {

		return sendcode;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")
	private WebElement sendstatus;

	public WebElement getsendstatus() {

		return sendstatus;

	}

	@FindBy(xpath = "(//input[@name='start_diagnosis_date'])[1]")
	private WebElement calenderstart;

	public WebElement getcalenderstart() {

		return calenderstart;

	}

	@FindBy(xpath = "(//input[@name='end_diagnosis_date'])[1]")
	private WebElement calenderend1;

	public WebElement getcalenderend1() {

		return calenderend1;
	}
	
//
//	@FindBy(how = How.XPATH, using = "(//input[@name='start_diagnosis_date'])[1]")
//	WebElement calendersele;
//
//	public Patient_Module Calendersele() {
//
//// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		Select se = new Select(calendersele);
//
//		se.selectByValue("14");

// eleusername.sendKeys("demosalesmanager");
//
//		return this;
//	}

	@FindBy(xpath = "//input[@value='2022-03-14']")
	private WebElement calenderstartsele;

	public WebElement getcalenderstartsele() {

		return calenderstartsele;

	}

	@FindBy(name = "end_diagnosis_date")
	private WebElement calenderend;

	public WebElement getcalenderend() {

		return calenderend;

	}

	@FindBy(xpath = "(//input[@name='snoomed'])[1]")
	private WebElement sendct;

	public WebElement getsendct() {

		return sendct;

	}

	@FindBy(xpath = "(//textarea[@name='comments'])[1]")
	private WebElement sendcomment;

	public WebElement getsendcomment() {

		return sendcomment;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveprob;

	public WebElement getsaveprob() {

		return saveprob;

	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	private WebElement clickclose1;

	public WebElement getclickclose1() {

		return clickclose1;

	}

///////// Click Allergies ////////
	@FindBy(xpath = "//a[normalize-space()='Allergies']")
	private WebElement clickaler;

	public WebElement getclickaler() {

		return clickaler;

	}

	@FindBy(xpath = "(//div[@class='add_alle_mod_tit_alt'])[1]")
	private WebElement clickaddaler;

	public WebElement getclickaddaler() {

		return clickaddaler;

	}

	@FindBy(xpath = "(//select[@name='allergy_type'])[1]")

	private WebElement selectaler;

	public WebElement getselectaler() {

		return selectaler;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Drug'])[1]")

	private WebElement speficdrug;

	public WebElement getspeficdrug() {

		return speficdrug;

	}

	@FindBy(xpath = "(//div[contains(text(),'RETIN-A (Topical)')])[1]")

	private WebElement seledrug;

	public WebElement getseledrug() {

		return seledrug;

	}

	@FindBy(xpath = "(//select[contains(@name,'reaction')])[1]")

	private WebElement speficreaction;

	public WebElement getspeficreaction() {

		return speficreaction;

	}

	@FindBy(xpath = "(//select[@name='severity'])[1]")

	private WebElement severity;

	public WebElement getseverity() {

		return severity;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")

	private WebElement selestatus;

	public WebElement getselestatus() {

		return selestatus;

	}

	@FindBy(xpath = "(//textarea[@name='note'])[1]")

	private WebElement Notesaler;

	public WebElement getNotesaler() {

		return Notesaler;

	}

	@FindBy(xpath = "//button[normalize-space()='Save']")

	private WebElement Savealer;

	public WebElement getSavealer() {

		return Savealer;

	}

//////////click medication ////////////////
	@FindBy(xpath = "(//a[normalize-space()='Medication'])[1]")

	private WebElement clickmedi;

	public WebElement getclickmedi() {

		return clickmedi;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Medication'])[1]")

	private WebElement clickaddmedi;

	public WebElement getclickaddmedi() {

		return clickaddmedi;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Drug'])[1]")

	private WebElement finddrug;

	public WebElement getfinddrug() {

		return finddrug;

	}

	@FindBy(xpath = "(//div[contains(text(),'RETIN-A (Topical)')])[1]")

	private WebElement selemed;

	public WebElement getselemed() {

		return selemed;

	}

	@FindBy(xpath = "(//input[@name='sig_note'])[1]")

	private WebElement signote;

	public WebElement getsignote() {

		return signote;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")

	private WebElement Statusmedi;

	public WebElement getStatusmedi() {

		return Statusmedi;

	}

	@FindBy(xpath = "(//select[@name='Appointment'])[1]")

	private WebElement appointmedi;

	public WebElement getappointmedi() {

		return appointmedi;

	}

	@FindBy(xpath = "(//input[@name='prescribed'])[1]")

	private WebElement pescribedate;

	public WebElement getpescribedate() {

		return pescribedate;

	}

	@FindBy(xpath = "(//input[@name='begdate'])[1]")

	private WebElement startpescribedate;

	public WebElement getstartpescribedate() {

		return startpescribedate;

	}

	@FindBy(xpath = "(//input[@name='enddate'])[1]")

	private WebElement stoppescribedate;

	public WebElement getstoppescribedate() {

		return stoppescribedate;

	}

	@FindBy(xpath = "(//input[@name='dquantity'])[1]")

	private WebElement dispensequan;

	public WebElement getdispensequan() {

		return dispensequan;

	}

	@FindBy(xpath = "(//input[@name='refills'])[1]")

	private WebElement nrefills;

	public WebElement getnrefills() {

		return nrefills;

	}

	@FindBy(xpath = "(//select[@name='outcome'])[1]")

	private WebElement orderstat;

	public WebElement getorderstat() {

		return orderstat;

	}

	@FindBy(xpath = "(//input[@name='notes'])[1]")

	private WebElement Notes;

	public WebElement getNotes() {

		return Notes;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clicksavemedi;

	public WebElement getclicksavemedi() {

		return clicksavemedi;
	}

	@FindBy(xpath = "//button[contains(text(),'EDIT')]")
	private WebElement clcikedit;

	public WebElement getclcikedit() {

		return clcikedit;

	}

	////////////////////////// IMMUNIZATION //////////////////////////

	@FindBy(xpath = "//th[@role='cell']")
	private WebElement ClickGunaPatient;

	public WebElement getClickGunaPatient() {
		return ClickGunaPatient;
	}

	@FindBy(xpath = "//a[normalize-space()='Immunizations']")
	private WebElement ClickImmunization;

	public WebElement getClickImmunization() {
		return ClickImmunization;
	}

	@FindBy(xpath = "//input[@id='cvx_Code']")
	private WebElement EnterCVXCode;

	public WebElement getEnterCVXCode() {
		return EnterCVXCode;
	}

	@FindBy(xpath = "//input[@id='manufacturer']")
	private WebElement EnterManufacturer;

	public WebElement getEnterManufacturer() {
		return EnterManufacturer;
	}

	@FindBy(xpath = "//input[@id='lotnumber']")
	private WebElement EnterLotNumber;

	public WebElement getEnterLotNumber() {
		return EnterLotNumber;
	}

	@FindBy(xpath = "//input[@id='lotexpirationdate']")
	private WebElement EnterLotExpirationDate;

	public WebElement getEnterLotExpirationDate() {
		return EnterLotExpirationDate;
	}

	@FindBy(xpath = "//input[@id='lotexpirationdate']")
	private WebElement selectdate;

	public WebElement getselectdate() {
		return selectdate;
	}

	@FindBy(xpath = "//input[@id='administeredamount']")
	private WebElement Enteradministeredamount;

	public WebElement getEnteradministeredamount() {
		return Enteradministeredamount;
	}

	@FindBy(xpath = "//select[@id='administeredunits']")
	private WebElement ClickAdministeredunits;

	public WebElement getClickAdministeredunits() {
		return ClickAdministeredunits;
	}

	@FindBy(xpath = "//option[@value='[CCID_50]']")
	private WebElement Select50;

	public WebElement getSelect50() {
		return Select50;
	}

	@FindBy(xpath = "//select[@id='vaccineroute']")
	private WebElement Selectvaccineroute;

	public WebElement getSelectvaccineroute() {
		return Selectvaccineroute;
	}

	@FindBy(xpath = "//option[@value='ID']")
	private WebElement SelectIntradermal;

	public WebElement getSelectIntradermal() {
		return SelectIntradermal;
	}

	@FindBy(xpath = "//select[@id='vaccinesite']")
	private WebElement Selectvaccinesite;

	public WebElement getSelectvaccinesite() {
		return Selectvaccinesite;
	}

	@FindBy(xpath = "//option[@value='LA']")
	private WebElement SelectLeftUpperArm;

	public WebElement getSelectLeftUpperArm() {
		return SelectLeftUpperArm;
	}

	@FindBy(xpath = "//select[@id='vaccinationstatus']")
	private WebElement Clickvaccinationstatus;

	public WebElement Clickvaccinationstatus() {
		return Clickvaccinationstatus;
	}

	@FindBy(xpath = "//option[@value='CP']")
	private WebElement SelectvaccinationstatusComplete;

	public WebElement getSelectvaccinationstatusComplete() {
		return SelectvaccinationstatusComplete;
	}

	@FindBy(xpath = "")
	private WebElement selectdate1;

	public WebElement getselectdate1() {
		return selectdate1;
	}

	@FindBy(xpath = "//select[@id='ordringdoctor']")
	private WebElement ClickOrderingdoctor;

	public WebElement getClickOrderingdoctor() {
		return ClickOrderingdoctor;
	}

	@FindBy(xpath = "//select[@id='ordringdoctor']//option[@value='1'][normalize-space()='tech1test']")
	private WebElement SelectTech1;

	public WebElement getSelectTech1() {
		return SelectTech1;
	}

	@FindBy(xpath = "//select[@id='administeredby']")
	private WebElement ClickAdministeredby;

	public WebElement getClickAdministeredby() {
		return ClickAdministeredby;
	}

	@FindBy(xpath = "//select[@id='administeredby']//option[@value='1'][normalize-space()='tech1test']")
	private WebElement SelectTec1Tech1;

	public WebElement getSelectTec1Tech1() {
		return SelectTec1Tech1;
	}

	@FindBy(xpath = "//select[@id='administeredat']")
	private WebElement Clickadministeredat;

	public WebElement getClickadministeredat() {
		return Clickadministeredat;
	}

	@FindBy(xpath = "//option[@value='3']")
	private WebElement SelectOemrvozo;

	public WebElement getSelectOemrvozo() {
		return SelectOemrvozo;
	}

	@FindBy(xpath = "//textarea[@id='comments']")
	private WebElement EnterComments;

	public WebElement getEnterComments() {
		return EnterComments;
	}

	@FindBy(xpath = " //button[normalize-space()='Save']")
	private WebElement clickSave;

	public WebElement getclickSave() {
		return clickSave;
	}
////////////////click family/////////////////

	@FindBy(xpath = "(//a[normalize-space()='Family History'])[1]")

	private WebElement clickfamilyhis;

	public WebElement getclickfamilyhis() {

		return clickfamilyhis;

	}

	@FindBy(xpath = "(//a[normalize-space()='Lab Order'])[1]")

	private WebElement clcilabo;

	public WebElement getclcilabo() {

		return clcilabo;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Family Member'])[1]")

	private WebElement addfamily;

	public WebElement getaddfamily() {

		return addfamily;

	}

	@FindBy(xpath = "//div[@class='form-group col']//select[@id='formGridEmail']")

	private WebElement relataion;

	public WebElement getrelataion() {

		return relataion;

	}

	@FindBy(xpath = "(//input[@id='formGridEmail'])[1]")

	private WebElement clciname;

	public WebElement getclciname() {

		return clciname;

	}

	@FindBy(xpath = "//div[@class='modal_body modal-body']//div[2]//div[2]//input[1]")

	private WebElement clcifamily;

	public WebElement getclcifamily() {

		return clcifamily;

	}

	@FindBy(xpath = "//div[@role='dialog']//div[3]//div[1]//input[1]")

	private WebElement addage;

	public WebElement getaddage() {

		return addage;

	}

	@FindBy(xpath = "//input[@name='dob']")

	private WebElement dobsele;

	public WebElement getdobsele() {

		return dobsele;

	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[2]")

	private WebElement selerace;

	public WebElement getselerace() {

		return selerace;

	}

//	@FindBy(how = How.XPATH, using = "//div[@class='add-fam']//div[1]//div[1]//div[1]//input[1]")
//	WebElement selecthracee;
//
//	public Patient_Module selecthracee() {
//
//// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		Select se = new Select(selecthracee);
//
//		se.selectByVisibleText("Abenaki");
//
//// eleusername.sendKeys("demosalesmanager");
//
//		return this;
//	}

	@FindBy(xpath = "(//span[normalize-space()='Abenaki'])[1]")

	private WebElement clickrace;

	public WebElement getclickrace() {

		return clickrace;

	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[3]")

	private WebElement seleeth;

	public WebElement getseleeth() {

		return seleeth;

	}
//
//	@FindBy(how = How.XPATH, using = "//div[@class='modal_body modal-body']//div[2]//div[1]//div[1]//input[1]")
//	WebElement selecthethen;
//
//	public Patient_Module selecthethen() {
//
//// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		Select se1 = new Select(selecthethen);
//
//		se1.selectByVisibleText("Hispanic or Latino");
//
//// eleusername.sendKeys("demosalesmanager");
//
//		return this;
//	}

	@FindBy(xpath = "(//span[normalize-space()='Hispanic or Latino'])[1]")

	private WebElement clicketh;

	public WebElement getclicketh() {

		return clicketh;

	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[4]")

	private WebElement selegender;

	public WebElement getselegender() {

		return selegender;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement fmsave;

	public WebElement getfmsave() {

		return fmsave;

	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cancelgh;

	public WebElement getcancelgh() {

		return cancelgh;

	}

	@FindBy(xpath = "(//th[@role='cell'])[1]")

	private WebElement cliguna;

	public WebElement getcliguna() {

		return cliguna;
	}

	/////////////////// Procedure order ///////////////////

	@FindBy(xpath = "//a[normalize-space()='Lab Order']")
	private WebElement clickProcedureOrder;

	public WebElement getclickProcedureOrder() {
		return clickProcedureOrder;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[@class='App']/div[@class='app-body']/div[@class='right-block neg-marg-btm m-l-250']/div[@class='w-99']/div[@id='demographics']/div/select[1]")
	private WebElement clickOrderingProvider;

	public WebElement getclickOrderingProvider() {
		return clickOrderingProvider;
	}

	@FindBy(xpath = "//option[@value='17']")
	private WebElement SelectTech1test;

	public WebElement getSelectTech1test() {
		return SelectTech1test;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/select[1]")
	private WebElement clickSendingTo;

	public WebElement getclickSendingTo() {
		return clickSendingTo;
	}

	@FindBy(xpath = "(//option[normalize-space()='Capminds'])[1]")
	private WebElement SelectCapminds;

	public WebElement getSelectCapminds() {
		return SelectCapminds;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/select[1]")
	private WebElement ClickPriority;

	public WebElement getClickPriority() {
		return ClickPriority;
	}

	@FindBy(xpath = "//option[@value='medium']")
	private WebElement SelectMedium;

	public WebElement getSelectMedium() {
		return SelectMedium;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[3]/div[1]/select[1]")
	private WebElement ClickStatus;

	public WebElement getClickStatus() {
		return ClickStatus;
	}

	@FindBy(xpath = "//option[@value='pending']")
	private WebElement Selectpending;

	public WebElement getSelectpending() {
		return Selectpending;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/select[1]")
	private WebElement ClickHistoryOrder;

	public WebElement getClickHistoryOrder() {
		return ClickHistoryOrder;
	}

	@FindBy(xpath = "//option[contains(text(),'Yes')]")
	private WebElement SelectYes;

	public WebElement getSelectYes() {
		return SelectYes;
	}

	@FindBy(xpath = "//div[@class='form-group']//input[@type='text']")
	private WebElement EnterClinicalHistory;

	public WebElement getEnterClinicalHistory() {
		return EnterClinicalHistory;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]/div[3]/div[1]/select[1]")
	private WebElement ClickAppointments;

	public WebElement getClickAppointments() {
		return ClickAppointments;
	}

	@FindBy(xpath = "//option[contains(text(),'2022-05-22 10:00:00')]")
	private WebElement SelectAppointments;

	public WebElement getSelectAppointments() {
		return SelectAppointments;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement ClickBack;

	public WebElement getClickBack() {
		return ClickBack;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement EnterProcedure;

	public WebElement getEnterProcedure() {
		return EnterProcedure;
	}

	@FindBy(xpath = "//div[contains(text(),'Calcidiol & Calciferol panel - 49590-3')]")
	private WebElement Selectprocedure;

	public WebElement getSelectprocedure() {
		return Selectprocedure;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement clicksave;

	public WebElement getclicksave() {
		return clicksave;
	}

	@FindBy(xpath = "//a[normalize-space()='Back']")
	private WebElement clickBack;

	public WebElement getclickBack() {
		return clickBack;
	}

////////////////////Click Senderx ///////

	@FindBy(xpath = "//a[contains(text(),'E-Prescriptions')]")

	private WebElement clicsene;

	public WebElement getclicsene() {

		return clicsene;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Presciptions'])[1]")

	private WebElement adpres;

	public WebElement getadpres() {

		return adpres;

	}

	@FindBy(xpath = "//label[@class='ant-radio-button-wrapper']//span[contains(text(),'Compound')]")

	private WebElement clicomp;

	public WebElement getclicomp() {

		return clicomp;
	}

	@FindBy(xpath = "(//span[normalize-space()='Supply'])[1]")

	private WebElement clisupp;

	public WebElement getclisupp() {

		return clisupp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Medication'])[1]")

	private WebElement finmedp;

	public WebElement getfinmedp() {

		return finmedp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Compound'])[1]")

	private WebElement fincompp;

	public WebElement getfincompp() {

		return fincompp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Supply'])[1]")

	private WebElement finsupp;

	public WebElement getfinsupp() {

		return finsupp;
	}

	@FindBy(xpath = "(//div[contains(text(),'RETIN-A (Topical)')])[1]")

	private WebElement selmedp;

	public WebElement getselmedp() {

		return selmedp;
	}

	@FindBy(xpath = "(//div[contains(text(),'RETIN-A (Topical)')])[1]")

	private WebElement selcomp;

	public WebElement getselcomp() {

		return selcomp;
	}

	@FindBy(xpath = "(//div[contains(text(),'RETIN-A (Topical)')])[1]")

	private WebElement selsupp;

	public WebElement getselsupp() {

		return selsupp;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-input-group-addon')])[1]")

	private WebElement selsigp;

	public WebElement getselsigp() {

		return selsigp;
	}//

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[1]")

	private WebElement seldosp;

	public WebElement getseldosp() {

		return seldosp;
	}

	@FindBy(xpath = "(//div[contains(text(),'apply')])[1]")

	private WebElement clidosp;

	public WebElement getclidosp() {

		return clidosp;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[2]")

	private WebElement selunip;

	public WebElement getselunip() {

		return selunip;
	}

	@FindBy(xpath = "(//div[contains(text(),'gram(s)')])[2]")

	private WebElement cliunip;

	public WebElement getcliunip() {

		return cliunip;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[3]")

	private WebElement selroup;

	public WebElement getselroup() {

		return selroup;
	}

	@FindBy(xpath = "(//div[contains(text(),'inhalation')])[1]")

	private WebElement cliroup;

	public WebElement getcliroup() {

		return cliroup;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")

	private WebElement selfrep;

	public WebElement getselfrep() {

		return selfrep;
	}

	@FindBy(xpath = "(//div[contains(text(),'4 times a day')])[1]")

	private WebElement clifrep;

	public WebElement getclifrep() {

		return clifrep;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[6]")

	private WebElement seldirp;

	public WebElement getseldirp() {

		return seldirp;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='after meals'])[1]")

	private WebElement clidirp;

	public WebElement getclidirp() {

		return clidirp;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[7]")

	private WebElement seldurp;

	public WebElement getseldurp() {

		return seldurp;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='x1 day'])[1]")

	private WebElement clidurp;

	public WebElement getclidurp() {

		return clidurp;
	}

	@FindBy(xpath = "(//span[normalize-space()='Update'])[1]")

	private WebElement cliupdp;

	public WebElement getcliupdp() {

		return cliupdp;
	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")

	private WebElement effdatp;

	public WebElement geteffdatp() {

		return effdatp;
	}

	@FindBy(xpath = "(//div[normalize-space()='14'])[1]")

	private WebElement effdatselp;

	public WebElement geteffdatselp() {

		return effdatselp;
	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")

	private WebElement sendip;

	public WebElement getsendip() {

		return sendip;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[7]")

	private WebElement diunp;

	public WebElement getdiunp() {

		return diunp;
	}

	@FindBy(xpath = "(//div[contains(text(),'Capsule')])[1]")

	private WebElement diunselp;

	public WebElement getdiunselp() {

		return diunselp;
	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")

	private WebElement refip;

	public WebElement getrefip() {

		return refip;
	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")

	private WebElement notophap;

	public WebElement getnotophap() {

		return notophap;
	}

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")

	private WebElement clisavp;

	public WebElement getclisavp() {

		return clisavp;
	}

	@FindBy(xpath = "(//button[normalize-space()='Preview Prescription'])[1]")

	private WebElement prepres;

	public WebElement getprepres() {

		return prepres;
	}

	@FindBy(xpath = "(//button[normalize-space()='Edit Prescription'])[1]")

	private WebElement edipres;

	public WebElement getedipres() {

		return edipres;
	}

	@FindBy(xpath = "(//a[normalize-space()='Electronic Reports'])[1]")

	private WebElement clelctronicrep;

	public WebElement getclelctronicrep() {

		return clelctronicrep;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")

	private WebElement pofromdat;

	public WebElement getpofromdat() {

		return pofromdat;
	}

	@FindBy(xpath = "(//div[normalize-space()='22'])[1]")

	private WebElement poselfromdat;

	public WebElement getposelfromdat() {

		return poselfromdat;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")

	private WebElement potodat;

	public WebElement getpotodat() {

		return potodat;
	}

	@FindBy(xpath = "(//div[contains(text(),'22')])[2]")

	private WebElement poseltodat;

	public WebElement getposeltodat() {

		return poseltodat;
	}

	@FindBy(xpath = "(//select[@class='arrow-adj form-control'])[1]")

	private WebElement selesta;

	public WebElement getselesta() {

		return selesta;
	}

	@FindBy(xpath = "(//option[@value='2'])[1]")

	private WebElement selestare;

	public WebElement getselestare() {

		return selestare;
	}

	@FindBy(xpath = "(//select[@class='tk-sel-box form-control'])[1]")

	private WebElement selepr;

	public WebElement getselepr() {

		return selepr;
	}

	@FindBy(xpath = "(//option[normalize-space()='tech1 test'])[1]")

	private WebElement seleprt;

	public WebElement getseleprt() {

		return seleprt;
	}

	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")

	private WebElement clisub;

	public WebElement getclisub() {

		return clisub;
	}

//PATIENT EDUCATION

	@FindBy(xpath = "//a[normalize-space()='Patient Education']")
	private WebElement ClickPatientEducation;

	public WebElement getClickPatientEducation() {
		return ClickPatientEducation;
	}

	@FindBy(xpath = "//input[@id='privatecheck']")
	private WebElement ClickPatientRadiobutton;

	public WebElement getClickPatientRadiobutton() {
		return ClickPatientRadiobutton;
	}

	@FindBy(xpath = "//input[@id='privategroupcheck']")
	private WebElement ClickPublicbutton;

	public WebElement getClickPublicbutton() {
		return ClickPublicbutton;
	}

	@FindBy(xpath = "//input[@placeholder='Search for Form']")
	private WebElement SearchforForm;

	public WebElement getSearchforForm() {
		return SearchforForm;
	}

	@FindBy(xpath = "//div[@class=' ins-top-btn lib_search_2']//button[@type='button'][normalize-space()='Search']")
	private WebElement clickSearch;

	public WebElement getclickSearch() {
		return clickSearch;
	}

	/////////////////////////

}

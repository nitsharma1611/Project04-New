package com.sunilos.p4.ctl;

/**
 * Contains ORS View and Controller URI
 * 
 * @author Rays EdTech
 * @version 1.0
 * @Copyright (c) Rays EdTech
 */

public interface ORSView {

	public String APP_CONTEXT = "/ORSProject04";

	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String ERROR_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";

	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";

	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String GET_MARKSHEET_VIEW = PAGE_FOLDER + "/GetMarksheetView.jsp";
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String COURSE_VIEW = PAGE_FOLDER + "/CourseView.jsp";
	public String COURSE_LIST_VIEW = PAGE_FOLDER + "/CourseListView.jsp";
	public String SUBJECT_VIEW = PAGE_FOLDER + "/SubjectView.jsp";
	public String SUBJECT_LIST_VIEW = PAGE_FOLDER + "/SubjectListView.jsp";
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";
	public String MARKSHEET_MERIT_LIST_VIEW = PAGE_FOLDER + "/MarksheetMeritListView.jsp";
	public String PRODUCT_VIEW = PAGE_FOLDER + "/ProductView.jsp";
	public String PRODUCT_LIST_VIEW = PAGE_FOLDER + "/ProductListView.jsp";
	public String SMART_PARKING_VIEW = PAGE_FOLDER + "/SmartParkingView.jsp";
	public String SMART_PARKING_LIST_VIEW = PAGE_FOLDER + "/SmartParkingListView.jsp";
	public String DRONE_DELIVERY_VIEW = PAGE_FOLDER + "/DroneDeliveryView.jsp";
	public String DRONE_DELIVERY_LIST_VIEW = PAGE_FOLDER + "/DroneDeliveryListView.jsp";
	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	public String WEATHERALERT_VIEW = PAGE_FOLDER + "/WeatherAlertView.jsp";
	public String WEATHERALERT_LIST_VIEW = PAGE_FOLDER + "/WeatherAlertListView.jsp";
	public String VOICE_COMMAND_VIEW = PAGE_FOLDER + "/VoiceCommandView.jsp";
	public String VOICE_COMMAND_LIST_VIEW = PAGE_FOLDER + "/VoiceCommandListView.jsp";
	public String FACE_RECOGNITION_VIEW = PAGE_FOLDER + "/FaceRecognitionView.jsp";
	public String FACE_RECOGNITION_LIST_VIEW = PAGE_FOLDER + "/FaceRecognitionListView.jsp";
	public String QR_SCANNER_VIEW = PAGE_FOLDER + "/QRScannerView.jsp";
	public String QR_SCANNER_LIST_VIEW = PAGE_FOLDER + "/QRScannerListView.jsp";
	public String WATER_MONITORING_VIEW = PAGE_FOLDER + "/WaterMonitoringView.jsp";
	public String WATER_MONITORING_LIST_VIEW = PAGE_FOLDER + "/WaterMonitoringListView.jsp";
	public String SMART_LIGHT_VIEW = PAGE_FOLDER + "/SmartLightView.jsp";
	public String SMART_LIGHT_LIST_VIEW = PAGE_FOLDER + "/SmartLightListView.jsp";
	public String ENERGY_CONSUMPTION_VIEW = PAGE_FOLDER + "/EnergyConsumptionView.jsp";
	public String ENERGY_CONSUMPTION_LIST_VIEW = PAGE_FOLDER + "/EnergyConsumptionListView.jsp";
	public String AI_RECOMMENDATION_VIEW = PAGE_FOLDER + "/AIRecommendationView.jsp";
	public String AI_RECOMMENDATION_LIST_VIEW = PAGE_FOLDER + "/AIRecommendationListView.jsp";
	public String DEPARTMENT_VIEW = PAGE_FOLDER + "/DepartmentView.jsp";
	public String DEPARTMENT_LIST_VIEW = PAGE_FOLDER + "/DepartmentListView.jsp";
	public String EXAM_VIEW = PAGE_FOLDER + "/ExamView.jsp";
	public String EXAM_LIST_VIEW = PAGE_FOLDER + "/ExamListView.jsp";
	public String CUSTOMER_VIEW = PAGE_FOLDER + "/CustomerView.jsp";
	public String CUSTOMER_LIST_VIEW = PAGE_FOLDER + "/CustomerListView.jsp";
	public String VEHICLE_VIEW = PAGE_FOLDER + "/VehicleView.jsp";
	public String VEHICLE_LIST_VIEW = PAGE_FOLDER + "/VehicleListView.jsp";
	public String BOOK_VIEW = PAGE_FOLDER + "/BookView.jsp";
	public String BOOK_LIST_VIEW = PAGE_FOLDER + "/BookListView.jsp";
	public String DOCTOR_VIEW = PAGE_FOLDER + "/DoctorView.jsp";
	public String DOCTOR_LIST_VIEW = PAGE_FOLDER + "/DoctorListView.jsp";
	public String PATIENT_VIEW = PAGE_FOLDER + "/PatientView.jsp";
	public String PATIENT_LIST_VIEW = PAGE_FOLDER + "/PatientListView.jsp";
public String LIBRARY_VIEW = PAGE_FOLDER + "/LibraryView.jsp";
	public String LIBRARY_LIST_VIEW = PAGE_FOLDER + "/LibraryListView.jsp";
	public String BANK_ACCOUNT_VIEW = PAGE_FOLDER + "/BankAccountView.jsp";
	public String BANK_ACCOUNT_LIST_VIEW = PAGE_FOLDER + "/BankAccountListView.jsp";
	public String VENDOR_VIEW = PAGE_FOLDER + "/VendorView.jsp";
	public String VENDOR_LIST_VIEW = PAGE_FOLDER + "/VendorListView.jsp";
	public String SERVICE_VIEW = PAGE_FOLDER + "/ServiceView.jsp";
	public String SERVICE_LIST_VIEW = PAGE_FOLDER + "/ServiceListView.jsp";
	public String EMPLOYEE_VIEW = PAGE_FOLDER + "/EmployeeView.jsp";
	public String EMPLOYEE_LIST_VIEW = PAGE_FOLDER + "/EmployeeListView.jsp";
	

	
	
	// ============================================================

	public String ERROR_CTL = "/ctl/MarksheetCtl";
	public String MARKSHEET_CTL = APP_CONTEXT + "/ctl/MarksheetCtl";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetListCtl";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";
	public String COLLEGE_CTL = APP_CONTEXT + "/ctl/CollegeCtl";
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/ctl/CollegeListCtl";
	public String STUDENT_CTL = APP_CONTEXT + "/ctl/StudentCtl";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/ctl/StudentListCtl";
	public String ROLE_CTL = APP_CONTEXT + "/ctl/RoleCtl";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/ctl/RoleListCtl";
	public String COURSE_CTL = APP_CONTEXT + "/ctl/CourseCtl";
	public String COURSE_LIST_CTL = APP_CONTEXT + "/ctl/CourseListCtl";
	public String SUBJECT_CTL = APP_CONTEXT + "/ctl/SubjectCtl";
	public String SUBJECT_LIST_CTL = APP_CONTEXT + "/ctl/SubjectListCtl";
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";
	public String LOGOUT_CTL = APP_CONTEXT + "/LoginCtl";
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";
	public String UPLOAD_PHOTO_CTL = APP_CONTEXT + "/ctl/uploadphoto";
	public String FACULTY_CTL = APP_CONTEXT + "/ctl/FacultyCtl";
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/ctl/FacultyListCtl";
	public String SMART_PARKING_CTL = APP_CONTEXT + "/ctl/SmartParkingCtl";
	public String SMART_PARKING_LIST_CTL = APP_CONTEXT + "/ctl/SmartParkingListCtl";
	public String DRONE_DELIVERY_CTL = APP_CONTEXT + "/ctl/DroneDeliveryCtl";
	public String DRONE_DELIVERY_LIST_CTL = APP_CONTEXT + "/ctl/DroneDeliveryListCtl";
	public String WEATHERALERT_CTL = APP_CONTEXT + "/ctl/WeatherAlertCtl";
	public String WEATHERALERT_LIST_CTL = APP_CONTEXT + "/ctl/WeatherAlertListCtl";
	public String VOICE_COMMAND_CTL = APP_CONTEXT + "/ctl/VoiceCommandCtl";
	public String VOICE_COMMAND_LIST_CTL = APP_CONTEXT + "/ctl/VoiceCommandListCtl";
	public String FACE_RECOGNITION__CTL = APP_CONTEXT + "/ctl/FaceRecognitionCtl";
	public String FACE_RECOGNITION_LIST_CTL = APP_CONTEXT + "/ctl/FaceRecognitionListCtl";
	public String QR_SCANNER_CTL = APP_CONTEXT + "/ctl/QRScannerCtl";
	public String QR_SCANNER_LIST_CTL = APP_CONTEXT + "/ctl/QRScannerListCtl";
	public String PRODUCT_CTL = APP_CONTEXT + "/ctl/ProductCtl";
	public String PRODUCT_LIST_CTL = APP_CONTEXT + "/ctl/ProductListCtl";
	public String WATER_MONITORING_CTL = APP_CONTEXT + "/ctl/WaterMonitoringCtl";
	public String WATER_MONITORING_LIST_CTL = APP_CONTEXT + "/ctl/WaterMonitoringListCtl";
	public String SMART_LIGHT_CTL = APP_CONTEXT + "/ctl/SmartLightCtl";
	public String SMART_LIGHT_LIST_CTL = APP_CONTEXT + "/ctl/SmartLightListCtl";
	public String ENERGY_CONSUMPTION_CTL = APP_CONTEXT + "/ctl/EnergyConsumptionCtl";
	public String ENERGY_CONSUMPTION_LIST_CTL = APP_CONTEXT + "/ctl/EnergyConsumptionListCtl";
	public String AI_RECOMMENDATION_CTL = APP_CONTEXT + "/ctl/AIRecommendationCtl";
	public String AI_RECOMMENDATION_LIST_CTL = APP_CONTEXT + "/ctl/AIRecommendationListCtl";
	public String DEPARTMENT_CTL = APP_CONTEXT + "/ctl/DepartmentCtl";
	public String DEPARTMENT_LIST_CTL = APP_CONTEXT + "/ctl/DepartmentListCtl";
	public String EXAM_CTL = APP_CONTEXT + "/ctl/ExamCtl";
	public String EXAM_LIST_CTL = APP_CONTEXT + "/ctl/ExamListCtl";
	public String CUSTOMER_CTL = APP_CONTEXT + "/ctl/CustomerCtl";
	public String CUSTOMER_LIST_CTL = APP_CONTEXT + "/ctl/CustomerListCtl";
	public String VEHICLE_CTL = APP_CONTEXT + "/ctl/VehicleCtl";
	public String VEHICLE_LIST_CTL = APP_CONTEXT + "/ctl/VehicleListCtl";
	public String BOOK_CTL = APP_CONTEXT + "/ctl/BookCtl";
	public String BOOK_LIST_CTL = APP_CONTEXT + "/ctl/BookListCtl";
	public String DOCTOR_CTL = APP_CONTEXT + "/ctl/DoctorCtl";
	public String DOCTOR_LIST_CTL = APP_CONTEXT + "/ctl/DoctorListCtl";
	public String PATIENT_CTL = APP_CONTEXT + "/ctl/PatientCtl";
	public String PATIENT_LIST_CTL = APP_CONTEXT + "/ctl/PatientListCtl";
	public String LIBRARY_CTL = APP_CONTEXT + "/ctl/LibraryCtl";
	public String LIBRARY_LIST_CTL = APP_CONTEXT + "/ctl/LibraryListCtl";
	public String BANK_ACCOUNT_CTL = APP_CONTEXT + "/ctl/BankAccountCtl";
	public String BANK_ACCOUNT_LIST_CTL = APP_CONTEXT + "/ctl/BankAccountListCtl";
	public String VENDOR_CTL = APP_CONTEXT + "/ctl/VendorCtl";
	public String VENDOR_LIST_CTL = APP_CONTEXT + "/ctl/VendorListCtl";
	public String SERVICE_CTL = APP_CONTEXT + "/ctl/ServiceCtl";
	public String SERVICE_LIST_CTL = APP_CONTEXT + "/ctl/ServiceListCtl";
	public String EMPLOYEE_CTL = APP_CONTEXT + "/ctl/EmployeeCtl";
	public String EMPLOYEE_LIST_CTL = APP_CONTEXT + "/ctl/EmployeeListCtl";
	
	// ============================================================

	public String SMART_PARKING_REPORT_CTL = APP_CONTEXT + "/ctl/SmartParkingReportCtl";
	public String STUDENT_REPORT_CTL = APP_CONTEXT + "/ctl/StudentReportCtl";
	public String COLLEGE_REPORT_CTL = APP_CONTEXT + "/ctl/CollegeReportCtl";
	public String USER_REPORT_CTL = APP_CONTEXT + "/ctl/UserReportCtl";
	public String ROLE_REPORT_CTL = APP_CONTEXT + "/ctl/RoleReportCtl";
	public String COURSE_REPORT_CTL = APP_CONTEXT + "/ctl/CourseReportCtl";
	public String SUBJECT_REPORT_CTL = APP_CONTEXT + "/ctl/SubjectReportCtl";
	public String MARKSHEET_REPORT_CTL = APP_CONTEXT + "/ctl/MarksheetReportCtl";
	public String FACULTY_REPORT_CTL = APP_CONTEXT + "/ctl/FacultyReportCtl";
	public String QR_SCANNER_REPORT_CTL = APP_CONTEXT + "/ctl/QRScannerReportCtl";
	public String WATER_MONITORING_REPORT_CTL = APP_CONTEXT + "/ctl/WaterMonitoringReportCtl";
	public String SMART_LIGHT_REPORT_CTL = APP_CONTEXT + "/ctl/SmartLightReportCtl";
	public String ENERGY_CONSUMPTION_REPORT_CTL = APP_CONTEXT + "/ctl/EnergyConsumptionReportCtl";
	public String AI_RECOMMENDATION_REPORT_CTL = APP_CONTEXT + "/ctl/AIRecommendationReportCtl";
	public String DEPARTMENT_REPORT_CTL = APP_CONTEXT + "/ctl/DepartmentReportCtl";
	public String EXAM_REPORT_CTL = APP_CONTEXT + "/ctl/ExamReportCtl";
	public String CUSTOMER_REPORT_CTL = APP_CONTEXT + "/ctl/CustomerReportCtl";
	public String VEHICLE_REPORT_CTL = APP_CONTEXT + "/ctl/VehicleReportCtl";
	public String BOOK_REPORT_CTL = APP_CONTEXT + "/ctl/BookReportCtl";
	public String DOCTOR_REPORT_CTL = APP_CONTEXT + "/ctl/DoctorReportCtl";
	public String PATIENT_REPORT_CTL = APP_CONTEXT + "/ctl/PatientReportCtl";
	public String LIBRARY_REPORT_CTL = APP_CONTEXT + "/ctl/LibraryReportCtl";
	public String BANK_ACCOUNT_REPORT_CTL = APP_CONTEXT + "/ctl/BankAccountReportCtl";
	public String VENDOR_REPORT_CTL = APP_CONTEXT + "/ctl/VendorReportCtl";
	public String SERVICE_REPORT_CTL = APP_CONTEXT + "/ctl/ServiceReportCtl";
	public String EMPLOYEE_REPORT_CTL = APP_CONTEXT + "/ctl/EmployeeReportCtl";
	
	
	
	
	// ============================================================

	public String COURSE_REPORT_VIEW = "/reports/CourseListReport.jrxml";
	public String STUDENT_REPORT_VIEW = "/reports/StudentListReport.jrxml";
	public String COLLEGE_REPORT_VIEW = "/reports/CollegeListReport.jrxml";
	public String USER_REPORT_VIEW = "/reports/UserListReport.jrxml";
	public String ROLE_REPORT_VIEW = "/reports/RoleListReport.jrxml";
	public String SUBJECT_REPORT_VIEW = "/reports/SubjectListReport.jrxml";
	public String MARKSHEET_REPORT_VIEW = "/reports/MarksheetListReport.jrxml";
	public String FACULTY_REPORT_VIEW = "/reports/FacultyListReport.jrxml";
	public String SMART_PARKING_REPORT_VIEW = "/reports/SmartParkingListReport.jrxml";
	public String QR_SCANNER_REPORT_VIEW = "/reports/QRScannerListReport.jrxml";
	public String WATER_MONITORING_REPORT_VIEW = "/reports/WaterMonitoringListReport.jrxml";
	public String SMART_LIGHT_REPORT_VIEW = "/reports/SmartLightListReport.jrxml";
	public String ENERGY_CONSUMPTION_REPORT_VIEW = "/reports/EnergyConsumptionListReport.jrxml";
	public String AI_RECOMMENDATION_REPORT_VIEW = "/reports/AIRecommendationListReport.jrxml";
	public String DEPARTMENT_REPORT_VIEW = "/reports/DepartmentListReport.jrxml";
	public String EXAM_REPORT_VIEW = "/reports/ExamListReport.jrxml";
	public String CUSTOMER_REPORT_VIEW = "/reports/CustomerListReport.jrxml";
	public String VEHICLE_REPORT_VIEW = "/reports/VehicleListReport.jrxml";
	public String BOOK_REPORT_VIEW = "/reports/BookListReport.jrxml";
	public String DOCTOR_REPORT_VIEW = "/reports/DoctorListReport.jrxml";
	public String PATIENT_REPORT_VIEW = "/reports/PatientListReport.jrxml";
	public String LIBRARY_REPORT_VIEW = "/reports/LibraryListReport.jrxml";
	public String BANK_ACCOUNT_REPORT_VIEW = "/reports/BankAccountListReport.jrxml";
	public String VENDOR_REPORT_VIEW = "/reports/VendorListReport.jrxml";
	public String SERVICE_REPORT_VIEW = "/reports/ServiceListReport.jrxml";
	public String EMPLOYEE_REPORT_VIEW = "/reports/EmployeeListReport.jrxml";
	
}
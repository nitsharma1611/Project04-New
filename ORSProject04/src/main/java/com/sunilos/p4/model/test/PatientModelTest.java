package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.PatientBean;
import com.sunilos.p4.model.PatientModel;

public class PatientModelTest {

	public static PatientModel model = new PatientModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByPatientName();
		// testFindByUniqueColumn();
		// testSearch();
		// testSearchPage();
		// testList();
		testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();

		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		PatientBean bean = new PatientBean();

		bean.setPatientName("Rahulji Sharma");
		bean.setDisease("Fever");
		bean.setDoctorName("Dr. Rajesh Sharma");

		// Admission Date
		bean.setAdmissionDate(new java.util.Date());

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		PatientBean bean = new PatientBean();

		bean.setId(26);
		bean.setPatientName("Rahul Sharmaji Updated");
		bean.setDisease("Cold and Fever");
		bean.setDoctorName("Dr. Rajesh Sharma");

		bean.setAdmissionDate(new java.util.Date());

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(26);

		System.out.println("Record Deleted");
	}

	public static void testFindByPK() throws Exception {

		PatientBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getPatientName());
			System.out.println(bean.getDisease());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getAdmissionDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByPatientName() throws Exception {

		PatientBean bean = model.findByPatientName("Rahul Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getPatientName());
			System.out.println(bean.getDisease());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getAdmissionDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		PatientBean bean = model.findByUniqueColumn("patientName", "Rahul Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getPatientName());
			System.out.println(bean.getDisease());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getAdmissionDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		PatientBean bean = new PatientBean();

		bean.setPatientName("Amit");

		List<PatientBean> list = model.search(bean);

		Iterator<PatientBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getPatientName() + "\t"
					+ bean.getDisease() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getAdmissionDate());
		}
	}

	public static void testSearchPage() throws Exception {

		PatientBean bean = new PatientBean();

		bean.setPatientName("Rahul");

		List<PatientBean> list = model.search(bean, 1, 5);

		Iterator<PatientBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getPatientName() + "\t"
					+ bean.getDisease() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getAdmissionDate());
		}
	}

	public static void testList() throws Exception {

		List<PatientBean> list = model.list();

		Iterator<PatientBean> it = list.iterator();

		while (it.hasNext()) {

			PatientBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getPatientName() + "\t"
					+ bean.getDisease() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getAdmissionDate());
		}
	}

	public static void testListPage() throws Exception {

		List<PatientBean> list = model.list(1, 5);

		Iterator<PatientBean> it = list.iterator();

		while (it.hasNext()) {

			PatientBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getPatientName() + "\t"
					+ bean.getDisease() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getAdmissionDate());
		}
	}
}
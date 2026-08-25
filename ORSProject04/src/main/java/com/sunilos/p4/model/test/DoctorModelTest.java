package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.DoctorBean;
import com.sunilos.p4.model.DoctorModel;

public class DoctorModelTest {

	public static DoctorModel model = new DoctorModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		//testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByDoctorName();
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

		DoctorBean bean = new DoctorBean();

		bean.setDoctorName("Dr. Rajesh Sharma ji");
		bean.setSpecialization("Cardiologist");
		bean.setExperience(12);
		bean.setContactNo("9876543210");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		DoctorBean bean = new DoctorBean();

		bean.setId(26);
		bean.setDoctorName("Dr. Rajesh ji Sharma Updated");
		bean.setSpecialization("Cardiologist");
		bean.setExperience(15);
		bean.setContactNo("9876543211");

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

		DoctorBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getSpecialization());
			System.out.println(bean.getExperience());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByDoctorName() throws Exception {

		DoctorBean bean = model.findByDoctorName("Dr. Rajesh Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getSpecialization());
			System.out.println(bean.getExperience());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		DoctorBean bean = model.findByUniqueColumn("doctorName", "Dr. Rajesh Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDoctorName());
			System.out.println(bean.getSpecialization());
			System.out.println(bean.getExperience());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		DoctorBean bean = new DoctorBean();

		bean.setDoctorName("Dr.");

		List<DoctorBean> list = model.search(bean);

		Iterator<DoctorBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getSpecialization() + "\t"
					+ bean.getExperience() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testSearchPage() throws Exception {

		DoctorBean bean = new DoctorBean();

		bean.setDoctorName("Dr.");

		List<DoctorBean> list = model.search(bean, 1, 5);

		Iterator<DoctorBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getSpecialization() + "\t"
					+ bean.getExperience() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testList() throws Exception {

		List<DoctorBean> list = model.list();

		Iterator<DoctorBean> it = list.iterator();

		while (it.hasNext()) {

			DoctorBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getSpecialization() + "\t"
					+ bean.getExperience() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testListPage() throws Exception {

		List<DoctorBean> list = model.list(1, 5);

		Iterator<DoctorBean> it = list.iterator();

		while (it.hasNext()) {

			DoctorBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDoctorName() + "\t"
					+ bean.getSpecialization() + "\t"
					+ bean.getExperience() + "\t"
					+ bean.getContactNo());
		}
	}
}
package com.sunilos.p4.model.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.FacultyBean;
import com.sunilos.p4.model.FacultyModel;

public class FacultyModelTest {

	public static FacultyModel model = new FacultyModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		 //testDelete();
		//testFindByPk();
		 //testFindByEmail();
		 //testFindByUniqueColumn();
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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		FacultyBean bean = new FacultyBean();

		bean.setCollegeId(1);
		bean.setFirstName("Nitin");
		bean.setLastName("Sharma");
		bean.setEmail("nitin@gmail.com");
		bean.setMobileNo("9876543210");
		bean.setAddress("Indore");
		bean.setGender("Male");
		bean.setDob(sdf.parse("1998-10-15"));

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		FacultyBean bean = new FacultyBean();

		bean.setId(1);
		bean.setCollegeId(1);
		bean.setFirstName("Rahul");
		bean.setLastName("Verma");
		bean.setEmail("rahul@gmail.com");
		bean.setMobileNo("9999999999");
		bean.setAddress("Bhopal");
		bean.setGender("Male");
		bean.setDob(sdf.parse("1997-05-20"));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(1);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		FacultyBean bean = model.findByPK(2);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getEmail());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getGender());
			System.out.println(bean.getDob());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByEmail() throws Exception {

		FacultyBean bean = model.findByEmail("rahul3@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getEmail());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		FacultyBean bean = model.findByUniqueColumn("EMAIL", "rahul3@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getEmail());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		FacultyBean bean = new FacultyBean();

		bean.setFirstName("Rahul");

		List<FacultyBean> list = model.search(bean);

		Iterator<FacultyBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLastName() + "\t"
					+ bean.getEmail() + "\t"
					+ bean.getCollegeName());
		}
	}

	public static void testSearchPage() throws Exception {

		FacultyBean bean = new FacultyBean();

		bean.setCollegeId(1);

		List<FacultyBean> list = model.search(bean, 1, 5);

		Iterator<FacultyBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getEmail());
		}
	}

	public static void testList() throws Exception {

		List<FacultyBean> list = model.list();

		Iterator<FacultyBean> it = list.iterator();

		while (it.hasNext()) {

			FacultyBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLastName() + "\t"
					+ bean.getEmail() + "\t"
					+ bean.getCollegeName());
		}
	}

	public static void testListPage() throws Exception {

		List<FacultyBean> list = model.list(1, 5);

		Iterator<FacultyBean> it = list.iterator();

		while (it.hasNext()) {

			FacultyBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getEmail());
		}
	}
}
package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.StudentBean;
import com.sunilos.p4.model.StudentModel;

public class StudentModelTest {

	public static StudentModel model = new StudentModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		 //testFindByEmailId();
		//testFindByUniqueColumn();
		// testSearch();
		// testSearchPage();
		 //testList();
		testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		StudentBean bean = new StudentBean();

		bean.setCollegeId(1l);
		bean.setFirstName("Nitin");
		bean.setLastName("Sharma");
		bean.setDob(sdf.parse("2002-05-15"));
		bean.setMobileNo("9876543210");
		bean.setEmail("nitin@gmail.com");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		StudentBean bean = new StudentBean();

		bean.setId(1);
		bean.setCollegeId(1l);
		bean.setFirstName("Rahul");
		bean.setLastName("Verma");
		bean.setDob(sdf.parse("2001-08-20"));
		bean.setMobileNo("9999999999");
		bean.setEmail("rahul@gmail.com");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(1);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		StudentBean bean = model.findByPK(20);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByEmailId() throws Exception {

		StudentBean bean = model.findByEmailId("rohan5@gmail.com");

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

		StudentBean bean = model.findByUniqueColumn("EMAIL", "rohan5@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getEmail());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		StudentBean bean = new StudentBean();

		bean.setFirstName("Rahul");

		List<StudentBean> list = model.search(bean);

		Iterator<StudentBean> it = list.iterator();

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

		StudentBean bean = new StudentBean();

		bean.setCollegeId(1l);

		List<StudentBean> list = model.search(bean, 1, 5);

		Iterator<StudentBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getEmail());
		}
	}

	public static void testList() throws Exception {

		List<StudentBean> list = model.list();

		Iterator<StudentBean> it = list.iterator();

		while (it.hasNext()) {

			StudentBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLastName() + "\t"
					+ bean.getEmail() + "\t"
					+ bean.getCollegeName());
		}
	}

	public static void testListPage() throws Exception {

		List<StudentBean> list = model.list(1, 5);

		Iterator<StudentBean> it = list.iterator();

		while (it.hasNext()) {

			StudentBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getEmail());
		}
	}
}
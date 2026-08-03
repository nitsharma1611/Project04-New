package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.CollegeBean;
import com.sunilos.p4.model.CollegeModel;

public class CollegeModelTest {

	public static CollegeModel model = new CollegeModel();

	public static void main(String[] args) throws Exception {

		 //testNextPK();
		// testAdd();
		 testUpdate();
		 //testDelete();
		// testFindByPk();
		// testFindByName();
		// testFindByUniqueColumn();
		// testSearch();
		// testSearchPage();
		// testList();
		// testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setName("Medicaps");
		bean.setAddress("A.B. Road");
		bean.setState("Madhya Pradesh");
		bean.setCity("Indore");
		bean.setPhoneNo("9876543210");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setId(1);
		bean.setName("JIT Institute");
		bean.setAddress("Bypass Road");
		bean.setState("Madhya Pradesh");
		bean.setCity("Khargone");
		bean.setPhoneNo("9999999999");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		
	}

	public static void testDelete() throws Exception {

		model.delete(27);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		CollegeBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhoneNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByName() throws Exception {

		CollegeBean bean = model.findByName("Medicaps University");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhoneNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		CollegeBean bean = model.findByUniqueColumn("NAME", "Medicaps University");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setCity("Indore");

		List<CollegeBean> list = model.search(bean);

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getState() + "\t"
					+ bean.getCity() + "\t"
					+ bean.getPhoneNo());
		}
	}

	public static void testSearchPage() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setState("Madhya Pradesh");

		List<CollegeBean> list = model.search(bean, 1, 5);

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getCity());
		}
	}

	public static void testList() throws Exception {

		List<CollegeBean> list = model.list();

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {

			CollegeBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getState() + "\t"
					+ bean.getCity() + "\t"
					+ bean.getPhoneNo());
		}
	}

	public static void testListPage() throws Exception {

		List<CollegeBean> list = model.list(1, 5);

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {

			CollegeBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getCity());
		}
	}
}
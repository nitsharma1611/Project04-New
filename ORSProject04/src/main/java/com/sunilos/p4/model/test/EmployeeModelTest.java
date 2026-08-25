package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.EmployeeBean;
import com.sunilos.p4.model.EmployeeModel;

public class EmployeeModelTest {

	public static EmployeeModel model = new EmployeeModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		 testUpdate();
		// testDelete();
		// testFindByPK();
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

		EmployeeBean bean = new EmployeeBean();

		bean.setName("Nitin Sharma");
		bean.setSalary(45000.0);
		bean.setDesignation("Developer");
		bean.setJoiningDate(new Date());

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		EmployeeBean bean = new EmployeeBean();

		bean.setId(26);
		bean.setName("Rahul Sharma Updated");
		bean.setSalary(50000.0);
		bean.setDesignation("Senior Developer");
		bean.setJoiningDate(new Date());

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

		EmployeeBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSalary());
			System.out.println(bean.getDesignation());
			System.out.println(bean.getJoiningDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByName() throws Exception {

		EmployeeBean bean = model.findByName("Rahul Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSalary());
			System.out.println(bean.getDesignation());
			System.out.println(bean.getJoiningDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		EmployeeBean bean = model.findByUniqueColumn(
				"name", "Rahul Sharma");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSalary());
			System.out.println(bean.getDesignation());
			System.out.println(bean.getJoiningDate());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		EmployeeBean bean = new EmployeeBean();

		bean.setName("Rahul");

		List<EmployeeBean> list = model.search(bean);

		Iterator<EmployeeBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getSalary() + "\t"
					+ bean.getDesignation() + "\t"
					+ bean.getJoiningDate());
		}
	}

	public static void testSearchPage() throws Exception {

		EmployeeBean bean = new EmployeeBean();

		bean.setName("Rahul");

		List<EmployeeBean> list = model.search(bean, 1, 5);

		Iterator<EmployeeBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getSalary() + "\t"
					+ bean.getDesignation() + "\t"
					+ bean.getJoiningDate());
		}
	}

	public static void testList() throws Exception {

		List<EmployeeBean> list = model.list();

		Iterator<EmployeeBean> it = list.iterator();

		while (it.hasNext()) {

			EmployeeBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getSalary() + "\t"
					+ bean.getDesignation() + "\t"
					+ bean.getJoiningDate());
		}
	}

	public static void testListPage() throws Exception {

		List<EmployeeBean> list = model.list(1, 5);

		Iterator<EmployeeBean> it = list.iterator();

		while (it.hasNext()) {

			EmployeeBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getSalary() + "\t"
					+ bean.getDesignation() + "\t"
					+ bean.getJoiningDate());
		}
	}
}
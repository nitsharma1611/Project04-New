package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.DepartmentBean;
import com.sunilos.p4.model.DepartmentModel;

public class DepartmentModelTest {

	public static DepartmentModel model = new DepartmentModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByDepartmentName();
		// testFindByUniqueColumn();
		// testSearch();
		 //testSearchPage();
		//testList();
		testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		DepartmentBean bean = new DepartmentBean();

		bean.setDepartmentName("Robotics");
		bean.setHodName("Dr. Anil Sharma");
		bean.setTotalFaculty(20);
		bean.setLocation("Block A");
		bean.setStatus("Active");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		DepartmentBean bean = new DepartmentBean();

		bean.setId(26);
		bean.setDepartmentName("Robotics");
		bean.setHodName("Dr. Rajesh Sharma");
		bean.setTotalFaculty(25);
		bean.setLocation("Block B");
		bean.setStatus("Inactive");

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

	public static void testFindByPk() throws Exception {

		DepartmentBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDepartmentName());
			System.out.println(bean.getHodName());
			System.out.println(bean.getTotalFaculty());
			System.out.println(bean.getLocation());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByDepartmentName() throws Exception {

		DepartmentBean bean = model.findByDepartmentName("Computer Science");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDepartmentName());
			System.out.println(bean.getHodName());
			System.out.println(bean.getTotalFaculty());
			System.out.println(bean.getLocation());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		DepartmentBean bean = model.findByUniqueColumn("departmentName", "Computer Science");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDepartmentName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		DepartmentBean bean = new DepartmentBean();

		bean.setStatus("Active");

		List<DepartmentBean> list = model.search(bean);

		Iterator<DepartmentBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDepartmentName() + "\t"
					+ bean.getHodName() + "\t"
					+ bean.getTotalFaculty() + "\t"
					+ bean.getLocation() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		DepartmentBean bean = new DepartmentBean();

		bean.setStatus("Active");

		List<DepartmentBean> list = model.search(bean, 1, 5);

		Iterator<DepartmentBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDepartmentName() + "\t"
					+ bean.getHodName());
		}
	}

	public static void testList() throws Exception {

		List<DepartmentBean> list = model.list();

		Iterator<DepartmentBean> it = list.iterator();

		while (it.hasNext()) {

			DepartmentBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDepartmentName() + "\t"
					+ bean.getHodName() + "\t"
					+ bean.getTotalFaculty() + "\t"
					+ bean.getLocation() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<DepartmentBean> list = model.list(1, 5);

		Iterator<DepartmentBean> it = list.iterator();

		while (it.hasNext()) {

			DepartmentBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getDepartmentName() + "\t"
					+ bean.getHodName());
		}
	}
}
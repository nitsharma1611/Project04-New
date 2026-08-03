package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.MarksheetBean;
import com.sunilos.p4.model.MarksheetModel;

public class MarksheetModelTest {

	public static MarksheetModel model = new MarksheetModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByRollNo();
		// testFindByUniqueColumn();
		// testSearch();
		// testSearchPage();
		// testList();
		// testListPage();
		// testMeritList();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();

		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRollNo("A101");
		bean.setStudentId(1L);
		bean.setPhysics(85);
		bean.setChemistry(90);
		bean.setMaths(95);

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(1);
		bean.setRollNo("A101");
		bean.setStudentId(1L);
		bean.setPhysics(80);
		bean.setChemistry(85);
		bean.setMaths(90);

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

		MarksheetBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getStudentId());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByRollNo() throws Exception {

		MarksheetBean bean = model.findByRollNo("A101");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		MarksheetBean bean = model.findByUniqueColumn("ROLL_NO", "A101");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRollNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRollNo("A");

		List<MarksheetBean> list = model.search(bean);

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRollNo() + "\t"
					+ bean.getName() + "\t"
					+ bean.getPhysics() + "\t"
					+ bean.getChemistry() + "\t"
					+ bean.getMaths());
		}
	}

	public static void testSearchPage() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setPhysics(80);

		List<MarksheetBean> list = model.search(bean, 1, 5);

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRollNo() + "\t"
					+ bean.getName());
		}
	}

	public static void testList() throws Exception {

		List<MarksheetBean> list = model.list();

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRollNo() + "\t"
					+ bean.getName() + "\t"
					+ bean.getPhysics() + "\t"
					+ bean.getChemistry() + "\t"
					+ bean.getMaths());
		}
	}

	public static void testListPage() throws Exception {

		List<MarksheetBean> list = model.list(1, 5);

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRollNo() + "\t"
					+ bean.getName());
		}
	}

	public static void testMeritList() throws Exception {

		List<MarksheetBean> list = model.getMeritList(1, 10);

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = it.next();

			int total = bean.getPhysics() + bean.getChemistry() + bean.getMaths();

			System.out.println(bean.getId() + "\t"
					+ bean.getRollNo() + "\t"
					+ bean.getName() + "\t"
					+ bean.getPhysics() + "\t"
					+ bean.getChemistry() + "\t"
					+ bean.getMaths() + "\t"
					+ total);
		}
	}
}
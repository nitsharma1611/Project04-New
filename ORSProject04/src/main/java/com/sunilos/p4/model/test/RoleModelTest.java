package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.RoleBean;
import com.sunilos.p4.model.RoleModel;

public class RoleModelTest {

	public static RoleModel model = new RoleModel();

	public static void main(String[] args) throws Exception {

		 testNextPK();
		// testAdd();
		// testUpdate();
		 testDelete();
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

		RoleBean bean = new RoleBean();

		bean.setName("AdminRole");
		bean.setDescription("Administrator ");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setId(5);
		bean.setName("Super Admin");
		bean.setDescription("System Administrator");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(5);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		RoleBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByName() throws Exception {

		RoleBean bean = model.findByName("Super Admin");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		RoleBean bean = model.findByUniqueColumn("NAME", "Super Admin");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setName("Admin");

		List<RoleBean> list = model.search(bean);

		Iterator<RoleBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription());
		}
	}

	public static void testSearchPage() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setDescription("System");

		List<RoleBean> list = model.search(bean, 1, 5);

		Iterator<RoleBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription());
		}
	}

	public static void testList() throws Exception {

		List<RoleBean> list = model.list();

		Iterator<RoleBean> it = list.iterator();

		while (it.hasNext()) {

			RoleBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription());
		}
	}

	public static void testListPage() throws Exception {

		List<RoleBean> list = model.list(1, 5);

		Iterator<RoleBean> it = list.iterator();

		while (it.hasNext()) {

			RoleBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription());
		}
	}
}
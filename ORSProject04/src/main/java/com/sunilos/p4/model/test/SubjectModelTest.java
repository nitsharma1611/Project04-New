package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.SubjectBean;
import com.sunilos.p4.model.SubjectModel;

public class SubjectModelTest {

	public static SubjectModel model = new SubjectModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
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

		SubjectBean bean = new SubjectBean();

		bean.setName("Java");
		bean.setDescription("Java Programming Language");
		bean.setCourseId(1);

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SubjectBean bean = new SubjectBean();

		bean.setId(26);
		bean.setName("Advanced Java");
		bean.setDescription("JDBC, Servlet, JSP");
		bean.setCourseId(1);

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
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

		SubjectBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCourseId());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByName() throws Exception {

		SubjectBean bean = model.findByName("Java");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCourseId());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		SubjectBean bean = model.findByUniqueColumn("NAME", "Advanced Java");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		SubjectBean bean = new SubjectBean();

		bean.setName("Java");

		List<SubjectBean> list = model.search(bean);

		Iterator<SubjectBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getCourseId());
		}
	}

	public static void testSearchPage() throws Exception {

		SubjectBean bean = new SubjectBean();

		bean.setCourseId(1);

		List<SubjectBean> list = model.search(bean, 1, 5);

		Iterator<SubjectBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getCourseId());
		}
	}

	public static void testList() throws Exception {

		List<SubjectBean> list = model.list();

		Iterator<SubjectBean> it = list.iterator();

		while (it.hasNext()) {

			SubjectBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getCourseId());
		}
	}

	public static void testListPage() throws Exception {

		List<SubjectBean> list = model.list(1, 5);

		Iterator<SubjectBean> it = list.iterator();

		while (it.hasNext()) {

			SubjectBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getCourseId());
		}
	}
}
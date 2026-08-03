package com.sunilos.p4.model.test;

import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.CourseBean;
import com.sunilos.p4.model.CourseModel;

public class CourseModelTest {

	public static CourseModel model = new CourseModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		 //testFindByName();
		// testFindByUniqueColumn();
		// testSearch();
		 testSearchPage();
		// testList();
		// testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		CourseBean bean = new CourseBean();

		bean.setName("Java Full Stack");
		bean.setDescription("Java, Spring Boot, React");
		bean.setDuration("6 Months");

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		CourseBean bean = new CourseBean();

		bean.setId(1);
		bean.setName("Advanced Java");
		bean.setDescription("JSP, Servlet, JDBC");
		bean.setDuration("4 Months");

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(1);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		CourseBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getDuration());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByName() throws Exception {

		CourseBean bean = model.findByName("Advanced Java");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getDuration());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		CourseBean bean = model.findByUniqueColumn("NAME", "Advanced Java");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		CourseBean bean = new CourseBean();

		bean.setName("Java");

		List<CourseBean> list = model.search(bean);

		Iterator<CourseBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getDuration());
		}
	}

	public static void testSearchPage() throws Exception {

		CourseBean bean = new CourseBean();

		bean.setDuration("6");

		List<CourseBean> list = model.search(bean, 1, 5);

		Iterator<CourseBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription()+ "\t"
					+ bean.getDuration());
		}
	}

	public static void testList() throws Exception {

		List<CourseBean> list = model.list();

		Iterator<CourseBean> it = list.iterator();

		while (it.hasNext()) {

			CourseBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getDuration());
		}
	}

	public static void testListPage() throws Exception {

		List<CourseBean> list = model.list(1, 5);

		Iterator<CourseBean> it = list.iterator();

		while (it.hasNext()) {

			CourseBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getName() + "\t"
					+ bean.getDuration());
		}
	}
}
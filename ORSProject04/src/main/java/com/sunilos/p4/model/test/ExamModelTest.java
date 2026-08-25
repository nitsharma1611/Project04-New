package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.ExamBean;
import com.sunilos.p4.model.ExamModel;

public class ExamModelTest {

	public static ExamModel model = new ExamModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
	//	 testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByExamName();
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

		ExamBean bean = new ExamBean();

		bean.setExamName("Java Advanced");
		bean.setExamDate(new SimpleDateFormat("yyyy-MM-dd").parse("2026-08-10"));
		bean.setTotalMarks(100);
		bean.setPassingMarks(40);

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		ExamBean bean = new ExamBean();

		bean.setId(26);
		bean.setExamName("Java Advanced");
		bean.setExamDate(new SimpleDateFormat("yyyy-MM-dd").parse("2026-08-15"));
		bean.setTotalMarks(100);
		bean.setPassingMarks(35);

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

		ExamBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getExamName());
			System.out.println(bean.getExamDate());
			System.out.println(bean.getTotalMarks());
			System.out.println(bean.getPassingMarks());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByExamName() throws Exception {

		ExamBean bean = model.findByExamName("Java Basics");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getExamName());
			System.out.println(bean.getExamDate());
			System.out.println(bean.getTotalMarks());
			System.out.println(bean.getPassingMarks());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		ExamBean bean = model.findByUniqueColumn("examName", "Java Basics");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getExamName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		ExamBean bean = new ExamBean();

		bean.setExamName("Java");

		List<ExamBean> list = model.search(bean);

		Iterator<ExamBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getExamName() + "\t"
					+ bean.getExamDate() + "\t"
					+ bean.getTotalMarks() + "\t"
					+ bean.getPassingMarks());
		}
	}

	public static void testSearchPage() throws Exception {

		ExamBean bean = new ExamBean();

		bean.setExamName("Java");

		List<ExamBean> list = model.search(bean, 1, 5);

		Iterator<ExamBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getExamName() + "\t"
					+ bean.getExamDate());
		}
	}

	public static void testList() throws Exception {

		List<ExamBean> list = model.list();

		Iterator<ExamBean> it = list.iterator();

		while (it.hasNext()) {

			ExamBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getExamName() + "\t"
					+ bean.getExamDate() + "\t"
					+ bean.getTotalMarks() + "\t"
					+ bean.getPassingMarks());
		}
	}

	public static void testListPage() throws Exception {

		List<ExamBean> list = model.list(1, 5);

		Iterator<ExamBean> it = list.iterator();

		while (it.hasNext()) {

			ExamBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getExamName() + "\t"
					+ bean.getExamDate());
		}
	}
}
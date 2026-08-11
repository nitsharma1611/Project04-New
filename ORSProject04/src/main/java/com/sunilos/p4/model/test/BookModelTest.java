package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.BookBean;
import com.sunilos.p4.model.BookModel;

public class BookModelTest {

	public static BookModel model = new BookModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
	// testFindByPK();
		// testFindByTitle();
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

		BookBean bean = new BookBean();

		bean.setTitle("Java Programming+");
		bean.setAuthor("James Gosling");
		bean.setPrice(550.00);
		bean.setPublicationYear(2020);

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		BookBean bean = new BookBean();

		bean.setId(25);
		bean.setTitle("Java Programming+ Updated");
		bean.setAuthor("James Gosling");
		bean.setPrice(600.00);
		bean.setPublicationYear(2021);

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

		BookBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getTitle());
			System.out.println(bean.getAuthor());
			System.out.println(bean.getPrice());
			System.out.println(bean.getPublicationYear());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByTitle() throws Exception {

		BookBean bean = model.findByUniqueColumn("title", "Java Programming");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getTitle());
			System.out.println(bean.getAuthor());
			System.out.println(bean.getPrice());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		BookBean bean = model.findByUniqueColumn("title", "Java Programming");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getTitle());
			System.out.println(bean.getAuthor());
			System.out.println(bean.getPrice());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		BookBean bean = new BookBean();

		bean.setTitle("Java");

		List<BookBean> list = model.search(bean);

		Iterator<BookBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getTitle() + "\t"
					+ bean.getAuthor() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getPublicationYear());
		}
	}

	public static void testSearchPage() throws Exception {

		BookBean bean = new BookBean();

		bean.setTitle("Java");

		List<BookBean> list = model.search(bean, 1, 5);

		Iterator<BookBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getTitle() + "\t"
					+ bean.getAuthor() + "\t"
					+ bean.getPrice());
		}
	}

	public static void testList() throws Exception {

		List<BookBean> list = model.list();

		Iterator<BookBean> it = list.iterator();

		while (it.hasNext()) {

			BookBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getTitle() + "\t"
					+ bean.getAuthor() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getPublicationYear());
		}
	}

	public static void testListPage() throws Exception {

		List<BookBean> list = model.list(1, 5);

		Iterator<BookBean> it = list.iterator();

		while (it.hasNext()) {

			BookBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getTitle() + "\t"
					+ bean.getAuthor() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getPublicationYear());
		}
	}
}
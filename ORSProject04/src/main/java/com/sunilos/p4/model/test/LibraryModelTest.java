
package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.LibraryBean;
import com.sunilos.p4.model.LibraryModel;

public class LibraryModelTest {

	public static LibraryModel model = new LibraryModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		 //testUpdate();
		 //testDelete();
		//testFindByPK();
		// testFindByLibraryName();
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

		LibraryBean bean = new LibraryBean();

		bean.setLibraryName("Centralji Library");
		bean.setAddress("Indore");
		bean.setTotalBooks(5000);
		bean.setContactNo("9876543210");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		LibraryBean bean = new LibraryBean();

		bean.setId(1);
		bean.setLibraryName("Central Library Updated");
		bean.setAddress("Indore Updated");
		bean.setTotalBooks(6000);
		bean.setContactNo("9876543211");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(27);

		System.out.println("Record Deleted");
	}

	public static void testFindByPK() throws Exception {

		LibraryBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLibraryName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getTotalBooks());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByLibraryName() throws Exception {

		LibraryBean bean = model.findByLibraryName("Sharda Library");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLibraryName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getTotalBooks());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		LibraryBean bean = model.findByUniqueColumn(
				"libraryName", "Sharda Library");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLibraryName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getTotalBooks());
			System.out.println(bean.getContactNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		LibraryBean bean = new LibraryBean();

		bean.setLibraryName("Central");

		List<LibraryBean> list = model.search(bean);

		Iterator<LibraryBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLibraryName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getTotalBooks() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testSearchPage() throws Exception {

		LibraryBean bean = new LibraryBean();

		bean.setLibraryName("Central");

		List<LibraryBean> list = model.search(bean, 1, 5);

		Iterator<LibraryBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLibraryName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getTotalBooks() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testList() throws Exception {

		List<LibraryBean> list = model.list();

		Iterator<LibraryBean> it = list.iterator();

		while (it.hasNext()) {

			LibraryBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLibraryName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getTotalBooks() + "\t"
					+ bean.getContactNo());
		}
	}

	public static void testListPage() throws Exception {

		List<LibraryBean> list = model.list(1, 5);

		Iterator<LibraryBean> it = list.iterator();

		while (it.hasNext()) {

			LibraryBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLibraryName() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getTotalBooks() + "\t"
					+ bean.getContactNo());
		}
	}
}

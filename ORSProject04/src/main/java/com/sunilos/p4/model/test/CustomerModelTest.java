package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.CustomerBean;
import com.sunilos.p4.model.CustomerModel;

public class CustomerModelTest {

	public static CustomerModel model = new CustomerModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByEmail();
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

		CustomerBean bean = new CustomerBean();

		bean.setCustomerName("Nitin Sharma");
		bean.setEmail("nitin@gmail.com");
		bean.setPhoneNumber("9876543210");
		bean.setAddress("Indore");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		CustomerBean bean = new CustomerBean();

		bean.setId(1);
		bean.setCustomerName("Nitin Sharma Updated");
		bean.setEmail("nitin@gmail.com");
		bean.setPhoneNumber("9999999999");
		bean.setAddress("Bhopal");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
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

		CustomerBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCustomerName());
			System.out.println(bean.getEmail());
			System.out.println(bean.getPhoneNumber());
			System.out.println(bean.getAddress());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByEmail() throws Exception {

		CustomerBean bean = model.findByEmail("nitin@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCustomerName());
			System.out.println(bean.getEmail());
			System.out.println(bean.getPhoneNumber());
			System.out.println(bean.getAddress());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		CustomerBean bean = model.findByUniqueColumn("email", "nitin@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCustomerName());
			System.out.println(bean.getEmail());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		CustomerBean bean = new CustomerBean();

		bean.setCustomerName("Nitin");

		List<CustomerBean> list = model.search(bean);

		Iterator<CustomerBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCustomerName() + "\t"
					+ bean.getEmail() + "\t"
					+ bean.getPhoneNumber() + "\t"
					+ bean.getAddress());
		}
	}

	public static void testSearchPage() throws Exception {

		CustomerBean bean = new CustomerBean();

		bean.setCustomerName("Nitin");

		List<CustomerBean> list = model.search(bean, 1, 5);

		Iterator<CustomerBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCustomerName() + "\t"
					+ bean.getEmail());
		}
	}

	public static void testList() throws Exception {

		List<CustomerBean> list = model.list();

		Iterator<CustomerBean> it = list.iterator();

		while (it.hasNext()) {

			CustomerBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCustomerName() + "\t"
					+ bean.getEmail() + "\t"
					+ bean.getPhoneNumber() + "\t"
					+ bean.getAddress());
		}
	}

	public static void testListPage() throws Exception {

		List<CustomerBean> list = model.list(1, 5);

		Iterator<CustomerBean> it = list.iterator();

		while (it.hasNext()) {

			CustomerBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCustomerName() + "\t"
					+ bean.getEmail());
		}
	}
}
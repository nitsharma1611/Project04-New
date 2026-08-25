package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.ServiceBean;
import com.sunilos.p4.model.ServiceModel;

public class ServiceModelTest {

	public static ServiceModel model = new ServiceModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByServiceName();
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

		ServiceBean bean = new ServiceBean();

		bean.setServiceName("AC Repair");
		bean.setPrice(500.0);
		bean.setDescription("AC repair and maintenance service");
		bean.setServiceCategory("Home Service");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		ServiceBean bean = new ServiceBean();

		bean.setId(1);
		bean.setServiceName("AC Repair Updated");
		bean.setPrice(750.0);
		bean.setDescription("AC repair and maintenance service updated");
		bean.setServiceCategory("Home Service");

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

	public static void testFindByPK() throws Exception {

		ServiceBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getServiceName());
			System.out.println(bean.getPrice());
			System.out.println(bean.getDescription());
			System.out.println(bean.getServiceCategory());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByServiceName() throws Exception {

		ServiceBean bean = model.findByServiceName("AC Repair");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getServiceName());
			System.out.println(bean.getPrice());
			System.out.println(bean.getDescription());
			System.out.println(bean.getServiceCategory());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		ServiceBean bean = model.findByUniqueColumn(
				"serviceName", "AC Repair");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getServiceName());
			System.out.println(bean.getPrice());
			System.out.println(bean.getDescription());
			System.out.println(bean.getServiceCategory());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		ServiceBean bean = new ServiceBean();

		bean.setServiceName("AC");

		List<ServiceBean> list = model.search(bean);

		Iterator<ServiceBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getServiceName() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getServiceCategory());
		}
	}

	public static void testSearchPage() throws Exception {

		ServiceBean bean = new ServiceBean();

		bean.setServiceName("AC");

		List<ServiceBean> list = model.search(bean, 1, 5);

		Iterator<ServiceBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getServiceName() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getServiceCategory());
		}
	}

	public static void testList() throws Exception {

		List<ServiceBean> list = model.list();

		Iterator<ServiceBean> it = list.iterator();

		while (it.hasNext()) {

			ServiceBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getServiceName() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getServiceCategory());
		}
	}

	public static void testListPage() throws Exception {

		List<ServiceBean> list = model.list(1, 5);

		Iterator<ServiceBean> it = list.iterator();

		while (it.hasNext()) {

			ServiceBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getServiceName() + "\t"
					+ bean.getPrice() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getServiceCategory());
		}
	}
}
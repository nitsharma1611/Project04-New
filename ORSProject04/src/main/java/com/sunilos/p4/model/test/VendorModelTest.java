package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.VendorBean;
import com.sunilos.p4.model.VendorModel;

public class VendorModelTest {

	public static VendorModel model = new VendorModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByVendorName();
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

		VendorBean bean = new VendorBean();

		bean.setVendorName("ABC Suppliers");
		bean.setMobileNo("9876543210");
		bean.setAddress("Indore");
		bean.setServiceType("Stationery");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		VendorBean bean = new VendorBean();

		bean.setId(1);
		bean.setVendorName("ABC Suppliers Updated");
		bean.setMobileNo("9876543211");
		bean.setAddress("Indore Updated");
		bean.setServiceType("Office Stationery");

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

		VendorBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVendorName());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getServiceType());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByVendorName() throws Exception {

		VendorBean bean = model.findByVendorName("ABC Suppliers");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVendorName());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getServiceType());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		VendorBean bean = model.findByUniqueColumn(
				"vendorName", "ABC Suppliers");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVendorName());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getServiceType());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		VendorBean bean = new VendorBean();

		bean.setVendorName("ABC");

		List<VendorBean> list = model.search(bean);

		Iterator<VendorBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVendorName() + "\t"
					+ bean.getMobileNo() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getServiceType());
		}
	}

	public static void testSearchPage() throws Exception {

		VendorBean bean = new VendorBean();

		bean.setVendorName("ABC");

		List<VendorBean> list = model.search(bean, 1, 5);

		Iterator<VendorBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVendorName() + "\t"
					+ bean.getMobileNo() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getServiceType());
		}
	}

	public static void testList() throws Exception {

		List<VendorBean> list = model.list();

		Iterator<VendorBean> it = list.iterator();

		while (it.hasNext()) {

			VendorBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVendorName() + "\t"
					+ bean.getMobileNo() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getServiceType());
		}
	}

	public static void testListPage() throws Exception {

		List<VendorBean> list = model.list(1, 5);

		Iterator<VendorBean> it = list.iterator();

		while (it.hasNext()) {

			VendorBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVendorName() + "\t"
					+ bean.getMobileNo() + "\t"
					+ bean.getAddress() + "\t"
					+ bean.getServiceType());
		}
	}
}
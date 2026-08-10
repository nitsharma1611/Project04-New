package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.VehicleBean;
import com.sunilos.p4.model.VehicleModel;

public class VehicleModelTest {

	public static VehicleModel model = new VehicleModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		 //testAdd();
		//testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByVehicleName();
		// testFindByUniqueColumn();
		 //testSearch();
		// testSearchPage();
	//	 testList();
		testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();

		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		VehicleBean bean = new VehicleBean();

		bean.setVehicleName("Toyota ");
		bean.setModelName("2024");
		bean.setColor("White");
		bean.setPrice(2850000);

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		VehicleBean bean = new VehicleBean();

		bean.setId(26);
		bean.setVehicleName("Toyota Camry Updated");
		bean.setModelName("2025");
		bean.setColor("Black");
		bean.setPrice(3000000);

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

		VehicleBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVehicleName());
			System.out.println(bean.getModelName());
			System.out.println(bean.getColor());
			System.out.println(bean.getPrice());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByVehicleName() throws Exception {

		VehicleBean bean = model.findByVehicleName("Toyota Camry");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVehicleName());
			System.out.println(bean.getModelName());
			System.out.println(bean.getColor());
			System.out.println(bean.getPrice());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		VehicleBean bean = model.findByUniqueColumn(
				"vehicleName", "Toyota Camry");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getVehicleName());
			System.out.println(bean.getModelName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		VehicleBean bean = new VehicleBean();

		bean.setVehicleName("Toyota");

		List<VehicleBean> list = model.search(bean);

		Iterator<VehicleBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVehicleName() + "\t"
					+ bean.getModelName() + "\t"
					+ bean.getColor() + "\t"
					+ bean.getPrice());
		}
	}

	public static void testSearchPage() throws Exception {

		VehicleBean bean = new VehicleBean();

		bean.setVehicleName("Toyota");

		List<VehicleBean> list = model.search(bean, 1, 5);

		Iterator<VehicleBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVehicleName() + "\t"
					+ bean.getModelName() + "\t"
					+ bean.getColor() + "\t"
					+ bean.getPrice());
		}
	}

	public static void testList() throws Exception {

		List<VehicleBean> list = model.list();

		Iterator<VehicleBean> it = list.iterator();

		while (it.hasNext()) {

			VehicleBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVehicleName() + "\t"
					+ bean.getModelName() + "\t"
					+ bean.getColor() + "\t"
					+ bean.getPrice());
		}
	}

	public static void testListPage() throws Exception {

		List<VehicleBean> list = model.list(1, 5);

		Iterator<VehicleBean> it = list.iterator();

		while (it.hasNext()) {

			VehicleBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getVehicleName() + "\t"
					+ bean.getModelName() + "\t"
					+ bean.getColor() + "\t"
					+ bean.getPrice());
		}
	}
}
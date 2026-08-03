package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.SmartParkingBean;
import com.sunilos.p4.model.SmartParkingModel;

public class SmartParkingModelTest {

	public static SmartParkingModel model = new SmartParkingModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		//testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		 //testFindByParkingCode();
		 //testFindByUniqueColumn();
		 //testSearch();
		// testSearchPage();
		// testList();
		 testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		SmartParkingBean bean = new SmartParkingBean();

		bean.setParkingCode("PK001");
		bean.setVehicleNumber("MP09AB1234");
		bean.setSlotNumber("S01");
		bean.setStatus("Occupied");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SmartParkingBean bean = new SmartParkingBean();

		bean.setId(1);
		bean.setParkingCode("PK001");
		bean.setVehicleNumber("MP09XY9999");
		bean.setSlotNumber("S05");
		bean.setStatus("Available");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
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

		SmartParkingBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getParkingCode());
			System.out.println(bean.getVehicleNumber());
			System.out.println(bean.getSlotNumber());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByParkingCode() throws Exception {

		SmartParkingBean bean = model.findByParkingCode("PK001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getParkingCode());
			System.out.println(bean.getVehicleNumber());
			System.out.println(bean.getSlotNumber());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		SmartParkingBean bean = model.findByUniqueColumn("ParkingCode", "PK001");

		if (bean != null) {
			System.out.println(bean.getId());
			
			System.out.println(bean.getVehicleNumber());
			System.out.println(bean.getSlotNumber());
			System.out.println(bean.getStatus());
		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		SmartParkingBean bean = new SmartParkingBean();

		bean.setStatus("Occupied");

		List<SmartParkingBean> list = model.search(bean);

		Iterator<SmartParkingBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getParkingCode() + "\t"
					+ bean.getVehicleNumber() + "\t"
					+ bean.getSlotNumber() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		SmartParkingBean bean = new SmartParkingBean();

		bean.setStatus("Occupied");

		List<SmartParkingBean> list = model.search(bean, 1, 5);

		Iterator<SmartParkingBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getParkingCode() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testList() throws Exception {

		List<SmartParkingBean> list = model.list();

		Iterator<SmartParkingBean> it = list.iterator();

		while (it.hasNext()) {

			SmartParkingBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getParkingCode() + "\t"
					+ bean.getVehicleNumber() + "\t"
					+ bean.getSlotNumber() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<SmartParkingBean> list = model.list(1, 5);

		Iterator<SmartParkingBean> it = list.iterator();

		while (it.hasNext()) {

			SmartParkingBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getParkingCode() + "\t"
					+ bean.getStatus());
		}
	}
}
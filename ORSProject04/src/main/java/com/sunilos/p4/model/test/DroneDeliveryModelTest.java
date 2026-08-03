package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.DroneDeliveryBean;
import com.sunilos.p4.model.DroneDeliveryModel;

public class DroneDeliveryModelTest {

	public static DroneDeliveryModel model = new DroneDeliveryModel();

	public static void main(String[] args) throws Exception {

		 //testNextPK();
		 //testAdd();
		 //testUpdate();
		// testDelete();
		 //testFindByPk();
		// testFindByDroneCode();
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

		DroneDeliveryBean bean = new DroneDeliveryBean();

		bean.setDroneCode("DRN026");
		bean.setOperatorName("Nitin Sharma");
		bean.setDeliveryZone("Zone F");
		bean.setStatus("Available");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		DroneDeliveryBean bean = new DroneDeliveryBean();

		bean.setId(1);
		bean.setDroneCode("DRN001");
		bean.setOperatorName("Rahul Sharma");
		bean.setDeliveryZone("Zone A");
		bean.setStatus("In Transit");

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

		DroneDeliveryBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDroneCode());
			System.out.println(bean.getOperatorName());
			System.out.println(bean.getDeliveryZone());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByDroneCode() throws Exception {

		DroneDeliveryBean bean = model.findByDroneCode("DRN001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDroneCode());
			System.out.println(bean.getOperatorName());
			System.out.println(bean.getDeliveryZone());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		DroneDeliveryBean bean = model.findByUniqueColumn("drone_code", "DRN001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getDroneCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		DroneDeliveryBean bean = new DroneDeliveryBean();

		bean.setStatus("Available");

		List<DroneDeliveryBean> list = model.search(bean);

		Iterator<DroneDeliveryBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t" + bean.getDroneCode() + "\t" + bean.getOperatorName() + "\t"
					+ bean.getDeliveryZone() + "\t" + bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		DroneDeliveryBean bean = new DroneDeliveryBean();

		bean.setDeliveryZone("Zone A");

		List<DroneDeliveryBean> list = model.search(bean, 1, 5);

		Iterator<DroneDeliveryBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t" + bean.getDroneCode() + "\t" + bean.getOperatorName());
		}
	}

	public static void testList() throws Exception {

		List<DroneDeliveryBean> list = model.list();

		Iterator<DroneDeliveryBean> it = list.iterator();

		while (it.hasNext()) {

			DroneDeliveryBean bean = it.next();

			System.out.println(bean.getId() + "\t" + bean.getDroneCode() + "\t" + bean.getOperatorName() + "\t"
					+ bean.getDeliveryZone() + "\t" + bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<DroneDeliveryBean> list = model.list(2, 5);

		Iterator<DroneDeliveryBean> it = list.iterator();

		while (it.hasNext()) {

			DroneDeliveryBean bean = it.next();

			System.out.println(bean.getId() + "\t" + bean.getDroneCode() + "\t" + bean.getOperatorName());
		}
	}
}
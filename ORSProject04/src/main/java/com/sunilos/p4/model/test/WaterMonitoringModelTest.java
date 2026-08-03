package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.WaterMonitoringBean;
import com.sunilos.p4.model.WaterMonitoringModel;

public class WaterMonitoringModelTest {

	public static WaterMonitoringModel model = new WaterMonitoringModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		 //testAdd();
	 //testUpdate();
		 //testDelete();
		// testFindByPk();
		 //testFindByWaterCode();
		// testFindByUniqueColumn();
		 testSearch();
		// testSearchPage();
		// testList();
		//testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		WaterMonitoringBean bean = new WaterMonitoringBean();

		bean.setWaterCode("WM026");
		bean.setLocation("Indore Dam");
		bean.setWaterLevel(75.5);
		bean.setStatus("Normal");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		WaterMonitoringBean bean = new WaterMonitoringBean();

		bean.setId(26);
		bean.setWaterCode("WM0026");
		bean.setLocation("Bhopal Lake");
		bean.setWaterLevel(88.5);
		bean.setStatus("High");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(2);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		WaterMonitoringBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getWaterCode());
			System.out.println(bean.getLocation());
			System.out.println(bean.getWaterLevel());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByWaterCode() throws Exception {

		WaterMonitoringBean bean = model.findByWaterCode("WM001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getWaterCode());
			System.out.println(bean.getLocation());
			System.out.println(bean.getWaterLevel());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		WaterMonitoringBean bean = model.findByUniqueColumn("waterCode", "WM001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getWaterCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		WaterMonitoringBean bean = new WaterMonitoringBean();

		bean.setStatus("Normal");

		List<WaterMonitoringBean> list = model.search(bean);

		Iterator<WaterMonitoringBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getWaterCode() + "\t"
					+ bean.getLocation() + "\t"
					+ bean.getWaterLevel() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		WaterMonitoringBean bean = new WaterMonitoringBean();

		bean.setStatus("High");

		List<WaterMonitoringBean> list = model.search(bean, 1, 5);

		Iterator<WaterMonitoringBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getWaterCode() + "\t"
					+ bean.getLocation());
		}
	}

	public static void testList() throws Exception {

		List<WaterMonitoringBean> list = model.list();

		Iterator<WaterMonitoringBean> it = list.iterator();

		while (it.hasNext()) {

			WaterMonitoringBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getWaterCode() + "\t"
					+ bean.getLocation() + "\t"
					+ bean.getWaterLevel() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<WaterMonitoringBean> list = model.list(1, 5);

		Iterator<WaterMonitoringBean> it = list.iterator();

		while (it.hasNext()) {

			WaterMonitoringBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getWaterCode() + "\t"
					+ bean.getLocation());
		}
	}
}
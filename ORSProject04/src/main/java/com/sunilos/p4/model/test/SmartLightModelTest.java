package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.SmartLightBean;
import com.sunilos.p4.model.SmartLightModel;

public class SmartLightModelTest {

	public static SmartLightModel model = new SmartLightModel();

	public static void main(String[] args) throws Exception {

		 //testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByLightCode();
		// testFindByUniqueColumn();
		
		
		//testSearch();
		 //testSearchPage();
		 //testList();
		 testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		SmartLightBean bean = new SmartLightBean();

		bean.setLightCode("SL026");
		bean.setRoomName("Conference Room");
		bean.setBrightnessLevel(80);
		bean.setStatus("ON");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SmartLightBean bean = new SmartLightBean();

		bean.setId(26);
		bean.setLightCode("SL026");
		bean.setRoomName("Meeting Room");
		bean.setBrightnessLevel(60);
		bean.setStatus("OFF");

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

		SmartLightBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLightCode());
			System.out.println(bean.getRoomName());
			System.out.println(bean.getBrightnessLevel());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByLightCode() throws Exception {

		SmartLightBean bean = model.findByLightCode("SL001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLightCode());
			System.out.println(bean.getRoomName());
			System.out.println(bean.getBrightnessLevel());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		SmartLightBean bean = model.findByUniqueColumn("lightCode", "SL001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLightCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		SmartLightBean bean = new SmartLightBean();

		bean.setStatus("ON");

		List<SmartLightBean> list = model.search(bean);

		Iterator<SmartLightBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLightCode() + "\t"
					+ bean.getRoomName() + "\t"
					+ bean.getBrightnessLevel() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		SmartLightBean bean = new SmartLightBean();

		bean.setStatus("ON");

		List<SmartLightBean> list = model.search(bean, 2, 5);

		Iterator<SmartLightBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLightCode() + "\t"
					+ bean.getRoomName());
		}
	}

	public static void testList() throws Exception {

		List<SmartLightBean> list = model.list();

		Iterator<SmartLightBean> it = list.iterator();

		while (it.hasNext()) {

			SmartLightBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLightCode() + "\t"
					+ bean.getRoomName() + "\t"
					+ bean.getBrightnessLevel() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<SmartLightBean> list = model.list(1, 5);

		Iterator<SmartLightBean> it = list.iterator();

		while (it.hasNext()) {

			SmartLightBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getLightCode() + "\t"
					+ bean.getRoomName());
		}
	}
}
package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.EnergyConsumptionBean;
import com.sunilos.p4.model.EnergyConsumptionModel;

public class EnergyConsumptionModelTest {

	public static EnergyConsumptionModel model = new EnergyConsumptionModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		 //testUpdate();
		 testDelete();
		// testFindByPk();
		// testFindByEnergyCode();
		 //testFindByUniqueColumn();

		// testSearch();
		// testSearchPage();
		// testList();
		//testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setEnergyCode("EC026");
		bean.setDeviceName("Air Conditioner");
		bean.setUnitsConsumed(145.75);
		bean.setStatus("Active");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setId(26);
		bean.setEnergyCode("EC026");
		bean.setDeviceName("Smart Air Conditioner");
		bean.setUnitsConsumed(165.50);
		bean.setStatus("Inactive");

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

		EnergyConsumptionBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getEnergyCode());
			System.out.println(bean.getDeviceName());
			System.out.println(bean.getUnitsConsumed());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByEnergyCode() throws Exception {

		EnergyConsumptionBean bean = model.findByEnergyCode("EC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getEnergyCode());
			System.out.println(bean.getDeviceName());
			System.out.println(bean.getUnitsConsumed());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		EnergyConsumptionBean bean = model.findByUniqueColumn("energyCode", "EC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getEnergyCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setStatus("Low");

		List<EnergyConsumptionBean> list = model.search(bean);

		Iterator<EnergyConsumptionBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getEnergyCode() + "\t"
					+ bean.getDeviceName() + "\t"
					+ bean.getUnitsConsumed() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		EnergyConsumptionBean bean = new EnergyConsumptionBean();

		bean.setStatus("Low");

		List<EnergyConsumptionBean> list = model.search(bean, 2, 5);

		Iterator<EnergyConsumptionBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getEnergyCode() + "\t"
					+ bean.getDeviceName());
		}
	}

	public static void testList() throws Exception {

		List<EnergyConsumptionBean> list = model.list();

		Iterator<EnergyConsumptionBean> it = list.iterator();

		while (it.hasNext()) {

			EnergyConsumptionBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getEnergyCode() + "\t"
					+ bean.getDeviceName() + "\t"
					+ bean.getUnitsConsumed() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<EnergyConsumptionBean> list = model.list(1, 5);

		Iterator<EnergyConsumptionBean> it = list.iterator();

		while (it.hasNext()) {

			EnergyConsumptionBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getEnergyCode() + "\t"
					+ bean.getDeviceName());
		}
	}
}
package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.WeatherAlertBean;
import com.sunilos.p4.model.WeatherAlertModel;

public class WeatherAlertModelTest {

	public static WeatherAlertModel model = new WeatherAlertModel();

	public static void main(String[] args) throws Exception {

		 testNextPK();
		// testAdd();
		 //testUpdate();
		// testDelete();
		 //testFindByPk();
		// testFindByAlertCode();
		//testSearch();
		// testSearchPage();
		// testList();
		 //testListPage();
	}

	public static void testNextPK() throws Exception {

		long pk = model.nextPK();
		System.out.println("Next PK = " + pk);
	}

	public static void testAdd() throws Exception {

		WeatherAlertBean bean = new WeatherAlertBean();

		bean.setAlertCode("WA027");
		bean.setCityName("Indore");
		bean.setTemperature(34.5);
		bean.setStatus("Hot");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		WeatherAlertBean bean = new WeatherAlertBean();

		bean.setId(1);
		bean.setAlertCode("WA001");
		bean.setCityName("Bhopal");
		bean.setTemperature(29.8);
		bean.setStatus("Normal");

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

		WeatherAlertBean bean = model.findByPK(1);
System.out.println(bean);
		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getAlertCode());
			System.out.println(bean.getCityName());
			System.out.println(bean.getTemperature());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByAlertCode() throws Exception {

		WeatherAlertBean bean = model.findByAlertCode("WA001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getAlertCode());
			System.out.println(bean.getCityName());
			System.out.println(bean.getTemperature());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		WeatherAlertBean bean = new WeatherAlertBean();

		bean.setCityName("Indore");

		List<WeatherAlertBean> list = model.search(bean);

		Iterator<WeatherAlertBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAlertCode() + "\t"
					+ bean.getCityName() + "\t"
					+ bean.getTemperature() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		WeatherAlertBean bean = new WeatherAlertBean();

		bean.setStatus("Hot");

		List<WeatherAlertBean> list = model.search(bean, 1, 5);

		Iterator<WeatherAlertBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAlertCode() + "\t"
					+ bean.getCityName() + "\t"
					+ bean.getTemperature() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testList() throws Exception {

		List<WeatherAlertBean> list = model.list();

		Iterator<WeatherAlertBean> it = list.iterator();

		while (it.hasNext()) {

			WeatherAlertBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAlertCode() + "\t"
					+ bean.getCityName() + "\t"
					+ bean.getTemperature() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<WeatherAlertBean> list = model.list(1, 5);

		Iterator<WeatherAlertBean> it = list.iterator();

		while (it.hasNext()) {

			WeatherAlertBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAlertCode() + "\t"
					+ bean.getCityName() + "\t"
					+ bean.getTemperature() + "\t"
					+ bean.getStatus());
		}
	}
}
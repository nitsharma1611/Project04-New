package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.VoiceCommandBean;
import com.sunilos.p4.model.VoiceCommandModel;

public class VoiceCommandModelTest {

	public static VoiceCommandModel model = new VoiceCommandModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		 //testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByCommandCode();
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

		VoiceCommandBean bean = new VoiceCommandBean();

		bean.setCommandCode("VC026");
		bean.setUserName("Nitin");
		bean.setCommandText("Turn On Light");
		bean.setStatus("Active");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		VoiceCommandBean bean = new VoiceCommandBean();

		bean.setId(1);
		bean.setCommandCode("VC001");
		bean.setUserName("Nitin Sharma");
		bean.setCommandText("Turn Off Light");
		bean.setStatus("Inactive");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(27);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		VoiceCommandBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCommandCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getCommandText());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByCommandCode() throws Exception {

		VoiceCommandBean bean = model.findByCommandCode("VC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCommandCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getCommandText());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		VoiceCommandBean bean = model.findByUniqueColumn("commandCode", "VC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCommandCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getCommandText());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		VoiceCommandBean bean = new VoiceCommandBean();

		bean.setStatus("Active");

		List<VoiceCommandBean> list = model.search(bean);

		Iterator<VoiceCommandBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCommandCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getCommandText() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		VoiceCommandBean bean = new VoiceCommandBean();

		bean.setStatus("Active");

		List<VoiceCommandBean> list = model.search(bean, 1, 5);

		Iterator<VoiceCommandBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCommandCode() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testList() throws Exception {

		List<VoiceCommandBean> list = model.list();

		Iterator<VoiceCommandBean> it = list.iterator();

		while (it.hasNext()) {

			VoiceCommandBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCommandCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getCommandText() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<VoiceCommandBean> list = model.list(1, 5);

		Iterator<VoiceCommandBean> it = list.iterator();

		while (it.hasNext()) {

			VoiceCommandBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getCommandCode() + "\t"
					+ bean.getStatus());
		}
	}
}
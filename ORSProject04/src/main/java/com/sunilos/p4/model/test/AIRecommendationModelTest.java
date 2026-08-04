package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.AIRecommendationBean;
import com.sunilos.p4.model.AIRecommendationModel;

public class AIRecommendationModelTest {

	public static AIRecommendationModel model = new AIRecommendationModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByRecommendationCode();
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

		AIRecommendationBean bean = new AIRecommendationBean();

		bean.setRecommendationCode("AR026");
		bean.setUserName("Nitin");
		bean.setRecommendationType("Energy Saving");
		bean.setStatus("Active");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		AIRecommendationBean bean = new AIRecommendationBean();

		bean.setId(26);
		bean.setRecommendationCode("AR026");
		bean.setUserName("Nitin Sharma");
		bean.setRecommendationType("Smart Energy Saving");
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

		AIRecommendationBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRecommendationCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getRecommendationType());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByRecommendationCode() throws Exception {

		AIRecommendationBean bean = model.findByRecommendationCode("AR001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRecommendationCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getRecommendationType());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		AIRecommendationBean bean = model.findByUniqueColumn("recommendationCode", "AR001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRecommendationCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		AIRecommendationBean bean = new AIRecommendationBean();

		bean.setStatus("Active");

		List<AIRecommendationBean> list = model.search(bean);

		Iterator<AIRecommendationBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRecommendationCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getRecommendationType() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		AIRecommendationBean bean = new AIRecommendationBean();

		bean.setStatus("Active");

		List<AIRecommendationBean> list = model.search(bean, 1, 5);

		Iterator<AIRecommendationBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRecommendationCode() + "\t"
					+ bean.getUserName());
		}
	}

	public static void testList() throws Exception {

		List<AIRecommendationBean> list = model.list();

		Iterator<AIRecommendationBean> it = list.iterator();

		while (it.hasNext()) {

			AIRecommendationBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRecommendationCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getRecommendationType() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<AIRecommendationBean> list = model.list(1, 5);

		Iterator<AIRecommendationBean> it = list.iterator();

		while (it.hasNext()) {

			AIRecommendationBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getRecommendationCode() + "\t"
					+ bean.getUserName());
		}
	}
}
package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.FaceRecognitionBean;
import com.sunilos.p4.model.FaceRecognitionModel;

public class FaceRecognitionModelTest {

	public static FaceRecognitionModel model = new FaceRecognitionModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		 //testUpdate();
		 //testDelete();
		// testFindByPk();
		// testFindByFaceCode();
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

		FaceRecognitionBean bean = new FaceRecognitionBean();

		bean.setFaceCode("FC026");
		bean.setUserName("Nitin Sharma");
		bean.setImagePath("images/faces/face26.jpg");
		bean.setStatus("Active");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		FaceRecognitionBean bean = new FaceRecognitionBean();

		bean.setId(26);
		bean.setFaceCode("FC026");
		bean.setUserName("Rahul Sharma");
		bean.setImagePath("images/faces/face1_new.jpg");
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

		FaceRecognitionBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFaceCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getImagePath());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByFaceCode() throws Exception {

		FaceRecognitionBean bean = model.findByFaceCode("FC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFaceCode());
			System.out.println(bean.getUserName());
			System.out.println(bean.getImagePath());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		FaceRecognitionBean bean = model.findByUniqueColumn("faceCode", "FC001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFaceCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		FaceRecognitionBean bean = new FaceRecognitionBean();

		bean.setStatus("Active");

		List<FaceRecognitionBean> list = model.search(bean);

		Iterator<FaceRecognitionBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFaceCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getImagePath() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		FaceRecognitionBean bean = new FaceRecognitionBean();

		bean.setStatus("Active");

		List<FaceRecognitionBean> list = model.search(bean, 1, 5);

		Iterator<FaceRecognitionBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFaceCode() + "\t"
					+ bean.getUserName());
		}
	}

	public static void testList() throws Exception {

		List<FaceRecognitionBean> list = model.list();

		Iterator<FaceRecognitionBean> it = list.iterator();

		while (it.hasNext()) {

			FaceRecognitionBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFaceCode() + "\t"
					+ bean.getUserName() + "\t"
					+ bean.getImagePath() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<FaceRecognitionBean> list = model.list(1, 5);

		Iterator<FaceRecognitionBean> it = list.iterator();

		while (it.hasNext()) {

			FaceRecognitionBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFaceCode() + "\t"
					+ bean.getUserName());
		}
	}
}
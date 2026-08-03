package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.QRScannerBean;
import com.sunilos.p4.model.QRScannerModel;

public class QRScannerModelTest {

	public static QRScannerModel model = new QRScannerModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByQrCode();
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

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		QRScannerBean bean = new QRScannerBean();

		bean.setQrCode("QR1026");
		bean.setScannedBy("Nitin");
		bean.setScanTime(sdf.parse("28-07-2026"));
		bean.setStatus("Active");

		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		QRScannerBean bean = new QRScannerBean();

		bean.setId(26);
		bean.setQrCode("QR1026");
		bean.setScannedBy("Rahul");
		bean.setScanTime(sdf.parse("29-07-2026"));
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

		QRScannerBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getQrCode());
			System.out.println(bean.getScannedBy());
			System.out.println(bean.getScanTime());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByQrCode() throws Exception {

		QRScannerBean bean = model.findByQrCode("QR1001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getQrCode());
			System.out.println(bean.getScannedBy());
			System.out.println(bean.getScanTime());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		QRScannerBean bean = model.findByUniqueColumn("QRCODE", "QR1001");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getQrCode());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		QRScannerBean bean = new QRScannerBean();

		bean.setStatus("Active");

		List<QRScannerBean> list = model.search(bean);

		Iterator<QRScannerBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getQrCode() + "\t"
					+ bean.getScannedBy() + "\t"
					+ bean.getScanTime() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		QRScannerBean bean = new QRScannerBean();

		bean.setStatus("Active");

		List<QRScannerBean> list = model.search(bean, 1, 5);

		Iterator<QRScannerBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getQrCode() + "\t"
					+ bean.getScannedBy());
		}
	}

	public static void testList() throws Exception {

		List<QRScannerBean> list = model.list();

		Iterator<QRScannerBean> it = list.iterator();

		while (it.hasNext()) {

			QRScannerBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getQrCode() + "\t"
					+ bean.getScannedBy() + "\t"
					+ bean.getScanTime() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<QRScannerBean> list = model.list(1, 5);

		Iterator<QRScannerBean> it = list.iterator();

		while (it.hasNext()) {

			QRScannerBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getQrCode() + "\t"
					+ bean.getScannedBy());
		}
	}
}
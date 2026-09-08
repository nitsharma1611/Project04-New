package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.ComplaintBean;
import com.sunilos.p4.model.ComplaintModel;

public class ComplaintModelTest {

	public static ComplaintModel model = new ComplaintModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByComplaintType();
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

		ComplaintBean bean = new ComplaintBean();

		bean.setComplaintType("Electricity Complaint");
		bean.setDescription("Power supply issue");
		bean.setComplaintDate(new Date());
		bean.setStatus("Pending");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(
				new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(
				new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		ComplaintBean bean = new ComplaintBean();

		bean.setId(1);
		bean.setComplaintType("Electricity Complaint Updated");
		bean.setDescription("Power supply issue updated");
		bean.setComplaintDate(new Date());
		bean.setStatus("Resolved");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(
				new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(
				new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(1);

		System.out.println("Record Deleted");
	}

	public static void testFindByPK() throws Exception {

		ComplaintBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getComplaintType());
			System.out.println(bean.getDescription());
			System.out.println(bean.getComplaintDate());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByComplaintType() throws Exception {

		ComplaintBean bean =
				model.findByComplaintType("Electricity Complaint");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getComplaintType());
			System.out.println(bean.getDescription());
			System.out.println(bean.getComplaintDate());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		ComplaintBean bean =
				model.findByUniqueColumn(
						"complaintType",
						"Electricity Complaint");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getComplaintType());
			System.out.println(bean.getDescription());
			System.out.println(bean.getComplaintDate());
			System.out.println(bean.getStatus());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		ComplaintBean bean = new ComplaintBean();

		bean.setComplaintType("Electricity");

		List<ComplaintBean> list = model.search(bean);

		Iterator<ComplaintBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(
					bean.getId() + "\t"
					+ bean.getComplaintType() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getComplaintDate() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testSearchPage() throws Exception {

		ComplaintBean bean = new ComplaintBean();

		bean.setComplaintType("Electricity");

		List<ComplaintBean> list =
				model.search(bean, 1, 5);

		Iterator<ComplaintBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(
					bean.getId() + "\t"
					+ bean.getComplaintType() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getComplaintDate() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testList() throws Exception {

		List<ComplaintBean> list = model.list();

		Iterator<ComplaintBean> it = list.iterator();

		while (it.hasNext()) {

			ComplaintBean bean = it.next();

			System.out.println(
					bean.getId() + "\t"
					+ bean.getComplaintType() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getComplaintDate() + "\t"
					+ bean.getStatus());
		}
	}

	public static void testListPage() throws Exception {

		List<ComplaintBean> list =
				model.list(1, 5);

		Iterator<ComplaintBean> it = list.iterator();

		while (it.hasNext()) {

			ComplaintBean bean = it.next();

			System.out.println(
					bean.getId() + "\t"
					+ bean.getComplaintType() + "\t"
					+ bean.getDescription() + "\t"
					+ bean.getComplaintDate() + "\t"
					+ bean.getStatus());
		}
	}
}
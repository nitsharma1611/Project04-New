package com.sunilos.p4.model.test;



import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.BankAccountBean;
import com.sunilos.p4.model.BankAccountModel;

public class BankAccountModelTest {

	public static BankAccountModel model = new BankAccountModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPK();
		// testFindByAccountNumber();
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

		BankAccountBean bean = new BankAccountBean();

		bean.setAccountNumber("123456789012");
		bean.setAccountHolderName("Nitin Sharma");
		bean.setAccountType("SAVINGS");
		bean.setBalance(50000.00);
		bean.setBranchName("Indore");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		BankAccountBean bean = new BankAccountBean();

		bean.setId(1);
		bean.setAccountNumber("123456789012");
		bean.setAccountHolderName("Nitin Sharma Updated");
		bean.setAccountType("CURRENT");
		bean.setBalance(75000.00);
		bean.setBranchName("Indore Updated");

		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(1);

		System.out.println("Record Deleted");
	}

	public static void testFindByPK() throws Exception {

		BankAccountBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getAccountNumber());
			System.out.println(bean.getAccountHolderName());
			System.out.println(bean.getAccountType());
			System.out.println(bean.getBalance());
			System.out.println(bean.getBranchName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByAccountNumber() throws Exception {

		BankAccountBean bean = model.findByAccountNumber("123456789012");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getAccountNumber());
			System.out.println(bean.getAccountHolderName());
			System.out.println(bean.getAccountType());
			System.out.println(bean.getBalance());
			System.out.println(bean.getBranchName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		BankAccountBean bean = model.findByUniqueColumn(
				"accountNumber", "123456789012");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getAccountNumber());
			System.out.println(bean.getAccountHolderName());
			System.out.println(bean.getAccountType());
			System.out.println(bean.getBalance());
			System.out.println(bean.getBranchName());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		BankAccountBean bean = new BankAccountBean();

		bean.setAccountHolderName("Nitin");

		List<BankAccountBean> list = model.search(bean);

		Iterator<BankAccountBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAccountNumber() + "\t"
					+ bean.getAccountHolderName() + "\t"
					+ bean.getAccountType() + "\t"
					+ bean.getBalance() + "\t"
					+ bean.getBranchName());
		}
	}

	public static void testSearchPage() throws Exception {

		BankAccountBean bean = new BankAccountBean();

		bean.setAccountHolderName("Nitin");

		List<BankAccountBean> list = model.search(bean, 1, 5);

		Iterator<BankAccountBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAccountNumber() + "\t"
					+ bean.getAccountHolderName() + "\t"
					+ bean.getAccountType() + "\t"
					+ bean.getBalance() + "\t"
					+ bean.getBranchName());
		}
	}

	public static void testList() throws Exception {

		List<BankAccountBean> list = model.list();

		Iterator<BankAccountBean> it = list.iterator();

		while (it.hasNext()) {

			BankAccountBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAccountNumber() + "\t"
					+ bean.getAccountHolderName() + "\t"
					+ bean.getAccountType() + "\t"
					+ bean.getBalance() + "\t"
					+ bean.getBranchName());
		}
	}

	public static void testListPage() throws Exception {

		List<BankAccountBean> list = model.list(1, 5);

		Iterator<BankAccountBean> it = list.iterator();

		while (it.hasNext()) {

			BankAccountBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getAccountNumber() + "\t"
					+ bean.getAccountHolderName() + "\t"
					+ bean.getAccountType() + "\t"
					+ bean.getBalance() + "\t"
					+ bean.getBranchName());
		}
	}
}
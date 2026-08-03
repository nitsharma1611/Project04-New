package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.UserBean;
import com.sunilos.p4.model.UserModel;

public class UserModelTest {

	public static UserModel model = new UserModel();

	public static void main(String[] args) throws Exception {

		// testNextPK();
		// testAdd();
		 //testUpdate();
		 //testDelete();
		// testFindByPk();
		 //testFindByLogin();
		//testAuthenticate();
		//testFindByUniqueColumn();
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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setFirstName("Nitin");
		bean.setLastName("Sharma");
		bean.setLogin("nitin@gmail.com");
		bean.setPassword("12345");
		bean.setDob(sdf.parse("2000-05-10"));
		bean.setMobileNo("9876543210");
		bean.setRoleId(1);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("Male");
		bean.setLastLogin(new Timestamp(System.currentTimeMillis()));
		bean.setLock("N");
		bean.setRegisteredIP("127.0.0.1");
		bean.setLastLoginIP("127.0.0.1");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		long pk = model.add(bean);

		System.out.println("Record Added : " + pk);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(1);
		bean.setFirstName("Rahul");
		bean.setLastName("Verma");
		bean.setLogin("rahul@gmail.com");
		bean.setPassword("123456");
		bean.setDob(sdf.parse("1999-08-15"));
		bean.setMobileNo("9999999999");
		bean.setRoleId(1);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("Male");
		bean.setLastLogin(new Timestamp(System.currentTimeMillis()));
		bean.setLock("N");
		bean.setRegisteredIP("127.0.0.1");
		bean.setLastLoginIP("127.0.0.1");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		model.update(bean);

		System.out.println("Record Updated");
	}

	public static void testDelete() throws Exception {

		model.delete(31);

		System.out.println("Record Deleted");
	}

	public static void testFindByPk() throws Exception {

		UserBean bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getMobileNo());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testFindByLogin() throws Exception {

		UserBean bean = model.findByLogin("rahul@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLogin());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testAuthenticate() throws Exception {

		UserBean bean = model.authenticate("rahul@gmail.com", "123456");

		if (bean != null) {

			System.out.println("Login Success");
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLogin());

		} else {

			System.out.println("Invalid Login Id or Password");
		}
	}

	public static void testFindByUniqueColumn() throws Exception {

		UserBean bean = model.findByUniqueColumn("LOGIN", "rahul@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getLogin());

		} else {

			System.out.println("Record Not Found");
		}
	}

	public static void testSearch() throws Exception {

		UserBean bean = new UserBean();

		List<UserBean> list = model.search(bean);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLastName() + "\t"
					+ bean.getLogin());
		}
	}

	public static void testSearchPage() throws Exception {

		UserBean bean = new UserBean();

		List<UserBean> list = model.search(bean, 1, 5);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLogin());
		}
	}

	public static void testList() throws Exception {

		List<UserBean> list = model.list();

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			UserBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLastName() + "\t"
					+ bean.getLogin());
		}
	}

	public static void testListPage() throws Exception {

		List<UserBean> list = model.list(1, 5);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {

			UserBean bean = it.next();

			System.out.println(bean.getId() + "\t"
					+ bean.getFirstName() + "\t"
					+ bean.getLogin());
		}
	}
}
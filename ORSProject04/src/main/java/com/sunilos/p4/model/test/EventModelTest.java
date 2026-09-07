package com.sunilos.p4.model.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sunilos.p4.bean.EventBean;
import com.sunilos.p4.model.EventModel;

public class EventModelTest {


public static EventModel model = new EventModel();

public static void main(String[] args) throws Exception {

	// testNextPK();
	//testAdd();
	// testUpdate();
	// testDelete();
	// testFindByPK();
	// testFindByEventName();
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

	EventBean bean = new EventBean();

	bean.setEventName("Java Training2");
	bean.setEventDate(new Date());
	bean.setVenue("Indore");
	bean.setOrganizer("Sunil Kumar");

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

	EventBean bean = new EventBean();

	bean.setId(26);
	bean.setEventName("Java1 Training Updated1");
	bean.setEventDate(new Date());
	bean.setVenue("Indore");
	bean.setOrganizer("Sunil Kumar");

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

	model.delete(26);

	System.out.println("Record Deleted");
}

public static void testFindByPK() throws Exception {

	EventBean bean = model.findByPK(1);

	if (bean != null) {

		System.out.println(bean.getId());
		System.out.println(bean.getEventName());
		System.out.println(bean.getEventDate());
		System.out.println(bean.getVenue());
		System.out.println(bean.getOrganizer());

	} else {

		System.out.println("Record Not Found");
	}
}

public static void testFindByEventName() throws Exception {

	EventBean bean = model.findByEventName("Java Training");

	if (bean != null) {

		System.out.println(bean.getId());
		System.out.println(bean.getEventName());
		System.out.println(bean.getEventDate());
		System.out.println(bean.getVenue());
		System.out.println(bean.getOrganizer());

	} else {

		System.out.println("Record Not Found");
	}
}

public static void testFindByUniqueColumn() throws Exception {

	EventBean bean = model.findByUniqueColumn(
			"eventName", "Java Training");

	if (bean != null) {

		System.out.println(bean.getId());
		System.out.println(bean.getEventName());
		System.out.println(bean.getEventDate());
		System.out.println(bean.getVenue());
		System.out.println(bean.getOrganizer());

	} else {

		System.out.println("Record Not Found");
	}
}

public static void testSearch() throws Exception {

	EventBean bean = new EventBean();

	bean.setEventName("Java");

	List<EventBean> list = model.search(bean);

	Iterator<EventBean> it = list.iterator();

	while (it.hasNext()) {

		bean = it.next();

		System.out.println(bean.getId() + "\t"
				+ bean.getEventName() + "\t"
				+ bean.getEventDate() + "\t"
				+ bean.getVenue() + "\t"
				+ bean.getOrganizer());
	}
}

public static void testSearchPage() throws Exception {

	EventBean bean = new EventBean();

	bean.setEventName("Java");

	List<EventBean> list = model.search(bean, 1, 5);

	Iterator<EventBean> it = list.iterator();

	while (it.hasNext()) {

		bean = it.next();

		System.out.println(bean.getId() + "\t"
				+ bean.getEventName() + "\t"
				+ bean.getEventDate() + "\t"
				+ bean.getVenue() + "\t"
				+ bean.getOrganizer());
	}
}

public static void testList() throws Exception {

	List<EventBean> list = model.list();

	Iterator<EventBean> it = list.iterator();

	while (it.hasNext()) {

		EventBean bean = it.next();

		System.out.println(bean.getId() + "\t"
				+ bean.getEventName() + "\t"
				+ bean.getEventDate() + "\t"
				+ bean.getVenue() + "\t"
				+ bean.getOrganizer());
	}
}

public static void testListPage() throws Exception {

	List<EventBean> list = model.list(1, 5);

	Iterator<EventBean> it = list.iterator();

	while (it.hasNext()) {

		EventBean bean = it.next();

		System.out.println(bean.getId() + "\t"
				+ bean.getEventName() + "\t"
				+ bean.getEventDate() + "\t"
				+ bean.getVenue() + "\t"
				+ bean.getOrganizer());
	}
}


}

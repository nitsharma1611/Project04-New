package com.sunilos.p4.ctl;


import com.sunilos.p4.bean.QRScannerBean;
import com.sunilos.p4.model.QRScannerModel;
import com.sunilos.p4.util.DataUtility;
import com.sunilos.p4.util.DataValidator;
import com.sunilos.p4.util.PropertyReader;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
@WebServlet("/ctl/QRScannerCtl")
public class QRScannerCtl extends BaseCtl<QRScannerBean, QRScannerModel> {

	@Override
	protected String getView() {

		return ORSView.QR_SCANNER_VIEW;
	}

	@Override
	protected String getView(String op) {
		if (OP_CANCEL.equalsIgnoreCase(op) || OP_DELETE.equalsIgnoreCase(op)) {
			return ORSView.QR_SCANNER_LIST_CTL;
		} else {
			return ORSView.QR_SCANNER_VIEW;
		}

	}

	@Override
	protected QRScannerModel getModel() {

		return new QRScannerModel();
	}

	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("qrCode"))) {
			request.setAttribute("qrCode", PropertyReader.getValue("error.require", "qrCode"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("scannedBy"))) {
			request.setAttribute("scannedBy", PropertyReader.getValue("error.require", "scannedBy"));
			pass = false;
		}

		System.out.println("scanTime"+request.getParameter("scanTime"));
		if (DataValidator.isNull(request.getParameter("scanTime"))) {
			request.setAttribute("scanTime", PropertyReader.getValue("error.require", "scanTime"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("status"))) {
			request.setAttribute("status", PropertyReader.getValue("error.require", "status"));
			pass = false;
		}

		return pass;
	}

	@Override
	protected QRScannerBean populateBean(HttpServletRequest request) {

		QRScannerBean bean = new QRScannerBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setQrCode(DataUtility.getString(request.getParameter("qrCode")));

		bean.setScannedBy(DataUtility.getString(request.getParameter("scannedBy")));

		bean.setScanTime(DataUtility.getDate(request.getParameter("scanTime")));

		bean.setStatus(DataUtility.getString(request.getParameter("status")));

		populateDTO(bean, request);

		
		return bean;
		
	}

}

package com.sunilos.p4.ctl;

import java.util.List;

import com.sunilos.p4.bean.QRScannerBean;
import com.sunilos.p4.bean.SubjectBean;
import com.sunilos.p4.model.QRScannerModel;
import com.sunilos.p4.model.SubjectModel;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ctl/QRScannerReportCtl")
public class QRScannerReportCtl extends BaseReportCtl<QRScannerBean>{

	@Override
	public String getView() {
		
		return ORSView.QR_SCANNER_REPORT_VIEW;
	}

	@Override
	public String getCompiledReportKey() {
		
		return "QR_SCANNER_LIST_COMPILED_REPORT";
	}

	@Override
	public List<QRScannerBean> getList() {
		QRScannerModel model = new QRScannerModel();
        @SuppressWarnings("unchecked")
        List<QRScannerBean> list = model.list();
        return list;
	}

}

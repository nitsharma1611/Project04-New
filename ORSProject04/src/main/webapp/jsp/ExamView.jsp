<%@page import="com.sunilos.p4.ctl.ORSView"%>
<%@page import="com.sunilos.p4.util.HTMLUtility"%>
<%@page import="java.util.HashMap"%>

<%@page import="com.sunilos.p4.ctl.BaseCtl"%>
<%@page import="com.sunilos.p4.util.DataUtility"%>
<%@page import="com.sunilos.p4.util.ServletUtility"%>

<jsp:useBean id="bean"
	class="com.sunilos.p4.bean.ExamBean"
	scope="request"></jsp:useBean>

<%
String _suc = ServletUtility.getSuccessMessage(request);
String _err = ServletUtility.getErrorMessage(request);


%>

<div class="container py-4" style="max-width:650px;">

	<div class="card border-0 shadow-sm rounded-4">

		<div class="card-header text-white py-3"
			style="background:linear-gradient(135deg,#0d2137,#1565c0);">

			<h5 class="mb-0 fw-bold">
				<i class="bi bi-p-square-fill me-2"></i>
				<%=bean.getId() > 0 ? "Edit Exam" : "Add Exam"%>
			</h5>

		</div>

		<div class="card-body">

			<%
			if (_suc != null && !_suc.isEmpty()) {
			%>
			<div class="alert alert-success">
				<i class="bi bi-check-circle-fill me-2"></i>
				<%=_suc%>
			</div>
			<%
			}
			%>

			<%
			if (_err != null && !_err.isEmpty()) {
			%>
			<div class="alert alert-danger">
				<i class="bi bi-exclamation-triangle-fill me-2"></i>
				<%=_err%>
			</div>
			<%
			}
			%>

			<form action="<%=ORSView.EXAM_CTL %>" method="post">

				<input type="hidden" name="id" value="<%=bean.getId()%>">

				<input type="hidden" name="createdBy"
					value="<%=bean.getCreatedBy()%>">

				<input type="hidden" name="modifiedBy"
					value="<%=bean.getModifiedBy()%>">

				<input type="hidden" name="createdDatetime"
					value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">

				<input type="hidden" name="modifiedDatetime"
					value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">


				<!-- Parking Code -->

				<div class="mb-3">
					<label class="form-label fw-semibold">
						Exam Name
						<span class="text-danger">*</span>
					</label>

					<input type="text"
						name="examName"
						class="form-control"
						value="<%=DataUtility.getStringData(bean.getExamName())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("examName", request)%>
					</div>
				</div>


				<!-- Vehicle Number -->

				<div class="mb-3">
					<label class="form-label fw-semibold">
					Exam Date
						<span class="text-danger">*</span>
					</label>

					<input type="text"
						name="examDate"
						class="form-control"
						placeholder="MM/dd/yyyy"
						value="<%=DataUtility.getDateString(bean.getExamDate())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("examDate", request)%>
					</div>
				</div>


				<!-- Slot Number -->
<div class="row g-3 mb-3">
				<div class="col-md-6">
					<label class="form-label fw-semibold">
						TotalMarks
						<span class="text-danger">*</span>
					</label>

					<input type="text"
						name="totalMarks"
						class="form-control"
						value="<%=DataUtility.getStringData(bean.getTotalMarks())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("totalMarks", request)%>
					</div>
				</div>


				<!-- Status -->
<div class="col-md-6">
					<label class="form-label fw-semibold">
						Passing Marks
						<span class="text-danger">*</span>
					</label>

					<input type="text"
						name="passingMarks"
						class="form-control"
						value="<%=DataUtility.getStringData(bean.getPassingMarks())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("passingMarks", request)%>
					</div>
				</div>
			
				</div>
</div>

				<div class="d-flex border-top pt-3">

					<button type="submit"
						name="operation"
						value="<%=BaseCtl.OP_SAVE%>"
						class="btn btn-primary">

						<i class="bi bi-save me-1"></i>
						Save

					</button>

					<a href="ExamListCtl?id=0"
						class="btn btn-secondary ms-auto">

						<i class="bi bi-x-circle me-1"></i>
						Cancel

					</a>

				</div>

			</form>

		</div>

	</div>

</div>
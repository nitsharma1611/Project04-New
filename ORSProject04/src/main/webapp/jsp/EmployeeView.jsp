<%@page import="com.sunilos.p4.ctl.ORSView"%>
<%@page import="com.sunilos.p4.util.HTMLUtility"%>


<%@page import="com.sunilos.p4.ctl.BaseCtl"%>
<%@page import="com.sunilos.p4.util.DataUtility"%>
<%@page import="com.sunilos.p4.util.ServletUtility"%>

<jsp:useBean id="bean" class="com.sunilos.p4.bean.EmployeeBean"
	scope="request"></jsp:useBean>

<%
String _suc = ServletUtility.getSuccessMessage(request);
String _err = ServletUtility.getErrorMessage(request);
%>

<div class="container py-4" style="max-width: 650px;">

	<div class="card border-0 shadow-sm rounded-4">

		<div class="card-header text-white py-3"
			style="background: linear-gradient(135deg, #0d2137, #1565c0);">

			<h5 class="mb-0 fw-bold">
				<i class="bi bi-p-square-fill me-2"></i>
				<%=bean.getId() > 0 ? "Edit Employee" : "Add Employee"%>
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

			<form action="<%=ORSView.EMPLOYEE_CTL%>" method="post">

				<input type="hidden" name="id" value="<%=bean.getId()%>"> <input
					type="hidden" name="createdBy" value="<%=bean.getCreatedBy()%>">

				<input type="hidden" name="modifiedBy"
					value="<%=bean.getModifiedBy()%>"> <input type="hidden"
					name="createdDatetime"
					value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">

				<input type="hidden" name="modifiedDatetime"
					value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">


				<!-- Parking Code -->

				<div class="mb-3">
					<label class="form-label fw-semibold"> Name <span
						class="text-danger">*</span>
					</label> <input type="text" name="name" class="form-control"
						value="<%=DataUtility.getStringData(bean.getName())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("name", request)%>
					</div>
				</div>


				<!-- Vehicle Number -->

				<div class="mb-3">
					<label class="form-label fw-semibold"> Salary <span
						class="text-danger">*</span>
					</label> <input type="text" name="salary" class="form-control"
						value="<%=DataUtility.getStringData(bean.getSalary())%>">

					<div class="text-danger small mt-1">
						<%=ServletUtility.getErrorMessage("salary", request)%>
					</div>
				</div>


				<!-- Slot Number -->
				<div class="row g-3 mb-3">
					<div class="col-md-6">
						<label class="form-label fw-semibold"> Designation <span
							class="text-danger">*</span>
						</label> <input type="text" name="designation" class="form-control"
							value="<%=DataUtility.getStringData(bean.getDesignation())%>">

						<div class="text-danger small mt-1">
							<%=ServletUtility.getErrorMessage("designation", request)%>
						</div>
					</div>

					<div class="col-md-6">

    <label class="form-label fw-semibold">
        JoiningDate
        <span class="text-danger">*</span>
    </label>

    <div class="input-group">

        <input type="text"
               name="joiningDate"
               id="joiningDate"
               class="form-control"
               placeholder="Select joiningDate"
               readonly
               value="<%=DataUtility.getDateString(bean.getJoiningDate())%>">

        <button type="button"
                class="btn btn-outline-secondary"
                onclick="showCommonDatePicker('joiningDate')">

            <img src="../img/cal.jpg"
                 width="16"
                 height="15"
                 alt="Calendar">

        </button>

    </div>

    <div class="text-danger small mt-1">

        <%=ServletUtility.getErrorMessage("joiningDate", request)%>

    </div>

</div>
					<!-- Status -->

				</div>

				<div class="d-flex border-top pt-3">

					<button type="submit" name="operation" value="<%=BaseCtl.OP_SAVE%>"
						class="btn btn-primary">

						<i class="bi bi-save me-1"></i> Save

					</button>

					<a href="EmployeeListCtl?id=0" class="btn btn-secondary ms-auto">

						<i class="bi bi-x-circle me-1"></i> Cancel

					</a>

				</div>

			</form>

		</div>

	</div>

</div>
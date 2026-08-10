<%@page import="com.sunilos.p4.bean.VehicleBean"%>




<%@page import="com.sunilos.p4.ctl.BaseCtl"%>
<%@page import="com.sunilos.p4.ctl.ORSView"%>
<%@page import="com.sunilos.p4.util.ServletUtility"%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<%
int pageNo = ServletUtility.getPageNo(request);
int pageSize = ServletUtility.getPageSize(request);
int index = ((pageNo - 1) * pageSize) + 1;

List list = ServletUtility.getList(request);
Iterator<VehicleBean> it = list.iterator();

String _err = ServletUtility.getErrorMessage(request);
String _suc = ServletUtility.getSuccessMessage(request);
%>

<div class="container-fluid px-4 py-4" style="max-width: 1200px;">

	<div class="card border-0 shadow-sm rounded-4 overflow-hidden">

		<div
			class="card-header text-white border-0 py-3 px-4 d-flex justify-content-between align-items-center"
			style="background: linear-gradient(135deg, #0d2137 0%, #1565c0 100%);">

			<h5 class="mb-0 fw-bold">
				<i class="bi bi-p-square-fill me-2"></i>Vehicle List
			</h5>

			<div class="d-flex gap-2">

				<a href="<%=ORSView.VEHICLE_REPORT_CTL%>" target="_blank"
					class="btn btn-warning btn-sm fw-semibold"> <i
					class="bi bi-file-earmark-pdf"></i> Print PDF
				</a> <a href="<%=ORSView.VEHICLE_REPORT_CTL%>?type=doc"
					target="_blank" class="btn btn-info btn-sm fw-semibold"> <i
					class="bi bi-file-earmark-word"></i> Print DOC
				</a> <a href="<%=ORSView.VEHICLE_CTL%>"
					class="btn btn-light btn-sm text-primary fw-semibold"> <i
					class="bi bi-plus-circle"></i> Add Vehicle
				</a>

			</div>

		</div>

		<form action="<%=ORSView.VEHICLE_LIST_CTL%>" method="post">

			<input type="hidden" name="pageNo" value="<%=pageNo%>"> <input
				type="hidden" name="pageSize" value="<%=pageSize%>">

			<!-- Search -->

			<div class="p-3 bg-light border-bottom d-flex flex-wrap gap-2">

				<input type="text" name="vehicleName"
					class="form-control form-control-sm" style="max-width: 220px"
					placeholder="Search vehicleNam"
					value="<%=ServletUtility.getParameter("vehicleName", request)%>">

				


				<button type="submit" name="operation"
					value="<%=BaseCtl.OP_SEARCH%>" class="btn btn-primary btn-sm">

					<i class="bi bi-search"></i> Search

				</button>

				<button type="submit" name="operation"
					value="<%=BaseCtl.OP_DELETE%>"
					class="btn btn-danger btn-sm ms-auto">

					<i class="bi bi-trash"></i> Delete Selected

				</button>

			</div>

			<%
			if (_err != null && !_err.isEmpty()) {
			%>

			<div class="alert alert-danger m-3">

				<i class="bi bi-exclamation-circle"></i>
				<%=_err%>

			</div>

			<%
			}
			%>

			<%
			if (_suc != null && !_suc.isEmpty()) {
			%>

			<div class="alert alert-success m-3">

				<i class="bi bi-check-circle"></i>
				<%=_suc%>

			</div>

			<%
			}
			%>

			<div class="table-responsive">

				<table class="table table-hover align-middle mb-0">

					<thead class="table-light">

						<tr>

							<th width="40"><input type="checkbox"
								onclick="document.querySelectorAll('input[name=ids]').forEach(c=>c.checked=this.checked)">
							</th>

							<th>#</th>
							<th>Vehicle Name</th>
							<th>Model Name</th>
							<th>Color </th>
							<th>Price</th>
							
							<th>Action</th>

						</tr>

					</thead>

					<tbody>

						<%
						while (it.hasNext()) {
							VehicleBean bean = it.next();
						%>

						<tr>

							<td><input type="checkbox" name="ids"
								value="<%=bean.getId()%>"></td>

							<td><%=index++%></td>

							<td><%=bean.getVehicleName()%></td>

							<td><%=bean.getModelName()%></td>

							<td><%=bean.getColor()%></td>
							<td><%=bean.getPrice()%></td>

							

							<td><a href="VehicleCtl?id=<%=bean.getId()%>"
								class="btn btn-outline-primary btn-sm"> <i
									class="bi bi-pencil"></i> Edit

							</a></td>

						</tr>

						<%
						}
						%>

					</tbody>

				</table>

			</div>

			<div class="p-3 border-top">

				<%@ include file="ListFooter.jsp"%>

			</div>

		</form>

	</div>

</div>

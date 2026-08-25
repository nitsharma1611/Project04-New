<%@page import="com.sunilos.p4.bean.BankAccountBean"%>




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
Iterator<BankAccountBean> it = list.iterator();

String _err = ServletUtility.getErrorMessage(request);
String _suc = ServletUtility.getSuccessMessage(request);
%>

<div class="container-fluid px-4 py-4" style="max-width: 1200px;">

	<div class="card border-0 shadow-sm rounded-4 overflow-hidden">

		<div
			class="card-header text-white border-0 py-3 px-4 d-flex justify-content-between align-items-center"
			style="background: linear-gradient(135deg, #0d2137 0%, #1565c0 100%);">

			<h5 class="mb-0 fw-bold">
				<i class="bi bi-p-square-fill me-2"></i>Library List
			</h5>

			<div class="d-flex gap-2">

				<a href="<%=ORSView.BANK_ACCOUNT_REPORT_CTL%>" target="_blank"
					class="btn btn-warning btn-sm fw-semibold"> <i
					class="bi bi-file-earmark-pdf"></i> Print PDF
				</a> <a href="<%=ORSView.BANK_ACCOUNT_REPORT_CTL%>?type=doc"
					target="_blank" class="btn btn-info btn-sm fw-semibold"> <i
					class="bi bi-file-earmark-word"></i> Print DOC
				</a> <a href="<%=ORSView.BANK_ACCOUNT_CTL%>"
					class="btn btn-light btn-sm text-primary fw-semibold"> <i
					class="bi bi-plus-circle"></i> Add BankAccount
				</a>

			</div>

		</div>

		<form action="<%=ORSView.BANK_ACCOUNT_LIST_CTL%>" method="post">

			<input type="hidden" name="pageNo" value="<%=pageNo%>"> <input
				type="hidden" name="pageSize" value="<%=pageSize%>">

			<!-- Search -->

			<div class="p-3 bg-light border-bottom d-flex flex-wrap gap-2">

				<input type="text" name="accountNumber"
					class="form-control form-control-sm" style="max-width: 220px"
					placeholder="Search accountNumber"
					value="<%=ServletUtility.getParameter("accountNumber", request)%>">

				<input type="text" name="accountHolderName"
					class="form-control form-control-sm" style="max-width: 220px"
					placeholder="Search accountHolderName"
					value="<%=ServletUtility.getParameter("accountHolderName", request)%>">


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
							<th>Account Number</th>
							<th>Account HolderName</th>
							<th>AccountType</th>
							<th>Balance</th>
<th>Branch Name</th>
							<th>Action</th>

						</tr>

					</thead>

					<tbody>

						<%
						while (it.hasNext()) {
							BankAccountBean bean = it.next();
						%>

						<tr>

							<td><input type="checkbox" name="ids"
								value="<%=bean.getId()%>"></td>

							<td><%=index++%></td>

							<td><%=bean.getAccountNumber()%></td>

							<td><%=bean.getAccountHolderName()%></td>

							<td><%=bean.getAccountType()%></td>
							<td><%=bean.getBalance()%></td>
							<td><%=bean.getBranchName()%></td>


							<td><a href="BankAccountCtl?id=<%=bean.getId()%>"
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
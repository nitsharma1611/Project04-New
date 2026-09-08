
<%@ page import="com.sunilos.p4.ctl.ORSView"%>
<%@ page import="com.sunilos.p4.util.HTMLUtility"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.sunilos.p4.ctl.BaseCtl"%>
<%@ page import="com.sunilos.p4.util.DataUtility"%>
<%@ page import="com.sunilos.p4.util.ServletUtility"%>

<jsp:useBean id="bean"
    class="com.sunilos.p4.bean.ComplaintBean"
    scope="request">
</jsp:useBean>

<%
String _suc = ServletUtility.getSuccessMessage(request);
String _err = ServletUtility.getErrorMessage(request);

HashMap statusMap = new HashMap();
statusMap.put("Approved", "Approved");
statusMap.put("Pending", "Pending");
statusMap.put("Rejected", "Rejected");
%>

<div class="container py-4" style="max-width:650px;">

    <div class="card border-0 shadow-sm rounded-4">

        <div class="card-header text-white py-3"
             style="background:linear-gradient(135deg,#0d2137,#1565c0);">

            <h5 class="mb-0 fw-bold">
                <i class="bi bi-p-square-fill me-2"></i>
                <%=bean.getId() > 0 ? "Edit Complaint" : "Add Complaint"%>
            </h5>

        </div>

        <div class="card-body">

            <% if (_suc != null && !_suc.isEmpty()) { %>

                <div class="alert alert-success">
                    <i class="bi bi-check-circle-fill me-2"></i>
                    <%=_suc%>
                </div>

            <% } %>


            <% if (_err != null && !_err.isEmpty()) { %>

                <div class="alert alert-danger">
                    <i class="bi bi-exclamation-triangle-fill me-2"></i>
                    <%=_err%>
                </div>

            <% } %>


            <form action="<%=ORSView.COMPLAINT_CTL%>" method="post">

                <input type="hidden" name="id"
                       value="<%=bean.getId()%>">

                <input type="hidden" name="createdBy"
                       value="<%=bean.getCreatedBy()%>">

                <input type="hidden" name="modifiedBy"
                       value="<%=bean.getModifiedBy()%>">

                <input type="hidden" name="createdDatetime"
                       value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">

                <input type="hidden" name="modifiedDatetime"
                       value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">


                <!-- Complaint Type + Description -->

                <div class="row g-3 mb-3">

                    <div class="col-md-6">

                        <label class="form-label fw-semibold">
                            Complaint Type
                            <span class="text-danger">*</span>
                        </label>

                        <input type="text"
                               name="complaintType"
                               class="form-control"
                               value="<%=DataUtility.getStringData(bean.getComplaintType())%>">

                        <div class="text-danger small mt-1">
                            <%=ServletUtility.getErrorMessage("complaintType", request)%>
                        </div>

                    </div>


                    <div class="col-md-6">

                        <label class="form-label fw-semibold">
                            Description
                            <span class="text-danger">*</span>
                        </label>

                        <input type="text"
                               name="description"
                               class="form-control"
                               value="<%=DataUtility.getStringData(bean.getDescription())%>">

                        <div class="text-danger small mt-1">
                            <%=ServletUtility.getErrorMessage("description", request)%>
                        </div>

                    </div>

                </div>


                <!-- Complaint Date + Status -->

                <div class="row g-3 mb-3">

                    <div class="col-md-6">

                        <label class="form-label fw-semibold">
                            Complaint Date
                            <span class="text-danger">*</span>
                        </label>

                        <div class="input-group">

                            <input type="text"
                                   name="complaintDate"
                                   id="complaintDate"
                                   class="form-control"
                                   placeholder="Select complaint date"
                                   readonly
                                   value="<%=DataUtility.getDateString(bean.getComplaintDate())%>">

                            <button type="button"
                                    class="btn btn-outline-secondary"
                                    onclick="showCommonDatePicker('complaintDate')">

                                <img src="../img/cal.jpg"
                                     width="16"
                                     height="15"
                                     alt="Calendar">

                            </button>

                        </div>

                        <div class="text-danger small mt-1">
                            <%=ServletUtility.getErrorMessage("complaintDate", request)%>
                        </div>

                    </div>


                    <div class="col-md-6">

                        <label class="form-label fw-semibold">
                            Status
                            <span class="text-danger">*</span>
                        </label>

                        <%=HTMLUtility.getList("status", bean.getStatus(), statusMap)%>

                        <div class="text-danger small mt-1">
                            <%=ServletUtility.getErrorMessage("status", request)%>
                        </div>

                    </div>

                </div>


                <!-- Buttons -->

                <div class="d-flex border-top pt-3">

                    <button type="submit"
                            name="operation"
                            value="<%=BaseCtl.OP_SAVE%>"
                            class="btn btn-primary">

                        <i class="bi bi-save me-1"></i>
                        Save

                    </button>


                    <a href="ComplaintListCtl?id=0"
                       class="btn btn-secondary ms-auto">

                        <i class="bi bi-x-circle me-1"></i>
                        Cancel

                    </a>

                </div>

            </form>

        </div>

    </div>

</div>
```

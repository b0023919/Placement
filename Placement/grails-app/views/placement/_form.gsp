<%@ page import="placement.Placement" %>



<div class="fieldcontain ${hasErrors(bean: placementInstance, field: 'companyName', 'error')} ">
	<label for="companyName">
		<g:message code="placement.companyName.label" default="Company Name" />
		
	</label>
	<g:textField name="companyName" value="${placementInstance?.companyName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementInstance, field: 'jobTitle', 'error')} ">
	<label for="jobTitle">
		<g:message code="placement.jobTitle.label" default="Job Title" />
		
	</label>
	<g:textField name="jobTitle" value="${placementInstance?.jobTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="placement.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${placement.Status.list()}" optionKey="id" required="" value="${placementInstance?.status?.id}" class="many-to-one"/>
</div>


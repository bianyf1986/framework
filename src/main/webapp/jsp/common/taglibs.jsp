﻿<%@ page import="com.afeng.common.utils.SysConstants" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fns" uri="/tlds/fns.tld" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="ctxAdmin" value="${pageContext.request.contextPath}${fns:getAdminPath()}" />
<c:set var="ctxFront" value="${pageContext.request.contextPath}${fns:getFrontPath()}" />
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<%
    long sysInitTime = SysConstants.SYS_INIT_TIME;
    //系统启动时间 
    request.setAttribute("sysInitTime",sysInitTime);
%>
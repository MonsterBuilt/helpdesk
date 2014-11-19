<%-- 
    Document   : basicLayout
    Created on : Jun 2, 2011, 9:19:08 AM
    Author     : daryl.galdones
--%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ page import="com.itp.config.SystemConfiguration"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/Style.css" type="text/css" ></link>
        <link type="text/css" href="<%= request.getContextPath()%>/css/jquery-ui-1.8.13.custom.css" rel="stylesheet" />	
        <script type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-1.5.1.min.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-ui-1.8.13.custom.min.js"></script>
         <script type="text/javascript" src="<%= request.getContextPath()%>/js/common.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
       <title><%= SystemConfiguration.getConfigurationValue(SystemConfiguration.APPLICATION_NAME)%></title>
    </head>
    <body>
        <tiles:insert attribute="menu" />
        <div style="padding:10px 0px 10px 0px;"><tiles:insert attribute="body" /></div>
        
        <tiles:insert attribute="footer"/>
    </body>
</html>

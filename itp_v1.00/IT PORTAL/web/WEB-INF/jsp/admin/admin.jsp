<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/WEB-INF/css/Style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Information Technology Portal</title>
</head>


<body>
<tr>
	<td>
    	<table cellpadding="5" cellspacing="5" width="100%">
                 <tr>
                    <td>
                        <table width="100%" cellpadding="0" cellspacing="0">
                            <tr>
                                <td class="header">
                                    <table align="right">
                                        <tr>
                                            <td class="nameHover">
                                            Name|        	
                                            </td>
                                            <td>
                                            <input type="text" size="30" value="Quick Search" />
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                                
                            </tr>
                            <tr>
                            <td class="menu">
                                <table width="100%" cellpadding="0" cellspacing="0" height="25px">
                                    <tr>
                                    	<td width="1%"></td>
                                        <td width="5%" class="menuHover">
                                            Dashboards| 
                                        </td>
                                        <td width="4%" class="menuHover">
                                            Projects| 
                                      </td>
                                        <td width="3%" class="menuHover">
                                            Issues| 
                                        </td class="menuHover">
                                        <td width="6%" class="menuHover">
                                            Administration| 
                                        </td>
                                        <td width="77%"></td>
                                        <td width="5%" align="right" class="menuHover">
                                            Create Issue
                                        </td>
                                    </tr>
                                </table>
                            </td>
                                
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        <table style="border:2px solid #D2D2D2" width="99%" align="center" cellpadding="2" cellspacing="2" bgcolor="#FFFFFF">
                            <tr>
                                <td width="50%">
                                    <table style="border:1px solid #D2D2D2" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                    	<tr>
                                        	<td class="headerBox">
                                            	Introduction
                                          </td>
                                        </tr>
                                        <tr>
                                        	<td style="font-size:12px; font-family:Arial, Helvetica, sans-serif">
                                            	Thanks for choosing JIRA.<br/>
                                                Welcome to JIRA — the easy way to help your team track and deliver projects.<br/><br/>
                                                
                                                Where do I start?<br/>
                                                Learn more about configuring JIRA with the JIRA 101 guide.<br/><br/>
                                                
                                                Get up to speed with an in-depth, interactive Atlassian training course.<br/><br/>
                                                
                                                You can customize this text in the Administration section.<br/><br/>
                                                
                                                Agile project management for JIRA<br/>
                                                The GreenHopper plugin for JIRA provides agile project management and assists with the introduction of agile to your team. Get started with the GreenHopper 101 guide.
                                          </td>
                                        </tr>
                                    </table>
                                </td>
                                <td width="50%">
                                	<table width="100%">
                                    	<tr>
                                        	<td>
                                            	<table style="border:1px solid #D2D2D2" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" height="120">
                                                    <tr>
                                                        <td class="headerBox">
                                                            Assigned to Me</td>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            No matching issues found.
                                                        </td>
                                                    </tr>
                                                </table>	
                                            </td>
                                         </tr>
                                         <tr>
                                        	<td>
                                            	<table style="border:1px solid #D2D2D2" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                                    <tr>
                                                        <td class="headerBox" colspan="2">
                                                            Favorite Filters</td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            You have no filters at the moment<br /><br />
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                    	<td width="14%">
                                                        	Create Filter
                                                        </td>
                                                        <td width="86%">
                                                        	Manage Filter
                                                        </td>
                                                    </tr>
                                                </table>	
                                            </td>
                                         </tr>
                                        
                                    </table>
                                    
                              </td>
                                
                            </tr>
                            <tr>
                                <td>
                                    <table style="border:1px solid #D2D2D2" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" height="120">
                                    	<tr>
                                        	<td class="headerBox">
                                            Activity Stream
                                            </td>
                                        </tr>
                                        <tr>
                                        	<td>
                                            Crimmy<br /><br />
                                            </td>
                                        </tr>
                                        <tr>
                                        	<td>No activity was found</td>
                                        </tr>
                                    </table>
                                </td>
                                <td>
                                    <table style="border:1px solid #D2D2D2" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                    	<tr>
                                        	<td width="9%" class="headerBox" colspan="2">
                                            Admin
                                            </td>
                                        </tr>
                                        <tr>
                                        	<td valign="top" style="font-weight:bold">
                                              Projects <br />
                                              Users<br />
                                              Data<br />
                                              Setup <br />
                                              Licence <br />
                                              <br />
											  <br />
                                              Database          
                                            </td>
                                            <td width="91%">
                                               View all or create new<br />
                                               Browse users, groups or create a new user.<br />
                                               Restore or backup JIRA data as XML<br />
                                               Configure JIRA or modify global permissions<br />
                                               JIRA: Evaluation<br />
                                               (view details)<br />
											   (Expires in 22 days, 12 hours on 17/Jun/11)<br />
                                               You are using HSQL DB, which is an in-memory database and susceptible to corruption when abnormally terminated. DO NOT USE THIS IN A
                                               PRODUCTION SYSTEM. Instead we recommend using an external database, for a list of supported databases please see our documentation
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                	<td align="center" style="font-size:11px; font-family:Arial, Helvetica, sans-serif">
                    	Atlassian JIRA (v4.3.3#617-r149616) | Report a problem                    
                    </td>
                </tr>
                <tr>
                	<td align="center" style="font-size:12px; font-family:Arial, Helvetica, sans-serif">
                    	POWERED BY A FREE ATLASSIAN JIRA EVALUATION LICENSE. PLEASE CONSIDER PURCHASING IT TODAY.                    
                    </td>
                </tr>
        </table>
    </td>
</tr>


</body>
</html>

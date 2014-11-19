<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
    $(function(){
        // Tabs
        $('#tabs').tabs();
    });
</script>
<table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
    <tr>
        <td class="headerBox">
            Project Information
        </td>
    </tr>
    <tr>
        <td>
            <tiles:insert attribute="applicationMessage" />	
        </td>
    </tr>
    <tr>
        <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
            <hr/>
            <div><br /><br />
                <div class="" style="vertical-align:middle">
                    <table width="100%">
                        <tr>
                            <td width="60%">
                                <table width="100%">
                                    <tr>
                                        <td><b>Project Name:&nbsp;&nbsp;<bean:write name="projectForm" property="projectName" /></b>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Project Description:&nbsp;&nbsp;</b><bean:write name="projectForm" property="projectDescription" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Category:&nbsp;&nbsp;</b><bean:write name="projectForm" property="projectCategoryName" /></td>
                                    </tr>
                                    <tr>
                                        <td><b>Company:&nbsp;&nbsp;</b><bean:write name="projectForm" property="companyName" /></td>
                                    </tr>
                                    <tr>
                                        <td><b>Project Lead:&nbsp;&nbsp;</b><a href="" ><bean:write name="projectForm" property="projectLeadFullName" /></a></td>
                                    </tr>
                                    <tr>
                                        <td style="padding-left:40px;">
                                            <b>Member(s):&nbsp;&nbsp;</b><!--<a href="" >Dominic Galdones</a>,&nbsp;<a href="" >Michael Valladolid</a-->
                                            <logic:present name="projectForm" property="participantBeans">
                                                <logic:notEmpty  name="projectForm" property="participantBeans">
                                                    <logic:iterate name="projectForm" property="participantBeans" id="pa">
                                                        <a href="" ><bean:write name="pa" property="fullName" /></a>,&nbsp;
                                                    </logic:iterate>
                                                </logic:notEmpty>
                                            </logic:present>
                                        </td>
                                    </tr>
                                    <!-- tr>
                                                                  <td ><b>Project Roles:&nbsp;&nbsp;</b>(<a href="" >View User Roles</a>)</td>
                                    </tr -->
                                    <tr>
                                        <td ><b>Status:&nbsp;&nbsp;</b><bean:write name="projectForm" property="projectStatusName" /></td>
                                    </tr>
                                    <tr>
                                        <td ><b>Priority:&nbsp;&nbsp;</b><bean:write name="projectForm" property="priorityName" /></td>
                                    </tr>
                                    <tr>
                                        <td ><b>Starting Date:&nbsp;&nbsp;</b><bean:write name="projectForm" property="startDateString" /></td>
                                    </tr>
                                    <tr>
                                        <td ><b>Ending Date:&nbsp;&nbsp;</b><bean:write name="projectForm" property="endDateString" /></td>
                                    </tr>
                                    <tr>
                                        <td ><b>Estimated hours:&nbsp;&nbsp;</b><bean:write name="projectForm" property="estimatedHours" /> hrs</td>
                                    </tr>
                                    <tr>
                                        <td ><b>Budget:&nbsp;&nbsp;</b><bean:write name="projectForm" property="budgetString" /></td>
                                    </tr>
                                </table>
                                
                            </td>
                            <td width="40%" style="vertical-align:top">
                                
                                
                            </td>
                        </tr>
                    </table>
                </div>
                <br />
                <div class="blue_links" style="vertical-align:middle; text-align:center"> 	
                    <a href="<%= request.getContextPath()%>/actions/createProject.do?action=3&projectId=<bean:write name="projectForm" property="projectId" />"  style="font-size:12px; vertical-align:middle">
                    <b><img src="<%= request.getContextPath()%>/images/edit_icon.gif" width="16" height="16" alt="Add"  border="0"/> Edit Project</b></a>&nbsp;&nbsp;|
                    <a href="<%= request.getContextPath()%>/actions/projectList.do"  style="font-size:12px; vertical-align:middle">
                    <b><img src="<%= request.getContextPath()%>/images/browse_icon.png" width="16" height="16" alt="Add"  border="0"/> Browse Project</b></a>&nbsp;&nbsp;|
                    
                    <a href="<%= request.getContextPath()%>/actions/createProject.do?action=1"  style="font-size:12px; vertical-align:middle">
                    <b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Create New Project</b></a>&nbsp;&nbsp;
                </div>
            </div>
            
            
            <br /><br /><br />	
            
            <div id="tabs">
                <ul>
                    <li><a href="#tabs-1" style="font-family:Tahoma, Geneva, sans-serif;">Project Assets</a></li>
                    <li><a href="#tabs-2" style="font-family:Tahoma, Geneva, sans-serif;">Notes (4)</a></li>
                    <li><a href="#tabs-3" style="font-family:Tahoma, Geneva, sans-serif;">Components </a></li>
                    <li><a href="#tabs-4" style="font-family:Tahoma, Geneva, sans-serif;">Versions</a></li>
                    <li><a href="#tabs-5" style="font-family:Tahoma, Geneva, sans-serif;">Tickets(3)</a></li>
                </ul>
                <div id="tabs-1" style="font-size:12px;font-family:Arial, Helvetica, sans-serif;">
                    <table  width="1000"  cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" style=";font-size:12px;font-family:Arial, Helvetica, sans-serif;">
                        <tr>
                            <th  width="30%">
                            </th>
                            <th   width="70%" class="blue_links" style="text-align:right; padding-right:10px; font-weight:normal" >
                                <a href="<%= request.getContextPath()%>/actions/createProjectAsset.do" style="font-size:12px; vertical-align:middle">
                                <b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Add New Asset</b></a>&nbsp;&nbsp;
                            </th>
                        </tr>
                        
                        <tr>
                            <td colspan="2" style="background-color:#215F92 ;height:1px" ></td>
                            
                        </tr>
                        <tr>
                            <td colspan="2" style="border:#215F92 solid 1px; padding: 15px 5px 5px 5px; ">
                                
                                <table width="100%" border="0" class="tableStyle" cellpadding="0" cellspacing="0">
                                    <tr >
                                        <th width="14%">Name</th>
                                        <th width="34%">Description</th>
                                        <th width="9%">Cost</th>
                                        <th width="12%">Date Budgeted</th>
                                        <th width="13%">Approved By</th>
                                        <th width="11%">Date Approved</th>
                                        <th width="7%">Operations</th>
                                    </tr>
                                    <tr>
                                        <td>AIX Unix Server</td>
                                        <td>New AIX Server to be used for production server.</td>
                                        <td>$ 5,000</td>
                                        <td>June 5, 2011</td>
                                        <td>David Pickron</td>
                                        <td>June 7, 2011</td>
                                        <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td>AIX Unix Server</td>
                                        <td>New AIX Server to be used for production server.</td>
                                        <td>$ 6,000</td>
                                        <td>June 5, 2011</td>
                                        <td>David Pickron</td>
                                        <td>June 7, 2011</td>
                                        <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td>AIX Unix Server</td>
                                        <td>New AIX Server to be used for production server.</td>
                                        <td>$ 5,040</td>
                                        <td>June 5, 2011</td>
                                        <td>David Pickron</td>
                                        <td>June 7, 2011</td>
                                        <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td  style="border:0px;">&nbsp;</td>
                                        <td style="border:0px;text-align:right"><b>Total Cost:</b></td>
                                        <td colspan="5" style="border:0px;">$ 16,040.00</td>
                                    </tr>
                                </table>
                                
                            </td>
                            
                        </tr>
                    </table>
                </div>
                
                <div id="tabs-2" style="font-size:12px;font-family:Arial, Helvetica, sans-serif;color:#000">
                    <br/>
                    <a id="dialog_link_new_note" href="<%= request.getContextPath()%>/actions/createProject.do?action=1"  style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all">
                    <b><img src="<%= request.getContextPath()%>/images/icon-new-note.png" width="16" height="16" alt="Add"  border="0"/>&nbsp;Add New Note</b></a>
                    <br/>
                    <br/>
                    <div >Advanced Search
                        <table width="100%"   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                            
                            
                            <tr>
                                <td colspan="2" style="background-color:#215F92"   height="2"></td>
                                
                            </tr>
                            <tr>
                                <td colspan="2" style="border:#215F92 solid 1px ">
                                    <table width="100%" border="0">
                                        <tr>
                                            <td width="100%">Search:&nbsp;
                                                <input type="text" value="Quick Search"  cols="80"    />
                                                
                                                &nbsp;&nbsp;Order by:
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                    <option value="1">Priority</option>
                                                    <option value="2">Name</option>
                                                    <option value="2">Date Started</option>
                                                </select>
                                                &nbsp;&nbsp; Order:&nbsp; 
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                    <option value="1">Ascending</option>
                                                    <option value="2">Descending</option>
                                                    
                                                </select>
                                                &nbsp;&nbsp; Filter:&nbsp; 
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                    <option value="1">Show All</option>
                                                    <option value="2">New</option>
                                                    <option value="3">In Progress</option>
                                                    <option value="4">Completed</option>
                                                </select>
                                                <span style="text-align:right">&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="button" value="Search" />
                                            </span></td>
                                        </tr>
                                </table></td>
                                
                            </tr>
                        </table>
                    </div>
                    <br />
                    
                    <!-- Start of table for the note message -->
                    <table  class="ui-state-custom ui-corner-all "  style="border-color:#ccc; background-color:#FFF;color:#000; text-decoration:none; font-style:normal; " width="1000" >
                        <tr>
                            <td colspan="3">
                                <table height="73"  border="0"cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td valign="top">
                                            <table>
                                                <tr>
                                                    <td width="153" align="center" style="vertical-align:top"><img src="<%= request.getContextPath()%>/images/davidp.jpg" alt="" width="69" height="60" /></td>
                                                </tr>
                                                <tr>
                                                    <td align="center" valign="top">David Pickron</td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td width="844">
                                            <table cellpadding="1" cellspacing="1">
                                                <tr>
                                                    <td  style="padding-right:5px;" >Note Summary: &nbsp;&nbsp;Error encountered during connection.. 
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="844" align="left" valign="top" class="blue_links">
                                                        <table width="100%" class="blue_links"><tr>
                                                    <td  width="50%"><span style="color:#39C">Sent:</span> Thu 6/9/2011 4:54 AM</td><td align="right" width="50%"><a href="">Edit</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">Delete</a></td></tr></table></td>
                                                </tr>
                                                
                                                <tr>
                                                    <td class="divStyle" style="padding-right:5px;" >
                                                        <p>Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.
                                                        </p>
                                                    </td>
                                                </tr>
                                                
                                                
                                            </table>
                                            
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        
                        <tr style=" border-top:thin solid #666 ">
                            <td width="73"   valign="top" style="padding:10px;">Attachment:</td>
                            <td   valign="top" style="padding:10px;">
                                <div>
                                    
                                    <img src="<%= request.getContextPath()%>/images/attachment_icon_black.gif" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="blue_links">[X]</a>
                                    
                                </div>
                            </td>
                            <td width="228" align="right" valign="top"  class="blue_links" style="padding:10px"><a href="">Download</a>  |  <a href="">Read More</a></td>
                        </tr>
                        
                    </table>
                    <br/>
                    <br/>
                    <table  class="ui-state-custom ui-corner-all "  style="border-color:#ccc; background-color:#FFF;color:#000; text-decoration:none; font-style:normal; " width="1000" >
                        <tr>
                            <td colspan="3">
                                <table height="73"  border="0"cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td valign="top">
                                            <table>
                                                <tr>
                                                    <td width="153" align="center" style="vertical-align:top"><img src="<%= request.getContextPath()%>/images/davidp.jpg" alt="" width="69" height="60" /></td>
                                                </tr>
                                                <tr>
                                                    <td align="center" valign="top">David Pickron</td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td width="844">
                                            <table cellpadding="1" cellspacing="1">
                                                <tr>
                                                    <td  style="padding-right:5px;" >Note Summary: &nbsp;&nbsp;Error encountered during connection.. 
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width="844" align="left" valign="top" class="blue_links">
                                                        <table width="100%" class="blue_links"><tr>
                                                    <td  width="50%"><span style="color:#39C">Sent:</span> Thu 6/9/2011 4:54 AM</td><td align="right" width="50%"><a href="">Edit</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="">Delete</a></td></tr></table></td>
                                                </tr>
                                                
                                                <tr>
                                                    <td class="divStyle" style="padding-right:5px;" >
                                                        <p>Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.
                                                        </p>
                                                    </td>
                                                </tr>
                                                
                                                
                                            </table>
                                            
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        
                        <tr style=" border-top:thin solid #666 ">
                            <td width="73"   valign="top" style="padding:10px;">Attachment:</td>
                            <td   valign="top" style="padding:10px;">
                                <div>
                                    
                                    <img src="<%= request.getContextPath()%>/images/attachment_icon_black.gif" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="blue_links">[X]</a>
                                    
                                </div>
                            </td>
                            <td width="228" align="right" valign="top"  class="blue_links" style="padding:10px"><a href="">Download</a>  |  <a href="">Read More</a></td>
                        </tr>
                        
                    </table>
                    <!-- end of table for the note message -->
                    
                    <br/>
                    <br/>
                    
                    
                    
                    
                </div>
                
                <div id="tabs-3" style="font-size:12px;font-family:Arial, Helvetica, sans-serif;">
                    <table  width="1000"  cellpadding="0"  cellspacing="0" bgcolor="#FFFFFF">
                        <tr>
                            <th  width="30%">
                            </th>
                            <th   width="70%" class="blue_links" style="text-align:right; padding-right:10px; font-weight:normal" >
                                <a href="<%= request.getContextPath()%>/actions/createProjectComponent.do" style="font-size:12px; vertical-align:middle">
                                <b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Add New Component</b></a>&nbsp;&nbsp;
                            </th>
                        </tr>
                        
                        <tr>
                            <td colspan="2" style="background-color:#215F92 ;height:1px" ></td>
                            
                        </tr>
                        <tr>
                            <td colspan="2" style="border:#215F92 solid 1px; padding: 15px 5px 5px 5px; ">
                                
                                <table width="100%"  class="tableStyle" border="1"   cellpadding="0" cellspacing="0">
                                    <tbody>
                                        <tr >
                                            <th width="14%">Name</th>
                                            <th width="34%">Description</th>
                                            
                                            <th width="11%">Component Lead</th>
                                            <th width="7%">Operations</th>
                                        </tr>
                                        <tr>
                                            <td>Java Web Application</td>
                                            <td>This permission allows the user to have the necessary access to issues.</td>
                                            
                                            <td>Daryl Galdones</td>
                                            <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                        </tr>
                                        <tr>
                                            <td>ASP.Net</td>
                                            <td>This permission allows the user to have the necessary access to issues.</td>
                                            
                                            <td>Dominic</td>
                                            <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                        </tr>
                                        <tr>
                                            <td>PHP</td>
                                            <td>This permission allows the user to have the necessary access to issues.</td>
                                            
                                            <td >Michael</td>
                                            <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                                
                            </td>
                            
                        </tr>
                    </table>
                    
                </div>
                
                <div id="tabs-4" style="font-size:12px;font-family:Arial, Helvetica, sans-serif;">
                    <table  width="1000"  cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                        <tr>
                            <th  width="30%">
                            </th>
                            <th   width="70%" class="blue_links" style="text-align:right; padding-right:10px; font-weight:normal" >
                                <a href="<%= request.getContextPath()%>/actions/createProjectVersion.do" style="font-size:12px; vertical-align:middle">
                                <b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Add New Version</b></a>&nbsp;&nbsp;
                            </th>
                        </tr>
                        
                        <tr>
                            <td colspan="2" style="background-color:#215F92 ;height:1px" ></td>
                            
                        </tr>
                        <tr>
                            <td colspan="2" style="border:#215F92 solid 1px; padding: 15px 5px 5px 5px; "><table width="100%" border="0" class="tableStyle" style="border:thin" cellpadding="0" cellspacing="0">
                                    <tr >
                                        <th width="10%">Name</th>
                                        <th width="36%">Description</th>
                                        <th width="11%">Schedule</th>
                                        <th width="10%">Approved By</th>
                                        <th width="11%">Date Approved</th>
                                        <th width="12%">Date Released</th>
                                        <th width="10%">Operations</th>
                                    </tr>
                                    <tr>
                                        <td>Version 1.0</td>
                                        <td>This permission allows the user to have the necessary access to issues.</td>
                                        <td>Jun 6, 2011</td>
                                        <td>David Pickron</td>
                                        <td>May 30, 2011</td>
                                        <td>Jun 10, 2011</td>
                                        <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td>Version 1.1</td>
                                        <td>This permission allows the user to have the necessary access to issues.</td>
                                        <td>Jun 6, 2011</td>
                                        <td>David Pickron</td>
                                        <td>Jun 10, 2011</td>
                                        <td>Jun 30, 2011</td>
                                        <td align="center"><a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                            </table></td>
                            
                        </tr>
                    </table>
                </div>
                
                <div id="tabs-5" style="font-size:12px;font-family:Arial, Helvetica, sans-serif;">
                    
                    <table  width="1100"  cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                        <tr>
                            <td>                                                                               
                                
                                <div >Advanced Search
                                    <table width="1100"   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                        
                                        
                                        <tr>
                                            <td colspan="2" style="background-color:#215F92"   height="2"></td>
                                            
                                        </tr>
                                        <tr>
                                            <td colspan="2" style="border:#215F92 solid 1px ">
                                                <table width="100%" border="0">
                                                    <tr>
                                                        <td width="100%">Search:&nbsp;
                                                            <input type="text" value="Quick Search"  cols="80"    />
                                                            
                                                            &nbsp;&nbsp;Status:
                                                            <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                                <option value="1">Priority</option>
                                                                <option value="2">Name</option>
                                                                <option value="2">Date Started</option>
                                                            </select>
                                                            &nbsp;&nbsp; Action:&nbsp; 
                                                            <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                                <option value="1">Open</option>
                                                                <option value="2">Closed</option>
                                                                
                                                            </select>
                                                            <span style="text-align:right">&nbsp;&nbsp;&nbsp;&nbsp;
                                                                <input type="button" value="Search" />
                                                        </span></td>
                                                    </tr>
                                            </table></td>
                                            
                                        </tr>
                                    </table>
                                </div>
                                
                            </td>
                        </tr>
                        <tr>
                            <td>
                                
                                <table width="1100" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="left">
                                    
                                    <tr>
                                        <th width="13%">Ticket_id</th>
                                        <th width="28%">Subject</th>
                                        <th width="10%">Requested By</th>
                                        <th width="13%">Date Requested</th>
                                        <th width="8%">Age(Days)</th>
                                        <th width="7%">Type</th>
                                        <th width="10%">Action Taken</th>
                                        <th width="11%">Operation</th>
                                    </tr>
                                    <tr>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>
                                        <td>Kevin Neus</td>
                                        <td>Jun 6, 2011 6:49 AM</td>
                                        <td align="center">1</td>
                                        <td align="center">Bug</td><br />
                                        <td>Pending</td>
                                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>
                                        <td>Kevin Neus</td>
                                        <td>Jun 6, 2011 6:49 AM</td>
                                        <td align="center">1</td>
                                        <td align="center">Trivial</td><br />
                                        <td>Pending</td>
                                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>
                                        <td>Kevin Neus</td>
                                        <td>Jun 6, 2011 6:49 AM</td>
                                        <td align="center">1</td>
                                        <td align="center">Bug</td><br />
                                        <td>Pending</td>
                                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                </table>
                                
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div  style="width:1100; text-align:right">
                                    <table width="1100">
                                        <tr>
                                            <td align="left"> Total result(s) found: 1</td>
                                            <td align="right" class="right blue_links"><a href="javascript:loadPrevPostedJobs();" id="prevs2">&laquo; PREV</a>  |  <a href="javascript:loadNextPostedJobs();" id="next2">NEXT &raquo;</a> | Go to 
                                                <select  id="goto2" class="blue_links" onchange="gotopage('goto2')">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                </select>
                                                <input type="hidden" id="max" value=""/>  <input type="hidden" id="index" value="0"/>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
                
            </div>
            
            
            <br /><br />
            
        </td>
    </tr>
</table>

<!-- dialogs -->

<div id="dialogNewNote" title="Add New Note">
    
    <table style="border:#E1E2E3 solid 0px;padding:10px" width="750">
        <tr>
            <td >
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td  align="left" valign="top">
                            Messages
                        </td>
                    </tr>
                    <tr>
                        <td  valign="top">
                            <textarea cols="120" rows="20"></textarea>
                        </td>
                    </tr>
                </table>
            </td>       	                
        </tr>
        <tr>
            <td  height="35">Attachment: &nbsp;<input type="file" name="dataFile" size="25"/></td>
            
        </tr>
        <tr>
            <td >
                <div>
                    <table cellpadding="2" cellspacing="2" width="100%">
                        <tr>
                            <td>
                                <img src="<%= request.getContextPath()%>/images/attachment_icon_black.gif" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="blue_links">[X]</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </td>
        </tr>
        
    </table>
</div>


<script type="text/javascript">
    $(function(){

                                

        // Dialog			
        $('#dialogNewNote').dialog({
            autoOpen: false,
            width: 800,
            modal: true,
            buttons: {
                "Post": function() { 
                    $(this).dialog("close"); 
                }, 
                "Cancel": function() { 
                    $(this).dialog("close"); 
                } 
            }
        });
                                
        // Dialog Link
        $('#dialog_link_new_note').click(function(){
            $('#dialogNewNote').dialog('open');
            return false;
        });  
    });
    
                                               
</script>


<%--</body>
</html> --%>

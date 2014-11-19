<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<div>
    <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
        <tr>
            <td class="headerBox">
            Projects</td>
        </tr>
        <tr>
            <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
            <p>You can set different types of permissions to provide levels of functionality to users according to their needs. For example, you could create one level of permission that provides users read-only access to the issues and projects, and create another that provides users the ability to create, modify, and delete files and issues and projects.</p></td>
        </tr>
        <tr>
            <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
                <hr/>
                <div><br /><br />
                    <div class="blue_links" style="vertical-align:middle"> <a href="<%= request.getContextPath()%>/actions/createProject.do?action=1"  style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all"><b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Create New Project</b></a> </div>
                    <br /><br />
                    
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
                    <table width="100%" border="1" class="tableStyle" cellpadding="0" cellspacing="0">
                        <tr >
                            <th width="17%">Name</th>
                            <th width="24%">Description</th>
                            <th width="15%">Project Lead</th>
                            <th width="15%">Satus</th>
                            <th width="13%">Priority</th>
                            <th width="13%">Date Started</th>
                            <th width="13%">URL</th>
                            <th width="16%">Operations</th>
                        </tr>
                        <logic:present name="searchResults" property="projects">
                            <logic:present name="searchResults" property="projects">
                                <logic:iterate name="searchResults" property="projects" id="result">
                                    <tr>
                                        <td>
                                            <a href="<%= request.getContextPath()%>/actions/projectInfo.do?projectId=<bean:write name="result" property="projectId" />">
                                                <bean:write name="result" property="projectName" />
                                            </a>
                                        </td>
                                        <td><bean:write name="result" property="projectDescription" /></td>
                                        <td>
                                            <a href=""><bean:write name="result" property="projectLeadFullName" /></a>
                                            
                                        </td>
                                        <td>
                                            In Progress
                                        </td>
                                        <td>
                                            Top Priority
                                        </td>
                                        <td width="13%"><bean:write name="result" property="startDateString" /></td>
                                        <td><a href="Http://localhost:8080/itpcontext">Http://localhost:8080/itpcontext</a></td>
                                        <td align="center"><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                    </tr>
                                </logic:iterate>
                            </logic:present>
                        </logic:present>
                        <!--<tr>
                        <td>CFC</td>
                            <td>Project Description Here</td>
                            <td><a href="">Daryl Galdones</a></td>
                            <td>
                                In Progress
                                
                            </td>
                            <td>
                                Top Priority
                                
                            </td>
                            <td width="13%">May 15, 2011</td>
                            <td><a href="Http://localhost:8080/itpcontext">Http://localhost:8080/cfcclient</a></td>
                            <td align="center"><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                        </tr>
                        <tr>
                            <td>CSPRO</td>
                            <td>Project Description Here</td>
                            <td><a href="">Jomar Mondejar</a></td>
                            <td>
                                In Progress
                                
                            </td>
                            <td>
                                Top Priority
                                
                            </td>
                            <td width="13%">May 15, 2011</td>
                            <td><a href="Http://localhost:8080/itpcontext">Http://localhost:8080/cspro</a></td>
                            <td align="center"><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                        </tr>
                        -->
                    </table>
                    
                </div>
                
                <div  style="width:100%; text-align:right">
                    <table width="100%">
                        <tr>
                            
                            <td align="left"> Total result(s) found:<b><bean:write name="searchResults" property="totalResults" /></b></td>
                            <td align="right" class="right blue_links">Rows per page:
                                <select  id="goto2" class="blue_links" onchange="gotopage('goto2')">
                                    <option value="10">10</option>
                                    <option value="20">20</option>
                                    <option value="30">30</option>
                                    <option value="40">40</option>
                                    <option value="50">50</option>
                                </select>
                                <a href="javascript:loadPrevPostedJobs();" id="prevs2">&laquo; PREV</a>  |  <a href="javascript:loadNextPostedJobs();" id="next2">NEXT &raquo;</a> | Go to 
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

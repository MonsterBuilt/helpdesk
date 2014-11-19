<div>
                	<table width="100%" cellpadding="0" cellspacing="0">
                            <tr>
                                <td class="header" style="Verical-align:middle;">Welcome to Information Technology Portal
                                  
                                </td>
                                <td class="header">
                                    <table  align="right">
                                        <tr>
                                            <td class="menu2"  >
                                            	<ul>
                                                <li><a href="#">Daryl Galdones<img style="border:0px" src="<%= request.getContextPath()%>/images/arrow.png" width="17" height="11" align="center" /></a>
                                                    <ul>
                                                	<li><a href="#">View Profile</a></li>
                                                        <li><a href="#">Log Out</a></li>
                                                    </ul>
                                                 </li>
                                                </ul>   	
                                            </td>
                                            <td>
                                            <input type="text" size="30" value="Quick Search" />
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                                
                            </tr>
                            <tr>
                            <td colspan="2" class="menu" align="left">
                                <table width="100%" border="0"  cellpadding="0" cellspacing="0" height="25px">
                                    <tr>
                                    	<td width="70%">
                                            <table width="520" border="0"  cellpadding="0" cellspacing="0" height="25px">
                                                <tr>
                                    
                                                <td width="50">
                                                <ul>
                                                    <li><a href="<%= request.getContextPath () %>/actions/dashBoard.do">Dashboards</a>
                                                       <%-- <ul><img style="border:0px" src="<%= request.getContextPath()%>/images/arrow.png" width="17" height="11" align="center" />
                                                                <li><a href="#">View System Dashboards</a></li>
                                                            <li><a href="#">Manage Dashboards</a></li>
                                                        </ul> --%>
                                                    </li>
                                                </ul>
                                                </td>
                                                <td width="100">
                                                    <ul>
                                                    <li><a href="<%= request.getContextPath () %>/actions/Welcome.do">Projects<img style="border:0px" src="<%= request.getContextPath()%>/images/arrow.png" width="17" height="11" align="center" /></a>
                                                        <ul>
                                                            <li><a href="<%= request.getContextPath () %>/actions/createProject.do?action=1" >Create New Project</a></li>
                                                            <li><a href="<%= request.getContextPath () %>/actions/projectList.do">Current Projects</a></li>
                                                            <li><a href="<%= request.getContextPath () %>/actions/projectList.do">View All Projects</a></li>
                                                        </ul>
                                                    </li>
                                                    </ul> 
                                              </td>
                                                <td width="100">
                                                    <ul>
                                                    <li><a href="#">Ticket<img style="border:0px" src="<%= request.getContextPath()%>/images/arrow.png" width="17" height="11" align="center" /></a>
                                                        <ul>
                                                            <li><a href="<%= request.getContextPath () %>/actions/ticket.do">Search for Ticket</a></li>
                                                            <li><a href="<%= request.getContextPath () %>/actions/requestTicket.do">Request Ticket</a></li>
                                                            
                                                        </ul>
                                                    </li>
                                                </ul> 
                                                </td>
                                                <td width="100">
                                                    <ul>
                                                    <li><a href="#">Administration<img style="border:0px" src="<%= request.getContextPath()%>/images/arrow.png" width="17" height="11" align="center" /></a>
                                                        <ul>
                                                            <li><a href="#">Manage Projects <img style="border:0px" src="<%= request.getContextPath()%>/images/arrowRight.png" height="7" width="4" align="center" /></a>
                                                                <ul>
                                                                    <li><a href="<%= request.getContextPath () %>/actions/projectList.do">View All Projects</a></li>
                                                                    <li><a href="<%= request.getContextPath () %>/actions/createProject.do?action=1" >Create New Project</a></li>
                                                                    <li><a href="<%= request.getContextPath()%>/actions/projectCategory.do">Project Category</a></li>
                                                                </ul>

                                                            </li>
                                                            
                                                            <%--li><a href="#">Manage Tickets <img style="border:0px" src="<%= request.getContextPath()%>/images/arrowRight.png" height="7" width="4" align="center" /></a>
                                                                <ul>
                                                                    <li><a href="#">View Tickets</a></li>
                                                                    <li><a href="#">Request New Ticket</a></li>
                                                                 </ul>

                                                            </li--%>
                                                            
                                                            <li><a href="#">Manage User/Accounts <img style="border:0px" src="<%= request.getContextPath()%>/images/arrowRight.png" height="7" width="4" align="center" /></a>
                                                                <ul>
                                                                    <li><a href="<%= request.getContextPath()%>/actions/userRoles.do">User Roles/Group</a></li>
                                                                    <li><a href="<%= request.getContextPath()%>/actions/users.do">User Accounts</a></li>
                                                                 </ul>

                                                            </li>
                                                            
                                                            <li><a href="<%= request.getContextPath()%>/actions/permissions.do">Permission Settings</a></li>
                                                            
                                                            <li><a href="#">Global Variables Settings <img style="border:0px" src="<%= request.getContextPath()%>/images/arrowRight.png" height="7" width="4" align="center" /></a>
                                                                <ul>
                                                                    <li><a href="<%= request.getContextPath()%>/actions/prioritySet.do">Priority Settings</a></li>
                                                                    <li><a href="<%= request.getContextPath()%>/actions/statusSet.do">Project Status Settings</a></li>
                                                                 </ul>

                                                            </li>
                                                           
                                                        </ul>
                                                    </li>
                                                </ul> 
                                                </td>
                                        
                                            </tr>
                                        </table>
                                    </td>
                                        <td width="40%" align="right">
                                            <table>
                                                <tr>
                                                    <td width="100%" align="right">
                                                    <ul>
                                                      <li><a href="<%= request.getContextPath () %>/actions/requestTicket.do">[&nbsp;<img style="border:0px" src="<%= request.getContextPath()%>/images/new_ticket_icon.png" width="17" height="15" align="center" /> &nbsp;Request Ticket&nbsp;]</a></li></ul>
                                                    </td>
                                                </tr>
                                            </table>
                                            </td>
                                    </tr>
                                </table>
                            </td>      
                       </tr>
                   </table>
             </div>


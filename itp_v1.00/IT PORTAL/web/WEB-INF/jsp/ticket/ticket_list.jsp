<div>
   <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
	<tr>
		<td class="headerBox">
			My Tickets
		</td>
    </tr>
	<tr>
        <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; ">

            <div><br/><br/>
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
            </div>

<table width="100%" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="center">
  
                    <tr>
                        <th width="11%">Ticket_id</th>
                        <th width="18%">Subject</th>
                        <th width="19%">Requested By</th>
                        <th width="13%">Date Requested</th>
                        <th width="13%">Age(Days)</th>
                        <th width="8%">Type</th>
                        <th width="12%">Action Taken</th>
                        <th width="19%">Operation</th>
                    </tr>
                    <tr>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                        <td>Kevin Neus</td>
                        <td>Jun 6, 2011 6:49 AM</td>
                        <td align="center">1</td>
                        <td align="center">Bug</td><br />
						<td>Pending</td>
                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                    </tr>
                    <tr>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                        <td>Kevin Neus</td>
                        <td>Jun 6, 2011 6:49 AM</td>
                        <td align="center">1</td>
                        <td align="center">Trivial</td><br />
						<td>Pending</td>
                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                    </tr>
                     <tr>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                        <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                        <td>Kevin Neus</td>
                        <td>Jun 6, 2011 6:49 AM</td>
                        <td align="center">1</td>
                        <td align="center">Bug</td><br />
						<td>Pending</td>
                        <td><a href="">View</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                    </tr>
                </table>
                <div  style="width:100%; text-align:right">
                       <table width="100%">
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
    <tr>
    	<td>
        	<br />	
                                          
        </td>
    </tr>
</table>
</div>

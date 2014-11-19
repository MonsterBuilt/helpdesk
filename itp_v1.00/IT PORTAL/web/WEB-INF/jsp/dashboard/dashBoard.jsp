<script type="text/javascript">
			$(function(){

				
	
				// Tabs
				$('#tabs').tabs();
	
});
</script>


<div  >
   

 <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
     <tr>
         <td class="headerBox">
              Dashboards
         </td>
    </tr>
    <tr>
     <td style=" padding:10px; padding-top:10px; vertical-align:top">
         
         <div id="tabs">
			<ul>
				<li><a href="#tabs-1" style="font-family:Tahoma, Geneva, sans-serif;">Ticket Requests <b>(10)</b></a></li>
				<li><a href="#tabs-2" style="font-family:Tahoma, Geneva, sans-serif;">Tickets Statistics</a></li>
                                <li><a href="#tabs-3" style="font-family:Tahoma, Geneva, sans-serif;">My Projects</a></li>
			</ul>
			<div id="tabs-1">
                            <!-- Start of Ticket Requests DIV -->
                            <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                 <tr>
                                     <td class="headerBox2" width="50%">
                                          <span></span>
                                     </td>
                                     <td class="headerBox2"  width="50%" align="right">
                                          <a href="" ><img border="0" src="<%= request.getContextPath()%>/images/refresh_icon.png"  /></a>
                                     </td>
                                </tr>
                        </table>
           		<table width="100%" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="center">
          		    <tr>
                                <th width="18%">Ticket ID</th>
                                <th width="42%">Subject</th>
                                <th width="23%">Requestor</th>
                                <th width="17%">Date of Request</th>
                                <th width="17%">Priority</th
                                
                            </tr>
                            <tr>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060711</a></td>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                                <td>Kevin Neus</td>
                                <td>Jun 6, 2011 6:49 AM</td>
                                <td  style=" color:#F00">Urgent</td>
                                
                           </tr> 
                           <tr>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060712</a></td>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                                <td>Kevin Neus</td>
                                <td>Jun 6, 2011 6:49 AM</td>
                                <td style=" color:#063">Minor</td>
                                
                           </tr> 
                           <tr>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060713</a></td>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                                <td>Kevin Neus</td>
                                <td>Jun 6, 2011 6:49 AM</td>
                                <td  style=" color:#F00">Urgent</td>
                                
                           </tr> 
                           <tr>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do">ITP001-000-060714</a></td>
                                <td><a href="<%= request.getContextPath()%>/actions/ticketDtls.do"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>
                                <td>Kevin Neus</td>
                                <td>Jun 6, 2011 6:49 AM</td>
                                <td style=" color:#063">Minor</td>
                                
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
                            <!-- End of Ticket Requests DIV -->
                        </div>
			<div id="tabs-2">
                            <!-- Start of Ticket Statistics DIV -->
                            
                            <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                 <tr>
                                     <td class="headerBox2">
                                          
                                     </td>
                                </tr>
                                <tr>
                                     <td >
                                         <table width="373" class="tableStyle" border="1" cellpadding="0" cellspacing="0">
                                            <tr>
                                                <th width="31%">Ticket Status</th>
                                                <th width="24%">Count</th>
                                                <th width="45%">Operation</th>

                                            </tr>
                                            <tr>
                                                <td>New</td>
                                                <td>2</td>
                                                <td><a href="#">View All</a></td>
                                           </tr>
                                           <tr>
                                                <td>New</td>
                                                <td>2</td>
                                                <td><a href="#">View All</a></td>
                                           </tr>
                                           <tr>
                                                <td>New</td>
                                                <td>2</td>
                                                <td><a href="#">View All</a></td>
                                           </tr> 
                                        </table>
                                     </td>
                                </tr>
                                
                        </table>
           		
                             <!-- End of Ticket Statistics DIV -->
                        </div>
			<div id="tabs-3">
                            <!-- Start of project DIV -->
                                 <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                     <tr>
                                         <td class="headerBox2">
                                              <span>Project Statistic</span>
                                         </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <table width="100%" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="left">
                                                 <tr>
                                                    <th width="23%">Project</th>
                                                    <th width="21%">Status</th>
                                                    <th width="14%">Notes Count</th>
                                                    <th width="42%">Lead</th>

                                                </tr>
                                                <tr>
                                                    <td><a href="#">ITP</a></td>
                                                    <td>In Progress</td>
                                                    <td> 34</td>
                                                    <td> <a href="#">Jun Espinosa</a></td>
                                               </tr>  
                                             </table>
                                        </td>
                                    </tr>

                                 </table>
                		
                               
                            <!-- End of Project DIV -->
                        </div>
         </div> 
                                         
                                       
          <table width="100%" border="0">
            <tr>
            	<td width="50%" rowspan="2" style=" padding-right:20px; padding-top:20px; vertical-align:top">
                           
            	
                        <!--table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                 <tr>
                                     <td class="headerBox2">
                                          <span>Accounts</span>
                                     </td>
                                </tr>
                        </table>
           				<table width="100%" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="center">
          					<tr>
                                <th width="31%">User Roles</th>
                                <th width="69%">Description</th>
                                
                            </tr>
                            <tr>
                                <td><a href="#">User Level 1</a></td>
                                <td>Cant Acces Admin Functions</td>
                                
                           </tr>  
                        </table-->
            	</td>
               	<td width="50%" style=" padding-left:20px; padding-top:20px; vertical-align:top">
                		
                        
            	</td>
           </tr>
            <tr>
            	<td rowspan="2"  width="50%" style=" padding-left:20px; padding-top:20px; vertical-align:top">
                	
            	</td>
           </tr>
        </table>
       				
       						

      </td>
    </tr>
  </table>

    
</div>
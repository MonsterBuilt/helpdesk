<div>
    <table class="componentStyle" width="100%" cellpadding="10" cellspacing="0" bgcolor="#FFFFFF">
	<tr>
		<td class="headerBox">
			Manage User
		</td>
    </tr>
	<tr>
        <td>
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
                                                                        <input type="text" size="30" value="Quick Search" />
                                                                      <!-- &nbsp;&nbsp; Search by:&nbsp; <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                                      <option value="1">Name</option>
                                                                      <option value="2">Roles</option>
                                                                      <option value="2">Project</option>
                                                                    </select>
                                                                    &nbsp;&nbsp;Order:
                                                                     
                                                                      <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                                      <option value="1">Ascending</option>
                                                                      <option value="2">Descending</option>
                                                                     
                                                                    </select>-->
                                                                      <span style="text-align:right">&nbsp;&nbsp;&nbsp;&nbsp;
                                                                      <input type="button" value="Search" />
                                                                    </span></td>
                                                                  </tr>
                                                                </table></td>
                                                      
                                                    </tr>
                                                </table>
                                            </div>
            <%--div>
                <table width="100%">
                    <tr>
                        <td width="3%">
                            Search:
                        </td>
                        <td width="13%">
                            <input type="text" size="30" value="Quick Search" /> 
                        </td>
                        <td width="3%">
                            Options:
                        </td>
                        <td width="13%">
                            <input type="text" size="30"/>
                        </td>
                        <td width="3%">
                            Status:
                        </td>
                        <td width="65%">
                            <input type="text" size="30"/>
                        </td>
                        
                    </tr>
                </table>
            </div--%>
<div>
<br /><br />
                                            <div class="blue_links"><a href="javascript:displayUserDiv(1);"   style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all"><b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Create New User Account</b></a></div>
                                            <br /><br />
  <table width="100%" class="tableStyle" border="1" cellpadding="0" cellspacing="0" align="center">
  
                    <tr>
                        <th width="18%">User Name</th>
                        <th width="18%">User Roles</th>
                        <th width="36%">Projects</th>
                        <th width="10%">Active</th>
                        <th width="18%">Action</th>
                    </tr>
                    <tr>
                        <td><a href="#">(dary1)</a></td>
                        <td><a href="#">(admin)</a></td>
                        <td>(pName)</td>
                        <td align="center"><img src="<%= request.getContextPath() %>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                        <td align="center"><a href="#">Edit</a>&nbsp;|&nbsp;<a href="#">Delete</a>&nbsp;|&nbsp;<a href="#">Deactivate</a></td>
                        
                    </tr>  
                </table>
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
                                            <div id="newUserDIv" style="width:800px; display:none">
                                                <table   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" >
                                                    <tr>
                                                        <th class="tabBox" width="25%" align="left">
                                                            New  Account
                                                     </th>
                                                      <th  width="75%" >
                                                           
                                                      </th>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td colspan="2" style="background-color:#215F92"   height="2"></td>
                                                      
                                                    </tr>
                                                     <tr>
                                                        <td colspan="2" style="border:#215F92 solid 1px ;padding:10px" >
                                                            	<table width="100%" border="0">
                                                                  <tr>
                                                                    <td width="24%" >&nbsp;</td>
                                                                    <td colspan="3">&nbsp;</td>
                                                                    
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Last Name:</td>
                                                                    <td width="39%"><input type="text"  cols="80"    /></td>
                                                                    <td width="15%">First Name:</td>
                                                                    <td width="21%" align="right"><input type="text"  cols="80"    /></td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>User Name::</td>
                                                                    <td><input type="text"  cols="80"    /></td>
                                                                    <td width="15%">Email:</td>
                                                                    <td width="21%" align="right"><input type="text"  cols="80"    /></td>
                                                                  
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Default Password::</td>
                                                                    <td><input type="text"  cols="80"    /></td>
                                                                    <td width="15%">Phone No.:</td>
                                                                    <td width="21%" align="right"><input type="text"  cols="80"    /></td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Re-type Password:</td>
                                                                    <td><input type="text"  cols="80"    /></td>
                                                                    <td width="15%">Mobile No.:</td>
                                                                    <td width="21%" align="right"><input type="text"  cols="80"    /></td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Add User Roles:</td>
                                                                    <td colspan="3"><select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                                      <option value="1">Select Roles</option>
                                                                      <option value="2">admin</option>
                                                                    </select></td>
                                                                  </tr>
                                                                  
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td colspan="3">&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                   
                                                                    <td colspan="3" style="text-align:right"><input type="button" value="Save" />&nbsp;&nbsp;&nbsp;<input type="button" value="Cancel"  onclick="javascript:displayUserDiv(0);"/></td>
                                                                    <td width="1%">&nbsp;</td>
                                                                  </tr>
                                                                </table>

                                                        </td>
                                                      
                                                    </tr>
                                                </table>
                                            </div>
        </td>
    </tr>
</table>
</div>
<script language='javascript'> 
  function displayUserDiv( bit){
      if (bit==1)
           document.getElementById('newUserDIv').style.display='block';
      else
           document.getElementById('newUserDIv').style.display='none';
  }
</script>
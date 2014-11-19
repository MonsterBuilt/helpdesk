<div>
<table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                    	<tr>
                                        	<td class="headerBox">
                                            	Permission Settings
                                          </td>
                                        </tr>
                                        <tr>
                                        	<td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
                                            	<p>You can set different types of permissions to provide levels of functionality to users according to their needs. For example, you could create one level of permission that provides users read-only access to the issues and projects, and create another that provides users the ability to create, modify, and delete files and issues and projects.</p></td>
                                        </tr>
                                        <tr>
                                       	  <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
                                          <hr/>
                                            <div><br /><br />
                                            <div class="blue_links"> <a href="javascript:displayPermissionDiv(1);"  style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all"><b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/>Create New Permission</b></a></div>
                                            <br /><br /><br />
                                              <table width="100%" border="1" class="tableStyle" cellpadding="0" cellspacing="0">
                                                <tr >
                                                  <th width="15%">Name</th>
                                                  <th width="24%">Description</th>
                                                  <th width="16%">ITP Component</th>
                                                  <th width="8%">Add</th>
                                                  <th width="7%">Edit</th>
                                                  <th width="8%">Delete</th>
                                                  <th width="8%">View/Browse</th>
                                                  <th width="14%">Operations</th>
                                                </tr>
                                                <tr>
                                                  <td>Issues Permission #1</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td>Issues</td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td align="center">&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                                <tr>
                                                  <td>Issues Permission #2</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td>Issues</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td align="center">&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                                <tr>
                                                  <td>Issues Permission #3</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td>Issues</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center">&nbsp;</td>
                                                  <td  align="center"><img src="<%= request.getContextPath()%>/images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td align="center">&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                               
                                              </table>
                                     
                                            </div>
                                            
                                            <div  style="width:100%; text-align:right">
                                            	<table width="100%">
                                                  <tr>
                                                    
                                                      <td align="left"> Total result(s) found: 3</td>
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
                                            <br /><br /><br />	
                                            <div id="newPermissionDIv" style="width:800px; display:none">
                                                <table   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                                    <tr>
                                                        <th class="tabBox" width="20%">
                                                            New Permission
                                                      </th>
                                                      <th  width="80%" >
                                                           
                                                      </th>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td colspan="2" style="background-color:#215F92"   height="2"></td>
                                                      
                                                    </tr>
                                                     <tr>
                                                        <td colspan="2" style="border:#215F92 solid 1px ">
                                                            	<table width="100%" border="0">
                                                                  <tr>
                                                                    <td >&nbsp;</td>
                                                                    <td >&nbsp;</td>
                                                                    
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Permission Name:</td>
                                                                    <td><input type="text"  cols="80"    /></td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Description:</td>
                                                                    <td><textarea name="textarea" cols="50" ></textarea></td>
                                                                  
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Component:</td>
                                                                    <td>
                                                                    	<select  id="goto2" class="" onchange="gotopage('goto2')">
                                                                            <option value="1">Select ITP Component Here</option>
                                                                            <option value="2">2</option>
                                                        				</select>
                                                        			</td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td>&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Allowed Operation:</td>
                                                                    <td >Can Add
                                                                    <input type="checkbox" />
                                                                    &nbsp;&nbsp;|&nbsp;&nbsp; Can Edit
                                                                    <input type="checkbox" />
                                                                    &nbsp;&nbsp;|&nbsp;&nbsp;Can Delete
                                                                    <input type="checkbox" />
                                                                    &nbsp;&nbsp;|&nbsp;&nbsp;Can View/Browse
                                                                    <input type="checkbox" /></td> 
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td >&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                   
                                                                    <td style="text-align:right"><input type="button" value="Save" />&nbsp;&nbsp;&nbsp;<input type="button" value="Cancel" onclick="javascript: displayPermissionDiv(0);" /></td>
                                                                  </tr>
                                                                </table>

                                                        </td>
                                                      
                                                    </tr>
                                                </table>
                                            </div>
                                          </td>
                                        </tr>
                                    </table>
                        <script language='javascript'> 
  function displayPermissionDiv( bit){
      if (bit==1)
           document.getElementById('newPermissionDIv').style.display='block';
      else
           document.getElementById('newPermissionDIv').style.display='none';
  }
</script>
</div>

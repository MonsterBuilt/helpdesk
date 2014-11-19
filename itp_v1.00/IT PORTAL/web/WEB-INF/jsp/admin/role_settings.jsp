<div>
<table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                    	<tr>
                                        	<td class="headerBox">
                                            	User Role Settings
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
                                            <div class="blue_links"> <a href="javascript:displayRoleDiv(1);"   style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all"><b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Create New Role</b></a></div>
                                            <br /><br /><br />
                                              <table width="100%" border="1" class="tableStyle" cellpadding="0" cellspacing="0">
                                                <tr >
                                                  <th width="15%">Name</th>
                                                  <th width="24%">Description</th>
                                                  <th width="16%">Permission(s)</th>
                                                  <th width="14%">Operations</th>
                                                </tr>
                                                <tr>
                                                  <td>Admin1</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td><a href="">Issues Permission #1</a>,&nbsp;<a href="">Issues Permission #2</a>&nbsp;</td>
                                                  <td align="center"><a href="">Copy</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                                <tr>
                                                  <td>Admin2</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td><a href="">Issues Permission #1</a>,&nbsp;<a href="">Issues Permission #2</a>&nbsp;</td>
                                                  <td align="center"><a href="">Copy</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                                <tr>
                                                  <td>user 1</td>
                                                  <td>This permission allows the user to have the necessary access to issues.</td>
                                                  <td>&nbsp;<a href="">Issues Permission #2</a>&nbsp;</td>
                                                  <td align="center"><a href="">Copy</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
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
                                            	
                                            <div id="newRoleDIv" style="width:900px; display:none">
                                                <br /><br /><br />
                                                <table   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                                    <tr>
                                                        <th class="tabBox" width="20%">
                                                            New Role
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
                                                                    <td width="20%" >&nbsp;</td>
                                                                    <td width="80%" >&nbsp;</td>
                                                                    
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Role
Name:</td>
                                                                    <td><input type="  cols="80"    /></td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Description:</td>
                                                                    <td><textarea name="textarea" cols="50" ></textarea></td>
                                                                  
                                                                  </tr>
                                                                   <tr>
                                                                    <td>Select Permission:</td>
                                                                    <td>
                                                                    	<select  id="goto2" class="" onchange="gotopage('goto2')">
                                                                            <option value="1">Select ITP Component Here</option>
                                                                            <option value="2">2</option>
                                                        				</select>
                                                        			</td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td >&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Permission(s):</td>
                                                                    <td >&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                   
                                                                    <td style="text-align:right"><input type="button" value="Save" />&nbsp;&nbsp;&nbsp;<input type="button" value="Cancel" onclick="javascript:displayRoleDiv(0);" /></td>
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
  function displayRoleDiv( bit){
      if (bit==1)
           document.getElementById('newRoleDIv').style.display='block';
          else
               document.getElementById('newRoleDIv').style.display='none';
              
  }
</script>

 <div>
                        <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                    	<tr>
                                            <td class="headerBox">
                                            	Project Priority Settings
                                            </td>
                                        </tr>
                                        <tr>
                                        	<td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
                                            	
                                        </tr>
                                        <tr>
                                       	  <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; ">  
                                        <div class="blue_links"> <a href="javascript:displayPriorityDiv(1);"  style="font-size:13px; vertical-align:middle;padding: .4em 1em .4em 20px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all"><b><img src="<%= request.getContextPath()%>/images/add_16.png" width="16" height="16" alt="Add"  border="0"/> Create New Priority Info</b></a></div><br/><br/>
                                         <div class="blue_links">
                                            <table width="100%" border="1" class="tableStyle" cellpadding="0" cellspacing="0">
                                                <tr >
                                                  <th width="15%">Name</th>
                                                  <th width="24%">Description</th>
                                                  <th width="16%">Priority Order</th>
                                                  <th width="8%">Icon</th>
                                                  <th width="14%">Operations</th>
                                                </tr>
                                                <tr>
                                                  <td>Urgent</td>
                                                  <td>This should be given attention immedidately</td>
                                                  <td align="center">1</td>
                                                  <td  align="center"><img src="../images/icon_check.png" width="23" height="18" alt="True" /></td>
                                                  <td align="center"><a href="">Copy</a>&nbsp;|&nbsp;<a href="">Edit</a>&nbsp;|&nbsp;<a href="">Delete</a></td>
                                                </tr>
                                               
                                              </table>
                                     
                                            </div>
                                            
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
                                            <br/><br/>
                                            <div id="newPriorityDIv" style="width:900px; display:none">
    
                                                <table   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                                                    <tr>
                                                        <th class="tabBox" width="20%">
                                                            New Priority
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
                                                                    <td>Order No:</td>
                                                                    <td><input type="text"  cols="80"    /></td>
                                                                   
                                                                  </tr>
                                                                  <tr>
                                                                    <td>Icon:</td>
                                                                    <td> <input type="file" /><img width="20px" height="20px" src="dsad" /></td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td >&nbsp;</td>
                                                                  </tr>
                                                                  <tr>
                                                                    <td>&nbsp;</td>
                                                                   
                                                                    <td style="text-align:right"><input type="button" value="Save" />&nbsp;&nbsp;&nbsp;<input type="button" value="Cancel" onclick="javascript:displayPriorityDiv(0);" /></td>
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
  function displayPriorityDiv( bit){
      if (bit==1)
           document.getElementById('newPriorityDIv').style.display='block';
      else
           document.getElementById('newPriorityDIv').style.display='none';
  }
</script>


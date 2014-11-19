<div>
     <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
	<tr>
		<td class="headerBox">
			Request New Ticket
		</td>
        </tr>
	<tr>
            <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; ">
                <div style="width:800px">
                     <table     cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                        
                        
                        <tr>
                            <td >
                                <table width="100%" border="0">
                                       <tr>
                                           <td width="15%" >&nbsp;</td>
                                           <td >&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td>Project:</td>
                                            <td width="48%">
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                           <option value="0">[ Select Project ]</option>
                                                           <option value="1">Crimshield</option>
                                                           <option value="2">ITP</option>
                                                           <option value="3">Crime Free Cricle</option>
                                                           <option value="4">Others</option>
                                                 </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Component:</td>
                                            <td width="48%">
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                           <option value="0">[ Select Component ]</option>
                                                           <option value="1">Crimshield</option>
                                                           <option value="2">ITP</option>
                                                           <option value="3">Crime Free Cricle</option>
                                                           <option value="4">Others</option>
                                                 </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>* Subject:</td>
                                            <td width="48%"><input type="text" size="80"     /></td>
                                        </tr>
                                        
                                        <tr>
                                            <td>Ticket Type:</td>
                                            <td width="48%">
                                                <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                           <option value="1">Bug</option>
                                                           <option value="2">New Feature</option>
                                                           <option value="3">Task</option>
                                                           <option value="4">Improvement</option>
                                                 </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="vertical-align:top">Priority:</td>
                                            <td style="vertical-align:top">
                                                  <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                          <option value="1">Blocker</option>
                                                          <option value="2">Critical</option>
                                                          <option value="3">Major</option>
                                                          <option value="4">Minor</option>
                                                          <option value="5">Trivial</option>
                                                  </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="vertical-align:top">Description:</td>
                                            <td style="vertical-align:top;" ><textarea name="textarea" cols="80" rows="30" ></textarea>
                                                       <div style="text-align:right"><input type="button" value="Clear Summary" /></div>
                                                                        
                                            </td>
                                        </tr>
                                        
                                        <!--tr>
                                            <td>Status:</td>
                                            <td width="48%">
                                                  <select name="goto" class=""  id="goto" onchange="gotopage('goto2')">
                                                           <option value="1">Priority</option>
                                                           <option value="2">Name</option>
                                                           <option value="2">Date Started</option>
                                                  </select>
                                            </td>
                                                                   
                                                      
                                      	</tr-->
                                        <tr>
                                            <td colspan="2" style="border-bottom:#CCC thin solid;">
                                            <br/><br/>
                                            </td>
                                        </tr>
                                        <tr>
                                           <td>Attachment:</td>
                                           <td><input type="file" name="dataFile" size="25"/></td>
                                        </tr>
                                         <tr>
                                             <td>&nbsp;</td>
                                             <td class="blue_links">
                                                <div>
                                                    <table cellpadding="2" cellspacing="2">
                                                        <tr>
                                                            <td width="134">
                                                                <img src="<%= request.getContextPath()%>/images/attachment_icon_black.gif" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="blue_links">[X]</a>
                                                            </td>
                                                        </tr>
                                                   </table>
                                                </div>
                                             </td>
                                         </tr>
                                         <tr>
                                            <td>&nbsp;</td>
                                            <td  style="text-align:right"><input type="button" value="Send Request" />
                                            </td>
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
      

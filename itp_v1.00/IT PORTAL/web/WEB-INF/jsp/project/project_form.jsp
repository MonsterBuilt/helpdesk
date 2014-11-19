<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<div>
    <html:form action="/actions/createProject" styleId="projectForm">
        <html:hidden property="action" />
        <html:hidden property="projectId" />
        <html:hidden property="userNameList" styleId="userNameList" />
        <table class="componentStyle" width="100%" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
            <tr>
                <td class="headerBox">
                    New Project 
                </td>
            </tr>
            <tr>
                <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; ">
                <p>&nbsp;</p></td>
            </tr>
            <tr>
                <td>
                    <tiles:insert attribute="applicationMessage" />	
                </td>
            </tr>
            <tr>
                <td style="font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; "><div style="width:100%">
                        <table width="100%"   cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                            
                            
                            <tr>
                                <td  style="background-color:#215F92"   height="2"></td>
                                
                            </tr>
                            <tr>
                                <td  style="border:#215F92 solid 1px ">
                                    <table   border="0" class="tableInputs">
                                        <tr>
                                            <td width="100" >&nbsp;</td>
                                            <td width="300" >&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td>* <bean:message key="project.name" />:</td>
                                            <td><html:text property="projectName" size="80"/></td>
                                        </tr>
                                        <tr>
                                            <td style="vertical-align:top">* <bean:message key="project.description" />:</td>
                                            <td style="vertical-align:top"><html:textarea property="projectDescription" cols="80" rows="10" ></html:textarea></td>
                                        </tr>
                                        <tr>
                                            <td>* <bean:message key="project.category" />:</td>
                                            <td>
                                                <span style="text-align:left">
                                                    <html:select property="projectCategoryId" styleClass=""  styleId="goto" onchange="gotopage('goto2')">
                                                        <html:optionsCollection name="projectCategories" label="projectCategoryName"value="projectCategoryId" />
                                                    </html:select>
                                                </span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Company:</td>
                                            <td><span style="text-align:left">
                                                    <html:select property="companyId" styleClass=""  styleId="goto3" onchange="gotopage('goto2')">
                                                        <html:optionsCollection name="companies" label="companyName"value="companyId" />
                                                    </html:select>
                                            </span></td>
                                        </tr>
                                        <tr>
                                            <td>Project Lead:</td>
                                            <td>
                                                <html:select property="projectLeadId" styleClass=""  styleId="goto2" onchange="gotopage('goto2')">
                                                    <html:optionsCollection name="users" label="fullName"value="username" />
                                                </html:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td  style="vertical-align:top">Project Members</td>
                                            <td class="blue_links"><p>
                                                <a href="#" onclick="javascript:getUserPicker()" style="font-size:10px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;" class="ui-state-default ui-corner-all">+ add member</a></p>
                                                <div id="projectMembers">
                                                    <tiles:insert attribute="projectMembers" />	
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >Status:</td>
                                            <td class="blue_links">
                                                <html:select property="statusId" styleClass=""  styleId="goto2" onchange="gotopage('goto2')">  
                                                    <html:optionsCollection name="projectStatus" label="projectStatusName"value="projectStatusId" />
                                                </html:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >Priority:</td>
                                            <td class="blue_links">
                                                <html:select property="priorityId" styleClass=""  styleId="goto2" onchange="gotopage('goto2')">
                                                    <html:optionsCollection name="priorities" label="priorityName"value="priorityId" />
                                                </html:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >* <bean:message key="project.start.date" />:</td>
                                            <td class="blue_links">
                                                <html:text property="startDateString" styleId="startDate"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >Ending Date:</td>
                                            <td class="blue_links">
                                                <html:text property="endDateString" styleId="endDate"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >Estimated Hours:</td>
                                            <td class="blue_links">
                                                <html:text property="estimatedHours"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td ><bean:message key="project.budget" />($)</td>
                                            <td class="blue_links">
                                                <html:text property="budget"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td >&nbsp;</td>
                                            <td class="blue_links">&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td>&nbsp;</td>
                                            <td class="blue_links">
                                                <input type="button" onclick="javascript:createProject()" value="Save Project" /> &nbsp; &nbsp; &nbsp;
                                                <input type="button" value="Cancel" />
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                </div></td>
            </tr>
        </table>
    </html:form>
</div>

<script>
    function getProjectMembers() {
        var tablePicker = document.getElementById('selectedMembers');
        var userLists = "";
        if(tablePicker!= null) {
            var tds = tablePicker.getElementsByTagName('td');
            for (var i = 0; i < tds.length; ++i) {
                var val = tds[i].innerHTML;
                var par = val.split('&nbsp;');
                if(par.length > 0 && par[0].length > 0) {
                    userLists = userLists + tds[i].id + ":";
                }
            }
        }
        return userLists;
    }
    $(function() {
        $('#startDate').datepicker();
        $('#endDate').datepicker();
    });
    function getUserPicker() {      
        var userLists = getProjectMembers();     
        popUp('<%= request.getContextPath()%>/actions/addMemberOnProject.do?action=1&userNameList=' + userLists,'elastic',400,600);
    }
    function removeUser(uname) {
        var userLists = getProjectMembers();
        $('#projectMembers').load('<%= request.getContextPath()%>/actions/addMemberOnProject.do', {action:3, userNameList:userLists, username:uname},
        function(responseText, textStatus, XMLHttpRequest) {
            //alert(responseText);
        }
    );
    }
    function createProject() { 
        document.getElementById('userNameList').value = getProjectMembers();
        document.getElementById('projectForm').submit();
    }
</script>



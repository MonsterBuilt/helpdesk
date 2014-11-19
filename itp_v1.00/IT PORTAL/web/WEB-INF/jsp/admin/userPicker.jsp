<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html:form action="actions/addMemberOnProject.do?action=2" styleId="addMemberForm">
    <table style="border: 1px solid rgb(210, 210, 210);" width="100%" bgcolor="#ffffff" cellpadding="0" cellspacing="0" >
        <tr>
            <td class="headerBox">
                <table width="100%">
                    <tr>
                        <td align="left">
                            User Picker
                        </td>  
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td><br/></td>
        </tr>
        <tr align="center">
            <td>
                <html:hidden property="action" value="2" />
                <html:hidden property="userNameList" value="" styleId="userNameList" />
                <table width="80%" class="tableStyle" id="users" cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <th width="10%"><input type="checkbox" onclick="checkOrUncheck(this.form, this)"/></th>
                        <th width="20%">Username</th>
                        <th width="40%">Full Name</th>
                        <th width="30%">Email</th>
                    </tr>
                    <logic:iterate name="users" id="user" >
                        <tr>
                            <td><input value="<bean:write name='user' property='username'/>;<bean:write name="user" property="fullName"/>" name="check" type="checkbox" /></td>
                            <td><bean:write name="user" property="username"/></td>
                            <td><bean:write name="user" property="fullName"/></td>
                            <td><bean:write name="user" property="email"/></td>
                        </tr>
                    </logic:iterate>
                </table>
                
            </td>
        </tr>
        <tr>
            <td>
                <center>
                    <br/>
                    <input type="button" onclick="javascript:submitForm(this.form)" value="Select" />
                </center>
            </td>
        </tr>
        <tr>
            <td><br/></td>
        </tr>
    </table>
</html:form>
<script>
    function checkOrUncheck(frm, all) {
        for(var i = 0; i < frm.elements.length; ++i) {
            var e = frm.elements[i];
            if(e.name == 'check' && e.type == 'checkbox') 
                e.checked = all.checked ? true : false;
        }
    }
    function submitForm(frm) {
        <logic:present name="userBean">
                var userLists = "<bean:write name="userBean" property="userNameList" />";
        </logic:present>
        <logic:notPresent name="userBean" >
                var userLists = "";
        </logic:notPresent>
                for(var i = 0; i < frm.elements.length; ++i) {
                    var e = frm.elements[i];
                    if(e.name == 'check' && e.type == 'checkbox' && e.checked) {
                        userLists = userLists + e.value + ":";
                    }
                }
            
                window.opener.$('#projectMembers').load('<%= request.getContextPath()%>/actions/addMemberOnProject.do', {action:2, userNameList:userLists},
                function(responseText, textStatus, XMLHttpRequest) {
                    //alert(responseText);
                }
            );
                self.close();
            }
</script>
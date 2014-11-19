<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>

<link rel="stylesheet" href="<%= request.getContextPath()%>/css/Style.css" type="text/css" ></link>
<link type="text/css" href="<%= request.getContextPath()%>/css/jquery-ui-1.8.13.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-ui-1.8.13.custom.min.js"></script>
<script type="text/javascript" src="<%= request.getContextPath()%>/js/common.js"></script>
<script>
    var usernames = new Array();
    var fullNames = new Array();
    
    <logic:present name="projectMembers">
        <logic:notEmpty name="projectMembers" >
            <logic:iterate name="projectMembers" id="member" indexId="i">
                usernames[<bean:write name="i"/>]='<bean:write name="member" property="username"/>';
                    fullNames[<bean:write name="i"/>]='<bean:write name="member" property="fullName"/>';
            </logic:iterate>
        </logic:notEmpty>
    </logic:present>
                var n = usernames.length;

                if(n > 0) {
                    $(document).ready( function () {
                        var tbl = '<table id="selectedMembers" width="100%" class="tableStyleHighlight_td">';
                        var d = Math.ceil(n / 2), id = 0;
                    
                        for(var i = 0; i < d; ++i) {
                            tbl = tbl + '<tr>';
                            for(var j = 0; j < 2; ++j) 
                              
                            if(id < n) {
                                var tit = usernames[id] + ';' + fullNames[id];
                                   
                                tbl = tbl + '<td id="' + tit + '"> ' + fullNames[id]  + ' &nbsp;&nbsp;<a href="#" onclick="javascript:removeUser(\'' + usernames[id] + '\')"><b>x</b></a></td>';
                                ++id;
                            }else
                            tbl = tbl + '<td>&nbsp;</td>';
                        tbl = tbl + '</tr>';
                    }
                    tbl = tbl + '</table>';  
                                    
                    $('#projectMembers').append(tbl);
                });
            }      
</script>

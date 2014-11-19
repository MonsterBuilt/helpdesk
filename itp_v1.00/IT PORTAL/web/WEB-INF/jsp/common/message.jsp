<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<logic:messagesPresent>
    <center>
        <table style="border: 1px solid rgb(210, 210, 210);" width="50%" bgcolor="#ffffff" cellpadding="0" cellspacing="0" id="messageBox" >
            <tr>
                <td class="errorHeader">
                    <table width="100%">
                        <tr>
                            <td align="left">
                                Error has occurred
                            </td>
                            <td align="right">
                                <img style="cursor:pointer;" onclick="hideMessage();" src="<%= request.getContextPath()%>/images/close_button.gif">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <table  cellpadding="5">
                        <tr>
                            <td align="left" valign="top"><html:errors  /></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>	 
        <p></p>
    </center>
</logic:messagesPresent>

<logic:messagesPresent message="true"> 
    <center>
        <table style="border: 1px solid rgb(210, 210, 210);" width="50%" bgcolor="#ffffff" cellpadding="0" cellspacing="0" id="messageBox">
            <tr>
                <td class="headerBox">
                    <table width="100%">
                        <tr>
                            <td align="left">
                                Application Message
                            </td>
                            <td align="right">
                                <img style="cursor:pointer;" onclick="hideMessage();" src="<%= request.getContextPath()%>/images/close_button.gif">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <table  cellpadding="5">
                        <tr>
                            <td>
                                <html:messages id="message"  message="true" >
                                    <ul><li><bean:write name="message" /></li></ul>
                                </html:messages>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>	
        <p></p>
    </center>
</logic:messagesPresent>

<script>
    function hideMessage ()
    {
        var obj = document.getElementById ('messageBox');
        obj.style.visibility='hidden';
        obj.style.display='none';
    }
</script>
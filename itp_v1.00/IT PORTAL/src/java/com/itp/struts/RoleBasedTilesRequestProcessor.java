package com.itp.struts;

import com.itp.beans.UserSessionBean;
import com.itp.config.UserRoleConfiguration;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.tiles.TilesRequestProcessor;

public class RoleBasedTilesRequestProcessor extends TilesRequestProcessor {

    public RoleBasedTilesRequestProcessor() {
    }

    protected boolean processRoles(HttpServletRequest request, HttpServletResponse response, ActionMapping mapping)
            throws IOException, ServletException {

        // Is this action protected by role requirements?
        String roles[] = mapping.getRoleNames();
        if ((roles == null) || (roles.length < 1)) {
            //not protected
            return (true);
        }

        //check the current user against the list of required roles
        HttpSession session = request.getSession();
        UserSessionBean user = (UserSessionBean) session.getAttribute("userSessionBean");

        //not a valid login
        if (user == null) {
            return false;
        }



        for (int i = 0; i < roles.length; i++) {
            String roleId = UserRoleConfiguration.getConfigurationValue(roles[i].toLowerCase());
            if (roleId != null && !roleId.equals("")) {
                return true;
            }
        }


        response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                getInternal().getMessage("notAuthorized",
                mapping.getPath()));
        return (false);
    }
}

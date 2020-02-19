package openClosedPrinciple;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * Open Closed Principle Example:
 * “Software components should be open for extension, but closed for modification”
 * 
 * For example, spring framework has class DispatcherServlet. This class acts as front controller for String based web applications. To use this class, we are not required to modify this class. All we need is to pass initialization parameters and we can extend it’s functionality the way we want.
 *
 */
public class HelloWorldAction extends Action 
{
    @Override
    public ActionForward execute(ActionMapping mapping, 
                                ActionForm form, 
                                HttpServletRequest request, 
                                HttpServletResponse response) 
                                throws Exception 
    {
         
        //Process the request
    	return null;
    }
}

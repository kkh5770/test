package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface action {
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res);
}

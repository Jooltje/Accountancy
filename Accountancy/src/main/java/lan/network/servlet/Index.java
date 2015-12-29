package lan.network.servlet;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lan.network.service.MessageService;

@WebServlet("/index")
public class Index extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private MessageService messageService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print(messageService.getMessage());
	}

}

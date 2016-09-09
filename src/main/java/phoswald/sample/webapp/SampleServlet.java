package phoswald.sample.webapp;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample-servlet")
public class SampleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String now = LocalDateTime.now().toString();
		System.out.println("SampleServlet called on " + now);
		response.setContentType("text/plain; charset=UTF-8");
		response.getWriter().write("Greetings from SampleServlet, the current time is " + now);
	}
}

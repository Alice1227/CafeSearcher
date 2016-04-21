package cafeSearcher;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Print
 */
@WebServlet("/Print")
public class Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Print() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("q");
		text = new String(text.getBytes("ISO-8859-1"), "UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		StringBuilder sb = new StringBuilder();

		sb.append("<embed src='luck.mp3' autostart='true' loop='true' width='1' height='1'>");
		sb.append("<br><br>");
		sb.append("<div class='col-xs-6 col-md-4'>");
		sb.append("<image src='title3.jpg' width='100%' ; height='auto'>");
		sb.append("</div>");
		sb.append("<br><br><br><br><br><br><br><br>");
		sb.append("<div class='row'>");
		sb.append("<div class='col-md-4'><img src='me.jpg' class='handsome'></div>");
		sb.append("<div class='col-md-8'>");
		sb.append("<table table class='table table-hover' ; style='width: 80%'>");

		Run run = new Run();
		ArrayList<Website> result = run.output(text);

		for (int i = 0; i < 10; i++) {
			Website w = result.get(i);

			sb.append("<tr>");
			sb.append("<td class='Rank'>" + (i + 1) + "</td>");
			sb.append("<td class='Website'>" + w.title);
			sb.append("<a href='" + w.urlStr + "'>");
			sb.append("<br><button type='button' class='btn btn-info'>Drink a Little</button>");
			sb.append("</a></td></tr>");
		}

		sb.append("</table></div></div>");
		sb.append("<div class='icon'>");
		sb.append("<a href='#top' class='btn btn-warning btn-lg'>");
		sb.append("<span class='glyphicon glyphicon-arrow-up' aria-hidden='true'></span> Top");
		sb.append("</a>");
		sb.append("<a href='index.html' class='btn btn-danger btn-lg'>");
		sb.append("<span class='glyphicon glyphicon-home'></span> Home");
		sb.append("</a></div>");

		Gson gson = new Gson();
		text = gson.toJson(sb.toString());
		response.getWriter().println(text);
		response.getWriter().flush();
		response.getWriter().close();

	}
}
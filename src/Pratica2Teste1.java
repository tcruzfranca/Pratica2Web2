

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pratica2Teste1
 */
@WebServlet("/Pratica2Teste1")
public class Pratica2Teste1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pratica2Teste1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("user");
		String pass = request.getParameter("password");
		
		String listarAlunos = request.getParameter("listaAlunos");
		
		String usuario = "Tiago";
		String senha = "q1w2e3r4";
		
		List<String> alunos = new ArrayList<String>();
		
		alunos.add("Ariel");
		alunos.add("Lucas Marinho");
		alunos.add("Renan");
		alunos.add("Lucas Martins");
		alunos.add("Gabriel Brum");
		alunos.add("Rodrigo");
		alunos.add("Endrew");
		alunos.add("Camila");
		alunos.add("Filipo");
		alunos.add("Zidane");
		alunos.add("Isabele");
		alunos.add("Guilherme");
		alunos.add("Arthur");
		alunos.add("Sidney");
		alunos.add("Beatriz");
		
		request.getServletContext().setAttribute("alunos", alunos);
		
		response.setContentType("text/html");
		
		if (listarAlunos != null) {
			response.sendRedirect("listarAlunos.do");
			return;
		}
		
		if ( (user == null) && (pass == null) ) {
			response.sendRedirect("redirecionado.html");
			return;
		}
		
		if(!( (usuario.equals(user)) && (pass.equals(senha)) )) {
			response.sendError(400, "Usuario ou senha ivalidos");
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Final");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

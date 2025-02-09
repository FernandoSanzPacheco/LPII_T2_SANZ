package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorLogueo
 */
public class ControladorLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogueo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// redireccionamos
		
		
	}	// fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String usuarioIngresado = request.getParameter("usuario"); // Obt�n el usuario del formulario
	    String passwordIngresado = request.getParameter("password"); // Obt�n la contrase�a del formulario

	    String usuarioCorrecto = "FernandoSanz";
	    String passwordCorrecto = "123456";

	    if (usuarioIngresado != null && passwordIngresado != null &&
	        usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {

	        // Usuario y contrase�a correctos
	        request.getSession().setAttribute("usuariosesion", usuarioIngresado); // Guarda el usuario en la sesi�n
	        request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);

	    } else {
	        // Usuario o contrase�a incorrectos
	        request.setAttribute("error", "Usuario o contrase�a incorrectos"); // Env�a un mensaje de error
	        request.getRequestDispatcher("/index.jsp").forward(request, response); // Redirige de vuelta al login
	    }
	} // fin del�metodo�dopost

}	// fin del controlador

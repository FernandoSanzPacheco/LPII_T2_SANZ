package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }	// fin del constructor proveedor

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//instanciamos la respectiva clase...
		ClassProveedorImp crudimp=new ClassProveedorImp();
		TblProveedorcl2 tblprov=new TblProveedorcl2();
		//recuperamos el listado de productos de la BD..
		List<TblProveedorcl2> listadoproveedores=crudimp.ListadoProveedor();
		//enviamos hacia la vista...
		//almacenamos en el respectivo metodo...
		request.setAttribute("listado",listadoproveedores);
		//redireccionamos hacia la vista(.jsp)
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		
	}	// fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}	// fin del metodo dopost

}	// fin del controlador

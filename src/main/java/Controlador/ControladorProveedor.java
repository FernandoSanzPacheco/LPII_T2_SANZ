package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		//declaramos una variable de tipo string...
				//recibimos el valor segun la accion..
				String accion=request.getParameter("accion");
				//aplicamos una condicion...
				if(accion!=null){
					//aplicamos un switch..
					switch(accion){
					case "Modificar":
						//obtenemos el codigo
						int cod=Integer.parseInt(request.getParameter("cod"));
						//asignamos el codigo
						tblprov.setIdproveedorcl2(cod);
						//buscamos el codigo a actualizar...
						TblProveedorcl2 prov=crudimp.BuscarProveedor(tblprov);
						SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						//asignamos los valores
		                //para enviarlos hacia la vista (formulario actualizar)
						request.setAttribute("codigo",prov.getIdproveedorcl2());
						request.setAttribute("proveedor",prov.getNomproveecl2());
						request.setAttribute("ruc",prov.getRucproveecl2());
						request.setAttribute("razsocial",prov.getRsocialproveecl2());
						request.setAttribute("email",prov.getEmailproveecl2());
						request.setAttribute("feing",format.format(prov.getFeingproveecl2()));
						//redireccionamos
						request.getRequestDispatcher("/FrmActualizarProveedor.jsp").forward(request, response);
						//salimos
						break;
					case "Registrar":
						//redireccionamos hacia la vista(.jsp)
						request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
						//salimos
						break;
					case "Eliminar":
						//obtenemos el codigo
						int codelim=Integer.parseInt(request.getParameter("cod"));
						//asignamos el codigo
						tblprov.setIdproveedorcl2(codelim);
						//invocamos al metodo a eliminar...
						crudimp.EliminarProveedor(tblprov);
						List<TblProveedorcl2> listado=crudimp.ListadoProveedor();
						//enviamos hacia la vista
						request.setAttribute("listado",listado);
						//redireccionamos
						request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
						break;
					case "Listar":
						//redireccionamos hacia la vista(.jsp)
						request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
						break;
					}	// fin del switch
				}	// fin de la condicion
				
	}	// fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				//recuperamos los datos del formulario...
				String codigo=request.getParameter("codigo");
				String proveedor=request.getParameter("proveedor");
				String ruc=request.getParameter("ruc");
				String razsocial=request.getParameter("razsocial");
				String email=request.getParameter("email");
				Date fecha=new Date();
				Date fechasql=new Date(fecha.getTime());
				//hacer las respectivas instancias....
				TblProveedorcl2 tblprov=new TblProveedorcl2();
				ClassProveedorImp climp=new ClassProveedorImp();
				//asignamos los valores
				tblprov.setNomproveecl2(proveedor);
				tblprov.setRucproveecl2(ruc);
				tblprov.setRsocialproveecl2(razsocial);
				tblprov.setEmailproveecl2(email);
				tblprov.setFeingproveecl2(fechasql);
				//aplicamos una condicion...
				if(codigo!=null){
					int cod=Integer.parseInt(codigo);
					//luego asignamos el codigo a actualizar...
					tblprov.setIdproveedorcl2(cod);
					//invocamos el metodo a actualizar...
					climp.ActualizarProveedor(tblprov);
				//invocamos el metodo registrar.
				}else{
				climp.RegistrarProveedor(tblprov);
				}
				//actualizamos el listado...
				List<TblProveedorcl2> listado=climp.ListadoProveedor();
				//enviamos hacia la vista
				request.setAttribute("listado",listado);
				//redireccionamos
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);		
			}   //fin del metodo dopost...

}	// fin del controlador proveedor

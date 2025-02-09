package TestEntidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestEntidadProveedor {

	public static void main(String[] args) {
		
		//	Instanciamos las respectivas clases

		TblProveedorcl2 tbl=new TblProveedorcl2();
		ClassProveedorImp crudimp=new ClassProveedorImp();
		
		//	testeando el metodo registrar

		/*
		
		tbl.setNomproveecl2("Alexander Paul Paco Cornejo");
		tbl.setRucproveecl2("10784512150");
		tbl.setRsocialproveecl2("Angamos SAC");
		tbl.setEmailproveecl2("angamos@gmail.com");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tbl.setFeingproveecl2(fechasql);
		//invocamos el respectivo metodo registrar...
		crudimp.RegistrarProveedor(tbl);
		
		*/
		
		//	testeando el metodo listado
		
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
			//	aplicamos un bucle for..
			for(TblProveedorcl2 prod:listadoproveedor){
						
				//	imprimir por pantalla
				System.out.println("codigo "+prod.getIdproveedorcl2()+" / Nombre: "
				+prod.getNomproveecl2()+" / Ruc "+prod.getRucproveecl2()+" / Razón social "
						+prod.getRsocialproveecl2()+" / Email "+prod.getEmailproveecl2()+
						" / Fecha "+format.format(prod.getFeingproveecl2()));
					
		}	//fin de bucle for....
		

	}	// fin del metodo principal

}	// fin de la clase

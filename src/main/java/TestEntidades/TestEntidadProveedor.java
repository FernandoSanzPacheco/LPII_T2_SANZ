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
		
		
		
		//	testeando el metodo actualizar
		
		tbl.setNomproveecl2("Alexander Paul Paco Cornejo");
		tbl.setRucproveecl2("10784512150");
		tbl.setRsocialproveecl2("Angamos SAC");
		tbl.setEmailproveecl2("angamos@gmail.com");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tbl.setFeingproveecl2(fechasql);
		//invocamos el metodo actualizar.
		crudimp.ActualizarProveedor(tbl);
		
		*/
			
		//	testeando el metodo buscar
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
		tbl.setIdproveedorcl2(4);
		TblProveedorcl2 buscaprov=crudimp.BuscarProveedor(tbl);
		//imprimimos por pantalla el mensaje...
		System.out.println("codigo "+buscaprov.getIdproveedorcl2()+" / Nombre: "
				+buscaprov.getNomproveecl2()+" / Ruc "+buscaprov.getRucproveecl2()+" / Razón social "
						+buscaprov.getRsocialproveecl2()+" / Email "+buscaprov.getEmailproveecl2()+
						" / Fecha "+format.format(buscaprov.getFeingproveecl2()));
			
		/*
		
		//	testeando el metodo listado
		
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
			//	aplicamos un bucle for..
			for(TblProveedorcl2 prov:listadoproveedor){
						
				//	imprimir por pantalla
				System.out.println("codigo "+prov.getIdproveedorcl2()+" / Nombre: "
				+prov.getNomproveecl2()+" / Ruc "+prov.getRucproveecl2()+" / Razón social "
						+prov.getRsocialproveecl2()+" / Email "+prov.getEmailproveecl2()+
						" / Fecha "+format.format(prov.getFeingproveecl2()));
					
		}	//fin de bucle for....
		
		*/
		

	}	// fin del metodo principal

}	// fin de la clase

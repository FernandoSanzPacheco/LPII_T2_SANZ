package TestEntidades;

import DaoImp.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		
//		Instanciamos las respectivas clases

			TblUsuariocl2 tbl=new TblUsuariocl2();
			ClassUsuarioImp crudimp=new ClassUsuarioImp();
			
			//	testeando el metodo registrar

			
			
			tbl.setUsuariocl2("FernandoSanz");
			tbl.setPasswordcl2("123456");
			//invocamos el respectivo metodo registrar...
			crudimp.RegistrarUsuario(tbl);
			
			
		
	}

}	//	fin de la clase

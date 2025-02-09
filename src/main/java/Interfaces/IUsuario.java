package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {

	// declaramos los metodos
	
		void RegistrarUsuario(TblUsuariocl2 tblusuariocl2);
		void ActualizarUsuario(TblUsuariocl2 tblusuariocl2);
		void EliminarUsuario(TblUsuariocl2 tblusuariocl2);
		List<TblUsuariocl2> ListadoUsuario();
		TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuariocl2);
		void ValidarUsuario(TblUsuariocl2 tblusuariocl2);
	
}

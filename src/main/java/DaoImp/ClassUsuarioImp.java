package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusuariocl2) {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		//permite gestionar entidades..
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblusuariocl2);
		//emitimos mensaje por pantalla....
		System.out.println("Usuario registrado en BD correctamente!!!!!!!!");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblusuariocl2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblusuariocl2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuariocl2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ValidarUsuario(TblUsuariocl2 tblusuariocl2) {
		// TODO Auto-generated method stub
		
	}

}

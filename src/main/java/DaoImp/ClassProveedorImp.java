package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	public void RegistrarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		//permite gestionar entidades..
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblproveedorcl2);
		//emitimos mensaje por pantalla....
		System.out.println("Proveedor registrado en BD correctamente!!!!!!!!");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();
		
	}	// fin del metodo registrar

	public void ActualizarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		// nos conectamos con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//actualizamos
		em.merge(tblproveedorcl2);
		//emitimos mensaje por consola
		System.out.println("Datos actualizados correctamente ");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}	// fin del metodo actualizar

	public void EliminarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		///establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperar el codigo a eliminar...
		TblProveedorcl2 tblprov=em.merge(tblproveedorcl2);
		//procedemos a eliminar
		em.remove(tblprov);
		System.out.println("Dato eliminado exitosamente");
		em.getTransaction().commit();
		em.close();	
		
	}	// fin del metodo eliminar

	public List<TblProveedorcl2> ListadoProveedor() {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el listado de la base de datos..
		List<TblProveedorcl2> listadoproveedores=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listadoproveedores;
				
	}	// fin del metodo listar

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		// establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenT2Sanz");
		//para administrar la transacciones
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el codigo a buscar...
		TblProveedorcl2 tblprov=em.find(TblProveedorcl2.class,tblproveedorcl2.getIdproveedorcl2());
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos la transaccion.
		em.close();
		//retornamos el registro solicitado..
		return tblprov;
		
	}	// fin del metodo buscar
	
	

}	// fin de la clase

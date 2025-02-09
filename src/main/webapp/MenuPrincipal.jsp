<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*" %>
<%@page import="model.TblProveedorcl2" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de proveedores</h1>
<h2 align="center">
<a href="ControladorProveedor?accion=Registrar" style="text-decoration: none">Registrar Proveedor</a>
</h2>
<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>RUC</td>
<td>Razón social</td>
<td>Email</td>
<td>Fecha de ingreso</td>
<td colspan="2" align="center">Acciones</td>

</tr>
<%
List<TblProveedorcl2> listadoproveedores=(List<TblProveedorcl2>)request.getAttribute("listado");
//aplicamos una condicion...
if(listadoproveedores!=null){
	//aplicamos un bucle for..
	for(TblProveedorcl2 prov:listadoproveedores){
	%>
	<tr><td>
	<%=prov.getIdproveedorcl2() %>
	</td>
	<td>
	<%=prov.getNomproveecl2() %>
	</td>
	<td>
	<%=prov.getRucproveecl2() %>
	</td>
	<td>
	<%=prov.getRsocialproveecl2() %>
	</td>
	<td>
	<%=prov.getEmailproveecl2() %>
	</td>
	<td>
	<%=prov.getFeingproveecl2() %>
	</td>
		<td><a href="ControladorProveedor?accion=Modificar&cod=<%=prov.getIdproveedorcl2() %>"  
		style="text-decoration: none">ACTUALIZAR</a></td>
		<td><a href="ControladorProveedor?accion=Eliminar&cod=<%=prov.getIdproveedorcl2() %>"  
		style="text-decoration: none">ELIMINAR</a></td>		
		</tr>
	<%			
	}   //fin del bucle for...
%>
<%
}//fin de la condicion....
%>
</table>


</body>
</html>
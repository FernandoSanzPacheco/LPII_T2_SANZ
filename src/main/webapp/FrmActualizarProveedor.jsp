<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedor</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">
Actualizar Proveedor...
</h1>

<form method="post" action="ControladorProveedor">
<table align="center" border="2">
<!-- recuperamos los valores que vienen del controlador   -->
<%
String codigo=request.getAttribute("codigo").toString();
String proveedor=(request.getAttribute("proveedor")!=null)?request.getAttribute("proveedor").toString():"";
String ruc=(request.getAttribute("ruc")!=null)?request.getAttribute("ruc").toString():"";
String razsocial=(request.getAttribute("razsocial")!=null)?request.getAttribute("razsocial").toString():"";
String email=(request.getAttribute("email")!=null)?request.getAttribute("email").toString():"";
String feing=(request.getAttribute("feing")!=null)?request.getAttribute("feing").toString():"";
%>
<input  type="hidden" name="codigo"  value="<%=codigo%>">
<tr>
<td>proveedor</td>
<td><input type="text" name="proveedor"  value="<%=proveedor%>"></td>
</tr>
<tr>
<td>ruc</td>
<td><input type="text" name="ruc"    value="<%=ruc%>"></td>
</tr>
<tr>
<td>razonsocial</td>
<td><input type="text" name="razsocial"  value="<%=razsocial%>"></td>
</tr>
<tr>
<td>email</td>
<td><input type="text" name="email"  value="<%=email%>"></td>
</tr>
<tr>
<td>fechaing</td>
<td><input  type="date" name="feing" value="<%=feing %>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit"  value="actualizar"></td>
</tr>
</table>
</form>

</body>
</html>
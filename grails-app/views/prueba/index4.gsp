<!doctype html>
<html>
<head>
    <title>Welcome to Grails</title>
</head>
<body>
  listado de administradores<br/>

  <g:if test="${administradores}">
    <table style="width: 100%; border: 1px solid black;">
      <thead>
        <tr>
          <th>Id</th>
          <th>Matrícula</th>
          <th>Nombre</th>
        </tr>
      </thead>
      <tbody>
        <g:each in="${administradores}">
          <tr>
            <td>${it.id}</td>
            <td>${it.matricula}</td>
            <td>${it.nombre}</td>
          </tr>
        </g:each>
      </tbody>
    </table>
  </g:if>
  <g:else>
    no hay nada
  </g:else>
</body>
</html>

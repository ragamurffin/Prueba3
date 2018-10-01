
<html>
<head>
<title> Ejemplo Freemarker</title>
</head>
<body>
${mensaje}

    <h1>
       
       <#if usuario=="Ramon">
            Bienvenido, Ramon ha llegado
        <#else>
            hola,   ${usuario} no es ramon
        </#if>

    </h1>

<h3>La fecha de hoy es: ${fecha}</h3>

<img src="logo.svg" />

<a href="/"> <-- Volver </a>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>

<h1> ${hello} </h1>

<h1> List Category </h1>


<ul>
<#if categories??>
<#list categories as category>
    <li>${category.id} ${category.name} ${category.description} </li>
</#list>
</#if>
</ul>



</body>
</html>
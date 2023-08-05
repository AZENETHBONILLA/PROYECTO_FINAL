
<?php

//REGISTRO DE PRODUCTOS + INVENTARIO DE PRODUCTO ---body

if (isset($_REQUEST['Id']) && isset($_REQUEST['Nombre']) && isset($_REQUEST['Marca']) && isset($_REQUEST['Presentacion']) && isset($_REQUEST['Precio'])) {
    $pdo = include 'conexion.php'; // Incluir el archivo y obtener la instancia de la conexión PDO
    
	$Id = $_REQUEST['Id'];
    $Nombre = $_REQUEST['Nombre'];
	$Marca = $_REQUEST['Marca'];
	$Presentacion = $_REQUEST['Presentacion'];
	$Precio = $_REQUEST['Precio'];


	// Consulta preparada con PDO
    $Query ="INSERT INTO registro_productos (Id, Nombre, Marca, Presentacion, Precio) VALUES (:id,:nombre,:marca,:presentacion,:precio)";
    $statement = $pdo->prepare($Query);
    $statement->bindParam(':id', $Id);
    $statement->bindParam(':nombre', $Nombre);
	$statement->bindParam(':marca', $Marca);
    $statement->bindParam(':presentacion', $Presentacion);
	$statement->bindParam(':precio', $Precio);
	
	$arreglo = array();
    if ($statement->execute()) {
        while ($recibido = $statement->fetch(PDO::FETCH_ASSOC)) {
            array_push($arreglo, $recibido);
        }
    }

    // Convertir resultado a JSON y enviarlo
    print json_encode($arreglo, JSON_FORCE_OBJECT);

    // Cerrar la conexión PDO
    $pdo = null;
	
}

?>
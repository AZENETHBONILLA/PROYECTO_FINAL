<?php

//BORRAR REGISTRO DE PRODUCTOS + INVENTARIO DE PRODUCTO ---body

if (isset($_REQUEST['Id'])) {
    $pdo = include 'conexion.php'; // Incluir el archivo y obtener la instancia de la conexión PDO
    
    $Id = $_REQUEST['Id'];

    // Consulta preparada con PDO para eliminar el producto por su Id en la tabla registro_productos
    $queryRegistroProductos = "DELETE FROM registro_productos WHERE Id=:id_registro";
    $statementRegistroProductos = $pdo->prepare($queryRegistroProductos);
    $statementRegistroProductos->bindParam(':id_registro', $Id);

    // Consulta preparada con PDO para eliminar el producto por su Id en la tabla productos_inventario
    $queryProductosInventario = "DELETE FROM productos_inventario WHERE Id=:id_inventario";
    $statementProductosInventario = $pdo->prepare($queryProductosInventario);
    $statementProductosInventario->bindParam(':id_inventario', $Id);

    $success = false; // Variable para indicar si la eliminación fue exitosa

    try {
        $pdo->beginTransaction(); // Iniciar transacción

        // Ejecutar las consultas de eliminación en ambas tablas
        if ($statementRegistroProductos->execute() && $statementProductosInventario->execute()) {
            $pdo->commit(); // Confirmar la transacción si ambas consultas tienen éxito
            $success = true;
        } else {
            $pdo->rollback(); // Revertir la transacción si alguna consulta falla
        }
    } catch (PDOException $e) {
        // Manejar el error de la base de datos, si ocurre
        // Puedes imprimir el mensaje de error o realizar otra acción
        $pdo->rollback(); // Revertir la transacción en caso de error
    }

    // Preparar la respuesta en formato JSON
    $response = array('success' => $success);
    print json_encode($response);

    // Cerrar la conexión PDO
    $pdo = null;
}

?>

<?php

$pdo = include 'conexion.php';

// Consulta para seleccionar todos los registros de la tabla 'productos_inventario'
$sql = "SELECT pi.*, rp.nombre AS Nombre FROM productos_inventario pi
        INNER JOIN registro_productos rp ON pi.Id= rp.id";

$result = $pdo->query($sql);

$inventariosArray = array();

if ($result->rowCount() > 0) {
    while ($row = $result->fetch(PDO::FETCH_ASSOC)) {
        $inventariosArray[] = $row;
    }
} else {
    echo "No se encontraron registros en la tabla 'productos_inventario'.";
}

// Cerrar la conexión a la base de datos
$pdo = null;

// Devolver los datos como JSON
echo json_encode($inventariosArray);

?>



<?php

if (isset($_REQUEST['Id'])&& isset($_REQUEST['Cantidad'])) {
	$pdo = include 'conexion.php'; // Obtener la instancia de la conexión PDO

    // Obtener el ID del producto proporcionado
	$idProducto = $_REQUEST['Id'];
    
	// Verificar si el producto existe en la tabla inventario
	$stmt = $pdo->prepare("SELECT * FROM productos_inventario WHERE Id = :Id");
	$stmt->bindValue(':Id', $idProducto);
    $stmt->execute();
    $producto = $stmt->fetch(PDO::FETCH_ASSOC);

    if (!$producto) {
        // El producto no está registrado en el inventario
        echo json_encode(array('error' => 'El producto no está registrado'));
        exit;
    }

	// Pedir al usuario la cantidad de piezas a comprar
    $cantidadDeseada = $_REQUEST['Cantidad'];

    if ($cantidadDeseada > $producto['Cantidad']) {
        // No hay suficiente cantidad disponible
        echo json_encode(array('error' => 'No hay suficiente cantidad disponible', 'cantidadExistente' => $producto['Cantidad']));
        exit;
    }

	// Buscar el precio del producto seleccionado
	$stmtCantidad = $pdo->prepare("SELECT Precio FROM registro_productos WHERE Id = :id");
	$stmtCantidad->bindValue(':id', $idProducto);
	$stmtCantidad->execute();
	$precio = $stmtCantidad->fetchColumn();
	//$precio = $producto['Precio'];
    
	// Calcular el total de pago
    $totalPago = $cantidadDeseada * $precio;
	print json_encode($totalPago, JSON_FORCE_OBJECT);

    /*Actualizar la cantidad en el inventario
    $nuevaCantidad = $producto['Cantidad'] - $cantidadDeseada;
    $stmt = $pdo->prepare("UPDATE productos_inventario SET Cantidad = :Cantidad WHERE Id = :Id");
    $stmt->bindValue(':Cantidad', $nuevaCantidad);
    $stmt->bindValue(':Id', $idProducto);
    $stmt->execute();

	
    // Registrar la venta en la tabla ventas_productos
    $sql = "INSERT INTO ventas_productos (Id_venta, Id_producto, Fecha_venta, Cantidad_producto, Precio, Nombre_Producto, TotalPago) VALUES (:Id_venta, :Id_producto, :Fecha_venta, :Cantidad_producto, :Precio, :Nombre_Producto, :TotalPago)";
    $stmt = $pdo->prepare($sql);
	$stmt->bindValue(':Id_venta', $_REQUEST['Id_venta']);
    $stmt->bindValue(':Id_producto', $idProducto);
    $stmt->bindValue(':Fecha_venta', date('Y-m-d H:i:s'));
    $stmt->bindValue(':Cantidad_producto', $cantidadDeseada);
    $stmt->bindValue(':Precio', $precio);
	$stmt->bindValue(':Nombre_Producto', $row["Nombre"] . "\n");
	$stmt->bindValue(':TotalPago', $totalPago);
    $stmt->execute();
    $idPost = $pdo->lastInsertId();

    if ($idPost) {
        header("HTTP/1.1 200 OK");
        echo json_encode(array('idVenta' => $idPost, 'totalPago' => $totalPago));
        exit;
    }*/

}
?>
<?php
if (isset($_REQUEST['Id']) && isset($_REQUEST['Cantidad'])&& isset($_REQUEST['Precio'])&& isset($_REQUEST['Nombre'])&& isset($_REQUEST['Total'])) {
    $pdo = include 'conexion.php'; // Obtener la instancia de la conexión PDO

	$idProducto = $_REQUEST['Id'];
	$cantidadDeseada = $_REQUEST['Cantidad'];
	$precio = $_REQUEST['Precio'];
    $Nombre = $_REQUEST['Nombre'];
	$totalPago = $_REQUEST['Total'];
	
    // Registrar la venta en la tabla ventas_productos
    $sql = "INSERT INTO ventas_productos (Id_producto, Fecha_venta, Cantidad_producto, Precio, Nombre_Producto, TotalPago) VALUES (:Id_producto, :Fecha_venta, :Cantidad_producto, :Precio, :Nombre_Producto, :TotalPago)";
    $stmt = $pdo->prepare($sql);
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
    }
?>
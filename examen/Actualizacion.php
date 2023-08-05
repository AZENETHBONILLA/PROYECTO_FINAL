<?php
/*$pdo = include 'conexion.php'; // Obtener la instancia de la conexión PDO

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Verificar si el producto existe en la tabla de inventario
    $stmtVerif = $pdo->prepare("SELECT Id FROM productos_inventario WHERE Id = :id");
    $stmtVerif->bindValue(':id', $_POST['Id']);
    $stmtVerif->execute();
    $productoExistente = $stmtVerif->fetch();

    if (!$productoExistente) {
        // Si el producto no existe, mostrar un mensaje al usuario
        echo "El producto no está registrado en el inventario. Por favor, regístrelo primero.";
        exit;
    }

    // Obtener la cantidad existente del producto en el inventario
    $stmtCantidad = $pdo->prepare("SELECT Cantidad FROM productos_inventario WHERE Id = :id");
    $stmtCantidad->bindValue(':id', $_POST['Id']);
    $stmtCantidad->execute();
    $cantidadExistente = $stmtCantidad->fetchColumn();

    // Calcular la nueva cantidad sumando la cantidad existente y la cantidad ingresada
    $nuevaCantidad = $cantidadExistente + $_POST['Cantidad'];

    // Actualizar la cantidad en el inventario
    $stmtActualizar = $pdo->prepare("UPDATE productos_inventario SET Cantidad = :cantidad WHERE Id = :id");
    $stmtActualizar->bindValue(':cantidad', $nuevaCantidad);
    $stmtActualizar->bindValue(':id', $_POST['Id']);
    $stmtActualizar->execute();

    // Ingresar datos a la tabla actualización de inventario
    $sql = "INSERT INTO actualizacion_inventario (Fechadecompra, NumerodeFactura,Id,Cantidad) VALUES (NOW(), :NumerodeFactura,:id,:cantidad)";
    $stmt = $pdo->prepare($sql);
    //$stmt->bindValue(':Fechadecompra', $_POST['Fechadecompra']);
    $stmt->bindValue(':NumerodeFactura', $_POST['NumerodeFactura']);
	$stmt->bindValue(':id', $_POST['Id']);
    $stmt->bindValue(':cantidad', $_POST['Cantidad']);
    $stmt->execute();
    $idPost = $pdo->lastInsertId();

    if ($idPost) {
        header("HTTP/1.1 200 OK");
        echo json_encode($idPost);
        exit;
    }

    // Mostrar mensaje de éxito
    echo "El inventario se ha actualizado correctamente.";

    // Aquí puedes agregar cualquier otra acción que desees realizar después de actualizar el inventario

    exit;
}
*/


if (isset($_REQUEST['Id']) && isset($_REQUEST['Cantidad']) && isset($_REQUEST['NumerodeFactura'])) {
	$pdo = include 'conexion.php'; // Obtener la instancia de la conexión PDO
	
    // Verificar si el producto existe en la tabla de inventario
    $stmtVerif = $pdo->prepare("SELECT Id FROM productos_inventario WHERE Id = :id");
    $stmtVerif->bindValue(':id', $_REQUEST['Id']);
    $stmtVerif->execute();
    $productoExistente = $stmtVerif->fetch();

    if (!$productoExistente) {
        // Si el producto no existe, mostrar un mensaje al usuario
        echo "El producto no está registrado en el inventario. Por favor, regístrelo primero.";
        exit;
    }

    // Obtener la cantidad existente del producto en el inventario
    $stmtCantidad = $pdo->prepare("SELECT Cantidad FROM productos_inventario WHERE Id = :id");
    $stmtCantidad->bindValue(':id', $_REQUEST['Id']);
    $stmtCantidad->execute();
    $cantidadExistente = $stmtCantidad->fetchColumn();

    // Calcular la nueva cantidad sumando la cantidad existente y la cantidad ingresada
    $nuevaCantidad = $cantidadExistente + $_REQUEST['Cantidad'];

    // Actualizar la cantidad en el inventario
    $stmtActualizar = $pdo->prepare("UPDATE productos_inventario SET Cantidad = :cantidad WHERE Id = :id");
    $stmtActualizar->bindValue(':cantidad', $nuevaCantidad);
    $stmtActualizar->bindValue(':id', $_REQUEST['Id']);
    $stmtActualizar->execute();

    // Ingresar datos a la tabla actualización de inventario
    $sql = "INSERT INTO actualizacion_inventario (Fechadecompra, NumerodeFactura, Id, Cantidad) VALUES (NOW(), :NumerodeFactura, :id, :cantidad)";
    $stmt = $pdo->prepare($sql);
    //$stmt->bindValue(':Fechadecompra', $_REQUEST['Fechadecompra']);
    $stmt->bindValue(':NumerodeFactura', $_REQUEST['NumerodeFactura']);
    $stmt->bindValue(':id', $_REQUEST['Id']);
    $stmt->bindValue(':cantidad', $_REQUEST['Cantidad']);
    $stmt->execute();
    $idPost = $pdo->lastInsertId();

    if ($idPost) {
        header("HTTP/1.1 200 OK");
        echo json_encode($idPost);
        exit;
    }

    // Mostrar mensaje de éxito
    echo "El inventario se ha actualizado correctamente.";

    // Aquí puedes agregar cualquier otra acción que desees realizar después de actualizar el inventario

    exit;
}
?>

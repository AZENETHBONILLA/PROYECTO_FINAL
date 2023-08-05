<?php

//MOSTRAR LOS DATOS DEL PRODUCTO DE LA ID INDICADA
if (isset($_REQUEST['Id'])) {
    $pdo = include 'conexion.php'; // Incluir el archivo y obtener la instancia de la conexión PDO
    
    $Id = $_REQUEST['Id'];
    
    $Query = "SELECT * FROM registro_productos WHERE Id=:Id";
    $statement = $pdo->prepare($Query);
    $statement->bindParam(':Id', $Id);

    if ($statement->execute()) {
        $arreglo = array();
        while ($recibido = $statement->fetch(PDO::FETCH_ASSOC)) {
            array_push($arreglo, $recibido);
        }

        if (empty($arreglo)) {
            // El producto no está registrado en el inventario
            $error_response = array('error' => 'El producto no esta registrado');
            echo json_encode($error_response); // Responder con el mensaje de error
        } else {
            // Convertir resultado a JSON y enviarlo
            print json_encode($arreglo, JSON_FORCE_OBJECT);
        }
    }
    // Cerrar la conexión PDO
    $pdo = null;
}
?>


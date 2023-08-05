<?php
	if (isset($_REQUEST['Usuario']) && isset($_REQUEST['Password'])) {
    $pdo = include 'conexion.php'; // Incluir el archivo y obtener la instancia de la conexión PDO
    $Usuario = $_REQUEST['Usuario'];
    $Password = $_REQUEST['Password'];

    // Consulta preparada con PDO
    $Query = "SELECT * FROM login WHERE Usuario = :usuario AND Password = :password";
    $statement = $pdo->prepare($Query);
    $statement->bindParam(':usuario', $Usuario);
    $statement->bindParam(':password', $Password);

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

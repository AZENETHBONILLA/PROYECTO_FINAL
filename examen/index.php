<?php

include 'conexion.php';
$pdo=new Conexion();


//MOSTRAR LOS DATOS DEL PRODUCTO DE LA ID INDICADA
if($_SERVER['REQUEST_METHOD']=='GET'){
	if(isset($_GET['id'])){
	$sql=$pdo->prepare("SELECT * FROM registro_productos WHERE Id=:Id");
	$sql->bindValue(':Id',$_GET['Id']);
	$sql->execute();
	$sql->setFetchMode(PDO::FETCH_ASSOC);
	header ("HTTP/1.1 200 Ok");
	echo json_encode($sql->fetchAll());
	exit;
	}
	else{
	$sql=$pdo->prepare ("SELECT * FROM Registro_productos");
	$sql->execute();
	$sql->setFetchMode(PDO::FETCH_ASSOC);
	header ("HTTP/1.1 200 Ok");
	echo json_encode ($sql->fetchAll());
	exit;
	}
}


//REGISTRO DE PRODUCTOS + INVENTARIO DE PRODUCTO
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $sql ="INSERT INTO registro_productos (Id, Nombre, Marca, Presentacion, Precio) VALUES (:id,:nombre,:marca,:presentacion,:precio)";
    $stmt=$pdo->prepare($sql);
	$stmt->bindValue(':id', $_POST['Id']);
    $stmt->bindValue(':nombre', $_POST['Nombre']);
    $stmt->bindValue(':marca', $_POST['Marca']);
    $stmt->bindValue(':presentacion', $_POST['Presentacion']);
    $stmt->bindValue(':precio', $_POST['Precio']);
	$stmt->execute();
	$idPost = $pdo->lastInsertId();

    if ($idPost) {
        header("HTTP/1.1 200 OK");
        echo json_encode($idPost);
        exit;
    }
	
}

if($_SERVER['REQUEST_METHOD']=='PUT'){
	$sql="UPDATE Actualizacion_i SET nombre=:Nombre WHERE idusuarios=:Id";
	$stmt=$pdo->prepare($sql);
	$stmt->bindValue(':Id',$_GET['idusuarios']);
	$stmt->bindValue(':Nombre',$_GET['nombre']);
	$stmt->execute();
	header("HTTP/1.1 200 OK");
	exit;
}



//BORRAR EL REGISTRO
if($_SERVER['REQUEST_METHOD']=='DELETE'){
	$sql="DELETE FROM Registro_productos WHERE Id=:id";
	$stmt=$pdo->prepare($sql);
	$stmt->bindValue(':id',$_GET['Id']);
	$stmt->execute();
	header("HTTP/1.1 200 OK");
	exit;
}
	
?>
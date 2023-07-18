<?php
include 'conexion.php';
$pdo=new Conexion();

if ($_SERVER['REQUEST_METHOD'] == 'GET') {
	if(isset($_GET['id'])){
	$sql=$pdo->prepare("SELECT * FROM login WHERE Usuario=:Usuario");
	$sql->bindValue(':Usuario',$_GET['Usuario']);
	$sql->execute();
	$sql->setFetchMode(PDO::FETCH_ASSOC);
	header ("HTTP/1.1 200 Ok");
	echo json_encode($sql->fetchAll());
	exit;
	}
	else{
	$sql=$pdo->prepare ("SELECT * FROM login");
	$sql->execute();
	$sql->setFetchMode(PDO::FETCH_ASSOC);
	header ("HTTP/1.1 200 Ok");
	echo json_encode ($sql->fetchAll());
	exit;
	}
}






?>
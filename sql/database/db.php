<?php

$conexion = mysqli_connect(
    "localhost",
    "root",
    "",
    "portal_eventosbd"
);
if (!$conexion) {
    die("Connection failed: " . mysqli_connect_error());
}

$eventName = $_POST['eventName'];
$eventDate = $_POST['eventDate'];
$eventDuration = $_POST['eventDuration'];

?>
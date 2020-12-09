<?php
$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "studentdb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "
INSERT INTO `studentdb`.`students`
(`FirstName`,
`LastName`,
`Email`,
`Address`)
VALUES
(
'Alex New',
'T',
'alexNew@gmail.com',
'Mississauga')";

if ($conn->query($sql) === TRUE) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
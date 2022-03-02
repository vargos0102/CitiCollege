
<?php
$name =  $_GET["n"];
$email = $_GET["e"];
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
'$name',
'T',
'$email',
'Mississauga')";

$getSql = "Select FirstName, Email from studentdb.students order by Id desc ";

if ($conn->query($sql) === TRUE) {
  //echo "New record created successfully";
  $result=$conn->query($getSql);
  while($row = $result->fetch_assoc())
  {
    echo "Name: ".$row["FirstName"].", Email: ".$row["Email"]."<br>";
  }
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>

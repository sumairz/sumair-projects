<?php
include 'mysql.php';

$sql1 = "select * from rahbar_stats where service_id=1";
$data1 = mysql_query($sql1);
$result1 = mysql_fetch_assoc($data1);

$sql2 = "select * from rahbar_stats where service_id=2";
$data2 = mysql_query($sql2);
$result2 = mysql_fetch_assoc($data2);

$sql3 = "select * from rahbar_stats where service_id=3";
$data3 = mysql_query($sql3);
$result3 = mysql_fetch_assoc($data3);

echo "<b>NIC registration:</b> <span style='font-size:24px;color:red;'>". $result1['usage'] ."</span> people used this service <br /><br />";
echo "<b>Driver license renewal:</b> <span style='font-size:24px;color:red;'>". $result2['usage'] ."</span> people used this service <br /><br />";
echo "<b>Intermediate Certificate:</b> <span style='font-size:24px;color:red;'>". $result3['usage'] ."</span> people used this service <br /><br />";
?>
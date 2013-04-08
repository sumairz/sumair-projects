<?php

$opt  = $_GET['op'];
$text = "";

if($opt == 1)
{
	$text = "<p>Following documents needed for NIC registration</p>
			 1. Birth Certificate or Old NIC <br />
			 2. Matriculation Certificate <br />
			 3. CNICs of immediate/blood relatives <br />
			 4. Citizenship certificate issued by MOI
			 <p>Other information<p>
			 <p>- Normal process: 30 days / Rs. 200<p
			 <p>- Urgent process: 15 days / Rs. 300</p>
			 <p>If you do not have a Pakistani NIC you will not be treated as Pakistani citizen.</p>";
}

if($opt == 2)
{
	$text = "<p> Following documents needed for driving license renewal<p>
			 1. 2 Passport size photographs <br />
			 2. Two photocopy of original NIC <br />
			 3. Expired driving license <br />
			 4. Original NIC (will be returned)
			 <p>Renewal fees: Max Rs. 1860 (Fee depends on the time of expiry)<p>
			 <p>In case of accidents if you do not have a Driver Licese you could be charged with attempt to murder case.</p>";
			 
			 
}

if($opt == 3)
{
	$text = "1. Intermediate certificate request form (available at inter board office)<br />
			 2. Two attested photocopies of NIC<br />
			 3. Intermediate marksheet<br />
			 4. Two passport size photographs<br />
			 5. HSC original admit card <br />
			 6. Intermediate original enrollment card <br />
			 7. Attested copy of Matric certificate<br />
			 8. Attested copty of intermediate marksheet
			 <p>Intermediate certificate is required for admission at local and international unversities.</p>";
}
?>


<html>
<?php echo $text; ?>
</html>
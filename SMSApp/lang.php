<?php

$lang = $_GET['l'];

?>

<html>
<form>
<!-- English -->
<?php if($lang == 1) { ?>
1. <a href="details.php?op=1" data-pring-label="NIC registration" data-pring-match="1">NIC registration</a><br/>
2. <a href="details.php?op=2" data-pring-label="Birth Certificate" data-pring-match="2">Driver license renewal</a><br/>
3. <a href="details.php?op=3" data-pring-label="Death Certificate" data-pring-match="3">Intermediate Certificate</a>
<?php } ?>

<!-- Urdu -->
<?php if($lang == 2) { ?>
1. <a href="details.php?op=1" data-pring-label="NIC registration" data-pring-match="1">NIC registration</a><br/>
2. <a href="details.php?op=2" data-pring-label="Birth Certificate" data-pring-match="2">Driver license registration</a><br/>
3. <a href="details.php?op=3" data-pring-label="Death Certificate" data-pring-match="3">Intermediate Certificate</a>
<?php } ?>

<!-- Pashto -->
<?php if($lang == 3) { ?>
1. <a href="details.php?op=1" data-pring-label="NIC registration" data-pring-match="1">NIC registration</a><br/>
2. <a href="details.php?op=2" data-pring-label="Birth Certificate" data-pring-match="2">Driver license registration</a><br/>
3. <a href="details.php?op=3" data-pring-label="Death Certificate" data-pring-match="3">Intermediate Certificate</a>
<?php } ?>
</form>
<br />
<br />

<p> Reply with 1,2 or 3</p>
</html>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Fiche client</title>
	<link rel="stylesheet" type="text/css" href="bootstrap.css" media="all" />
	<link rel="stylesheet" href="/xmedia/tuto/styles.css" type="text/css">
	
</head>
<body>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">La Banque</a>
			</div>
		</div>
	</nav>

	<form class="form-signin">
		<label for="inputFirstName" class="sr-only">Nom</label> <input
			type="text" id="inputFirstName" class="form-control"
			placeholder="Nom" required autofocus> <label
			for="inputLastname" class="sr-only">Prénom</label> <input type="text"
			id="inputLastname" class="form-control" placeholder="Prénom" required>
		<label for="inputnomdejeunefille" class="sr-only">Nom de jeune fille</label> <input type="text" id="inputnomdejeunefille"
			class="form-control" placeholder="Nom de jeune fille"> <br>

<div id="wrap">

	<h2>Démonstration d'un input de type date</h2>
		<form action="input-type-date.php" method="post">
		<label for="champ1">Votre date de naissance</label>
		<input type="date" id="champ1" name="date">
		<br /><br />
		<button>Tayst</button>
	</form>

</div> <br>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Envoyer la fiche client</button>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Enregistrer la fiche client</button>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Annuler l'inscription</button>
	</form>



</body>
</html>
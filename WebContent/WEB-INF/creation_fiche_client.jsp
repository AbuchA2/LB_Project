<%@include file="header.jsp" %>

	<form class="form-signin" method="POST" action="creation_fiche_client">
	
		<label for="inputFirstName" class="sr-only" enctype="multipart/form-data">Nom</label> <input
			type="text" name="nom" id="inputFirstName" class="form-control"
			placeholder="Nom" required autofocus> 
			
			<label
			for="inputLastname" class="sr-only">Prénom</label> <input type="text" name="prenom"
			id="inputLastname" class="form-control" placeholder="Prénom" required>
			
		<label for="inputnomdejeunefille" class="sr-only">Nom de jeune
			fille</label> <input type="text" name="nom_de_jeune_fille" id="inputnomdejeunefille"
			class="form-control" placeholder="Nom de jeune fille"> <br>

		<div id="wrap">

			<label for="inputdatedenaissance" class="sr-only">Date de
				naissance</label> <input type="date" name="date_de_naissance" id="datedenaissance"
				class="form-control" placeholder="Date de naissance">

		</div>
		
		<label for="adresse" class="sr-only">Adresse</label> <input
			type="text" name="adresse" id="adresse" class="form-control"
			placeholder="Adresse" required autofocus> 
			
			<label
			for="mail" class="sr-only">Mail</label> <input type="text" name="user_mail"
			id="Mail" class="form-control" placeholder="Mail" required>
			
		<label for="Téléphone" class="sr-only">Téléphone </label> <input type="number" name="tel" id="Téléphone"
			class="form-control" placeholder="Téléphone">
			
		<br>
			
	<div class="form-group">		
		<label for="lien_PI" class="sr_only">Pièce d'identité :</label>
		<input type="file" name="lien_PI" id="lien_PI" class="form-control" placeholder="lien vers l'image de votre pièce d'indentité">
			
	<!-- <label for="lien_JD" class="sr_only">Justificatif de domicile :</label>
		<input type="file" name="lien_JD" id="lien_JD" class="form-control" placeholder="lien vers l'image de votre justificatif de domicile">

		<label for="lien_IS" class="sr_only">Feuille de salaire :</label>
		<input type="file" name="lien_IS" id="lien_IS" class="form-control" placeholder="lien vers l'image de votre "> -->
	</div>
	
		<br>
		<button class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;">Envoyer
			la fiche client</button>
			

	</form>
	
	<button class="btn btn-lg btn-primary btn-block" >Enregistrer
		la fiche client</button>
	<button class="btn btn-lg btn-primary btn-block" >Annuler
		l'inscription</button>


<%@include file="footer.jsp" %>
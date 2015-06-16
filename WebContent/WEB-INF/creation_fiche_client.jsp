<%@include file="header.jsp" %>

 	<form class="form-signin" method="POST" action="creation_fiche_client" enctype="multipart/form-data">
 	<label for="inputFirstName" class="sr-only">Nom</label> <input
			type="text" name="nom" id="inputFirstName" class="form-control"
			placeholder="Nom" required autofocus> 
			
			<label
			for="inputLastname" class="sr-only">Prénom</label> <input type="text" name="prenom"
			id="inputLastname" class="form-control" placeholder="Prénom" required>
			
		<!-- <label for="inputnomdejeunefille" class="sr-only">Nom de jeune
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
			
		<br> -->
	
		<br>
		<button href= "upload_fiche_client" class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;"> Suivant </button>
			

	</form>
	
	<button class="btn btn-lg btn-primary btn-block" >Enregistrer
		la fiche client</button>
	<button class="btn btn-lg btn-primary btn-block" >Annuler
		l'inscription</button>


<%@include file="footer.jsp" %>
<%@include file="header.jsp" %>

 	<form class="form-signin" method="POST" action="upload_fiche_client" enctype="multipart/form-data">
			
	<div class="form-group">		
		<label for="lien_PI" class="sr_only">Pièce d'identité :</label>
		<input type="file" name="lien_PI" id="lien_PI" placeholder="lien vers l'image de votre pièce d'indentité">
			
	<label for="lien_JD" class="sr_only">Justificatif de domicile :</label>
		<input type="file" name="lien_JD" id="lien_JD" placeholder="lien vers l'image de votre justificatif de domicile">

		<label for="lien_IS" class="sr_only">Image de signature :</label>
		<input type="file" name="lien_IS" id="lien_IS" placeholder="lien vers l'image de votre signature">
	</div>
	
		<br>
		<button href="creation_fiche_client_choix_du_canal" class="btn btn-lg btn-primary btn-block" type="submit" style="margin-bottom:5px;">Envoyer
			la fiche client</button>
			
	</form>
	
	<button class="btn btn-lg btn-primary btn-block" >Enregistrer
		la fiche client</button>
	<button class="btn btn-lg btn-primary btn-block" >Annuler
		l'inscription</button>


<%@include file="footer.jsp" %>
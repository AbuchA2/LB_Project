<%@include file="header.jsp" %>


      <form class="form-signin" method="POST" action="creation_fiche_client_choix_du_canal">
      
     
     	<input type="radio" name="Canal" value="Mail"><label for="Mail">Mail</label><br>
		<input type="radio" name="Canal" value="Téléphone"><label for="Téléphone">Téléphone</label>
     <br>
		<br>
		<br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Valider</button>

      </form>
      
        <button class="btn btn-lg btn-primary btn-block" type="submit">Annuler</button>
        

<%@include file="footer.jsp" %>
<%@include file="header.jsp" %>


      <form class="form-signin" method="POST" action="modification_profil">
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" name="motdepasse" id="inputPassword" class="form-control" placeholder="Mot de Passe" required>
        <label for="inputConfirmationPassword" class="sr-only">Confirmation du mot de passe</label>
        <input type="password" name="confirmpasse" id="inputConfirmationPassword" class="form-control" placeholder="Confirmation mot de passe" required>
        <label for="inputEmail" class="sr-only">Mail</label>
        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Adresse mail" required>
        <label for="inputConfirmationMail" class="sr-only">Confirmation Mail</label>
        <input type="email" name="confirmmail" id="inputConfirmationMail" class="form-control" placeholder="Confirmation adresse mail" required>
		<br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Valider</button>

      </form>

        <button class="btn btn-lg btn-primary btn-block" href="resume_profil">Annuler</button>


<%@include file="footer.jsp" %>

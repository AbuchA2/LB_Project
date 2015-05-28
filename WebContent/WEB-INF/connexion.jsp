<%@include file="header.jsp" %>
    

      <form class="form-signin" method ="POST" action ="connexion">
        <label for="inputUser" class="sr-only">Nom d'utilisateur</label>
        <input type="text" name="nom" id="inputUser" class="form-control" placeholder="Nom d'utilisateur" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de Passe</label>
        <input type="password" name="motdepasse" id="inputPassword" class="form-control" placeholder="Mot de Passe" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Se souvenir de moi
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;">Se connecter</button>
        
        
      </form>
      <a href= "creation_compte.jsp" style="text-decoration:none;"><button class="btn btn-lg btn-primary btn-block" >S'inscrire</button></a>

<%@include file="footer.jsp" %>
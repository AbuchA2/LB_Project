<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Connexion</title>
<link rel="stylesheet" type="text/css" href="bootstrap.css" media="all"/>


</head>
<body>

   <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">La Banque</a>
        </div>
      </div>
    </nav>
    

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
      <a href= "creation_compte_test.jsp" style="text-decoration:none;"><button class="btn btn-lg btn-primary btn-block" >S'inscrire</button></a>

</body>
</html>
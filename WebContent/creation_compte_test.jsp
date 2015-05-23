<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.css" media="all"/>
        <meta charset="utf-8" />
<meta charset="ISO-8859-1">
<title>Création de compte</title>
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


      <form class="form-signin" method="POST" action="creation_compte">
        <label for="inputUserName" class="sr-only">Nom d'utilisateur</label>
        <input type="text" name="inputUserName" id="inputUserName" class="form-control" placeholder="Nom d'utilisateur" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" name="motdepasse" id="inputPassword" class="form-control" placeholder="Mot de Passe" required>
        <label for="inputConfirmationPassword" class="sr-only">Confirmation du mot de passe</label>
        <input type="password" name="confirmpasse" id="inputConfirmationPassword" class="form-control" placeholder="Confirmation mot de passe" required>
        <label for="inputEmail" class="sr-only">Mot de Passe</label>
        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Adresse mail" required>
        <label for="inputConfirmationMail" class="sr-only">Confirmation Mail</label>
        <input type="email" name="confirmmail" id="inputConfirmationMail" class="form-control" placeholder="Confirmation adresse mail" required>
		<br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Valider</button>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Annuler</button>
      </form>

</body>
</html>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    
        <div class="container">
 <form method="post" action="choix_produits">
      <div class="starter-template">
        <h2>Vos produits</h2>
       
        <p class="lead">
       Cochez les produits auxquels vous voulez souscrire :<br /><br />
       
       <input type="checkbox" name="Livret_A" id="Livret A" /> <label for="Livret A"><a class="btn btn-lg btn-success" href="choix_produits_livretA" role="button">Livret A</a></label><br />
       <input type="checkbox" name="PEL" id="PEL" /> <label for="PEL"><a class="btn btn-lg btn-success" href="choix_produits_PEL" role="button">PEL</a></label><br />
       <input type="checkbox" name="Compte_Bancaire" id="Compte Bancaire" /> <label for="Compte Bancaire"><a class="btn btn-lg btn-success" href="choix_produits_compte_bancaire" role="button">Compte Bancaire</a></label><br />
       <input type="checkbox" name="Carte_Bancaire_Nationale" id="Carte Bancaire Nationale" /> <label for="Carte Bancaire Nationale"><a class="btn btn-lg btn-success" href="choix_produits_carte_bancaire_nationale" role="button">Carte Bancaire Nationale</a></label><br />
       <input type="checkbox" name="Carte_Bancaire_Internationale" id="Carte Bancaire Internationale" /> <label for="Carte Bancaire Internationale"><a class="btn btn-lg btn-success" href="choix_produits_carte_bancaire_internationale" role="button">Carte Bancaire Internationale</a></label><br />
       <input type="checkbox" name="Carte_Bancaire_Platine" id="Carte Bancaire Platine" /> <label for="Carte Bancaire Platine"><a class="btn btn-lg btn-success" href="choix_produits_carte_platine" role="button">Carte Platine</a></label>
  		 </p>
 	  </div>
 	  <button class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;">Valider le choix des produits</button>

	</form>
    </div><!-- /.container -->
    
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    

<%@include file="footer.jsp" %>
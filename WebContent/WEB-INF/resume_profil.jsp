<%@include file="header.jsp" %>
<h5>Nom d'utilisateur :</h5> 
${person.username}
<h5>Adresse mail :</h5>
${person.email}

<p>
	<a class="btn btn-lg btn-success" href="modification_profil" role="button">Modifier votre profil</a>
</p>
<p>
	<a class="btn btn-lg btn-danger" href="page_accueil" role="button">Retour vers la page d'accueil</a>
</p>


<%@include file="footer.jsp" %>
<%@include file="header.jsp" %>


<form class="form-signin" method ="POST" action ="localisateur_agence">
        <label for="inputaddress" class="sr-only">Adresse</label>
        <input type="text" name="adresse" id="inputaddress" class="form-control" placeholder="Adresse" required autofocus>

        <button class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;">Rechercher une agence</button>

        
      </form>


<%@include file="footer.jsp" %>
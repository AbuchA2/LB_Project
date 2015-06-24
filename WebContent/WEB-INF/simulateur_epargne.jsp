<%@include file="header.jsp" %>

	<form class="form-inline" method ="POST" action="simulateur_epargne">
		<div class="form-group">
		
		<input type="checkbox" name="LivretA" id="LivretA" /> <label for="Livret A">Livret A</label><br />
		
		<br></br>
		
		<label for="montant"> Montant à placer : </label>
		<input type="number" name="montant" id="montant" class="form-control" placeholder="En euros">
		<br>
		
		</div>
	<br></br>
		<label for="mois"> Durée du placement : </label>
        <input type="number" name="mois" id="mois" class="form-control" placeholder="En mois">
		<br>
	<br>
	</br>
	<br>
	

	<input type="checkbox" name="PEL" id="PEL" /> <label for="PEL">PEL</label><br />
	<br>

		<label for="montant2"> Montant à placer : </label>
		<input type="number" name="montant2" id="montant2" class="form-control" placeholder="En euros" >
		<br>
		
		</div>
	<br>
		<label for="mois2"> Durée du placement : </label>
        <input type="number" name="mois2" id="mois2" class="form-control" placeholder="En mois" >
		<br>
		

<br>
</br>
<br>
</br>
<button class="btn btn-lg btn-primary btn-block" type="submit" style = "margin-bottom:5px;width:150px;height:40px;text-align:center;"> Calculer </button>
<br></br>
	<label for="total">Total : </label>     
		<%  
            String attribut = (String) request.getAttribute("resultat");
		if (attribut != null){
            out.println( attribut );
		}
        %>
	</form>
	  <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
 	  
<%@include file="footer.jsp" %>

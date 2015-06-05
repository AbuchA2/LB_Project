<%@include file="header.jsp" %>

	<form class="form-inline" method ="POST" action="simulateur_epargne">
		<div class="form-group">
		
		<input type="checkbox" name="Livret A" id="Livret A" /> <label for="Livret A">Livret A</label><br />
		
		<br></br>
		
		<label for="inputmontant"> Montant à placer : </label>
		<input type="text" name="montant" id="inputmontant" class="form-control" placeholder="(En euros)" required>
		<br>
		
		</div>
	<br></br>
		<label for="inputmois"> Durée du placement : </label>
        <input type="text" name="mois" id="inputmois" class="form-control" placeholder="(En mois)"required>
		<br>
	<br>
	</br>
	<br>
	

	<input type="checkbox" name="PEL" id="PEL" /> <label for="PEL">PEL</label><br />
	<br>

		<label for="inputmontant2"> Montant à placer : </label>
		<input type="text" name="montant2" id="inputmontant2" class="form-control" placeholder="(En euros)" required>
		<br>
		
		</div>
	<br>
		<label for="inputmois2"> Durée du placement : </label>
        <input type="text" name="mois2" id="inputmois2" class="form-control" placeholder="(En mois)" required>
		<br>
		

<br>
</br>
<br>
</br>
	
	<label for="somme">Total : </label>
	
	</form>
 	  
<%@include file="footer.jsp" %>

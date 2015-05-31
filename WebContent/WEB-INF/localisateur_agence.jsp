<%@include file="header.jsp" %>
<style>
 #map-canvas { 
 	min-height: 500px;
 	 
 	width: 80%;
 	margin:auto; 
 	padding: 0;
 	background-border: 2px solid red;
 
 }
 
</style>


    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js">
    </script>
    <script type="text/javascript">
      function initialize() {
        var mapOptions = {
          center: { lat: 48, lng: 2},
          zoom: 8
        };
        var map = new google.maps.Map(document.getElementById('map-canvas'),
            mapOptions);
        var testtest = new google.maps.LatLng(-25.363882,131.044922);
        var marker = new google.maps.Marker({
              position: testtest ,
              map: map,
              title: 'Hello World!'
          });
        var contentString = 'test';

        var infowindow = new google.maps.InfoWindow({
            content: contentString
        });
      google.maps.event.addListener(marker, 'click', function() {
          infowindow.open(map,marker);
        });
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
<div id="map-canvas"></div>

${agence.name}
${agence.adress}
${agence.lat}
${agence.longi}


<%@include file="footer.jsp" %>
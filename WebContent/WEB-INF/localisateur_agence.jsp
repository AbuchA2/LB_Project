
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script>

   var geocoder;
   var map;

   function initialize() {
    geocoder = new google.maps.Geocoder();
    var mapCanvas = document.getElementById('map-canvas');
    var mapOptions = {
     center: new google.maps.LatLng(0, 0),
     zoom: 11,
     mapTypeId: google.maps.MapTypeId.ROADMAP
    }
    map = new google.maps.Map(mapCanvas, mapOptions);
    loadMarkers();
   }

   function adressToMarker(address, desc) {
    geocoder.geocode({'address': address}, function(results, status) {
     if (status == google.maps.GeocoderStatus.OK) {
      //map.setCenter(results[0].geometry.location);
      var infowindow = new google.maps.InfoWindow({
       content: desc
      });

      var marker = new google.maps.Marker({
       map: map,
       position: results[0].geometry.location
      });
      google.maps.event.addListener(marker, 'click', function() {
       infowindow.open(map, marker);
      });
     } else {
      console.log("Geocode was not successful for the following reason: " + status);
     }
    });
   }

   function centerOnAdress(address) {
    geocoder.geocode({'address': address}, function(results, status) {
     if (status == google.maps.GeocoderStatus.OK) {
      map.setCenter(results[0].geometry.location);
     } else {
      console.log("Geocode was not successful for the following reason: " + status);
     }
    });
   }

   function loadMarkers() {

    <c:forEach items="${agences}" var="agence">
     adressToMarker("${agence.adress} ${agence.code_postal}", "${agence.name} ${agence.desc}");
    </c:forEach>


    centerOnAdress("${adresse}");
    adressToMarker("${adresse}", "Vous êtes ici !");
   }
   
   google.maps.event.addDomListener(window, 'load', initialize);
  </script>

<div id="map-canvas"></div>


<%@include file="footer.jsp" %>
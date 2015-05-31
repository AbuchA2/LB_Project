
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



${item.name}


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
        <c:forEach items="${agence}" var="item">
        var testtest = new google.maps.LatLng(${item.lat},${item.longi});
        var marker${item.id} = new google.maps.Marker({
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
      </c:forEach>
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>




<div id="map-canvas"></div>


<%@include file="footer.jsp" %>
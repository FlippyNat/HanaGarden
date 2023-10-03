/*Google Map*/
let map;

function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 5.453367, lng: 100.286965 },
    zoom: 17
  });
  
  var marker = new google.maps.Marker({position: center});
marker.setMap(maps); /*Map marker (not working)*/
  
}


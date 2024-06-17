////////////* Variabler hentet fra reise.html*//////////////

var divInfo = document.getElementById("divInfo");
var frmFlyreise = document.getElementById("frmFlyreise");
var velgFlyplassUtreise = document.getElementById("velgFlyplassUtreise");
var velgFlyplassTil = document.getElementById("velgFlyplassTil");
var inpUtdato = document.getElementById("inpUtdato");
var inpReturdato = document.getElementById("inpReturdato");
var inpAntVoksne = document.getElementById("inpAntVoksne");
var inpAntBarn = document.getElementById('inpAntBarn');
var rbTR = document.getElementById("rbTR");
var rbEnVei = document.getElementById("rbEnVei");
var cbLeiebil = document.getElementById("cbLeiebil");
var cbHotell = document.getElementById("cbHotell");

var lyd = document.getElementById("lyd");

////////////////////////////////////////////////////////

var formSubmitted = false; /* Skjemaet for bestilling er ikke sendt inn */


/* Flyprisene til de forskjellige reisene */
var flyPriser = {
  "Norge - Sverige": 117,
  "Sverige - Norway": 123,
  "Norge - Dannmark": 164,
  "Dannmark - Norge": 141,
  "Sverige - Dannmark": 98,
  "Dannmark - Sverige": 91,
};
/////////////////////////////////////////////


/* Når Search flight knappen trykkes skal det som står under skje*/
frmFlyreise.onsubmit = function (evt) {

	if (formSubmitted) { /* Hvis skjemaet er sendt inn allerede skal det returneres at der ikke er sendt inn*/
		return false;
	}

	formSubmitted = true; /* Skjemaet er nå sendt in og no kan ikke skjeamet bli sendt inn flere ganger*/

	evt.preventDefault(); /* Stopper siden for at den ikke skal oppdateres */
	lyd.play(); /* Klikke lyden blir spilt av */
	divInfo.style.visibility = "visible"; /* Billett diven vises */

	var totalPris = 0; /* Totalprisen som blir vist på biletten blir satt til 0*/

	var flyPris = flyPriser[velgFlyplassUtreise.value + " - " + velgFlyplassTil.value]; /* Her blir det hentet ut det brukeren har valgt og matcher det med variabelen flypriser og får pris ur fra det */ 
  totalPris += flyPris * inpAntVoksne.value; /* Totalprisen blir flypris ganget med hvor mange voksne som er med*/

    if (velgFlyplassUtreise.value === velgFlyplassTil.value) { /* Hvis flyfra og flytil er samme land vises meldingen under*/
    divInfo.innerHTML = "Error: " + "<b>" + "Fly from " + "</b>" + "and " + "<b>" + "Fly to " + "</b>" + "cannot be the same. Please select different airports";
    return; /* Funkskjonen avsluttes hvis dette skjer og siden må oppdateres */
}
	if (rbTR.checked) { /* Hvis radioknappen Round trip er valgt skal det under skje */
	/* Inne på bilett diven skal meldingene under vises */
	divInfo.innerHTML += "Departure from: " + velgFlyplassUtreise.value + "<br>";
	divInfo.innerHTML += "Travelling to: " + velgFlyplassTil.value + "<br>";
	divInfo.innerHTML += "Date of Departure: " + inpUtdato.value + "<br>";
	divInfo.innerHTML += "Date for arrival: " + inpReturdato.value + "<br>";
	divInfo.innerHTML += "Adults: " + inpAntVoksne.value + "<br>";
	totalPris *= 2; /* Siden round trip inkluderer 2 fly så dobler totalprisen seg */
}
	if (rbEnVei.checked) { /* Hvis radioknappen One way er valgt skal det under skje */
	inpReturdato.value = ""; /* Siden one way er bare et fly så tømmes returdatoen siden returfly ikke er inkludert i one way */
	divInfo.innerHTML += "Departure from: " + velgFlyplassUtreise.value + "<br>";
	divInfo.innerHTML += "Travelling to: " + velgFlyplassTil.value + "<br>";
	divInfo.innerHTML += "Date of departure: " + inpUtdato.value + "<br>";
	divInfo.innerHTML += "Adults: " + inpAntVoksne.value + "<br>";
}
	if (inpAntBarn.value >= 1) { /* Hvis antall barn er 1 eller over så skal meldingen under vises inne på bilett diven */
	divInfo.innerHTML += "Children: " + inpAntBarn.value + "<br>";
}
	if (cbLeiebil.checked) { /* Hvis checkboksen include rental car er krysset av så skal meldingen under vises inne på bilett diven */
	divInfo.innerHTML += "Rental car included" + "<br>";
	totalPris += 75; /* For å ha med leiebil vil det koste 75 euro */
}
	if (cbHotell.checked) { /* Hvis checkboksen include hotel er krysset av så skal meldingen under vises inne på bilett diven */	
	divInfo.innerHTML += "Hotel included" + "<br>";
	totalPris += 175; /* For å ha med hotell vil det koste 175 euro */
}
	divInfo.innerHTML += "Your total comes to: " + "<b>" + totalPris + "</b>" + " £"; /* På slutten av biletten vises meldingen med hva totalprisen ble */
}

function betal() {
	location.reload(); /* Når betal knappen (checkout) trykkes oppdateres siden */
}

function sok() {
	location.reload(); /* Når søke knappen som ligger med nav baren trykkes oppdateres siden */
}

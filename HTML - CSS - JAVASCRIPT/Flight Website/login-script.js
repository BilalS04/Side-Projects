////////////* Variabler hentet fra login.html*//////////////

var formLog = document.getElementById("formLog");
var logRes = document.getElementById("logRes");
var inpUser = document.getElementById("inpUser");
var inpPass = document.getElementById("inpPass");
var frmSign = document.getElementById("frmSign");
var signRes = document.getElementById("signRes");
var formSign = document.getElementById("formSign");
var frmLog = document.getElementById("frmLog");
var inpSignPass = document.getElementById("inpSignPass");
var inpSignPass2 = document.getElementById("inpSignPass2");
var inpNavn = document.getElementById("inpNavn");
var inpFod = document.getElementById("inpFod");
var inpNum = document.getElementById("inpNum");
var inpSignUser = document.getElementById("inpSignUser");
var inpSignPass = document.getElementById("inpSignPass");
var inpSignPass2 = document.getElementById("inpSignPass2");

//////////////////////////////////////////////////////////

//////* Når login knappen trykkes skal dette skje *////////

formLog.onsubmit = function (evt) {
	evt.preventDefault(); /* Stopper siden for at den ikke skal oppdateres */

	inpUser.value = ""; /* Når login knappen trykkes skal input feltet tømmes */
	inpPass.value = "";
	logRes.innerHTML = "You sucessfully signed in to your account"; /* Denne meldingen kommes opp */

	frmSign.style.visibility = "hidden"; /* Sign-up diven skjules */

}

//////* Når Sign-up knappen trykkes skal dette skje *////////
formSign.onsubmit = function (evt) {
	evt.preventDefault();
	if (inpSignPass.value === inpSignPass2.value) {      /* Hvis begge passord inputene matcher skal meldingen under vises */
		signRes.innerHTML = "Congratulation, your new account has been created";
	} else {                                            /* Ellers skal meldingen under vises */
		signRes.innerHTML = "Sorry your password didn't match. Please try again";
	}
	inpNavn.value = "";    /* Etter skjemaet er submittet skal input feltene tømmes */
	inpFod.value = "";
	inpNum.value = "";
	inpSignUser.value = "";
	inpSignPass.value = "";
	inpSignPass2.value = "";

	frmLog.style.visibility = "hidden"; /* Logg in diven skjules */
}

function sok() {
	location.reload(); /* Når søke knappen som ligger med nav baren trykkes oppdateres siden */
}


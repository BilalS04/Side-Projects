////////////* Variabler hentet fra kontakt.html*//////////////
var formKontakt = document.getElementById("formKontakt");
var posten = document.getElementById("posten");
///////////////////////////////////////////////////////////////
formKontakt.onsubmit = function () { /* Når skjemaet blir sendt inn skjer det under */
    if (posten.checked) {           /* Hvis post checkboksen er markert */
        alert("Skjemaet ditt er levert! Vi sender svaret til posten din.");
    } else {
        alert("Skjemaet ditt er levert!"); /* Kommer en pop opp med den teksten */
    }
}

function oppdater() {
    location.reload(); /* Oppdaterer siden */
}
////////////* Variabler hentet fra bestilling.html*//////////////
var divHandlekurv = document.getElementById("divHandlekurv");
var pHandlekurv = document.getElementById("pHandlekurv");
///////////////////////////////////////////////////////////////
var sum = 0; /* Variabel sum og setter verdien til 0 */

function frenchVanilla() { /* Funksjonen sin navn */
    sum += 30; /* Plusser 30 til summen*/
    pHandlekurv.innerHTML = sum + " kr"; /* Bytter teksten til hvor mye totalkostnaden er */
    divHandlekurv.style.display = "block"; /* Handlekurven vises */
}

function caramelMacchiato() {
    sum += 37;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function pumpkinSpice() {
    sum += 35;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function hazelnut() {
    sum += 40;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function mocha() {
    sum += 45;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function donut() {
    sum += 15;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function cherryPie() {
    sum += 27;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function cheesecake() {
    sum += 30;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function cinnamonRoll() {
    sum += 25;
    pHandlekurv.innerHTML = sum + " kr";
    divHandlekurv.style.display = "block";
}

function oppdater() {
    location.reload(); /* Oppdaterer siden */
}



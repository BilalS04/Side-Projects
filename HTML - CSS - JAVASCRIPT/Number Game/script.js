const game = document.getElementById('divGame');
const inputNumber = document.getElementById('addNumber');
const btnEnter = document.getElementById('btnEnter');
const result = document.getElementById('pResult');
const pPreviousNumbers = document.getElementById('pPreviousNumbers');
const wonScreen = document.getElementById('divWon');

const usedNumbers = [];

console.log(usedNumbers);


function isUsed(number) {
    return usedNumbers.includes(number);
}

function numberRange(number) {
    return number > 0 && number < 100;
}

function addToPrevious(number) {
    pPreviousNumbers.innerHTML += number + ", ";
}

btnEnter.addEventListener('click', button => {
    const temp = parseInt(inputNumber.value);

    if(!isUsed(temp) && numberRange(temp)) {
        inputNumber.value = '';
        usedNumbers.push(temp);
        result.innerHTML = "Added!";
        addToPrevious(temp);
    } else if(!isUsed(temp) && !numberRange(temp)) {
        result.innerHTML = "ERROR!: Number is not in range!";
    } else {
        result.innerHTML = "ERROR!: Number is already used!"
    }

    if(usedNumbers.length === 99) {
        game.style.visibility = "hidden";
        wonScreen.style.visibility = "visible";
    }
})




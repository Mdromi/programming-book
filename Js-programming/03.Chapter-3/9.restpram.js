/*====================
CP: 03 JavaScript ES6
9.Rest Prameters
CMD: [ node 9.restpram.js ]
EX: 
===================*/

function arguments5 () {
    for (var i = 0; i < arguments.length; i++) {
        console.log(`Arguments passed: ` +  arguments[i]);
    }
}

function argumentsMethWork () {
    var argsArr = Array.prototype.slice.call(arguments)
    argsArr.map(oneArgs => {
        console.log(`Arguments passed: ` +  oneArgs);
    })
}

// Rest Perametar
function argumentsMeth6 (...anyName) {
    anyName.map(oneArgs => {
        console.log(`Arguments passed: ` +  oneArgs);
    })
}

// argumentsMeth6('Bangladesh', 'Indonesian', 'Quet', 'Qatar', 'UE')
// argumentsMethWork ('Bangladesh', 'Indonesian', 'Quet', 'Qatar', 'UE') 
// arguments5('Bangladesh', 'Indonesian', 'Quet', 'Qatar', 'UE')
/*====================
CP: 03 JavaScript ES6
10.Default Prameters
CMD: [ node 10.defaultParam.js ]
EX: 
===================*/

function defaultParam(name = `Md Romi`, age = 19) {
    this.name = name
    this.age = age
}

let romi = new defaultParam()

console.log(romi.name);
console.log(romi.age);
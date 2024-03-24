/*====================
CP: 03 JavaScript ES6
11. Class
CMD: [ node 12.class.js ]
EX: class{};
===================*/

class Child {
    constructor(name, dob) {
        this.name = name
        this.dob = dob
    }

    currentage() {
        console.log(`${this.name} is ${2023 - this.dob} years old`);
    }
}

let romi = new Child(`Md Romi`, 2002)

console.log(romi.name);
console.log(romi.dob);
romi.currentage()
/*====================
CP: 03 JavaScript ES6
11. Class Inheritance
CMD: [ node 13.classInheritance.js ]
EX: class{};
===================*/

class PersonClass {
    constructor (name, age, job) {
        this.name = name
        this.age = age
        this.job = job
    }

    dateOfBirth() {
        console.log(`${this.name} born in ${2023 - this.age} years old`);
    }
}

class TeacherClass extends PersonClass {
    constructor (name, age, job, subject) {
        super(name, age, job)
        this.subject = subject
    }
}

const ourSir = new TeacherClass(`Safiq Sir`, 45, 'Assistant Teacher', `Physics`)
console.log(ourSir.name);
console.log(ourSir.age);
console.log(ourSir.job);
console.log(ourSir.subject);
ourSir.dateOfBirth()
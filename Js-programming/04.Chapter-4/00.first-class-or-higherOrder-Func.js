
// function passed as a argument
function callMyName(name, callback) {
    var myAge = 20;
    callback(myAge);
    console.log(`Is it interesting? Yes it is Mr.` + name);
}
function hello(age) {
    console.log(`I am passed through argument and age is: ` + age);
}
// callMyName(`Md Romi`, hello)


// return function from function
function welcomeMsg(name) {
    console.log(`welcome Mr. ${name}`);
    return function options(menu) {
        console.log(`Do you like ${menu} Mr. ${name}`);
    }
}
// welcomeMsg(`Md Romi`)(`Coffee`);

// storing function as a variable
let aFunc = function(name) {
    console.log(`I am Simply a function and my name is ${name}`);
}
let anotherLet = aFunc;
anotherLet(`Md Romi`)
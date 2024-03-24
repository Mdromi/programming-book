// OR Operator
const empty = ``;
const something = `Eat`;
const work = empty || something;
// console.log(work);

const user = {
    name: `MD Romi`
}
const ourAge = user.age || `Age not found`
// console.log(ourAge);

const aFunc = () => {
    console.log(`Print Me`);
}
// console.log(aFunc() || false);


// And operator
const anoVar = `Me` && `You`
const anoVar2 = false && `Anything`
// console.log(anoVar, anoVar2); // you false

console.log(user.name || user.age) && console.log(`Found ${user.name || user.age}`);


